package tables
// AUTO-GENERATED Slick data model for table TimeZoneTransitionType
trait TimeZoneTransitionTypeTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TimeZoneTransitionType
   *  @param Time_zone_id Database column Time_zone_id SqlType(INT UNSIGNED)
   *  @param Transition_type_id Database column Transition_type_id SqlType(INT UNSIGNED)
   *  @param Offset Database column Offset SqlType(INT), Default(0)
   *  @param Is_DST Database column Is_DST SqlType(TINYINT UNSIGNED), Default(0)
   *  @param Abbreviation Database column Abbreviation SqlType(CHAR), Length(8,false), Default('') */
  case class TimeZoneTransitionTypeRow(Time_zone_id: Long, Transition_type_id: Long, Offset: Int, Is_DST: Short, Abbreviation: String)
  /** GetResult implicit for fetching TimeZoneTransitionTypeRow objects using plain SQL queries */
  implicit def GetResultTimeZoneTransitionTypeRow(implicit e0: GR[Long], e1: GR[Int], e2: GR[Short], e3: GR[String]): GR[TimeZoneTransitionTypeRow] = GR{
    prs => import prs._
    TimeZoneTransitionTypeRow.tupled((<<[Long], <<[Long], <<[Int], <<[Short], <<[String]))
  }
  /** Table description of table time_zone_transition_type. Objects of this class serve as prototypes for rows in queries. */
  class TimeZoneTransitionType(_tableTag: Tag) extends profile.api.Table[TimeZoneTransitionTypeRow](_tableTag, Some("mysql"), "time_zone_transition_type") {
    def * = (Time_zone_id, Transition_type_id, Offset, Is_DST, Abbreviation).<>(TimeZoneTransitionTypeRow.tupled, TimeZoneTransitionTypeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Time_zone_id), Rep.Some(Transition_type_id), Rep.Some(Offset), Rep.Some(Is_DST), Rep.Some(Abbreviation))).shaped.<>({r=>import r._; _1.map(_=> TimeZoneTransitionTypeRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Time_zone_id SqlType(INT UNSIGNED) */
    val Time_zone_id: Rep[Long] = column[Long]("Time_zone_id")
    /** Database column Transition_type_id SqlType(INT UNSIGNED) */
    val Transition_type_id: Rep[Long] = column[Long]("Transition_type_id")
    /** Database column Offset SqlType(INT), Default(0) */
    val Offset: Rep[Int] = column[Int]("Offset", O.Default(0))
    /** Database column Is_DST SqlType(TINYINT UNSIGNED), Default(0) */
    val Is_DST: Rep[Short] = column[Short]("Is_DST", O.Default(0))
    /** Database column Abbreviation SqlType(CHAR), Length(8,false), Default('') */
    val Abbreviation: Rep[String] = column[String]("Abbreviation", O.Length(8,varying=false), O.Default("''"))

    /** Primary key of TimeZoneTransitionType (database name time_zone_transition_type_PK) */
    val pk = primaryKey("time_zone_transition_type_PK", (Time_zone_id, Transition_type_id))
  }
  /** Collection-like TableQuery object for table TimeZoneTransitionType */
  lazy val TimeZoneTransitionType = new TableQuery(tag => new TimeZoneTransitionType(tag))
}
