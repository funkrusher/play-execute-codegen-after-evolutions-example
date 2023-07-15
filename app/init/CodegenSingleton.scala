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
import util.DbAccess

@Singleton
class CodegenSingleton @Inject() (
    codegenGenerator: CodegenGenerator,
    lifecycle: ApplicationLifecycle,
    applicationEvolutions: ApplicationEvolutions,
) {
  if (applicationEvolutions.upToDate) {
    codegenGenerator.generate(false)
  }
}
