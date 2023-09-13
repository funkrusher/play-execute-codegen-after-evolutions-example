package tables
// AUTO-GENERATED Slick data model for table WpTerms
trait WpTermsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpTerms
   *  @param term_id Database column term_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(200,true), Default('')
   *  @param slug Database column slug SqlType(VARCHAR), Length(200,true), Default('')
   *  @param term_group Database column term_group SqlType(BIGINT), Default(0) */
  case class WpTermsRow(term_id: Long, name: String, slug: String, term_group: Long)
  /** GetResult implicit for fetching WpTermsRow objects using plain SQL queries */
  implicit def GetResultWpTermsRow(implicit e0: GR[Long], e1: GR[String]): GR[WpTermsRow] = GR{
    prs => import prs._
    WpTermsRow.tupled((<<[Long], <<[String], <<[String], <<[Long]))
  }
  /** Table description of table wp_terms. Objects of this class serve as prototypes for rows in queries. */
  class WpTerms(_tableTag: Tag) extends profile.api.Table[WpTermsRow](_tableTag, Some("wp_atopia"), "wp_terms") {
    def * = (term_id, name, slug, term_group).<>(WpTermsRow.tupled, WpTermsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(term_id), Rep.Some(name), Rep.Some(slug), Rep.Some(term_group))).shaped.<>({r=>import r._; _1.map(_=> WpTermsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column term_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val term_id: Rep[Long] = column[Long]("term_id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(200,true), Default('') */
    val name: Rep[String] = column[String]("name", O.Length(200,varying=true), O.Default("''"))
    /** Database column slug SqlType(VARCHAR), Length(200,true), Default('') */
    val slug: Rep[String] = column[String]("slug", O.Length(200,varying=true), O.Default("''"))
    /** Database column term_group SqlType(BIGINT), Default(0) */
    val term_group: Rep[Long] = column[Long]("term_group", O.Default(0L))

    /** Index over (name) (database name name) */
    val index1 = index("name", name)
    /** Index over (slug) (database name slug) */
    val index2 = index("slug", slug)
  }
  /** Collection-like TableQuery object for table WpTerms */
  lazy val WpTerms = new TableQuery(tag => new WpTerms(tag))
}
