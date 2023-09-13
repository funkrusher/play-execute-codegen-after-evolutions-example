package tables
// AUTO-GENERATED Slick data model for table WpYoastIndexable
trait WpYoastIndexableTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpYoastIndexable
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param permalink Database column permalink SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param permalink_hash Database column permalink_hash SqlType(VARCHAR), Length(191,true), Default(Some(NULL))
   *  @param object_id Database column object_id SqlType(INT UNSIGNED), Default(None)
   *  @param object_type Database column object_type SqlType(VARCHAR), Length(32,true)
   *  @param object_sub_type Database column object_sub_type SqlType(VARCHAR), Length(32,true), Default(Some(NULL))
   *  @param author_id Database column author_id SqlType(INT UNSIGNED), Default(None)
   *  @param post_parent Database column post_parent SqlType(INT UNSIGNED), Default(None)
   *  @param title Database column title SqlType(TEXT), Default(Some(NULL))
   *  @param description Database column description SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL))
   *  @param breadcrumb_title Database column breadcrumb_title SqlType(TEXT), Default(Some(NULL))
   *  @param post_status Database column post_status SqlType(VARCHAR), Length(191,true), Default(Some(NULL))
   *  @param is_public Database column is_public SqlType(BOOLEAN), Default(None)
   *  @param is_protected Database column is_protected SqlType(BOOLEAN), Default(Some(false))
   *  @param has_public_posts Database column has_public_posts SqlType(BOOLEAN), Default(None)
   *  @param number_of_pages Database column number_of_pages SqlType(INT UNSIGNED), Default(None)
   *  @param canonical Database column canonical SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param primary_focus_keyword Database column primary_focus_keyword SqlType(VARCHAR), Length(191,true), Default(Some(NULL))
   *  @param primary_focus_keyword_score Database column primary_focus_keyword_score SqlType(INT), Default(None)
   *  @param readability_score Database column readability_score SqlType(INT), Default(None)
   *  @param is_cornerstone Database column is_cornerstone SqlType(BOOLEAN), Default(Some(false))
   *  @param is_robots_noindex Database column is_robots_noindex SqlType(BOOLEAN), Default(Some(false))
   *  @param is_robots_nofollow Database column is_robots_nofollow SqlType(BOOLEAN), Default(Some(false))
   *  @param is_robots_noarchive Database column is_robots_noarchive SqlType(BOOLEAN), Default(Some(false))
   *  @param is_robots_noimageindex Database column is_robots_noimageindex SqlType(BOOLEAN), Default(Some(false))
   *  @param is_robots_nosnippet Database column is_robots_nosnippet SqlType(BOOLEAN), Default(Some(false))
   *  @param twitter_title Database column twitter_title SqlType(TEXT), Default(Some(NULL))
   *  @param twitter_image Database column twitter_image SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param twitter_description Database column twitter_description SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param twitter_image_id Database column twitter_image_id SqlType(VARCHAR), Length(191,true), Default(Some(NULL))
   *  @param twitter_image_source Database column twitter_image_source SqlType(TEXT), Default(Some(NULL))
   *  @param open_graph_title Database column open_graph_title SqlType(TEXT), Default(Some(NULL))
   *  @param open_graph_description Database column open_graph_description SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param open_graph_image Database column open_graph_image SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param open_graph_image_id Database column open_graph_image_id SqlType(VARCHAR), Length(191,true), Default(Some(NULL))
   *  @param open_graph_image_source Database column open_graph_image_source SqlType(TEXT), Default(Some(NULL))
   *  @param open_graph_image_meta Database column open_graph_image_meta SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL))
   *  @param link_count Database column link_count SqlType(INT), Default(None)
   *  @param incoming_link_count Database column incoming_link_count SqlType(INT), Default(None)
   *  @param prominent_words_version Database column prominent_words_version SqlType(INT UNSIGNED), Default(None)
   *  @param created_at Database column created_at SqlType(DATETIME), Default(None)
   *  @param updated_at Database column updated_at SqlType(TIMESTAMP)
   *  @param blog_id Database column blog_id SqlType(BIGINT), Default(1)
   *  @param language Database column language SqlType(VARCHAR), Length(32,true), Default(Some(NULL))
   *  @param region Database column region SqlType(VARCHAR), Length(32,true), Default(Some(NULL))
   *  @param schema_page_type Database column schema_page_type SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param schema_article_type Database column schema_article_type SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
  case class WpYoastIndexableRow(id: Long, permalink: Option[String], permalink_hash: Option[String], object_id: Option[Long], object_type: String, object_sub_type: Option[String], author_id: Option[Long], post_parent: Option[Long], title: Option[String], description: Option[String], breadcrumb_title: Option[String], post_status: Option[String], is_public: Option[Boolean], is_protected: Option[Boolean], has_public_posts: Option[Boolean], number_of_pages: Option[Long], canonical: Option[String], primary_focus_keyword: Option[String], primary_focus_keyword_score: Option[Int], readability_score: Option[Int], is_cornerstone: Option[Boolean], is_robots_noindex: Option[Boolean], is_robots_nofollow: Option[Boolean], is_robots_noarchive: Option[Boolean], is_robots_noimageindex: Option[Boolean], is_robots_nosnippet: Option[Boolean], twitter_title: Option[String], twitter_image: Option[String], twitter_description: Option[String], twitter_image_id: Option[String], twitter_image_source: Option[String], open_graph_title: Option[String], open_graph_description: Option[String], open_graph_image: Option[String], open_graph_image_id: Option[String], open_graph_image_source: Option[String], open_graph_image_meta: Option[String], link_count: Option[Int], incoming_link_count: Option[Int], prominent_words_version: Option[Long], created_at: Option[java.sql.Timestamp], updated_at: java.sql.Timestamp, blog_id: Long, language: Option[String], region: Option[String], schema_page_type: Option[String], schema_article_type: Option[String])
  /** GetResult implicit for fetching WpYoastIndexableRow objects using plain SQL queries */
  implicit def GetResultWpYoastIndexableRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[String], e4: GR[Option[Boolean]], e5: GR[Option[Int]], e6: GR[Option[java.sql.Timestamp]], e7: GR[java.sql.Timestamp]): GR[WpYoastIndexableRow] = GR{
    prs => import prs._
    WpYoastIndexableRow(<<[Long], <<?[String], <<?[String], <<?[Long], <<[String], <<?[String], <<?[Long], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Boolean], <<?[Boolean], <<?[Boolean], <<?[Long], <<?[String], <<?[String], <<?[Int], <<?[Int], <<?[Boolean], <<?[Boolean], <<?[Boolean], <<?[Boolean], <<?[Boolean], <<?[Boolean], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[Int], <<?[Long], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String])
  }
  /** Table description of table wp_yoast_indexable. Objects of this class serve as prototypes for rows in queries. */
  class WpYoastIndexable(_tableTag: Tag) extends profile.api.Table[WpYoastIndexableRow](_tableTag, Some("wp_atopia"), "wp_yoast_indexable") {
    def * = (id :: permalink :: permalink_hash :: object_id :: object_type :: object_sub_type :: author_id :: post_parent :: title :: description :: breadcrumb_title :: post_status :: is_public :: is_protected :: has_public_posts :: number_of_pages :: canonical :: primary_focus_keyword :: primary_focus_keyword_score :: readability_score :: is_cornerstone :: is_robots_noindex :: is_robots_nofollow :: is_robots_noarchive :: is_robots_noimageindex :: is_robots_nosnippet :: twitter_title :: twitter_image :: twitter_description :: twitter_image_id :: twitter_image_source :: open_graph_title :: open_graph_description :: open_graph_image :: open_graph_image_id :: open_graph_image_source :: open_graph_image_meta :: link_count :: incoming_link_count :: prominent_words_version :: created_at :: updated_at :: blog_id :: language :: region :: schema_page_type :: schema_article_type :: HNil).mapTo[WpYoastIndexableRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id) :: permalink :: permalink_hash :: object_id :: Rep.Some(object_type) :: object_sub_type :: author_id :: post_parent :: title :: description :: breadcrumb_title :: post_status :: is_public :: is_protected :: has_public_posts :: number_of_pages :: canonical :: primary_focus_keyword :: primary_focus_keyword_score :: readability_score :: is_cornerstone :: is_robots_noindex :: is_robots_nofollow :: is_robots_noarchive :: is_robots_noimageindex :: is_robots_nosnippet :: twitter_title :: twitter_image :: twitter_description :: twitter_image_id :: twitter_image_source :: open_graph_title :: open_graph_description :: open_graph_image :: open_graph_image_id :: open_graph_image_source :: open_graph_image_meta :: link_count :: incoming_link_count :: prominent_words_version :: created_at :: Rep.Some(updated_at) :: Rep.Some(blog_id) :: language :: region :: schema_page_type :: schema_article_type :: HNil).shaped.<>(r => WpYoastIndexableRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[Long]], r(4).asInstanceOf[Option[String]].get, r(5).asInstanceOf[Option[String]], r(6).asInstanceOf[Option[Long]], r(7).asInstanceOf[Option[Long]], r(8).asInstanceOf[Option[String]], r(9).asInstanceOf[Option[String]], r(10).asInstanceOf[Option[String]], r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[Boolean]], r(13).asInstanceOf[Option[Boolean]], r(14).asInstanceOf[Option[Boolean]], r(15).asInstanceOf[Option[Long]], r(16).asInstanceOf[Option[String]], r(17).asInstanceOf[Option[String]], r(18).asInstanceOf[Option[Int]], r(19).asInstanceOf[Option[Int]], r(20).asInstanceOf[Option[Boolean]], r(21).asInstanceOf[Option[Boolean]], r(22).asInstanceOf[Option[Boolean]], r(23).asInstanceOf[Option[Boolean]], r(24).asInstanceOf[Option[Boolean]], r(25).asInstanceOf[Option[Boolean]], r(26).asInstanceOf[Option[String]], r(27).asInstanceOf[Option[String]], r(28).asInstanceOf[Option[String]], r(29).asInstanceOf[Option[String]], r(30).asInstanceOf[Option[String]], r(31).asInstanceOf[Option[String]], r(32).asInstanceOf[Option[String]], r(33).asInstanceOf[Option[String]], r(34).asInstanceOf[Option[String]], r(35).asInstanceOf[Option[String]], r(36).asInstanceOf[Option[String]], r(37).asInstanceOf[Option[Int]], r(38).asInstanceOf[Option[Int]], r(39).asInstanceOf[Option[Long]], r(40).asInstanceOf[Option[java.sql.Timestamp]], r(41).asInstanceOf[Option[java.sql.Timestamp]].get, r(42).asInstanceOf[Option[Long]].get, r(43).asInstanceOf[Option[String]], r(44).asInstanceOf[Option[String]], r(45).asInstanceOf[Option[String]], r(46).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column permalink SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val permalink: Rep[Option[String]] = column[Option[String]]("permalink", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column permalink_hash SqlType(VARCHAR), Length(191,true), Default(Some(NULL)) */
    val permalink_hash: Rep[Option[String]] = column[Option[String]]("permalink_hash", O.Length(191,varying=true), O.Default(Some("NULL")))
    /** Database column object_id SqlType(INT UNSIGNED), Default(None) */
    val object_id: Rep[Option[Long]] = column[Option[Long]]("object_id", O.Default(None))
    /** Database column object_type SqlType(VARCHAR), Length(32,true) */
    val object_type: Rep[String] = column[String]("object_type", O.Length(32,varying=true))
    /** Database column object_sub_type SqlType(VARCHAR), Length(32,true), Default(Some(NULL)) */
    val object_sub_type: Rep[Option[String]] = column[Option[String]]("object_sub_type", O.Length(32,varying=true), O.Default(Some("NULL")))
    /** Database column author_id SqlType(INT UNSIGNED), Default(None) */
    val author_id: Rep[Option[Long]] = column[Option[Long]]("author_id", O.Default(None))
    /** Database column post_parent SqlType(INT UNSIGNED), Default(None) */
    val post_parent: Rep[Option[Long]] = column[Option[Long]]("post_parent", O.Default(None))
    /** Database column title SqlType(TEXT), Default(Some(NULL)) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Default(Some("NULL")))
    /** Database column description SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL)) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(16777215,varying=true), O.Default(Some("NULL")))
    /** Database column breadcrumb_title SqlType(TEXT), Default(Some(NULL)) */
    val breadcrumb_title: Rep[Option[String]] = column[Option[String]]("breadcrumb_title", O.Default(Some("NULL")))
    /** Database column post_status SqlType(VARCHAR), Length(191,true), Default(Some(NULL)) */
    val post_status: Rep[Option[String]] = column[Option[String]]("post_status", O.Length(191,varying=true), O.Default(Some("NULL")))
    /** Database column is_public SqlType(BOOLEAN), Default(None) */
    val is_public: Rep[Option[Boolean]] = column[Option[Boolean]]("is_public", O.Default(None))
    /** Database column is_protected SqlType(BOOLEAN), Default(Some(false)) */
    val is_protected: Rep[Option[Boolean]] = column[Option[Boolean]]("is_protected", O.Default(Some(false)))
    /** Database column has_public_posts SqlType(BOOLEAN), Default(None) */
    val has_public_posts: Rep[Option[Boolean]] = column[Option[Boolean]]("has_public_posts", O.Default(None))
    /** Database column number_of_pages SqlType(INT UNSIGNED), Default(None) */
    val number_of_pages: Rep[Option[Long]] = column[Option[Long]]("number_of_pages", O.Default(None))
    /** Database column canonical SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val canonical: Rep[Option[String]] = column[Option[String]]("canonical", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column primary_focus_keyword SqlType(VARCHAR), Length(191,true), Default(Some(NULL)) */
    val primary_focus_keyword: Rep[Option[String]] = column[Option[String]]("primary_focus_keyword", O.Length(191,varying=true), O.Default(Some("NULL")))
    /** Database column primary_focus_keyword_score SqlType(INT), Default(None) */
    val primary_focus_keyword_score: Rep[Option[Int]] = column[Option[Int]]("primary_focus_keyword_score", O.Default(None))
    /** Database column readability_score SqlType(INT), Default(None) */
    val readability_score: Rep[Option[Int]] = column[Option[Int]]("readability_score", O.Default(None))
    /** Database column is_cornerstone SqlType(BOOLEAN), Default(Some(false)) */
    val is_cornerstone: Rep[Option[Boolean]] = column[Option[Boolean]]("is_cornerstone", O.Default(Some(false)))
    /** Database column is_robots_noindex SqlType(BOOLEAN), Default(Some(false)) */
    val is_robots_noindex: Rep[Option[Boolean]] = column[Option[Boolean]]("is_robots_noindex", O.Default(Some(false)))
    /** Database column is_robots_nofollow SqlType(BOOLEAN), Default(Some(false)) */
    val is_robots_nofollow: Rep[Option[Boolean]] = column[Option[Boolean]]("is_robots_nofollow", O.Default(Some(false)))
    /** Database column is_robots_noarchive SqlType(BOOLEAN), Default(Some(false)) */
    val is_robots_noarchive: Rep[Option[Boolean]] = column[Option[Boolean]]("is_robots_noarchive", O.Default(Some(false)))
    /** Database column is_robots_noimageindex SqlType(BOOLEAN), Default(Some(false)) */
    val is_robots_noimageindex: Rep[Option[Boolean]] = column[Option[Boolean]]("is_robots_noimageindex", O.Default(Some(false)))
    /** Database column is_robots_nosnippet SqlType(BOOLEAN), Default(Some(false)) */
    val is_robots_nosnippet: Rep[Option[Boolean]] = column[Option[Boolean]]("is_robots_nosnippet", O.Default(Some(false)))
    /** Database column twitter_title SqlType(TEXT), Default(Some(NULL)) */
    val twitter_title: Rep[Option[String]] = column[Option[String]]("twitter_title", O.Default(Some("NULL")))
    /** Database column twitter_image SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val twitter_image: Rep[Option[String]] = column[Option[String]]("twitter_image", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column twitter_description SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val twitter_description: Rep[Option[String]] = column[Option[String]]("twitter_description", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column twitter_image_id SqlType(VARCHAR), Length(191,true), Default(Some(NULL)) */
    val twitter_image_id: Rep[Option[String]] = column[Option[String]]("twitter_image_id", O.Length(191,varying=true), O.Default(Some("NULL")))
    /** Database column twitter_image_source SqlType(TEXT), Default(Some(NULL)) */
    val twitter_image_source: Rep[Option[String]] = column[Option[String]]("twitter_image_source", O.Default(Some("NULL")))
    /** Database column open_graph_title SqlType(TEXT), Default(Some(NULL)) */
    val open_graph_title: Rep[Option[String]] = column[Option[String]]("open_graph_title", O.Default(Some("NULL")))
    /** Database column open_graph_description SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val open_graph_description: Rep[Option[String]] = column[Option[String]]("open_graph_description", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column open_graph_image SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val open_graph_image: Rep[Option[String]] = column[Option[String]]("open_graph_image", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column open_graph_image_id SqlType(VARCHAR), Length(191,true), Default(Some(NULL)) */
    val open_graph_image_id: Rep[Option[String]] = column[Option[String]]("open_graph_image_id", O.Length(191,varying=true), O.Default(Some("NULL")))
    /** Database column open_graph_image_source SqlType(TEXT), Default(Some(NULL)) */
    val open_graph_image_source: Rep[Option[String]] = column[Option[String]]("open_graph_image_source", O.Default(Some("NULL")))
    /** Database column open_graph_image_meta SqlType(MEDIUMTEXT), Length(16777215,true), Default(Some(NULL)) */
    val open_graph_image_meta: Rep[Option[String]] = column[Option[String]]("open_graph_image_meta", O.Length(16777215,varying=true), O.Default(Some("NULL")))
    /** Database column link_count SqlType(INT), Default(None) */
    val link_count: Rep[Option[Int]] = column[Option[Int]]("link_count", O.Default(None))
    /** Database column incoming_link_count SqlType(INT), Default(None) */
    val incoming_link_count: Rep[Option[Int]] = column[Option[Int]]("incoming_link_count", O.Default(None))
    /** Database column prominent_words_version SqlType(INT UNSIGNED), Default(None) */
    val prominent_words_version: Rep[Option[Long]] = column[Option[Long]]("prominent_words_version", O.Default(None))
    /** Database column created_at SqlType(DATETIME), Default(None) */
    val created_at: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updated_at: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("updated_at")
    /** Database column blog_id SqlType(BIGINT), Default(1) */
    val blog_id: Rep[Long] = column[Long]("blog_id", O.Default(1L))
    /** Database column language SqlType(VARCHAR), Length(32,true), Default(Some(NULL)) */
    val language: Rep[Option[String]] = column[Option[String]]("language", O.Length(32,varying=true), O.Default(Some("NULL")))
    /** Database column region SqlType(VARCHAR), Length(32,true), Default(Some(NULL)) */
    val region: Rep[Option[String]] = column[Option[String]]("region", O.Length(32,varying=true), O.Default(Some("NULL")))
    /** Database column schema_page_type SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val schema_page_type: Rep[Option[String]] = column[Option[String]]("schema_page_type", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column schema_article_type SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val schema_article_type: Rep[Option[String]] = column[Option[String]]("schema_article_type", O.Length(64,varying=true), O.Default(Some("NULL")))

    /** Index over (object_id,object_type) (database name object_id_and_type) */
    val index1 = index("object_id_and_type", object_id :: object_type :: HNil)
    /** Index over (object_type,object_sub_type) (database name object_type_and_sub_type) */
    val index2 = index("object_type_and_sub_type", object_type :: object_sub_type :: HNil)
    /** Index over (permalink_hash) (database name permalink_hash) */
    val index3 = index("permalink_hash", permalink_hash :: HNil)
  }
  /** Collection-like TableQuery object for table WpYoastIndexable */
  lazy val WpYoastIndexable = new TableQuery(tag => new WpYoastIndexable(tag))
}
