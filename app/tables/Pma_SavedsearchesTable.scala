package tables
// AUTO-GENERATED Slick data model for table Pma_Savedsearches
trait Pma_SavedsearchesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Savedsearches
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param username Database column username SqlType(VARCHAR), Length(64,true), Default('')
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param search_name Database column search_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param search_data Database column search_data SqlType(TEXT) */
  case class Pma_SavedsearchesRow(id: Long, username: String, db_name: String, search_name: String, search_data: String)
  /** GetResult implicit for fetching Pma_SavedsearchesRow objects using plain SQL queries */
  implicit def GetResultPma_SavedsearchesRow(implicit e0: GR[Long], e1: GR[String]): GR[Pma_SavedsearchesRow] = GR{
    prs => import prs._
    Pma_SavedsearchesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table pma__savedsearches. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Savedsearches(_tableTag: Tag) extends profile.api.Table[Pma_SavedsearchesRow](_tableTag, Some("phpmyadmin"), "pma__savedsearches") {
    def * = (id, username, db_name, search_name, search_data).<>(Pma_SavedsearchesRow.tupled, Pma_SavedsearchesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(username), Rep.Some(db_name), Rep.Some(search_name), Rep.Some(search_data))).shaped.<>({r=>import r._; _1.map(_=> Pma_SavedsearchesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column username SqlType(VARCHAR), Length(64,true), Default('') */
    val username: Rep[String] = column[String]("username", O.Length(64,varying=true), O.Default("''"))
    /** Database column db_name SqlType(VARCHAR), Length(64,true), Default('') */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column search_name SqlType(VARCHAR), Length(64,true), Default('') */
    val search_name: Rep[String] = column[String]("search_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column search_data SqlType(TEXT) */
    val search_data: Rep[String] = column[String]("search_data")

    /** Uniqueness Index over (username,db_name,search_name) (database name u_savedsearches_username_dbname) */
    val index1 = index("u_savedsearches_username_dbname", (username, db_name, search_name), unique=true)
  }
  /** Collection-like TableQuery object for table Pma_Savedsearches */
  lazy val Pma_Savedsearches = new TableQuery(tag => new Pma_Savedsearches(tag))
}
