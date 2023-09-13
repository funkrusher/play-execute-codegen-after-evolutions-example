package tables
// AUTO-GENERATED Slick data model for table Pma_Userconfig
trait Pma_UserconfigTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Userconfig
   *  @param username Database column username SqlType(VARCHAR), PrimaryKey, Length(64,true)
   *  @param timevalue Database column timevalue SqlType(TIMESTAMP)
   *  @param config_data Database column config_data SqlType(TEXT) */
  case class Pma_UserconfigRow(username: String, timevalue: java.sql.Timestamp, config_data: String)
  /** GetResult implicit for fetching Pma_UserconfigRow objects using plain SQL queries */
  implicit def GetResultPma_UserconfigRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp]): GR[Pma_UserconfigRow] = GR{
    prs => import prs._
    Pma_UserconfigRow.tupled((<<[String], <<[java.sql.Timestamp], <<[String]))
  }
  /** Table description of table pma__userconfig. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Userconfig(_tableTag: Tag) extends profile.api.Table[Pma_UserconfigRow](_tableTag, Some("phpmyadmin"), "pma__userconfig") {
    def * = (username, timevalue, config_data).<>(Pma_UserconfigRow.tupled, Pma_UserconfigRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(username), Rep.Some(timevalue), Rep.Some(config_data))).shaped.<>({r=>import r._; _1.map(_=> Pma_UserconfigRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column username SqlType(VARCHAR), PrimaryKey, Length(64,true) */
    val username: Rep[String] = column[String]("username", O.PrimaryKey, O.Length(64,varying=true))
    /** Database column timevalue SqlType(TIMESTAMP) */
    val timevalue: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("timevalue")
    /** Database column config_data SqlType(TEXT) */
    val config_data: Rep[String] = column[String]("config_data")
  }
  /** Collection-like TableQuery object for table Pma_Userconfig */
  lazy val Pma_Userconfig = new TableQuery(tag => new Pma_Userconfig(tag))
}
