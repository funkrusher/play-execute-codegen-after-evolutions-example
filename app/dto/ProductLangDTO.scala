package dto

import play.api.libs.json.Json
import play.api.libs.json.OFormat
import tables.Tables.ProductLangRow

import java.sql.Timestamp

case class ProductLangDTO(
    productId: Long,
    langId: Int,
    name: String,
    description: String,
)

object ProductLangDTO {
  implicit val fmt: OFormat[ProductLangDTO] = Json.format[ProductLangDTO]

  def fromRow(item: ProductLangRow): ProductLangDTO = {
    ProductLangDTO(
      productId = item.productId,
      langId = item.langId,
      name = item.name,
      description = item.description,
    )
  }

  def toRow(item: ProductLangDTO): ProductLangRow = {
    ProductLangRow(
      productId = item.productId,
      langId = item.langId,
      name = item.name,
      description = item.description,
    )
  }
}
