package dao

import play.api.db.slick.DatabaseConfigProvider
import slick.basic.DatabasePublisher
import slick.jdbc.ResultSetConcurrency
import slick.jdbc.ResultSetType
import tables.Tables.Product
import tables.Tables.ProductRow
import util.DbAccess

import javax.inject.Inject
import javax.inject.Singleton
import scala.concurrent.ExecutionContext

/**
 * ProductDAO
 *
 * @param ec
 */
@Singleton
class ProductDAO @Inject() (dbcp: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends DbAccess(dbcp) {

  import api._

  def fetchAll(): DBIO[Seq[ProductRow]] = {
    Product.result
  }

  def fetchOne(productId: Long): DBIO[Option[ProductRow]] =
    Product.filter(_.productId === productId).result.headOption

  def insertOne(item: ProductRow): DBIO[Int] =
    Product += item

  def insertMany(items: Seq[ProductRow]): DBIO[Option[Int]] =
    Product ++= items

  def deleteOne(productId: Long): DBIO[Int] =
    Product.filter(_.productId === productId).delete

  def updateOne(item: ProductRow): DBIO[Int] =
    Product.filter(_.productId === item.productId).update(item)

}
