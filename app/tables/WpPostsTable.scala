package tables
// AUTO-GENERATED Slick data model for table WpPosts
trait WpPostsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpPosts
   *  @param ID Database column ID SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param post_author Database column post_author SqlType(BIGINT UNSIGNED), Default(0)
   *  @param post_date Database column post_date SqlType(DATETIME)
   *  @param post_date_gmt Database column post_date_gmt SqlType(DATETIME)
   *  @param post_content Database column post_content SqlType(LONGTEXT), Length(2147483647,true)
   *  @param post_title Database column post_title SqlType(TEXT)
   *  @param post_excerpt Database column post_excerpt SqlType(TEXT)
   *  @param post_status Database column post_status SqlType(VARCHAR), Length(20,true), Default('publish')
   *  @param comment_status Database column comment_status SqlType(VARCHAR), Length(20,true), Default('open')
   *  @param ping_status Database column ping_status SqlType(VARCHAR), Length(20,true), Default('open')
   *  @param post_password Database column post_password SqlType(VARCHAR), Length(255,true), Default('')
   *  @param post_name Database column post_name SqlType(VARCHAR), Length(200,true), Default('')
   *  @param to_ping Database column to_ping SqlType(TEXT)
   *  @param pinged Database column pinged SqlType(TEXT)
   *  @param post_modified Database column post_modified SqlType(DATETIME)
   *  @param post_modified_gmt Database column post_modified_gmt SqlType(DATETIME)
   *  @param post_content_filtered Database column post_content_filtered SqlType(LONGTEXT), Length(2147483647,true)
   *  @param post_parent Database column post_parent SqlType(BIGINT UNSIGNED), Default(0)
   *  @param guid Database column guid SqlType(VARCHAR), Length(255,true), Default('')
   *  @param menu_order Database column menu_order SqlType(INT), Default(0)
   *  @param post_type Database column post_type SqlType(VARCHAR), Length(20,true), Default('post')
   *  @param post_mime_type Database column post_mime_type SqlType(VARCHAR), Length(100,true), Default('')
   *  @param comment_count Database column comment_count SqlType(BIGINT), Default(0) */
  case class WpPostsRow(ID: Long, post_author: Long, post_date: java.sql.Timestamp, post_date_gmt: java.sql.Timestamp, post_content: String, post_title: String, post_excerpt: String, post_status: String, comment_status: String, ping_status: String, post_password: String, post_name: String, to_ping: String, pinged: String, post_modified: java.sql.Timestamp, post_modified_gmt: java.sql.Timestamp, post_content_filtered: String, post_parent: Long, guid: String, menu_order: Int, post_type: String, post_mime_type: String, comment_count: Long)
  /** GetResult implicit for fetching WpPostsRow objects using plain SQL queries */
  implicit def GetResultWpPostsRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Int]): GR[WpPostsRow] = GR{
    prs => import prs._
    WpPostsRow(<<[Long], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[Long], <<[String], <<[Int], <<[String], <<[String], <<[Long])
  }
  /** Table description of table wp_posts. Objects of this class serve as prototypes for rows in queries. */
  class WpPosts(_tableTag: Tag) extends profile.api.Table[WpPostsRow](_tableTag, Some("wp_atopia"), "wp_posts") {
    def * = (ID :: post_author :: post_date :: post_date_gmt :: post_content :: post_title :: post_excerpt :: post_status :: comment_status :: ping_status :: post_password :: post_name :: to_ping :: pinged :: post_modified :: post_modified_gmt :: post_content_filtered :: post_parent :: guid :: menu_order :: post_type :: post_mime_type :: comment_count :: HNil).mapTo[WpPostsRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(ID) :: Rep.Some(post_author) :: Rep.Some(post_date) :: Rep.Some(post_date_gmt) :: Rep.Some(post_content) :: Rep.Some(post_title) :: Rep.Some(post_excerpt) :: Rep.Some(post_status) :: Rep.Some(comment_status) :: Rep.Some(ping_status) :: Rep.Some(post_password) :: Rep.Some(post_name) :: Rep.Some(to_ping) :: Rep.Some(pinged) :: Rep.Some(post_modified) :: Rep.Some(post_modified_gmt) :: Rep.Some(post_content_filtered) :: Rep.Some(post_parent) :: Rep.Some(guid) :: Rep.Some(menu_order) :: Rep.Some(post_type) :: Rep.Some(post_mime_type) :: Rep.Some(comment_count) :: HNil).shaped.<>(r => WpPostsRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[Long]].get, r(2).asInstanceOf[Option[java.sql.Timestamp]].get, r(3).asInstanceOf[Option[java.sql.Timestamp]].get, r(4).asInstanceOf[Option[String]].get, r(5).asInstanceOf[Option[String]].get, r(6).asInstanceOf[Option[String]].get, r(7).asInstanceOf[Option[String]].get, r(8).asInstanceOf[Option[String]].get, r(9).asInstanceOf[Option[String]].get, r(10).asInstanceOf[Option[String]].get, r(11).asInstanceOf[Option[String]].get, r(12).asInstanceOf[Option[String]].get, r(13).asInstanceOf[Option[String]].get, r(14).asInstanceOf[Option[java.sql.Timestamp]].get, r(15).asInstanceOf[Option[java.sql.Timestamp]].get, r(16).asInstanceOf[Option[String]].get, r(17).asInstanceOf[Option[Long]].get, r(18).asInstanceOf[Option[String]].get, r(19).asInstanceOf[Option[Int]].get, r(20).asInstanceOf[Option[String]].get, r(21).asInstanceOf[Option[String]].get, r(22).asInstanceOf[Option[Long]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val ID: Rep[Long] = column[Long]("ID", O.AutoInc, O.PrimaryKey)
    /** Database column post_author SqlType(BIGINT UNSIGNED), Default(0) */
    val post_author: Rep[Long] = column[Long]("post_author", O.Default(0L))
    /** Database column post_date SqlType(DATETIME) */
    val post_date: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("post_date")
    /** Database column post_date_gmt SqlType(DATETIME) */
    val post_date_gmt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("post_date_gmt")
    /** Database column post_content SqlType(LONGTEXT), Length(2147483647,true) */
    val post_content: Rep[String] = column[String]("post_content", O.Length(2147483647,varying=true))
    /** Database column post_title SqlType(TEXT) */
    val post_title: Rep[String] = column[String]("post_title")
    /** Database column post_excerpt SqlType(TEXT) */
    val post_excerpt: Rep[String] = column[String]("post_excerpt")
    /** Database column post_status SqlType(VARCHAR), Length(20,true), Default('publish') */
    val post_status: Rep[String] = column[String]("post_status", O.Length(20,varying=true), O.Default("'publish'"))
    /** Database column comment_status SqlType(VARCHAR), Length(20,true), Default('open') */
    val comment_status: Rep[String] = column[String]("comment_status", O.Length(20,varying=true), O.Default("'open'"))
    /** Database column ping_status SqlType(VARCHAR), Length(20,true), Default('open') */
    val ping_status: Rep[String] = column[String]("ping_status", O.Length(20,varying=true), O.Default("'open'"))
    /** Database column post_password SqlType(VARCHAR), Length(255,true), Default('') */
    val post_password: Rep[String] = column[String]("post_password", O.Length(255,varying=true), O.Default("''"))
    /** Database column post_name SqlType(VARCHAR), Length(200,true), Default('') */
    val post_name: Rep[String] = column[String]("post_name", O.Length(200,varying=true), O.Default("''"))
    /** Database column to_ping SqlType(TEXT) */
    val to_ping: Rep[String] = column[String]("to_ping")
    /** Database column pinged SqlType(TEXT) */
    val pinged: Rep[String] = column[String]("pinged")
    /** Database column post_modified SqlType(DATETIME) */
    val post_modified: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("post_modified")
    /** Database column post_modified_gmt SqlType(DATETIME) */
    val post_modified_gmt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("post_modified_gmt")
    /** Database column post_content_filtered SqlType(LONGTEXT), Length(2147483647,true) */
    val post_content_filtered: Rep[String] = column[String]("post_content_filtered", O.Length(2147483647,varying=true))
    /** Database column post_parent SqlType(BIGINT UNSIGNED), Default(0) */
    val post_parent: Rep[Long] = column[Long]("post_parent", O.Default(0L))
    /** Database column guid SqlType(VARCHAR), Length(255,true), Default('') */
    val guid: Rep[String] = column[String]("guid", O.Length(255,varying=true), O.Default("''"))
    /** Database column menu_order SqlType(INT), Default(0) */
    val menu_order: Rep[Int] = column[Int]("menu_order", O.Default(0))
    /** Database column post_type SqlType(VARCHAR), Length(20,true), Default('post') */
    val post_type: Rep[String] = column[String]("post_type", O.Length(20,varying=true), O.Default("'post'"))
    /** Database column post_mime_type SqlType(VARCHAR), Length(100,true), Default('') */
    val post_mime_type: Rep[String] = column[String]("post_mime_type", O.Length(100,varying=true), O.Default("''"))
    /** Database column comment_count SqlType(BIGINT), Default(0) */
    val comment_count: Rep[Long] = column[Long]("comment_count", O.Default(0L))

    /** Index over (post_author) (database name post_author) */
    val index1 = index("post_author", post_author :: HNil)
    /** Index over (post_name) (database name post_name) */
    val index2 = index("post_name", post_name :: HNil)
    /** Index over (post_parent) (database name post_parent) */
    val index3 = index("post_parent", post_parent :: HNil)
    /** Index over (post_type,post_status,post_date,ID) (database name type_status_date) */
    val index4 = index("type_status_date", post_type :: post_status :: post_date :: ID :: HNil)
  }
  /** Collection-like TableQuery object for table WpPosts */
  lazy val WpPosts = new TableQuery(tag => new WpPosts(tag))
}
