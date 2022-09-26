package init

import play.api.Environment
import play.api.Mode.Dev
import play.api.db.evolutions.ApplicationEvolutions
import play.api.db.slick.DatabaseConfigProvider
import slick.codegen.SourceCodeGenerator
import slick.jdbc.{JdbcProfile, MySQLProfile}
import slick.jdbc.meta.MTable

import java.util.concurrent.TimeUnit
import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global
import javax.inject._
import play.api.inject.ApplicationLifecycle
import tables.Tables.App
import util.DbAccess

@Singleton
class CodegenSingleton @Inject() (
                                   lifecycle: ApplicationLifecycle,
                                   env: Environment,
                                   dbcp: DatabaseConfigProvider,
                                   applicationEvolutions: ApplicationEvolutions)  extends DbAccess(dbcp)  {

  import api._

  if (env.mode == Dev) { // <- we only want it to be executed in DevMode
    if (applicationEvolutions.upToDate) {

      val slickDriver = "slick.jdbc.MySQLProfile"
      val jdbcDriver = "org.mariadb.jdbc.Driver"
      val url = "jdbc:mariadb://localhost:3306/codegen1"
      val outputDir = "./app"
      val username = "root"
      val password = ""

      val db = slick.jdbc.MySQLProfile.api.Database.forURL(url, username, password, driver = jdbcDriver)
      val dbio = MySQLProfile.createModel(Some(MTable.getTables(None, None, None, Some(Seq("TABLE", "VIEW")))))
      val futureModel = db.run(dbio)
      val future: Future[SourceCodeGenerator] = futureModel.map(model =>
        new SourceCodeGenerator(model) {
          override def tableName =
            dbTableName => dbTableName.toLowerCase.toCamelCase

          // override table generator
          override def Table =
            new Table(_) {
              // override contained column generator
              override def Column =
                new Column(_) {
                  override def rawName = this.model.name

                  override def rawType =
                    if (model.name.startsWith("fineWithAnswer")) "Boolean" else super.rawType
                }
            }
        }
      )

      try {

        val codegen: SourceCodeGenerator = Await.result(future, Duration.create(5, TimeUnit.MINUTES))

        codegen.writeToMultipleFiles(profile = slickDriver, folder = outputDir, pkg = "tables", container = "Tables")
      } catch {
        case e: Exception => print(e)
      }

      //generate some test data via db.

    }
  }
}
