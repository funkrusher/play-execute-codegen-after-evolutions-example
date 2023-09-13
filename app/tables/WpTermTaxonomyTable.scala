package tables
// AUTO-GENERATED Slick data model for table WpTermTaxonomy
trait WpTermTaxonomyTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpTermTaxonomy
   *  @param term_taxonomy_id Database column term_taxonomy_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param term_id Database column term_id SqlType(BIGINT UNSIGNED), Default(0)
   *  @param taxonomy Database column taxonomy SqlType(VARCHAR), Length(32,true), Default('')
   *  @param description Database column description SqlType(LONGTEXT), Length(2147483647,true)
   *  @param parent Database column parent SqlType(BIGINT UNSIGNED), Default(0)
   *  @param count Database column count SqlType(BIGINT), Default(0) */
  case class WpTermTaxonomyRow(term_taxonomy_id: Long, term_id: Long, taxonomy: String, description: String, parent: Long, count: Long)
  /** GetResult implicit for fetching WpTermTaxonomyRow objects using plain SQL queries */
  implicit def GetResultWpTermTaxonomyRow(implicit e0: GR[Long], e1: GR[String]): GR[WpTermTaxonomyRow] = GR{
    prs => import prs._
    WpTermTaxonomyRow.tupled((<<[Long], <<[Long], <<[String], <<[String], <<[Long], <<[Long]))
  }
  /** Table description of table wp_term_taxonomy. Objects of this class serve as prototypes for rows in queries. */
  class WpTermTaxonomy(_tableTag: Tag) extends profile.api.Table[WpTermTaxonomyRow](_tableTag, Some("wp_atopia"), "wp_term_taxonomy") {
    def * = (term_taxonomy_id, term_id, taxonomy, description, parent, count).<>(WpTermTaxonomyRow.tupled, WpTermTaxonomyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(term_taxonomy_id), Rep.Some(term_id), Rep.Some(taxonomy), Rep.Some(description), Rep.Some(parent), Rep.Some(count))).shaped.<>({r=>import r._; _1.map(_=> WpTermTaxonomyRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column term_taxonomy_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val term_taxonomy_id: Rep[Long] = column[Long]("term_taxonomy_id", O.AutoInc, O.PrimaryKey)
    /** Database column term_id SqlType(BIGINT UNSIGNED), Default(0) */
    val term_id: Rep[Long] = column[Long]("term_id", O.Default(0L))
    /** Database column taxonomy SqlType(VARCHAR), Length(32,true), Default('') */
    val taxonomy: Rep[String] = column[String]("taxonomy", O.Length(32,varying=true), O.Default("''"))
    /** Database column description SqlType(LONGTEXT), Length(2147483647,true) */
    val description: Rep[String] = column[String]("description", O.Length(2147483647,varying=true))
    /** Database column parent SqlType(BIGINT UNSIGNED), Default(0) */
    val parent: Rep[Long] = column[Long]("parent", O.Default(0L))
    /** Database column count SqlType(BIGINT), Default(0) */
    val count: Rep[Long] = column[Long]("count", O.Default(0L))

    /** Index over (taxonomy) (database name taxonomy) */
    val index1 = index("taxonomy", taxonomy)
    /** Uniqueness Index over (term_id,taxonomy) (database name term_id_taxonomy) */
    val index2 = index("term_id_taxonomy", (term_id, taxonomy), unique=true)
  }
  /** Collection-like TableQuery object for table WpTermTaxonomy */
  lazy val WpTermTaxonomy = new TableQuery(tag => new WpTermTaxonomy(tag))
}
