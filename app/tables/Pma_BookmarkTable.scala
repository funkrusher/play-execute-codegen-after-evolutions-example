package tables
// AUTO-GENERATED Slick data model for table Pma_Bookmark
trait Pma_BookmarkTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Bookmark
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param dbase Database column dbase SqlType(VARCHAR), Length(255,true), Default('')
   *  @param user Database column user SqlType(VARCHAR), Length(255,true), Default('')
   *  @param label Database column label SqlType(VARCHAR), Length(255,true), Default('')
   *  @param query Database column query SqlType(TEXT) */
  case class Pma_BookmarkRow(id: Long, dbase: String, user: String, label: String, query: String)
  /** GetResult implicit for fetching Pma_BookmarkRow objects using plain SQL queries */
  implicit def GetResultPma_BookmarkRow(implicit e0: GR[Long], e1: GR[String]): GR[Pma_BookmarkRow] = GR{
    prs => import prs._
    Pma_BookmarkRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table pma__bookmark. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Bookmark(_tableTag: Tag) extends profile.api.Table[Pma_BookmarkRow](_tableTag, Some("phpmyadmin"), "pma__bookmark") {
    def * = (id, dbase, user, label, query).<>(Pma_BookmarkRow.tupled, Pma_BookmarkRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(dbase), Rep.Some(user), Rep.Some(label), Rep.Some(query))).shaped.<>({r=>import r._; _1.map(_=> Pma_BookmarkRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column dbase SqlType(VARCHAR), Length(255,true), Default('') */
    val dbase: Rep[String] = column[String]("dbase", O.Length(255,varying=true), O.Default("''"))
    /** Database column user SqlType(VARCHAR), Length(255,true), Default('') */
    val user: Rep[String] = column[String]("user", O.Length(255,varying=true), O.Default("''"))
    /** Database column label SqlType(VARCHAR), Length(255,true), Default('') */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true), O.Default("''"))
    /** Database column query SqlType(TEXT) */
    val query: Rep[String] = column[String]("query")
  }
  /** Collection-like TableQuery object for table Pma_Bookmark */
  lazy val Pma_Bookmark = new TableQuery(tag => new Pma_Bookmark(tag))
}
