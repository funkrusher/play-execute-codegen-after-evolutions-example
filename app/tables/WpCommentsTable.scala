package tables
// AUTO-GENERATED Slick data model for table WpComments
trait WpCommentsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpComments
   *  @param comment_ID Database column comment_ID SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param comment_post_ID Database column comment_post_ID SqlType(BIGINT UNSIGNED), Default(0)
   *  @param comment_author Database column comment_author SqlType(TINYTEXT), Length(255,true)
   *  @param comment_author_email Database column comment_author_email SqlType(VARCHAR), Length(100,true), Default('')
   *  @param comment_author_url Database column comment_author_url SqlType(VARCHAR), Length(200,true), Default('')
   *  @param comment_author_IP Database column comment_author_IP SqlType(VARCHAR), Length(100,true), Default('')
   *  @param comment_date Database column comment_date SqlType(DATETIME)
   *  @param comment_date_gmt Database column comment_date_gmt SqlType(DATETIME)
   *  @param comment_content Database column comment_content SqlType(TEXT)
   *  @param comment_karma Database column comment_karma SqlType(INT), Default(0)
   *  @param comment_approved Database column comment_approved SqlType(VARCHAR), Length(20,true), Default('1')
   *  @param comment_agent Database column comment_agent SqlType(VARCHAR), Length(255,true), Default('')
   *  @param comment_type Database column comment_type SqlType(VARCHAR), Length(20,true), Default('')
   *  @param comment_parent Database column comment_parent SqlType(BIGINT UNSIGNED), Default(0)
   *  @param user_id Database column user_id SqlType(BIGINT UNSIGNED), Default(0) */
  case class WpCommentsRow(comment_ID: Long, comment_post_ID: Long, comment_author: String, comment_author_email: String, comment_author_url: String, comment_author_IP: String, comment_date: java.sql.Timestamp, comment_date_gmt: java.sql.Timestamp, comment_content: String, comment_karma: Int, comment_approved: String, comment_agent: String, comment_type: String, comment_parent: Long, user_id: Long)
  /** GetResult implicit for fetching WpCommentsRow objects using plain SQL queries */
  implicit def GetResultWpCommentsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Int]): GR[WpCommentsRow] = GR{
    prs => import prs._
    WpCommentsRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[Int], <<[String], <<[String], <<[String], <<[Long], <<[Long]))
  }
  /** Table description of table wp_comments. Objects of this class serve as prototypes for rows in queries. */
  class WpComments(_tableTag: Tag) extends profile.api.Table[WpCommentsRow](_tableTag, Some("wp_atopia"), "wp_comments") {
    def * = (comment_ID, comment_post_ID, comment_author, comment_author_email, comment_author_url, comment_author_IP, comment_date, comment_date_gmt, comment_content, comment_karma, comment_approved, comment_agent, comment_type, comment_parent, user_id).<>(WpCommentsRow.tupled, WpCommentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(comment_ID), Rep.Some(comment_post_ID), Rep.Some(comment_author), Rep.Some(comment_author_email), Rep.Some(comment_author_url), Rep.Some(comment_author_IP), Rep.Some(comment_date), Rep.Some(comment_date_gmt), Rep.Some(comment_content), Rep.Some(comment_karma), Rep.Some(comment_approved), Rep.Some(comment_agent), Rep.Some(comment_type), Rep.Some(comment_parent), Rep.Some(user_id))).shaped.<>({r=>import r._; _1.map(_=> WpCommentsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column comment_ID SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val comment_ID: Rep[Long] = column[Long]("comment_ID", O.AutoInc, O.PrimaryKey)
    /** Database column comment_post_ID SqlType(BIGINT UNSIGNED), Default(0) */
    val comment_post_ID: Rep[Long] = column[Long]("comment_post_ID", O.Default(0L))
    /** Database column comment_author SqlType(TINYTEXT), Length(255,true) */
    val comment_author: Rep[String] = column[String]("comment_author", O.Length(255,varying=true))
    /** Database column comment_author_email SqlType(VARCHAR), Length(100,true), Default('') */
    val comment_author_email: Rep[String] = column[String]("comment_author_email", O.Length(100,varying=true), O.Default("''"))
    /** Database column comment_author_url SqlType(VARCHAR), Length(200,true), Default('') */
    val comment_author_url: Rep[String] = column[String]("comment_author_url", O.Length(200,varying=true), O.Default("''"))
    /** Database column comment_author_IP SqlType(VARCHAR), Length(100,true), Default('') */
    val comment_author_IP: Rep[String] = column[String]("comment_author_IP", O.Length(100,varying=true), O.Default("''"))
    /** Database column comment_date SqlType(DATETIME) */
    val comment_date: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("comment_date")
    /** Database column comment_date_gmt SqlType(DATETIME) */
    val comment_date_gmt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("comment_date_gmt")
    /** Database column comment_content SqlType(TEXT) */
    val comment_content: Rep[String] = column[String]("comment_content")
    /** Database column comment_karma SqlType(INT), Default(0) */
    val comment_karma: Rep[Int] = column[Int]("comment_karma", O.Default(0))
    /** Database column comment_approved SqlType(VARCHAR), Length(20,true), Default('1') */
    val comment_approved: Rep[String] = column[String]("comment_approved", O.Length(20,varying=true), O.Default("'1'"))
    /** Database column comment_agent SqlType(VARCHAR), Length(255,true), Default('') */
    val comment_agent: Rep[String] = column[String]("comment_agent", O.Length(255,varying=true), O.Default("''"))
    /** Database column comment_type SqlType(VARCHAR), Length(20,true), Default('') */
    val comment_type: Rep[String] = column[String]("comment_type", O.Length(20,varying=true), O.Default("''"))
    /** Database column comment_parent SqlType(BIGINT UNSIGNED), Default(0) */
    val comment_parent: Rep[Long] = column[Long]("comment_parent", O.Default(0L))
    /** Database column user_id SqlType(BIGINT UNSIGNED), Default(0) */
    val user_id: Rep[Long] = column[Long]("user_id", O.Default(0L))

    /** Index over (comment_approved,comment_date_gmt) (database name comment_approved_date_gmt) */
    val index1 = index("comment_approved_date_gmt", (comment_approved, comment_date_gmt))
    /** Index over (comment_author_email) (database name comment_author_email) */
    val index2 = index("comment_author_email", comment_author_email)
    /** Index over (comment_date_gmt) (database name comment_date_gmt) */
    val index3 = index("comment_date_gmt", comment_date_gmt)
    /** Index over (comment_parent) (database name comment_parent) */
    val index4 = index("comment_parent", comment_parent)
    /** Index over (comment_post_ID) (database name comment_post_ID) */
    val index5 = index("comment_post_ID", comment_post_ID)
  }
  /** Collection-like TableQuery object for table WpComments */
  lazy val WpComments = new TableQuery(tag => new WpComments(tag))
}
