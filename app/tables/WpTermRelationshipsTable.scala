package tables
// AUTO-GENERATED Slick data model for table WpTermRelationships
trait WpTermRelationshipsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpTermRelationships
   *  @param object_id Database column object_id SqlType(BIGINT UNSIGNED), Default(0)
   *  @param term_taxonomy_id Database column term_taxonomy_id SqlType(BIGINT UNSIGNED), Default(0)
   *  @param term_order Database column term_order SqlType(INT), Default(0) */
  case class WpTermRelationshipsRow(object_id: Long, term_taxonomy_id: Long, term_order: Int)
  /** GetResult implicit for fetching WpTermRelationshipsRow objects using plain SQL queries */
  implicit def GetResultWpTermRelationshipsRow(implicit e0: GR[Long], e1: GR[Int]): GR[WpTermRelationshipsRow] = GR{
    prs => import prs._
    WpTermRelationshipsRow.tupled((<<[Long], <<[Long], <<[Int]))
  }
  /** Table description of table wp_term_relationships. Objects of this class serve as prototypes for rows in queries. */
  class WpTermRelationships(_tableTag: Tag) extends profile.api.Table[WpTermRelationshipsRow](_tableTag, Some("wp_atopia"), "wp_term_relationships") {
    def * = (object_id, term_taxonomy_id, term_order).<>(WpTermRelationshipsRow.tupled, WpTermRelationshipsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(object_id), Rep.Some(term_taxonomy_id), Rep.Some(term_order))).shaped.<>({r=>import r._; _1.map(_=> WpTermRelationshipsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column object_id SqlType(BIGINT UNSIGNED), Default(0) */
    val object_id: Rep[Long] = column[Long]("object_id", O.Default(0L))
    /** Database column term_taxonomy_id SqlType(BIGINT UNSIGNED), Default(0) */
    val term_taxonomy_id: Rep[Long] = column[Long]("term_taxonomy_id", O.Default(0L))
    /** Database column term_order SqlType(INT), Default(0) */
    val term_order: Rep[Int] = column[Int]("term_order", O.Default(0))

    /** Primary key of WpTermRelationships (database name wp_term_relationships_PK) */
    val pk = primaryKey("wp_term_relationships_PK", (object_id, term_taxonomy_id))

    /** Index over (term_taxonomy_id) (database name term_taxonomy_id) */
    val index1 = index("term_taxonomy_id", term_taxonomy_id)
  }
  /** Collection-like TableQuery object for table WpTermRelationships */
  lazy val WpTermRelationships = new TableQuery(tag => new WpTermRelationships(tag))
}
