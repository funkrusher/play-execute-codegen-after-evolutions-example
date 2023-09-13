package tables
// AUTO-GENERATED Slick data model for table Pma_TableUiprefs
trait Pma_TableUiprefsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_TableUiprefs
   *  @param username Database column username SqlType(VARCHAR), Length(64,true)
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true)
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true)
   *  @param prefs Database column prefs SqlType(TEXT)
   *  @param last_update Database column last_update SqlType(TIMESTAMP) */
  case class Pma_TableUiprefsRow(username: String, db_name: String, table_name: String, prefs: String, last_update: java.sql.Timestamp)
  /** GetResult implicit for fetching Pma_TableUiprefsRow objects using plain SQL queries */
  implicit def GetResultPma_TableUiprefsRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp]): GR[Pma_TableUiprefsRow] = GR{
    prs => import prs._
    Pma_TableUiprefsRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table pma__table_uiprefs. Objects of this class serve as prototypes for rows in queries. */
  class Pma_TableUiprefs(_tableTag: Tag) extends profile.api.Table[Pma_TableUiprefsRow](_tableTag, Some("phpmyadmin"), "pma__table_uiprefs") {
    def * = (username, db_name, table_name, prefs, last_update).<>(Pma_TableUiprefsRow.tupled, Pma_TableUiprefsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(username), Rep.Some(db_name), Rep.Some(table_name), Rep.Some(prefs), Rep.Some(last_update))).shaped.<>({r=>import r._; _1.map(_=> Pma_TableUiprefsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column username SqlType(VARCHAR), Length(64,true) */
    val username: Rep[String] = column[String]("username", O.Length(64,varying=true))
    /** Database column db_name SqlType(VARCHAR), Length(64,true) */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true))
    /** Database column table_name SqlType(VARCHAR), Length(64,true) */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true))
    /** Database column prefs SqlType(TEXT) */
    val prefs: Rep[String] = column[String]("prefs")
    /** Database column last_update SqlType(TIMESTAMP) */
    val last_update: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("last_update")

    /** Primary key of Pma_TableUiprefs (database name pma__table_uiprefs_PK) */
    val pk = primaryKey("pma__table_uiprefs_PK", (username, db_name, table_name))
  }
  /** Collection-like TableQuery object for table Pma_TableUiprefs */
  lazy val Pma_TableUiprefs = new TableQuery(tag => new Pma_TableUiprefs(tag))
}
