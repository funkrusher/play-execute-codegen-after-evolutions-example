package tables
// AUTO-GENERATED Slick data model for table Book
trait BookTable {

  self:TablesRoot with AuthorTable with LanguageTable  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Book
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param author_id Database column author_id SqlType(INT)
   *  @param title Database column title SqlType(VARCHAR), Length(400,true)
   *  @param published_in Database column published_in SqlType(INT)
   *  @param language_id Database column language_id SqlType(INT) */
  case class BookRow(id: Int, author_id: Int, title: String, published_in: Int, language_id: Int)
  /** GetResult implicit for fetching BookRow objects using plain SQL queries */
  implicit def GetResultBookRow(implicit e0: GR[Int], e1: GR[String]): GR[BookRow] = GR{
    prs => import prs._
    BookRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[Int]))
  }
  /** Table description of table book. Objects of this class serve as prototypes for rows in queries. */
  class Book(_tableTag: Tag) extends profile.api.Table[BookRow](_tableTag, Some("testdb"), "book") {
    def * = (id, author_id, title, published_in, language_id).<>(BookRow.tupled, BookRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(author_id), Rep.Some(title), Rep.Some(published_in), Rep.Some(language_id))).shaped.<>({r=>import r._; _1.map(_=> BookRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column author_id SqlType(INT) */
    val author_id: Rep[Int] = column[Int]("author_id")
    /** Database column title SqlType(VARCHAR), Length(400,true) */
    val title: Rep[String] = column[String]("title", O.Length(400,varying=true))
    /** Database column published_in SqlType(INT) */
    val published_in: Rep[Int] = column[Int]("published_in")
    /** Database column language_id SqlType(INT) */
    val language_id: Rep[Int] = column[Int]("language_id")

    /** Foreign key referencing Author (database name fk_book_author) */
    lazy val authorFk = foreignKey("fk_book_author", author_id, Author)(r => r.id, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Restrict)
    /** Foreign key referencing Language (database name fk_book_language) */
    lazy val languageFk = foreignKey("fk_book_language", language_id, Language)(r => r.id, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Restrict)
  }
  /** Collection-like TableQuery object for table Book */
  lazy val Book = new TableQuery(tag => new Book(tag))
}
