package dto

import play.api.libs.json.Json
import play.api.libs.json.OFormat
import tables.Tables.ProductRow

import java.sql.Timestamp

case class ProductDTO(
    productId: Long,
    clientId: Int,
    price: BigDecimal,
    createdAt: String,
    updatedAt: String,
    deleted: Boolean,
    // non-database fields
    langs: Option[Seq[ProductLangDTO]],
)

object ProductDTO {
  implicit val fmt: OFormat[ProductDTO] = Json.format[ProductDTO]

  def fromRow(item: ProductRow): ProductDTO = {
    ProductDTO(
      productId = item.productId,
      clientId = item.clientId,
      price = item.price,
      createdAt = item.createdAt.toString,
      updatedAt = item.updatedAt.toString,
      deleted = item.deleted,
      langs = None,
    )
  }

  def toRow(item: ProductDTO): ProductRow = {
    ProductRow(
      productId = item.productId,
      clientId = item.clientId,
      price = item.price,
      createdAt = Timestamp.valueOf(item.createdAt),
      updatedAt = Timestamp.valueOf(item.updatedAt),
      deleted = item.deleted,
    )
  }
}
