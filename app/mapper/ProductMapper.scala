package mapper

import dao.ProductDAO
import dao.UserDAO
import dto.ProductDTO
import dto.UserDTO
import play.api.db.slick.DatabaseConfigProvider
import slick.lifted.Query
import tables.Tables.Product
import tables.Tables.ProductLang
import tables.Tables.ProductRow
import tables.Tables.ProductLangRow
import util.DbAccess

import javax.inject.Inject
import javax.inject.Singleton
import scala.concurrent.ExecutionContext
import scala.concurrent.Future

@Singleton
class ProductMapper @Inject() (dbcp: DatabaseConfigProvider, productDAO: ProductDAO)(implicit ec: ExecutionContext)
    extends DbAccess(dbcp) {

  import api._

  def fetchAll(): Future[Seq[ProductRow]] = {
    // see: https://stackoverflow.com/questions/37015008/slick-3-simple-join-on-tables
    // see: https://stackoverflow.com/questions/57461600/many-to-many-version-of-a-slick-extension-method
    // see: http://mts.wibro.agh.edu.pl/dydaktyka/iwm/essential-slick-3.pdf

    val action = for {
      product <- Product.result
    } yield (product)

    db.run(action)
      .map(x => {
        val productDTOs = x.map(product => {
          product;
        })
        productDTOs
      })
  }
}
