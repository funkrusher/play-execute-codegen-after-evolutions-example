package tables
// AUTO-GENERATED Slick data model for table Pma_History
trait Pma_HistoryTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_History
   *  @param id Database column id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param username Database column username SqlType(VARCHAR), Length(64,true), Default('')
   *  @param db Database column db SqlType(VARCHAR), Length(64,true), Default('')
   *  @param table Database column table SqlType(VARCHAR), Length(64,true), Default('')
   *  @param timevalue Database column timevalue SqlType(TIMESTAMP)
   *  @param sqlquery Database column sqlquery SqlType(TEXT) */
  case class Pma_HistoryRow(id: Long, username: String, db: String, table: String, timevalue: java.sql.Timestamp, sqlquery: String)
  /** GetResult implicit for fetching Pma_HistoryRow objects using plain SQL queries */
  implicit def GetResultPma_HistoryRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[Pma_HistoryRow] = GR{
    prs => import prs._
    Pma_HistoryRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[String]))
  }
  /** Table description of table pma__history. Objects of this class serve as prototypes for rows in queries. */
  class Pma_History(_tableTag: Tag) extends profile.api.Table[Pma_HistoryRow](_tableTag, Some("phpmyadmin"), "pma__history") {
    def * = (id, username, db, table, timevalue, sqlquery).<>(Pma_HistoryRow.tupled, Pma_HistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(username), Rep.Some(db), Rep.Some(table), Rep.Some(timevalue), Rep.Some(sqlquery))).shaped.<>({r=>import r._; _1.map(_=> Pma_HistoryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column username SqlType(VARCHAR), Length(64,true), Default('') */
    val username: Rep[String] = column[String]("username", O.Length(64,varying=true), O.Default("''"))
    /** Database column db SqlType(VARCHAR), Length(64,true), Default('') */
    val db: Rep[String] = column[String]("db", O.Length(64,varying=true), O.Default("''"))
    /** Database column table SqlType(VARCHAR), Length(64,true), Default('') */
    val table: Rep[String] = column[String]("table", O.Length(64,varying=true), O.Default("''"))
    /** Database column timevalue SqlType(TIMESTAMP) */
    val timevalue: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("timevalue")
    /** Database column sqlquery SqlType(TEXT) */
    val sqlquery: Rep[String] = column[String]("sqlquery")

    /** Index over (username,db,table,timevalue) (database name username) */
    val index1 = index("username", (username, db, table, timevalue))
  }
  /** Collection-like TableQuery object for table Pma_History */
  lazy val Pma_History = new TableQuery(tag => new Pma_History(tag))
}
