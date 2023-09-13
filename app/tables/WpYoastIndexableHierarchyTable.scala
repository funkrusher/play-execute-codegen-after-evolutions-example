package tables
// AUTO-GENERATED Slick data model for table WpYoastIndexableHierarchy
trait WpYoastIndexableHierarchyTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpYoastIndexableHierarchy
   *  @param indexable_id Database column indexable_id SqlType(INT UNSIGNED)
   *  @param ancestor_id Database column ancestor_id SqlType(INT UNSIGNED)
   *  @param depth Database column depth SqlType(INT UNSIGNED), Default(None)
   *  @param blog_id Database column blog_id SqlType(BIGINT), Default(1) */
  case class WpYoastIndexableHierarchyRow(indexable_id: Long, ancestor_id: Long, depth: Option[Long], blog_id: Long)
  /** GetResult implicit for fetching WpYoastIndexableHierarchyRow objects using plain SQL queries */
  implicit def GetResultWpYoastIndexableHierarchyRow(implicit e0: GR[Long], e1: GR[Option[Long]]): GR[WpYoastIndexableHierarchyRow] = GR{
    prs => import prs._
    WpYoastIndexableHierarchyRow.tupled((<<[Long], <<[Long], <<?[Long], <<[Long]))
  }
  /** Table description of table wp_yoast_indexable_hierarchy. Objects of this class serve as prototypes for rows in queries. */
  class WpYoastIndexableHierarchy(_tableTag: Tag) extends profile.api.Table[WpYoastIndexableHierarchyRow](_tableTag, Some("wp_atopia"), "wp_yoast_indexable_hierarchy") {
    def * = (indexable_id, ancestor_id, depth, blog_id).<>(WpYoastIndexableHierarchyRow.tupled, WpYoastIndexableHierarchyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(indexable_id), Rep.Some(ancestor_id), depth, Rep.Some(blog_id))).shaped.<>({r=>import r._; _1.map(_=> WpYoastIndexableHierarchyRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column indexable_id SqlType(INT UNSIGNED) */
    val indexable_id: Rep[Long] = column[Long]("indexable_id")
    /** Database column ancestor_id SqlType(INT UNSIGNED) */
    val ancestor_id: Rep[Long] = column[Long]("ancestor_id")
    /** Database column depth SqlType(INT UNSIGNED), Default(None) */
    val depth: Rep[Option[Long]] = column[Option[Long]]("depth", O.Default(None))
    /** Database column blog_id SqlType(BIGINT), Default(1) */
    val blog_id: Rep[Long] = column[Long]("blog_id", O.Default(1L))

    /** Primary key of WpYoastIndexableHierarchy (database name wp_yoast_indexable_hierarchy_PK) */
    val pk = primaryKey("wp_yoast_indexable_hierarchy_PK", (indexable_id, ancestor_id))

    /** Index over (ancestor_id) (database name ancestor_id) */
    val index1 = index("ancestor_id", ancestor_id)
    /** Index over (depth) (database name depth) */
    val index2 = index("depth", depth)
    /** Index over (indexable_id) (database name indexable_id) */
    val index3 = index("indexable_id", indexable_id)
  }
  /** Collection-like TableQuery object for table WpYoastIndexableHierarchy */
  lazy val WpYoastIndexableHierarchy = new TableQuery(tag => new WpYoastIndexableHierarchy(tag))
}
