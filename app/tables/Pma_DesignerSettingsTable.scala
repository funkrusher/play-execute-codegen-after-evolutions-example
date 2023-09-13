package tables
// AUTO-GENERATED Slick data model for table Pma_DesignerSettings
trait Pma_DesignerSettingsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_DesignerSettings
   *  @param username Database column username SqlType(VARCHAR), PrimaryKey, Length(64,true)
   *  @param settings_data Database column settings_data SqlType(TEXT) */
  case class Pma_DesignerSettingsRow(username: String, settings_data: String)
  /** GetResult implicit for fetching Pma_DesignerSettingsRow objects using plain SQL queries */
  implicit def GetResultPma_DesignerSettingsRow(implicit e0: GR[String]): GR[Pma_DesignerSettingsRow] = GR{
    prs => import prs._
    Pma_DesignerSettingsRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table pma__designer_settings. Objects of this class serve as prototypes for rows in queries. */
  class Pma_DesignerSettings(_tableTag: Tag) extends profile.api.Table[Pma_DesignerSettingsRow](_tableTag, Some("phpmyadmin"), "pma__designer_settings") {
    def * = (username, settings_data).<>(Pma_DesignerSettingsRow.tupled, Pma_DesignerSettingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(username), Rep.Some(settings_data))).shaped.<>({r=>import r._; _1.map(_=> Pma_DesignerSettingsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column username SqlType(VARCHAR), PrimaryKey, Length(64,true) */
    val username: Rep[String] = column[String]("username", O.PrimaryKey, O.Length(64,varying=true))
    /** Database column settings_data SqlType(TEXT) */
    val settings_data: Rep[String] = column[String]("settings_data")
  }
  /** Collection-like TableQuery object for table Pma_DesignerSettings */
  lazy val Pma_DesignerSettings = new TableQuery(tag => new Pma_DesignerSettings(tag))
}
