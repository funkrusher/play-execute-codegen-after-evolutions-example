package tables
// AUTO-GENERATED Slick data model for table WpAccordeonmenuckStyles
trait WpAccordeonmenuckStylesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpAccordeonmenuckStyles
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(TEXT)
   *  @param state Database column state SqlType(INT)
   *  @param params Database column params SqlType(LONGTEXT), Length(2147483647,true)
   *  @param layoutcss Database column layoutcss SqlType(TEXT) */
  case class WpAccordeonmenuckStylesRow(id: Int, name: String, state: Int, params: String, layoutcss: String)
  /** GetResult implicit for fetching WpAccordeonmenuckStylesRow objects using plain SQL queries */
  implicit def GetResultWpAccordeonmenuckStylesRow(implicit e0: GR[Int], e1: GR[String]): GR[WpAccordeonmenuckStylesRow] = GR{
    prs => import prs._
    WpAccordeonmenuckStylesRow.tupled((<<[Int], <<[String], <<[Int], <<[String], <<[String]))
  }
  /** Table description of table wp_accordeonmenuck_styles. Objects of this class serve as prototypes for rows in queries. */
  class WpAccordeonmenuckStyles(_tableTag: Tag) extends profile.api.Table[WpAccordeonmenuckStylesRow](_tableTag, Some("wp_atopia"), "wp_accordeonmenuck_styles") {
    def * = (id, name, state, params, layoutcss).<>(WpAccordeonmenuckStylesRow.tupled, WpAccordeonmenuckStylesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), Rep.Some(state), Rep.Some(params), Rep.Some(layoutcss))).shaped.<>({r=>import r._; _1.map(_=> WpAccordeonmenuckStylesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(TEXT) */
    val name: Rep[String] = column[String]("name")
    /** Database column state SqlType(INT) */
    val state: Rep[Int] = column[Int]("state")
    /** Database column params SqlType(LONGTEXT), Length(2147483647,true) */
    val params: Rep[String] = column[String]("params", O.Length(2147483647,varying=true))
    /** Database column layoutcss SqlType(TEXT) */
    val layoutcss: Rep[String] = column[String]("layoutcss")
  }
  /** Collection-like TableQuery object for table WpAccordeonmenuckStyles */
  lazy val WpAccordeonmenuckStyles = new TableQuery(tag => new WpAccordeonmenuckStyles(tag))
}
