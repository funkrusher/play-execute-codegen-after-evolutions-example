package tables
// AUTO-GENERATED Slick data model for table HelpCategory
trait HelpCategoryTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HelpCategory
   *  @param help_category_id Database column help_category_id SqlType(SMALLINT UNSIGNED), PrimaryKey
   *  @param name Database column name SqlType(CHAR), Length(64,false)
   *  @param parent_category_id Database column parent_category_id SqlType(SMALLINT UNSIGNED), Default(None)
   *  @param url Database column url SqlType(TEXT) */
  case class HelpCategoryRow(help_category_id: Int, name: String, parent_category_id: Option[Int], url: String)
  /** GetResult implicit for fetching HelpCategoryRow objects using plain SQL queries */
  implicit def GetResultHelpCategoryRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[Int]]): GR[HelpCategoryRow] = GR{
    prs => import prs._
    HelpCategoryRow.tupled((<<[Int], <<[String], <<?[Int], <<[String]))
  }
  /** Table description of table help_category. Objects of this class serve as prototypes for rows in queries. */
  class HelpCategory(_tableTag: Tag) extends profile.api.Table[HelpCategoryRow](_tableTag, Some("mysql"), "help_category") {
    def * = (help_category_id, name, parent_category_id, url).<>(HelpCategoryRow.tupled, HelpCategoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(help_category_id), Rep.Some(name), parent_category_id, Rep.Some(url))).shaped.<>({r=>import r._; _1.map(_=> HelpCategoryRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column help_category_id SqlType(SMALLINT UNSIGNED), PrimaryKey */
    val help_category_id: Rep[Int] = column[Int]("help_category_id", O.PrimaryKey)
    /** Database column name SqlType(CHAR), Length(64,false) */
    val name: Rep[String] = column[String]("name", O.Length(64,varying=false))
    /** Database column parent_category_id SqlType(SMALLINT UNSIGNED), Default(None) */
    val parent_category_id: Rep[Option[Int]] = column[Option[Int]]("parent_category_id", O.Default(None))
    /** Database column url SqlType(TEXT) */
    val url: Rep[String] = column[String]("url")

    /** Uniqueness Index over (name) (database name name) */
    val index1 = index("name", name, unique=true)
  }
  /** Collection-like TableQuery object for table HelpCategory */
  lazy val HelpCategory = new TableQuery(tag => new HelpCategory(tag))
}
