package dao

import play.api.db.slick.DatabaseConfigProvider
import slick.basic.DatabasePublisher
import slick.jdbc.ResultSetConcurrency
import slick.jdbc.ResultSetType
import tables.Tables.ProductLang
import tables.Tables.ProductLangRow
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
class ProductLangDAO @Inject() (dbcp: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends DbAccess(dbcp) {

  import api._

  def fetchByProductIds(productIds: Seq[Long]): DBIO[Seq[ProductLangRow]] =
    ProductLang.filter(_.productId.inSet(productIds.toSet)).result

}
