package tables
// AUTO-GENERATED Slick data model for table WpYoastSeoMeta
trait WpYoastSeoMetaTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpYoastSeoMeta
   *  @param object_id Database column object_id SqlType(BIGINT UNSIGNED)
   *  @param internal_link_count Database column internal_link_count SqlType(INT UNSIGNED), Default(None)
   *  @param incoming_link_count Database column incoming_link_count SqlType(INT UNSIGNED), Default(None) */
  case class WpYoastSeoMetaRow(object_id: Long, internal_link_count: Option[Long], incoming_link_count: Option[Long])
  /** GetResult implicit for fetching WpYoastSeoMetaRow objects using plain SQL queries */
  implicit def GetResultWpYoastSeoMetaRow(implicit e0: GR[Long], e1: GR[Option[Long]]): GR[WpYoastSeoMetaRow] = GR{
    prs => import prs._
    WpYoastSeoMetaRow.tupled((<<[Long], <<?[Long], <<?[Long]))
  }
  /** Table description of table wp_yoast_seo_meta. Objects of this class serve as prototypes for rows in queries. */
  class WpYoastSeoMeta(_tableTag: Tag) extends profile.api.Table[WpYoastSeoMetaRow](_tableTag, Some("wp_atopia"), "wp_yoast_seo_meta") {
    def * = (object_id, internal_link_count, incoming_link_count).<>(WpYoastSeoMetaRow.tupled, WpYoastSeoMetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(object_id), internal_link_count, incoming_link_count)).shaped.<>({r=>import r._; _1.map(_=> WpYoastSeoMetaRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column object_id SqlType(BIGINT UNSIGNED) */
    val object_id: Rep[Long] = column[Long]("object_id")
    /** Database column internal_link_count SqlType(INT UNSIGNED), Default(None) */
    val internal_link_count: Rep[Option[Long]] = column[Option[Long]]("internal_link_count", O.Default(None))
    /** Database column incoming_link_count SqlType(INT UNSIGNED), Default(None) */
    val incoming_link_count: Rep[Option[Long]] = column[Option[Long]]("incoming_link_count", O.Default(None))

    /** Uniqueness Index over (object_id) (database name object_id) */
    val index1 = index("object_id", object_id, unique=true)
  }
  /** Collection-like TableQuery object for table WpYoastSeoMeta */
  lazy val WpYoastSeoMeta = new TableQuery(tag => new WpYoastSeoMeta(tag))
}
