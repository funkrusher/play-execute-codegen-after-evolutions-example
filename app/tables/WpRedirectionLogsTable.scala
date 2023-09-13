package tables
// AUTO-GENERATED Slick data model for table WpRedirectionLogs
trait WpRedirectionLogsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpRedirectionLogs
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param created Database column created SqlType(DATETIME)
   *  @param url Database column url SqlType(MEDIUMTEXT), Length(16777215,true)
   *  @param sent_to Database column sent_to SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL))
   *  @param agent Database column agent SqlType(MEDIUMTEXT), Length(16777215,true)
   *  @param referrer Database column referrer SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL))
   *  @param redirection_id Database column redirection_id SqlType(INT UNSIGNED), Default(None)
   *  @param ip Database column ip SqlType(VARCHAR), Length(45,true), Default(Some(NULL))
   *  @param module_id Database column module_id SqlType(INT UNSIGNED)
   *  @param group_id Database column group_id SqlType(INT UNSIGNED), Default(None) */
  case class WpRedirectionLogsRow(id: Long, created: java.sql.Timestamp, url: String, sent_to: Option[String], agent: String, referrer: Option[String], redirection_id: Option[Long], ip: Option[String], module_id: Long, group_id: Option[Long])
  /** GetResult implicit for fetching WpRedirectionLogsRow objects using plain SQL queries */
  implicit def GetResultWpRedirectionLogsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[Long]]): GR[WpRedirectionLogsRow] = GR{
    prs => import prs._
    WpRedirectionLogsRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[String], <<?[String], <<[String], <<?[String], <<?[Long], <<?[String], <<[Long], <<?[Long]))
  }
  /** Table description of table wp_redirection_logs. Objects of this class serve as prototypes for rows in queries. */
  class WpRedirectionLogs(_tableTag: Tag) extends profile.api.Table[WpRedirectionLogsRow](_tableTag, Some("wp_atopia"), "wp_redirection_logs") {
    def * = (id, created, url, sent_to, agent, referrer, redirection_id, ip, module_id, group_id).<>(WpRedirectionLogsRow.tupled, WpRedirectionLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(created), Rep.Some(url), sent_to, Rep.Some(agent), referrer, redirection_id, ip, Rep.Some(module_id), group_id)).shaped.<>({r=>import r._; _1.map(_=> WpRedirectionLogsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7, _8, _9.get, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created SqlType(DATETIME) */
    val created: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created")
    /** Database column url SqlType(MEDIUMTEXT), Length(16777215,true) */
    val url: Rep[String] = column[String]("url", O.Length(16777215,varying=true))
    /** Database column sent_to SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL)) */
    val sent_to: Rep[Option[String]] = column[Option[String]]("sent_to", O.Length(16777215,varying=true), O.Default(Some("NULL")))
    /** Database column agent SqlType(MEDIUMTEXT), Length(16777215,true) */
    val agent: Rep[String] = column[String]("agent", O.Length(16777215,varying=true))
    /** Database column referrer SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL)) */
    val referrer: Rep[Option[String]] = column[Option[String]]("referrer", O.Length(16777215,varying=true), O.Default(Some("NULL")))
    /** Database column redirection_id SqlType(INT UNSIGNED), Default(None) */
    val redirection_id: Rep[Option[Long]] = column[Option[Long]]("redirection_id", O.Default(None))
    /** Database column ip SqlType(VARCHAR), Length(45,true), Default(Some(NULL)) */
    val ip: Rep[Option[String]] = column[Option[String]]("ip", O.Length(45,varying=true), O.Default(Some("NULL")))
    /** Database column module_id SqlType(INT UNSIGNED) */
    val module_id: Rep[Long] = column[Long]("module_id")
    /** Database column group_id SqlType(INT UNSIGNED), Default(None) */
    val group_id: Rep[Option[Long]] = column[Option[Long]]("group_id", O.Default(None))

    /** Index over (created) (database name created) */
    val index1 = index("created", created)
    /** Index over (group_id) (database name group_id) */
    val index2 = index("group_id", group_id)
    /** Index over (ip) (database name ip) */
    val index3 = index("ip", ip)
    /** Index over (module_id) (database name module_id) */
    val index4 = index("module_id", module_id)
    /** Index over (redirection_id) (database name redirection_id) */
    val index5 = index("redirection_id", redirection_id)
  }
  /** Collection-like TableQuery object for table WpRedirectionLogs */
  lazy val WpRedirectionLogs = new TableQuery(tag => new WpRedirectionLogs(tag))
}
