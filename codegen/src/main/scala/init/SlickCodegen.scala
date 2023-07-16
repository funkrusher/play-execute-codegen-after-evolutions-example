package init

import com.typesafe.config.ConfigFactory
import slick.codegen.SourceCodeGenerator
import slick.jdbc.MySQLProfile
import slick.jdbc.meta.MTable

import java.io.File
import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration.Duration
class SlickCodegen {

  def rebuild(clearOld: Boolean) = {
    println("SlickCodegen - start")
    val filename        = "./conf/application.conf"
    val applicationConf = new File(filename)
    val conf            = ConfigFactory.parseFile(applicationConf);

    val url      = conf.getString("slick.dbs.default.db.url")
    val username = conf.getString("slick.dbs.default.db.user")
    val password = conf.getString("slick.dbs.default.db.password")

    val slickDriver = "slick.jdbc.MySQLProfile"
    val jdbcDriver  = "org.mariadb.jdbc.Driver"
    val outputDir   = "./app"
    val pkg         = "tables"

    if (clearOld) {
      println("SlickCodegen - clear old files...")
      val folder2: String = outputDir + "/" + (pkg.replace(".", "/")) + "/"
      new File(folder2).delete()
      println("SlickCodegen - clear old files done!")
    }

    val db                                  = slick.jdbc.MySQLProfile.api.Database.forURL(url, username, password, driver = jdbcDriver)
    val dbio                                = MySQLProfile.createModel(Some(MTable.getTables(None, None, None, Some(Seq("TABLE", "VIEW")))))
    val futureModel                         = db.run(dbio)
    val future: Future[SourceCodeGenerator] = futureModel.map(model => new CustomCodeGenerator(model))
    try {
      println("SlickCodegen - creating files...")
      val codegen: SourceCodeGenerator = Await.result(future, Duration.create(5, TimeUnit.MINUTES))
      codegen.writeToMultipleFiles(profile = slickDriver, folder = outputDir, pkg = "tables", container = "Tables")
      println("SlickCodegen - creating files done!")
    } catch {
      case e: Exception =>
        println("SlickCodegen - creating files error!")
        e.printStackTrace()
    }
  }
}
