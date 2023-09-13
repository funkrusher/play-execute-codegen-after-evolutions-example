package tables
// AUTO-GENERATED Slick data model for table HelpKeyword
trait HelpKeywordTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HelpKeyword
   *  @param help_keyword_id Database column help_keyword_id SqlType(INT UNSIGNED), PrimaryKey
   *  @param name Database column name SqlType(CHAR), Length(64,false) */
  case class HelpKeywordRow(help_keyword_id: Long, name: String)
  /** GetResult implicit for fetching HelpKeywordRow objects using plain SQL queries */
  implicit def GetResultHelpKeywordRow(implicit e0: GR[Long], e1: GR[String]): GR[HelpKeywordRow] = GR{
    prs => import prs._
    HelpKeywordRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table help_keyword. Objects of this class serve as prototypes for rows in queries. */
  class HelpKeyword(_tableTag: Tag) extends profile.api.Table[HelpKeywordRow](_tableTag, Some("mysql"), "help_keyword") {
    def * = (help_keyword_id, name).<>(HelpKeywordRow.tupled, HelpKeywordRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(help_keyword_id), Rep.Some(name))).shaped.<>({r=>import r._; _1.map(_=> HelpKeywordRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column help_keyword_id SqlType(INT UNSIGNED), PrimaryKey */
    val help_keyword_id: Rep[Long] = column[Long]("help_keyword_id", O.PrimaryKey)
    /** Database column name SqlType(CHAR), Length(64,false) */
    val name: Rep[String] = column[String]("name", O.Length(64,varying=false))

    /** Uniqueness Index over (name) (database name name) */
    val index1 = index("name", name, unique=true)
  }
  /** Collection-like TableQuery object for table HelpKeyword */
  lazy val HelpKeyword = new TableQuery(tag => new HelpKeyword(tag))
}
