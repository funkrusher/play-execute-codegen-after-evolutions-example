package tables
// AUTO-GENERATED Slick data model for table TimeZoneName
trait TimeZoneNameTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TimeZoneName
   *  @param Name Database column Name SqlType(CHAR), PrimaryKey, Length(64,false)
   *  @param Time_zone_id Database column Time_zone_id SqlType(INT UNSIGNED) */
  case class TimeZoneNameRow(Name: String, Time_zone_id: Long)
  /** GetResult implicit for fetching TimeZoneNameRow objects using plain SQL queries */
  implicit def GetResultTimeZoneNameRow(implicit e0: GR[String], e1: GR[Long]): GR[TimeZoneNameRow] = GR{
    prs => import prs._
    TimeZoneNameRow.tupled((<<[String], <<[Long]))
  }
  /** Table description of table time_zone_name. Objects of this class serve as prototypes for rows in queries. */
  class TimeZoneName(_tableTag: Tag) extends profile.api.Table[TimeZoneNameRow](_tableTag, Some("mysql"), "time_zone_name") {
    def * = (Name, Time_zone_id).<>(TimeZoneNameRow.tupled, TimeZoneNameRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Name), Rep.Some(Time_zone_id))).shaped.<>({r=>import r._; _1.map(_=> TimeZoneNameRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Name SqlType(CHAR), PrimaryKey, Length(64,false) */
    val Name: Rep[String] = column[String]("Name", O.PrimaryKey, O.Length(64,varying=false))
    /** Database column Time_zone_id SqlType(INT UNSIGNED) */
    val Time_zone_id: Rep[Long] = column[Long]("Time_zone_id")
  }
  /** Collection-like TableQuery object for table TimeZoneName */
  lazy val TimeZoneName = new TableQuery(tag => new TimeZoneName(tag))
}
