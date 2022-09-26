package controllers

import javax.inject.Inject
import javax.inject.Singleton
import play.api.i18n.I18nSupport
import play.api.mvc._

@Singleton
class RootController @Inject() (cc: ControllerComponents) extends AbstractController(cc) with I18nSupport {

  def index: Action[AnyContent] =
    Action { implicit request =>
      Ok("Slick with Scala and Play-Framework Example")
    }
}
