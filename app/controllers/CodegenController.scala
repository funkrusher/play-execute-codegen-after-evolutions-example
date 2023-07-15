package controllers

import init.CodegenGenerator
import mapper.ProductMapper
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
class CodegenController @Inject() (cc: ControllerComponents, codegenGenerator: CodegenGenerator)
    extends AbstractController(cc)
    with I18nSupport {

  def rebuild: Action[AnyContent] =
    Action { implicit request =>
      codegenGenerator.generate(true)
      Ok("Generating Code...")
    }
}
