package tables
// AUTO-GENERATED Slick data model for table TimeZone
trait TimeZoneTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TimeZone
   *  @param Time_zone_id Database column Time_zone_id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param Use_leap_seconds Database column Use_leap_seconds SqlType(ENUM), Default(N) */
  case class TimeZoneRow(Time_zone_id: Long, Use_leap_seconds: Char)
  /** GetResult implicit for fetching TimeZoneRow objects using plain SQL queries */
  implicit def GetResultTimeZoneRow(implicit e0: GR[Long], e1: GR[Char]): GR[TimeZoneRow] = GR{
    prs => import prs._
    TimeZoneRow.tupled((<<[Long], <<[Char]))
  }
  /** Table description of table time_zone. Objects of this class serve as prototypes for rows in queries. */
  class TimeZone(_tableTag: Tag) extends profile.api.Table[TimeZoneRow](_tableTag, Some("mysql"), "time_zone") {
    def * = (Time_zone_id, Use_leap_seconds).<>(TimeZoneRow.tupled, TimeZoneRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Time_zone_id), Rep.Some(Use_leap_seconds))).shaped.<>({r=>import r._; _1.map(_=> TimeZoneRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Time_zone_id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val Time_zone_id: Rep[Long] = column[Long]("Time_zone_id", O.AutoInc, O.PrimaryKey)
    /** Database column Use_leap_seconds SqlType(ENUM), Default(N) */
    val Use_leap_seconds: Rep[Char] = column[Char]("Use_leap_seconds", O.Default('N'))
  }
  /** Collection-like TableQuery object for table TimeZone */
  lazy val TimeZone = new TableQuery(tag => new TimeZone(tag))
}
