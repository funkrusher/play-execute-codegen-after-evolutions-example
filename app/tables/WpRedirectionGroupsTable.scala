package tables
// AUTO-GENERATED Slick data model for table WpRedirectionGroups
trait WpRedirectionGroupsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpRedirectionGroups
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(50,true)
   *  @param tracking Database column tracking SqlType(INT), Default(1)
   *  @param module_id Database column module_id SqlType(INT UNSIGNED), Default(0)
   *  @param status Database column status SqlType(ENUM), Length(8,true), Default('enabled')
   *  @param position Database column position SqlType(INT UNSIGNED), Default(0) */
  case class WpRedirectionGroupsRow(id: Long, name: String, tracking: Int, module_id: Long, status: String, position: Long)
  /** GetResult implicit for fetching WpRedirectionGroupsRow objects using plain SQL queries */
  implicit def GetResultWpRedirectionGroupsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int]): GR[WpRedirectionGroupsRow] = GR{
    prs => import prs._
    WpRedirectionGroupsRow.tupled((<<[Long], <<[String], <<[Int], <<[Long], <<[String], <<[Long]))
  }
  /** Table description of table wp_redirection_groups. Objects of this class serve as prototypes for rows in queries. */
  class WpRedirectionGroups(_tableTag: Tag) extends profile.api.Table[WpRedirectionGroupsRow](_tableTag, Some("wp_atopia"), "wp_redirection_groups") {
    def * = (id, name, tracking, module_id, status, position).<>(WpRedirectionGroupsRow.tupled, WpRedirectionGroupsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(name), Rep.Some(tracking), Rep.Some(module_id), Rep.Some(status), Rep.Some(position))).shaped.<>({r=>import r._; _1.map(_=> WpRedirectionGroupsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(50,true) */
    val name: Rep[String] = column[String]("name", O.Length(50,varying=true))
    /** Database column tracking SqlType(INT), Default(1) */
    val tracking: Rep[Int] = column[Int]("tracking", O.Default(1))
    /** Database column module_id SqlType(INT UNSIGNED), Default(0) */
    val module_id: Rep[Long] = column[Long]("module_id", O.Default(0L))
    /** Database column status SqlType(ENUM), Length(8,true), Default('enabled') */
    val status: Rep[String] = column[String]("status", O.Length(8,varying=true), O.Default("'enabled'"))
    /** Database column position SqlType(INT UNSIGNED), Default(0) */
    val position: Rep[Long] = column[Long]("position", O.Default(0L))

    /** Index over (module_id) (database name module_id) */
    val index1 = index("module_id", module_id)
    /** Index over (status) (database name status) */
    val index2 = index("status", status)
  }
  /** Collection-like TableQuery object for table WpRedirectionGroups */
  lazy val WpRedirectionGroups = new TableQuery(tag => new WpRedirectionGroups(tag))
}
