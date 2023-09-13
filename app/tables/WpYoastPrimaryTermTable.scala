package tables
// AUTO-GENERATED Slick data model for table WpYoastPrimaryTerm
trait WpYoastPrimaryTermTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpYoastPrimaryTerm
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param post_id Database column post_id SqlType(INT UNSIGNED)
   *  @param term_id Database column term_id SqlType(INT UNSIGNED)
   *  @param taxonomy Database column taxonomy SqlType(VARCHAR), Length(32,true)
   *  @param created_at Database column created_at SqlType(DATETIME), Default(None)
   *  @param updated_at Database column updated_at SqlType(TIMESTAMP)
   *  @param blog_id Database column blog_id SqlType(BIGINT), Default(1) */
  case class WpYoastPrimaryTermRow(id: Long, post_id: Long, term_id: Long, taxonomy: String, created_at: Option[java.sql.Timestamp], updated_at: java.sql.Timestamp, blog_id: Long)
  /** GetResult implicit for fetching WpYoastPrimaryTermRow objects using plain SQL queries */
  implicit def GetResultWpYoastPrimaryTermRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[java.sql.Timestamp]): GR[WpYoastPrimaryTermRow] = GR{
    prs => import prs._
    WpYoastPrimaryTermRow.tupled((<<[Long], <<[Long], <<[Long], <<[String], <<?[java.sql.Timestamp], <<[java.sql.Timestamp], <<[Long]))
  }
  /** Table description of table wp_yoast_primary_term. Objects of this class serve as prototypes for rows in queries. */
  class WpYoastPrimaryTerm(_tableTag: Tag) extends profile.api.Table[WpYoastPrimaryTermRow](_tableTag, Some("wp_atopia"), "wp_yoast_primary_term") {
    def * = (id, post_id, term_id, taxonomy, created_at, updated_at, blog_id).<>(WpYoastPrimaryTermRow.tupled, WpYoastPrimaryTermRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(post_id), Rep.Some(term_id), Rep.Some(taxonomy), created_at, Rep.Some(updated_at), Rep.Some(blog_id))).shaped.<>({r=>import r._; _1.map(_=> WpYoastPrimaryTermRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column post_id SqlType(INT UNSIGNED) */
    val post_id: Rep[Long] = column[Long]("post_id")
    /** Database column term_id SqlType(INT UNSIGNED) */
    val term_id: Rep[Long] = column[Long]("term_id")
    /** Database column taxonomy SqlType(VARCHAR), Length(32,true) */
    val taxonomy: Rep[String] = column[String]("taxonomy", O.Length(32,varying=true))
    /** Database column created_at SqlType(DATETIME), Default(None) */
    val created_at: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("created_at", O.Default(None))
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updated_at: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("updated_at")
    /** Database column blog_id SqlType(BIGINT), Default(1) */
    val blog_id: Rep[Long] = column[Long]("blog_id", O.Default(1L))

    /** Index over (post_id,taxonomy) (database name post_taxonomy) */
    val index1 = index("post_taxonomy", (post_id, taxonomy))
    /** Index over (post_id,term_id) (database name post_term) */
    val index2 = index("post_term", (post_id, term_id))
  }
  /** Collection-like TableQuery object for table WpYoastPrimaryTerm */
  lazy val WpYoastPrimaryTerm = new TableQuery(tag => new WpYoastPrimaryTerm(tag))
}
