package tables
// AUTO-GENERATED Slick data model for table Pma_ExportTemplates
trait Pma_ExportTemplatesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_ExportTemplates
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param username Database column username SqlType(VARCHAR), Length(64,true)
   *  @param export_type Database column export_type SqlType(VARCHAR), Length(10,true)
   *  @param template_name Database column template_name SqlType(VARCHAR), Length(64,true)
   *  @param template_data Database column template_data SqlType(TEXT) */
  case class Pma_ExportTemplatesRow(id: Long, username: String, export_type: String, template_name: String, template_data: String)
  /** GetResult implicit for fetching Pma_ExportTemplatesRow objects using plain SQL queries */
  implicit def GetResultPma_ExportTemplatesRow(implicit e0: GR[Long], e1: GR[String]): GR[Pma_ExportTemplatesRow] = GR{
    prs => import prs._
    Pma_ExportTemplatesRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table pma__export_templates. Objects of this class serve as prototypes for rows in queries. */
  class Pma_ExportTemplates(_tableTag: Tag) extends profile.api.Table[Pma_ExportTemplatesRow](_tableTag, Some("phpmyadmin"), "pma__export_templates") {
    def * = (id, username, export_type, template_name, template_data).<>(Pma_ExportTemplatesRow.tupled, Pma_ExportTemplatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(username), Rep.Some(export_type), Rep.Some(template_name), Rep.Some(template_data))).shaped.<>({r=>import r._; _1.map(_=> Pma_ExportTemplatesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column username SqlType(VARCHAR), Length(64,true) */
    val username: Rep[String] = column[String]("username", O.Length(64,varying=true))
    /** Database column export_type SqlType(VARCHAR), Length(10,true) */
    val export_type: Rep[String] = column[String]("export_type", O.Length(10,varying=true))
    /** Database column template_name SqlType(VARCHAR), Length(64,true) */
    val template_name: Rep[String] = column[String]("template_name", O.Length(64,varying=true))
    /** Database column template_data SqlType(TEXT) */
    val template_data: Rep[String] = column[String]("template_data")

    /** Uniqueness Index over (username,export_type,template_name) (database name u_user_type_template) */
    val index1 = index("u_user_type_template", (username, export_type, template_name), unique=true)
  }
  /** Collection-like TableQuery object for table Pma_ExportTemplates */
  lazy val Pma_ExportTemplates = new TableQuery(tag => new Pma_ExportTemplates(tag))
}
