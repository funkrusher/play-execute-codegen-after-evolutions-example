package tables
// AUTO-GENERATED Slick data model for table HelpRelation
trait HelpRelationTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HelpRelation
   *  @param help_topic_id Database column help_topic_id SqlType(INT UNSIGNED)
   *  @param help_keyword_id Database column help_keyword_id SqlType(INT UNSIGNED) */
  case class HelpRelationRow(help_topic_id: Long, help_keyword_id: Long)
  /** GetResult implicit for fetching HelpRelationRow objects using plain SQL queries */
  implicit def GetResultHelpRelationRow(implicit e0: GR[Long]): GR[HelpRelationRow] = GR{
    prs => import prs._
    HelpRelationRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table help_relation. Objects of this class serve as prototypes for rows in queries. */
  class HelpRelation(_tableTag: Tag) extends profile.api.Table[HelpRelationRow](_tableTag, Some("mysql"), "help_relation") {
    def * = (help_topic_id, help_keyword_id).<>(HelpRelationRow.tupled, HelpRelationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(help_topic_id), Rep.Some(help_keyword_id))).shaped.<>({r=>import r._; _1.map(_=> HelpRelationRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column help_topic_id SqlType(INT UNSIGNED) */
    val help_topic_id: Rep[Long] = column[Long]("help_topic_id")
    /** Database column help_keyword_id SqlType(INT UNSIGNED) */
    val help_keyword_id: Rep[Long] = column[Long]("help_keyword_id")

    /** Primary key of HelpRelation (database name help_relation_PK) */
    val pk = primaryKey("help_relation_PK", (help_keyword_id, help_topic_id))
  }
  /** Collection-like TableQuery object for table HelpRelation */
  lazy val HelpRelation = new TableQuery(tag => new HelpRelation(tag))
}
