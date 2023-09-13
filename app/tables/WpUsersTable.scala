package tables
// AUTO-GENERATED Slick data model for table WpUsers
trait WpUsersTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpUsers
   *  @param ID Database column ID SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param user_login Database column user_login SqlType(VARCHAR), Length(60,true), Default('')
   *  @param user_pass Database column user_pass SqlType(VARCHAR), Length(255,true), Default('')
   *  @param user_nicename Database column user_nicename SqlType(VARCHAR), Length(50,true), Default('')
   *  @param user_email Database column user_email SqlType(VARCHAR), Length(100,true), Default('')
   *  @param user_url Database column user_url SqlType(VARCHAR), Length(100,true), Default('')
   *  @param user_registered Database column user_registered SqlType(DATETIME)
   *  @param user_activation_key Database column user_activation_key SqlType(VARCHAR), Length(255,true), Default('')
   *  @param user_status Database column user_status SqlType(INT), Default(0)
   *  @param display_name Database column display_name SqlType(VARCHAR), Length(250,true), Default('') */
  case class WpUsersRow(ID: Long, user_login: String, user_pass: String, user_nicename: String, user_email: String, user_url: String, user_registered: java.sql.Timestamp, user_activation_key: String, user_status: Int, display_name: String)
  /** GetResult implicit for fetching WpUsersRow objects using plain SQL queries */
  implicit def GetResultWpUsersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Int]): GR[WpUsersRow] = GR{
    prs => import prs._
    WpUsersRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[String], <<[Int], <<[String]))
  }
  /** Table description of table wp_users. Objects of this class serve as prototypes for rows in queries. */
  class WpUsers(_tableTag: Tag) extends profile.api.Table[WpUsersRow](_tableTag, Some("wp_atopia"), "wp_users") {
    def * = (ID, user_login, user_pass, user_nicename, user_email, user_url, user_registered, user_activation_key, user_status, display_name).<>(WpUsersRow.tupled, WpUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(ID), Rep.Some(user_login), Rep.Some(user_pass), Rep.Some(user_nicename), Rep.Some(user_email), Rep.Some(user_url), Rep.Some(user_registered), Rep.Some(user_activation_key), Rep.Some(user_status), Rep.Some(display_name))).shaped.<>({r=>import r._; _1.map(_=> WpUsersRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val ID: Rep[Long] = column[Long]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column user_login SqlType(VARCHAR), Length(60,true), Default('') */
    val user_login: Rep[String] = column[String]("user_login", O.Length(60,varying=true), O.Default("''"))
    /** Database column user_pass SqlType(VARCHAR), Length(255,true), Default('') */
    val user_pass: Rep[String] = column[String]("user_pass", O.Length(255,varying=true), O.Default("''"))
    /** Database column user_nicename SqlType(VARCHAR), Length(50,true), Default('') */
    val user_nicename: Rep[String] = column[String]("user_nicename", O.Length(50,varying=true), O.Default("''"))
    /** Database column user_email SqlType(VARCHAR), Length(100,true), Default('') */
    val user_email: Rep[String] = column[String]("user_email", O.Length(100,varying=true), O.Default("''"))
    /** Database column user_url SqlType(VARCHAR), Length(100,true), Default('') */
    val user_url: Rep[String] = column[String]("user_url", O.Length(100,varying=true), O.Default("''"))
    /** Database column user_registered SqlType(DATETIME) */
    val user_registered: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("user_registered")
    /** Database column user_activation_key SqlType(VARCHAR), Length(255,true), Default('') */
    val user_activation_key: Rep[String] = column[String]("user_activation_key", O.Length(255,varying=true), O.Default("''"))
    /** Database column user_status SqlType(INT), Default(0) */
    val user_status: Rep[Int] = column[Int]("user_status", O.Default(0))
    /** Database column display_name SqlType(VARCHAR), Length(250,true), Default('') */
    val display_name: Rep[String] = column[String]("display_name", O.Length(250,varying=true), O.Default("''"))

    /** Index over (user_email) (database name user_email) */
    val index1 = index("user_email", user_email)
    /** Index over (user_login) (database name user_login_key) */
    val index2 = index("user_login_key", user_login)
    /** Index over (user_nicename) (database name user_nicename) */
    val index3 = index("user_nicename", user_nicename)
  }
  /** Collection-like TableQuery object for table WpUsers */
  lazy val WpUsers = new TableQuery(tag => new WpUsers(tag))
}
