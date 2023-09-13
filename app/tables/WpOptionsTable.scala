package tables
// AUTO-GENERATED Slick data model for table WpOptions
trait WpOptionsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpOptions
   *  @param option_id Database column option_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param option_name Database column option_name SqlType(VARCHAR), Length(191,true), Default('')
   *  @param option_value Database column option_value SqlType(LONGTEXT), Length(2147483647,true)
   *  @param autoload Database column autoload SqlType(VARCHAR), Length(20,true), Default('yes') */
  case class WpOptionsRow(option_id: Long, option_name: String, option_value: String, autoload: String)
  /** GetResult implicit for fetching WpOptionsRow objects using plain SQL queries */
  implicit def GetResultWpOptionsRow(implicit e0: GR[Long], e1: GR[String]): GR[WpOptionsRow] = GR{
    prs => import prs._
    WpOptionsRow.tupled((<<[Long], <<[String], <<[String], <<[String]))
  }
  /** Table description of table wp_options. Objects of this class serve as prototypes for rows in queries. */
  class WpOptions(_tableTag: Tag) extends profile.api.Table[WpOptionsRow](_tableTag, Some("wp_atopia"), "wp_options") {
    def * = (option_id, option_name, option_value, autoload).<>(WpOptionsRow.tupled, WpOptionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(option_id), Rep.Some(option_name), Rep.Some(option_value), Rep.Some(autoload))).shaped.<>({r=>import r._; _1.map(_=> WpOptionsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column option_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val option_id: Rep[Long] = column[Long]("option_id", O.AutoInc, O.PrimaryKey)
    /** Database column option_name SqlType(VARCHAR), Length(191,true), Default('') */
    val option_name: Rep[String] = column[String]("option_name", O.Length(191,varying=true), O.Default("''"))
    /** Database column option_value SqlType(LONGTEXT), Length(2147483647,true) */
    val option_value: Rep[String] = column[String]("option_value", O.Length(2147483647,varying=true))
    /** Database column autoload SqlType(VARCHAR), Length(20,true), Default('yes') */
    val autoload: Rep[String] = column[String]("autoload", O.Length(20,varying=true), O.Default("'yes'"))

    /** Index over (autoload) (database name autoload) */
    val index1 = index("autoload", autoload)
    /** Uniqueness Index over (option_name) (database name option_name) */
    val index2 = index("option_name", option_name, unique=true)
  }
  /** Collection-like TableQuery object for table WpOptions */
  lazy val WpOptions = new TableQuery(tag => new WpOptions(tag))
}
