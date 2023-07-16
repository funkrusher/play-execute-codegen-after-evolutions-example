package tables
// AUTO-GENERATED Slick data model for table Product
trait ProductTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Product
   *  @param productId Database column productId SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param clientId Database column clientId SqlType(INT)
   *  @param price Database column price SqlType(DECIMAL)
   *  @param createdAt Database column createdAt SqlType(DATETIME)
   *  @param updatedAt Database column updatedAt SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(BIT), Default(false) */
  case class ProductRow(productId: Long, clientId: Int, price: scala.math.BigDecimal, createdAt: java.sql.Timestamp, updatedAt: java.sql.Timestamp, deleted: Boolean = false)
  /** GetResult implicit for fetching ProductRow objects using plain SQL queries */
  implicit def GetResultProductRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[scala.math.BigDecimal], e3: GR[java.sql.Timestamp], e4: GR[Boolean]): GR[ProductRow] = GR{
    prs => import prs._
    ProductRow.tupled((<<[Long], <<[Int], <<[scala.math.BigDecimal], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Boolean]))
  }
  /** Table description of table product. Objects of this class serve as prototypes for rows in queries. */
  class Product(_tableTag: Tag) extends profile.api.Table[ProductRow](_tableTag, Some("codegen1"), "product") {
    def * = (productId, clientId, price, createdAt, updatedAt, deleted) <> (ProductRow.tupled, ProductRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(productId), Rep.Some(clientId), Rep.Some(price), Rep.Some(createdAt), Rep.Some(updatedAt), Rep.Some(deleted))).shaped.<>({r=>import r._; _1.map(_=> ProductRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column productId SqlType(BIGINT), AutoInc, PrimaryKey */
    val productId: Rep[Long] = column[Long]("productId", O.AutoInc, O.PrimaryKey)
    /** Database column clientId SqlType(INT) */
    val clientId: Rep[Int] = column[Int]("clientId")
    /** Database column price SqlType(DECIMAL) */
    val price: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("price")
    /** Database column createdAt SqlType(DATETIME) */
    val createdAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("createdAt")
    /** Database column updatedAt SqlType(DATETIME) */
    val updatedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("updatedAt")
    /** Database column deleted SqlType(BIT), Default(false) */
    val deleted: Rep[Boolean] = column[Boolean]("deleted", O.Default(false))

    /** Foreign key referencing Client (database name fk_product_clientId) */
    lazy val clientFk = foreignKey("fk_product_clientId", clientId, Client)(r => r.clientId, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table Product */
  implicit class ProductRowExtension[C[_]](q: Query[Product, ProductRow, C]) {
  
    def clients = q.join(TableQuery[Client]).on((_.clientId === _.clientId)).map(_._2)

  
    def clients_products(implicit q: Query[Client, ClientRow, Seq]): Query[Product, ProductRow, Seq] =
      q.join(TableQuery[Product]).on((_.clientId === _.clientId)).map(_._2)

  }

  lazy val Product = new TableQuery(tag => new Product(tag))
}
