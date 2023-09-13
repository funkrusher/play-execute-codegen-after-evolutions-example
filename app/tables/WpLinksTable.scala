package tables
// AUTO-GENERATED Slick data model for table WpLinks
trait WpLinksTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpLinks
   *  @param link_id Database column link_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param link_url Database column link_url SqlType(VARCHAR), Length(255,true), Default('')
   *  @param link_name Database column link_name SqlType(VARCHAR), Length(255,true), Default('')
   *  @param link_image Database column link_image SqlType(VARCHAR), Length(255,true), Default('')
   *  @param link_target Database column link_target SqlType(VARCHAR), Length(25,true), Default('')
   *  @param link_description Database column link_description SqlType(VARCHAR), Length(255,true), Default('')
   *  @param link_visible Database column link_visible SqlType(VARCHAR), Length(20,true), Default('Y')
   *  @param link_owner Database column link_owner SqlType(BIGINT UNSIGNED), Default(1)
   *  @param link_rating Database column link_rating SqlType(INT), Default(0)
   *  @param link_updated Database column link_updated SqlType(DATETIME)
   *  @param link_rel Database column link_rel SqlType(VARCHAR), Length(255,true), Default('')
   *  @param link_notes Database column link_notes SqlType(MEDIUMTEXT), Length(16777215,true)
   *  @param link_rss Database column link_rss SqlType(VARCHAR), Length(255,true), Default('') */
  case class WpLinksRow(link_id: Long, link_url: String, link_name: String, link_image: String, link_target: String, link_description: String, link_visible: String, link_owner: Long, link_rating: Int, link_updated: java.sql.Timestamp, link_rel: String, link_notes: String, link_rss: String)
  /** GetResult implicit for fetching WpLinksRow objects using plain SQL queries */
  implicit def GetResultWpLinksRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int], e3: GR[java.sql.Timestamp]): GR[WpLinksRow] = GR{
    prs => import prs._
    WpLinksRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[Long], <<[Int], <<[java.sql.Timestamp], <<[String], <<[String], <<[String]))
  }
  /** Table description of table wp_links. Objects of this class serve as prototypes for rows in queries. */
  class WpLinks(_tableTag: Tag) extends profile.api.Table[WpLinksRow](_tableTag, Some("wp_atopia"), "wp_links") {
    def * = (link_id, link_url, link_name, link_image, link_target, link_description, link_visible, link_owner, link_rating, link_updated, link_rel, link_notes, link_rss).<>(WpLinksRow.tupled, WpLinksRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(link_id), Rep.Some(link_url), Rep.Some(link_name), Rep.Some(link_image), Rep.Some(link_target), Rep.Some(link_description), Rep.Some(link_visible), Rep.Some(link_owner), Rep.Some(link_rating), Rep.Some(link_updated), Rep.Some(link_rel), Rep.Some(link_notes), Rep.Some(link_rss))).shaped.<>({r=>import r._; _1.map(_=> WpLinksRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column link_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val link_id: Rep[Long] = column[Long]("link_id", O.AutoInc, O.PrimaryKey)
    /** Database column link_url SqlType(VARCHAR), Length(255,true), Default('') */
    val link_url: Rep[String] = column[String]("link_url", O.Length(255,varying=true), O.Default("''"))
    /** Database column link_name SqlType(VARCHAR), Length(255,true), Default('') */
    val link_name: Rep[String] = column[String]("link_name", O.Length(255,varying=true), O.Default("''"))
    /** Database column link_image SqlType(VARCHAR), Length(255,true), Default('') */
    val link_image: Rep[String] = column[String]("link_image", O.Length(255,varying=true), O.Default("''"))
    /** Database column link_target SqlType(VARCHAR), Length(25,true), Default('') */
    val link_target: Rep[String] = column[String]("link_target", O.Length(25,varying=true), O.Default("''"))
    /** Database column link_description SqlType(VARCHAR), Length(255,true), Default('') */
    val link_description: Rep[String] = column[String]("link_description", O.Length(255,varying=true), O.Default("''"))
    /** Database column link_visible SqlType(VARCHAR), Length(20,true), Default('Y') */
    val link_visible: Rep[String] = column[String]("link_visible", O.Length(20,varying=true), O.Default("'Y'"))
    /** Database column link_owner SqlType(BIGINT UNSIGNED), Default(1) */
    val link_owner: Rep[Long] = column[Long]("link_owner", O.Default(1L))
    /** Database column link_rating SqlType(INT), Default(0) */
    val link_rating: Rep[Int] = column[Int]("link_rating", O.Default(0))
    /** Database column link_updated SqlType(DATETIME) */
    val link_updated: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("link_updated")
    /** Database column link_rel SqlType(VARCHAR), Length(255,true), Default('') */
    val link_rel: Rep[String] = column[String]("link_rel", O.Length(255,varying=true), O.Default("''"))
    /** Database column link_notes SqlType(MEDIUMTEXT), Length(16777215,true) */
    val link_notes: Rep[String] = column[String]("link_notes", O.Length(16777215,varying=true))
    /** Database column link_rss SqlType(VARCHAR), Length(255,true), Default('') */
    val link_rss: Rep[String] = column[String]("link_rss", O.Length(255,varying=true), O.Default("''"))

    /** Index over (link_visible) (database name link_visible) */
    val index1 = index("link_visible", link_visible)
  }
  /** Collection-like TableQuery object for table WpLinks */
  lazy val WpLinks = new TableQuery(tag => new WpLinks(tag))
}
