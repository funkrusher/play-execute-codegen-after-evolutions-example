package controllers

import init.SlickCodegen
import mapper.ProductMapper
import play.api.Environment
import play.api.Mode.Dev
import play.api.i18n.I18nSupport
import play.api.libs.json.Json
import play.api.mvc.AbstractController
import play.api.mvc.Action
import play.api.mvc.AnyContent
import play.api.mvc.ControllerComponents

import javax.inject.Inject
import javax.inject.Singleton
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class CodegenController @Inject() (env: Environment, cc: ControllerComponents)
    extends AbstractController(cc)
    with I18nSupport {

  def rebuild: Action[AnyContent] =
    Action { implicit request =>
      if (env.mode == Dev) { // <- we only want it to be executed in DevMode
        // see: https://github.com/slick/slick-codegen-customization-example/blob/master/codegen/CustomizedCodeGenerator.scala
        val slickCodegen = new SlickCodegen();
        slickCodegen.rebuild(true);
      }
      Ok("Generating Code...")
    }
}
