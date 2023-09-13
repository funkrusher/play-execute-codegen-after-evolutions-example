package tables
// AUTO-GENERATED Slick data model for table WpWprssLogs
trait WpWprssLogsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpWprssLogs
   *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param date Database column date SqlType(TIMESTAMP)
   *  @param level Database column level SqlType(VARCHAR), Length(30,true)
   *  @param message Database column message SqlType(TEXT)
   *  @param feed_id Database column feed_id SqlType(VARCHAR), Length(100,true), Default(Some(NULL)) */
  case class WpWprssLogsRow(id: Long, date: Option[java.sql.Timestamp], level: String, message: String, feed_id: Option[String])
  /** GetResult implicit for fetching WpWprssLogsRow objects using plain SQL queries */
  implicit def GetResultWpWprssLogsRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]]): GR[WpWprssLogsRow] = GR{
    prs => import prs._
    WpWprssLogsRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[String], <<[String], <<?[String]))
  }
  /** Table description of table wp_wprss_logs. Objects of this class serve as prototypes for rows in queries. */
  class WpWprssLogs(_tableTag: Tag) extends profile.api.Table[WpWprssLogsRow](_tableTag, Some("wp_atopia"), "wp_wprss_logs") {
    def * = (id, date, level, message, feed_id).<>(WpWprssLogsRow.tupled, WpWprssLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), date, Rep.Some(level), Rep.Some(message), feed_id)).shaped.<>({r=>import r._; _1.map(_=> WpWprssLogsRow.tupled((_1.get, _2, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column date SqlType(TIMESTAMP) */
    val date: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("date")
    /** Database column level SqlType(VARCHAR), Length(30,true) */
    val level: Rep[String] = column[String]("level", O.Length(30,varying=true))
    /** Database column message SqlType(TEXT) */
    val message: Rep[String] = column[String]("message")
    /** Database column feed_id SqlType(VARCHAR), Length(100,true), Default(Some(NULL)) */
    val feed_id: Rep[Option[String]] = column[Option[String]]("feed_id", O.Length(100,varying=true), O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table WpWprssLogs */
  lazy val WpWprssLogs = new TableQuery(tag => new WpWprssLogs(tag))
}
