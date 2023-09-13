package tables
// AUTO-GENERATED Slick data model for table Author
trait AuthorTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Author
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param first_name Database column first_name SqlType(VARCHAR), Length(50,true), Default(Some(NULL))
   *  @param last_name Database column last_name SqlType(VARCHAR), Length(50,true)
   *  @param date_of_birth Database column date_of_birth SqlType(DATE), Default(None)
   *  @param year_of_birth Database column year_of_birth SqlType(INT), Default(None)
   *  @param distinguished Database column distinguished SqlType(INT), Default(None) */
  case class AuthorRow(id: Int, first_name: Option[String], last_name: String, date_of_birth: Option[java.sql.Date], year_of_birth: Option[Int], distinguished: Option[Int])
  /** GetResult implicit for fetching AuthorRow objects using plain SQL queries */
  implicit def GetResultAuthorRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[java.sql.Date]], e4: GR[Option[Int]]): GR[AuthorRow] = GR{
    prs => import prs._
    AuthorRow.tupled((<<[Int], <<?[String], <<[String], <<?[java.sql.Date], <<?[Int], <<?[Int]))
  }
  /** Table description of table author. Objects of this class serve as prototypes for rows in queries. */
  class Author(_tableTag: Tag) extends profile.api.Table[AuthorRow](_tableTag, Some("testdb"), "author") {
    def * = (id, first_name, last_name, date_of_birth, year_of_birth, distinguished).<>(AuthorRow.tupled, AuthorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), first_name, Rep.Some(last_name), date_of_birth, year_of_birth, distinguished)).shaped.<>({r=>import r._; _1.map(_=> AuthorRow.tupled((_1.get, _2, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column first_name SqlType(VARCHAR), Length(50,true), Default(Some(NULL)) */
    val first_name: Rep[Option[String]] = column[Option[String]]("first_name", O.Length(50,varying=true), O.Default(Some("NULL")))
    /** Database column last_name SqlType(VARCHAR), Length(50,true) */
    val last_name: Rep[String] = column[String]("last_name", O.Length(50,varying=true))
    /** Database column date_of_birth SqlType(DATE), Default(None) */
    val date_of_birth: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("date_of_birth", O.Default(None))
    /** Database column year_of_birth SqlType(INT), Default(None) */
    val year_of_birth: Rep[Option[Int]] = column[Option[Int]]("year_of_birth", O.Default(None))
    /** Database column distinguished SqlType(INT), Default(None) */
    val distinguished: Rep[Option[Int]] = column[Option[Int]]("distinguished", O.Default(None))
  }
  /** Collection-like TableQuery object for table Author */
  lazy val Author = new TableQuery(tag => new Author(tag))
}
