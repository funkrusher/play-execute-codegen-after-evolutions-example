package tables
// AUTO-GENERATED Slick data model for table ProductLang
trait ProductLangTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ProductLang
   *  @param productId Database column productId SqlType(BIGINT)
   *  @param langId Database column langId SqlType(INT)
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param description Database column description SqlType(TEXT) */
  case class ProductLangRow(productId: Long, langId: Int, name: String, description: String)
  /** GetResult implicit for fetching ProductLangRow objects using plain SQL queries */
  implicit def GetResultProductLangRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[String]): GR[ProductLangRow] = GR{
    prs => import prs._
    ProductLangRow.tupled((<<[Long], <<[Int], <<[String], <<[String]))
  }
  /** Table description of table product_lang. Objects of this class serve as prototypes for rows in queries. */
  class ProductLang(_tableTag: Tag) extends profile.api.Table[ProductLangRow](_tableTag, Some("codegen1"), "product_lang") {
    def * = (productId, langId, name, description) <> (ProductLangRow.tupled, ProductLangRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(productId), Rep.Some(langId), Rep.Some(name), Rep.Some(description))).shaped.<>({r=>import r._; _1.map(_=> ProductLangRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column productId SqlType(BIGINT) */
    val productId: Rep[Long] = column[Long]("productId")
    /** Database column langId SqlType(INT) */
    val langId: Rep[Int] = column[Int]("langId")
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column description SqlType(TEXT) */
    val description: Rep[String] = column[String]("description")

    /** Primary key of ProductLang (database name product_lang_PK) */
    val pk = primaryKey("product_lang_PK", (productId, langId))

    /** Foreign key referencing Lang (database name fk_product_lang_langId) */
    lazy val langFk = foreignKey("fk_product_lang_langId", langId, Lang)(r => r.langId, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
    /** Foreign key referencing Product (database name fk_product_lang_productId) */
    lazy val productFk = foreignKey("fk_product_lang_productId", productId, Product)(r => r.productId, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table ProductLang */
  implicit class ProductLangRowExtension[C[_]](q: Query[ProductLang, ProductLangRow, C]) {
    def langs = q.join(Lang).on(_.langId === _.langId).map(_._2)
    def products = q.join(Product).on(_.productId === _.productId).map(_._2)
  }

  lazy val ProductLang = new TableQuery(tag => new ProductLang(tag))
}
