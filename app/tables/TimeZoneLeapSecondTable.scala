package tables
// AUTO-GENERATED Slick data model for table TimeZoneLeapSecond
trait TimeZoneLeapSecondTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TimeZoneLeapSecond
   *  @param Transition_time Database column Transition_time SqlType(BIGINT), PrimaryKey
   *  @param Correction Database column Correction SqlType(INT) */
  case class TimeZoneLeapSecondRow(Transition_time: Long, Correction: Int)
  /** GetResult implicit for fetching TimeZoneLeapSecondRow objects using plain SQL queries */
  implicit def GetResultTimeZoneLeapSecondRow(implicit e0: GR[Long], e1: GR[Int]): GR[TimeZoneLeapSecondRow] = GR{
    prs => import prs._
    TimeZoneLeapSecondRow.tupled((<<[Long], <<[Int]))
  }
  /** Table description of table time_zone_leap_second. Objects of this class serve as prototypes for rows in queries. */
  class TimeZoneLeapSecond(_tableTag: Tag) extends profile.api.Table[TimeZoneLeapSecondRow](_tableTag, Some("mysql"), "time_zone_leap_second") {
    def * = (Transition_time, Correction).<>(TimeZoneLeapSecondRow.tupled, TimeZoneLeapSecondRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Transition_time), Rep.Some(Correction))).shaped.<>({r=>import r._; _1.map(_=> TimeZoneLeapSecondRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Transition_time SqlType(BIGINT), PrimaryKey */
    val Transition_time: Rep[Long] = column[Long]("Transition_time", O.PrimaryKey)
    /** Database column Correction SqlType(INT) */
    val Correction: Rep[Int] = column[Int]("Correction")
  }
  /** Collection-like TableQuery object for table TimeZoneLeapSecond */
  lazy val TimeZoneLeapSecond = new TableQuery(tag => new TimeZoneLeapSecond(tag))
}
