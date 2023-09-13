package tables
// AUTO-GENERATED Slick data model for table WpRedirectionItems
trait WpRedirectionItemsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpRedirectionItems
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param url Database column url SqlType(MEDIUMTEXT), Length(16777215,true)
   *  @param match_url Database column match_url SqlType(VARCHAR), Length(2000,true), Default(Some(NULL))
   *  @param match_data Database column match_data SqlType(TEXT), Default(Some(NULL))
   *  @param regex Database column regex SqlType(INT UNSIGNED), Default(0)
   *  @param position Database column position SqlType(INT UNSIGNED), Default(0)
   *  @param last_count Database column last_count SqlType(INT UNSIGNED), Default(0)
   *  @param last_access Database column last_access SqlType(DATETIME)
   *  @param group_id Database column group_id SqlType(INT), Default(0)
   *  @param status Database column status SqlType(ENUM), Length(8,true), Default('enabled')
   *  @param action_type Database column action_type SqlType(VARCHAR), Length(20,true)
   *  @param action_code Database column action_code SqlType(INT UNSIGNED)
   *  @param action_data Database column action_data SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL))
   *  @param match_type Database column match_type SqlType(VARCHAR), Length(20,true)
   *  @param title Database column title SqlType(TEXT), Default(Some(NULL)) */
  case class WpRedirectionItemsRow(id: Long, url: String, match_url: Option[String], match_data: Option[String], regex: Long, position: Long, last_count: Long, last_access: java.sql.Timestamp, group_id: Int, status: String, action_type: String, action_code: Long, action_data: Option[String], match_type: String, title: Option[String])
  /** GetResult implicit for fetching WpRedirectionItemsRow objects using plain SQL queries */
  implicit def GetResultWpRedirectionItemsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[Int]): GR[WpRedirectionItemsRow] = GR{
    prs => import prs._
    WpRedirectionItemsRow.tupled((<<[Long], <<[String], <<?[String], <<?[String], <<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp], <<[Int], <<[String], <<[String], <<[Long], <<?[String], <<[String], <<?[String]))
  }
  /** Table description of table wp_redirection_items. Objects of this class serve as prototypes for rows in queries. */
  class WpRedirectionItems(_tableTag: Tag) extends profile.api.Table[WpRedirectionItemsRow](_tableTag, Some("wp_atopia"), "wp_redirection_items") {
    def * = (id, url, match_url, match_data, regex, position, last_count, last_access, group_id, status, action_type, action_code, action_data, match_type, title).<>(WpRedirectionItemsRow.tupled, WpRedirectionItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(url), match_url, match_data, Rep.Some(regex), Rep.Some(position), Rep.Some(last_count), Rep.Some(last_access), Rep.Some(group_id), Rep.Some(status), Rep.Some(action_type), Rep.Some(action_code), action_data, Rep.Some(match_type), title)).shaped.<>({r=>import r._; _1.map(_=> WpRedirectionItemsRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13, _14.get, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column url SqlType(MEDIUMTEXT), Length(16777215,true) */
    val url: Rep[String] = column[String]("url", O.Length(16777215,varying=true))
    /** Database column match_url SqlType(VARCHAR), Length(2000,true), Default(Some(NULL)) */
    val match_url: Rep[Option[String]] = column[Option[String]]("match_url", O.Length(2000,varying=true), O.Default(Some("NULL")))
    /** Database column match_data SqlType(TEXT), Default(Some(NULL)) */
    val match_data: Rep[Option[String]] = column[Option[String]]("match_data", O.Default(Some("NULL")))
    /** Database column regex SqlType(INT UNSIGNED), Default(0) */
    val regex: Rep[Long] = column[Long]("regex", O.Default(0L))
    /** Database column position SqlType(INT UNSIGNED), Default(0) */
    val position: Rep[Long] = column[Long]("position", O.Default(0L))
    /** Database column last_count SqlType(INT UNSIGNED), Default(0) */
    val last_count: Rep[Long] = column[Long]("last_count", O.Default(0L))
    /** Database column last_access SqlType(DATETIME) */
    val last_access: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("last_access")
    /** Database column group_id SqlType(INT), Default(0) */
    val group_id: Rep[Int] = column[Int]("group_id", O.Default(0))
    /** Database column status SqlType(ENUM), Length(8,true), Default('enabled') */
    val status: Rep[String] = column[String]("status", O.Length(8,varying=true), O.Default("'enabled'"))
    /** Database column action_type SqlType(VARCHAR), Length(20,true) */
    val action_type: Rep[String] = column[String]("action_type", O.Length(20,varying=true))
    /** Database column action_code SqlType(INT UNSIGNED) */
    val action_code: Rep[Long] = column[Long]("action_code")
    /** Database column action_data SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL)) */
    val action_data: Rep[Option[String]] = column[Option[String]]("action_data", O.Length(16777215,varying=true), O.Default(Some("NULL")))
    /** Database column match_type SqlType(VARCHAR), Length(20,true) */
    val match_type: Rep[String] = column[String]("match_type", O.Length(20,varying=true))
    /** Database column title SqlType(TEXT), Default(Some(NULL)) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Default(Some("NULL")))

    /** Index over (group_id) (database name group) */
    val index1 = index("group", group_id)
    /** Index over (group_id,position) (database name group_idpos) */
    val index2 = index("group_idpos", (group_id, position))
    /** Index over (match_url) (database name match_url) */
    val index3 = index("match_url", match_url)
    /** Index over (regex) (database name regex) */
    val index4 = index("regex", regex)
    /** Index over (status) (database name status) */
    val index5 = index("status", status)
    /** Index over (url) (database name url) */
    val index6 = index("url", url)
  }
  /** Collection-like TableQuery object for table WpRedirectionItems */
  lazy val WpRedirectionItems = new TableQuery(tag => new WpRedirectionItems(tag))
}
