package tables
// AUTO-GENERATED Slick data model for table BookToBookStore
trait BookToBookStoreTable {

  self:TablesRoot with BookTable with BookStoreTable  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BookToBookStore
   *  @param name Database column name SqlType(VARCHAR), Length(400,true)
   *  @param book_id Database column book_id SqlType(INT)
   *  @param stock Database column stock SqlType(INT), Default(None) */
  case class BookToBookStoreRow(name: String, book_id: Int, stock: Option[Int])
  /** GetResult implicit for fetching BookToBookStoreRow objects using plain SQL queries */
  implicit def GetResultBookToBookStoreRow(implicit e0: GR[String], e1: GR[Int], e2: GR[Option[Int]]): GR[BookToBookStoreRow] = GR{
    prs => import prs._
    BookToBookStoreRow.tupled((<<[String], <<[Int], <<?[Int]))
  }
  /** Table description of table book_to_book_store. Objects of this class serve as prototypes for rows in queries. */
  class BookToBookStore(_tableTag: Tag) extends profile.api.Table[BookToBookStoreRow](_tableTag, Some("testdb"), "book_to_book_store") {
    def * = (name, book_id, stock).<>(BookToBookStoreRow.tupled, BookToBookStoreRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(name), Rep.Some(book_id), stock)).shaped.<>({r=>import r._; _1.map(_=> BookToBookStoreRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(VARCHAR), Length(400,true) */
    val name: Rep[String] = column[String]("name", O.Length(400,varying=true))
    /** Database column book_id SqlType(INT) */
    val book_id: Rep[Int] = column[Int]("book_id")
    /** Database column stock SqlType(INT), Default(None) */
    val stock: Rep[Option[Int]] = column[Option[Int]]("stock", O.Default(None))

    /** Primary key of BookToBookStore (database name book_to_book_store_PK) */
    val pk = primaryKey("book_to_book_store_PK", (name, book_id))

    /** Foreign key referencing Book (database name fk_b2bs_book) */
    lazy val bookFk = foreignKey("fk_b2bs_book", book_id, Book)(r => r.id, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
    /** Foreign key referencing BookStore (database name fk_b2bs_book_store) */
    lazy val bookStoreFk = foreignKey("fk_b2bs_book_store", name, BookStore)(r => r.name, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table BookToBookStore */
  lazy val BookToBookStore = new TableQuery(tag => new BookToBookStore(tag))
}
