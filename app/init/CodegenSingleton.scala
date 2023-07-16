package init

import play.api.Environment
import play.api.Logging
import play.api.Mode.Dev
import play.api.db.evolutions.ApplicationEvolutions
import play.api.db.slick.DatabaseConfigProvider
import slick.codegen.SourceCodeGenerator
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile
import slick.jdbc.meta.MTable

import java.util.concurrent.TimeUnit
import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global
import javax.inject._
import play.api.inject.ApplicationLifecycle
import tables.Tables.PlayEvolutions
import util.DbAccess

import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import scala.reflect.io.File

@Singleton
class CodegenSingleton @Inject() (
    lifecycle: ApplicationLifecycle,
    dbcp: DatabaseConfigProvider,
    env: Environment,
    applicationEvolutions: ApplicationEvolutions,
) extends DbAccess(dbcp) {
  import api._

  if (applicationEvolutions.upToDate) {
    if (env.mode == Dev) { // <- we only want it to be executed in DevMode
      // see: https://github.com/slick/slick-codegen-customization-example/blob/master/codegen/CustomizedCodeGenerator.scala

      // we are in dev-mode, and the evolutions are up-to-date.
      // we now need to compare the evolution-count in the database with the last
      // evolution-count we have saved. Only if they are different, we should rebuild
      // the tables-code.

      val action = for {
        evolutions <- PlayEvolutions.result
      } yield evolutions.length

      db.run(action)
        .map(evolutionCount => {
          val path = Paths.get("temp.txt")
          val file = path.toFile
          if (!file.exists()) {
            Files.write(path, evolutionCount.toString.getBytes(StandardCharsets.UTF_8))
          }
          val oldEvolutionCount = Files.readAllLines(Paths.get("temp.txt"), StandardCharsets.UTF_8).get(0).toInt;
          if (evolutionCount != oldEvolutionCount) {
            Files.write(Paths.get("temp.txt"), evolutionCount.toString.getBytes(StandardCharsets.UTF_8))

            // start codegen.
            val slickCodegen = new SlickCodegen();
            slickCodegen.rebuild(true);
          }
        })
    }
  }
}
