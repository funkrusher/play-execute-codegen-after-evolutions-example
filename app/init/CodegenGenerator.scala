package init

import play.api.Environment
import play.api.Logging
import play.api.Mode.Dev
import play.api.db.evolutions.ApplicationEvolutions
import play.api.db.slick.DatabaseConfigProvider
import slick.codegen.SourceCodeGenerator
import slick.jdbc.MySQLProfile
import slick.jdbc.meta.MTable

import java.util.concurrent.TimeUnit
import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global
import javax.inject._
import util.DbAccess

import java.io.File

@Singleton
class CodegenGenerator @Inject() (
    dbcp: DatabaseConfigProvider,
    env: Environment,
) extends DbAccess(dbcp)
    with Logging {

  import api._
  def generate(clearOld: Boolean) = {
    if (env.mode == Dev) { // <- we only want it to be executed in DevMode
      // see: https://github.com/slick/slick-codegen-customization-example/blob/master/codegen/CustomizedCodeGenerator.scala

      logger.info("Autogenerated Tables For Use With Slick - START")

      val slickDriver = "slick.jdbc.MySQLProfile"
      val jdbcDriver  = "org.mariadb.jdbc.Driver"
      val url         = "jdbc:mariadb://localhost:3306/codegen1"
      val outputDir   = "./app"
      val pkg         = "tables"
      val username    = "root"
      val password    = ""

      if (clearOld) {
        val folder2: String = outputDir + "/" + (pkg.replace(".", "/")) + "/"
        new File(folder2).delete()
      }

      val db                                  = slick.jdbc.MySQLProfile.api.Database.forURL(url, username, password, driver = jdbcDriver)
      val dbio                                = MySQLProfile.createModel(Some(MTable.getTables(None, None, None, Some(Seq("TABLE", "VIEW")))))
      val futureModel                         = db.run(dbio)
      val future: Future[SourceCodeGenerator] = futureModel.map(model => new CustomCodeGenerator(model))
      try {
        val codegen: SourceCodeGenerator = Await.result(future, Duration.create(5, TimeUnit.MINUTES))
        codegen.writeToMultipleFiles(profile = slickDriver, folder = outputDir, pkg = "tables", container = "Tables")
        logger.info("Autogenerated Tables For Use With Slick - FINISHED!")

      } catch {
        case e: Exception =>
          logger.error(e.getMessage)
      }
    }
  }
}
