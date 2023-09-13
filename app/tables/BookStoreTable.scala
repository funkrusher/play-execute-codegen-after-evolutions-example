package tables
// AUTO-GENERATED Slick data model for table BookStore
trait BookStoreTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table BookStore
   *  @param name Database column name SqlType(VARCHAR), Length(400,true) */
  case class BookStoreRow(name: String)
  /** GetResult implicit for fetching BookStoreRow objects using plain SQL queries */
  implicit def GetResultBookStoreRow(implicit e0: GR[String]): GR[BookStoreRow] = GR{
    prs => import prs._
    BookStoreRow(<<[String])
  }
  /** Table description of table book_store. Objects of this class serve as prototypes for rows in queries. */
  class BookStore(_tableTag: Tag) extends profile.api.Table[BookStoreRow](_tableTag, Some("testdb"), "book_store") {
    def * = name.<>(BookStoreRow, BookStoreRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(name)).shaped.<>(r => r.map(_=> BookStoreRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(VARCHAR), Length(400,true) */
    val name: Rep[String] = column[String]("name", O.Length(400,varying=true))

    /** Uniqueness Index over (name) (database name name) */
    val index1 = index("name", name, unique=true)
  }
  /** Collection-like TableQuery object for table BookStore */
  lazy val BookStore = new TableQuery(tag => new BookStore(tag))
}
