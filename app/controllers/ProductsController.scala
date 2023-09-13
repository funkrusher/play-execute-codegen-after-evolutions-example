package controllers

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
class ProductsController @Inject() (cc: ControllerComponents, productMapper: ProductMapper)
    extends AbstractController(cc)
    with I18nSupport {

  def fetchAll: Action[AnyContent] =
    Action.async { implicit request =>
      val result = for {
        products <- productMapper.fetchAll
      } yield products

      result.map({
        case (products) =>
          Ok(Json.obj("products" -> products))
      })
    }
}
