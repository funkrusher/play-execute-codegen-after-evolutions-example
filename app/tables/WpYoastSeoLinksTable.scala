package tables
// AUTO-GENERATED Slick data model for table WpYoastSeoLinks
trait WpYoastSeoLinksTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpYoastSeoLinks
   *  @param id Database column id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param url Database column url SqlType(VARCHAR), Length(255,true)
   *  @param post_id Database column post_id SqlType(BIGINT UNSIGNED)
   *  @param target_post_id Database column target_post_id SqlType(BIGINT UNSIGNED)
   *  @param `type` Database column type SqlType(VARCHAR), Length(8,true) */
  case class WpYoastSeoLinksRow(id: Long, url: String, post_id: Long, target_post_id: Long, `type`: String)
  /** GetResult implicit for fetching WpYoastSeoLinksRow objects using plain SQL queries */
  implicit def GetResultWpYoastSeoLinksRow(implicit e0: GR[Long], e1: GR[String]): GR[WpYoastSeoLinksRow] = GR{
    prs => import prs._
    WpYoastSeoLinksRow.tupled((<<[Long], <<[String], <<[Long], <<[Long], <<[String]))
  }
  /** Table description of table wp_yoast_seo_links. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class WpYoastSeoLinks(_tableTag: Tag) extends profile.api.Table[WpYoastSeoLinksRow](_tableTag, Some("wp_atopia"), "wp_yoast_seo_links") {
    def * = (id, url, post_id, target_post_id, `type`).<>(WpYoastSeoLinksRow.tupled, WpYoastSeoLinksRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(url), Rep.Some(post_id), Rep.Some(target_post_id), Rep.Some(`type`))).shaped.<>({r=>import r._; _1.map(_=> WpYoastSeoLinksRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column url SqlType(VARCHAR), Length(255,true) */
    val url: Rep[String] = column[String]("url", O.Length(255,varying=true))
    /** Database column post_id SqlType(BIGINT UNSIGNED) */
    val post_id: Rep[Long] = column[Long]("post_id")
    /** Database column target_post_id SqlType(BIGINT UNSIGNED) */
    val target_post_id: Rep[Long] = column[Long]("target_post_id")
    /** Database column type SqlType(VARCHAR), Length(8,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type", O.Length(8,varying=true))

    /** Index over (post_id,`type`) (database name link_direction) */
    val index1 = index("link_direction", (post_id, `type`))
  }
  /** Collection-like TableQuery object for table WpYoastSeoLinks */
  lazy val WpYoastSeoLinks = new TableQuery(tag => new WpYoastSeoLinks(tag))
}
