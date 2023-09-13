package tables
// AUTO-GENERATED Slick data model for table Plugin
trait PluginTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Plugin
   *  @param name Database column name SqlType(VARCHAR), PrimaryKey, Length(64,true), Default('')
   *  @param dl Database column dl SqlType(VARCHAR), Length(128,true), Default('') */
  case class PluginRow(name: String, dl: String)
  /** GetResult implicit for fetching PluginRow objects using plain SQL queries */
  implicit def GetResultPluginRow(implicit e0: GR[String]): GR[PluginRow] = GR{
    prs => import prs._
    PluginRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table plugin. Objects of this class serve as prototypes for rows in queries. */
  class Plugin(_tableTag: Tag) extends profile.api.Table[PluginRow](_tableTag, Some("mysql"), "plugin") {
    def * = (name, dl).<>(PluginRow.tupled, PluginRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(name), Rep.Some(dl))).shaped.<>({r=>import r._; _1.map(_=> PluginRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(VARCHAR), PrimaryKey, Length(64,true), Default('') */
    val name: Rep[String] = column[String]("name", O.PrimaryKey, O.Length(64,varying=true), O.Default("''"))
    /** Database column dl SqlType(VARCHAR), Length(128,true), Default('') */
    val dl: Rep[String] = column[String]("dl", O.Length(128,varying=true), O.Default("''"))
  }
  /** Collection-like TableQuery object for table Plugin */
  lazy val Plugin = new TableQuery(tag => new Plugin(tag))
}
