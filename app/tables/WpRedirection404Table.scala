package tables
// AUTO-GENERATED Slick data model for table WpRedirection404
trait WpRedirection404Table {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpRedirection404
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param created Database column created SqlType(DATETIME)
   *  @param url Database column url SqlType(VARCHAR), Length(255,true), Default('')
   *  @param agent Database column agent SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param referrer Database column referrer SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param ip Database column ip SqlType(VARCHAR), Length(45,true), Default(Some(NULL)) */
  case class WpRedirection404Row(id: Long, created: java.sql.Timestamp, url: String, agent: Option[String], referrer: Option[String], ip: Option[String])
  /** GetResult implicit for fetching WpRedirection404Row objects using plain SQL queries */
  implicit def GetResultWpRedirection404Row(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Option[String]]): GR[WpRedirection404Row] = GR{
    prs => import prs._
    WpRedirection404Row.tupled((<<[Long], <<[java.sql.Timestamp], <<[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table wp_redirection_404. Objects of this class serve as prototypes for rows in queries. */
  class WpRedirection404(_tableTag: Tag) extends profile.api.Table[WpRedirection404Row](_tableTag, Some("wp_atopia"), "wp_redirection_404") {
    def * = (id, created, url, agent, referrer, ip).<>(WpRedirection404Row.tupled, WpRedirection404Row.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(created), Rep.Some(url), agent, referrer, ip)).shaped.<>({r=>import r._; _1.map(_=> WpRedirection404Row.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created SqlType(DATETIME) */
    val created: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created")
    /** Database column url SqlType(VARCHAR), Length(255,true), Default('') */
    val url: Rep[String] = column[String]("url", O.Length(255,varying=true), O.Default("''"))
    /** Database column agent SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val agent: Rep[Option[String]] = column[Option[String]]("agent", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column referrer SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val referrer: Rep[Option[String]] = column[Option[String]]("referrer", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column ip SqlType(VARCHAR), Length(45,true), Default(Some(NULL)) */
    val ip: Rep[Option[String]] = column[Option[String]]("ip", O.Length(45,varying=true), O.Default(Some("NULL")))

    /** Index over (created) (database name created) */
    val index1 = index("created", created)
    /** Index over (ip) (database name ip) */
    val index2 = index("ip", ip)
    /** Index over (referrer) (database name referrer) */
    val index3 = index("referrer", referrer)
    /** Index over (url) (database name url) */
    val index4 = index("url", url)
  }
  /** Collection-like TableQuery object for table WpRedirection404 */
  lazy val WpRedirection404 = new TableQuery(tag => new WpRedirection404(tag))
}
