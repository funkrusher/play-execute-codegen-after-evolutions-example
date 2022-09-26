package controllers

import dao.UserDAO
import mapper.UserMapper
import play.api.i18n.I18nSupport
import play.api.libs.json.JsSuccess
import play.api.libs.json.JsValue
import play.api.libs.json.Json
import play.api.mvc.AbstractController
import play.api.mvc.Action
import play.api.mvc.AnyContent
import play.api.mvc.ControllerComponents

import javax.inject.Inject
import javax.inject.Singleton
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class UserController @Inject()(cc: ControllerComponents, userMapper: UserMapper)
    extends AbstractController(cc)
    with I18nSupport {

  def fetchAll: Action[AnyContent] =
    Action.async { implicit request =>
      val result = for {
        users <- userMapper.fetchAll
      } yield users

      result.map({
        case (users) =>
          Ok(Json.obj("users" -> users))
      })
    }
}
