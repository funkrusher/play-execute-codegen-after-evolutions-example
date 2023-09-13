package tables
// AUTO-GENERATED Slick data model for table TimeZoneTransition
trait TimeZoneTransitionTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TimeZoneTransition
   *  @param Time_zone_id Database column Time_zone_id SqlType(INT UNSIGNED)
   *  @param Transition_time Database column Transition_time SqlType(BIGINT)
   *  @param Transition_type_id Database column Transition_type_id SqlType(INT UNSIGNED) */
  case class TimeZoneTransitionRow(Time_zone_id: Long, Transition_time: Long, Transition_type_id: Long)
  /** GetResult implicit for fetching TimeZoneTransitionRow objects using plain SQL queries */
  implicit def GetResultTimeZoneTransitionRow(implicit e0: GR[Long]): GR[TimeZoneTransitionRow] = GR{
    prs => import prs._
    TimeZoneTransitionRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table time_zone_transition. Objects of this class serve as prototypes for rows in queries. */
  class TimeZoneTransition(_tableTag: Tag) extends profile.api.Table[TimeZoneTransitionRow](_tableTag, Some("mysql"), "time_zone_transition") {
    def * = (Time_zone_id, Transition_time, Transition_type_id).<>(TimeZoneTransitionRow.tupled, TimeZoneTransitionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Time_zone_id), Rep.Some(Transition_time), Rep.Some(Transition_type_id))).shaped.<>({r=>import r._; _1.map(_=> TimeZoneTransitionRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Time_zone_id SqlType(INT UNSIGNED) */
    val Time_zone_id: Rep[Long] = column[Long]("Time_zone_id")
    /** Database column Transition_time SqlType(BIGINT) */
    val Transition_time: Rep[Long] = column[Long]("Transition_time")
    /** Database column Transition_type_id SqlType(INT UNSIGNED) */
    val Transition_type_id: Rep[Long] = column[Long]("Transition_type_id")

    /** Primary key of TimeZoneTransition (database name time_zone_transition_PK) */
    val pk = primaryKey("time_zone_transition_PK", (Time_zone_id, Transition_time))
  }
  /** Collection-like TableQuery object for table TimeZoneTransition */
  lazy val TimeZoneTransition = new TableQuery(tag => new TimeZoneTransition(tag))
}
