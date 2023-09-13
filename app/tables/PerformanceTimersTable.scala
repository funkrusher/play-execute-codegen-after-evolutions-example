package tables
// AUTO-GENERATED Slick data model for table PerformanceTimers
trait PerformanceTimersTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PerformanceTimers
   *  @param TIMER_NAME Database column TIMER_NAME SqlType(ENUM), Length(11,true)
   *  @param TIMER_FREQUENCY Database column TIMER_FREQUENCY SqlType(BIGINT), Default(None)
   *  @param TIMER_RESOLUTION Database column TIMER_RESOLUTION SqlType(BIGINT), Default(None)
   *  @param TIMER_OVERHEAD Database column TIMER_OVERHEAD SqlType(BIGINT), Default(None) */
  case class PerformanceTimersRow(TIMER_NAME: String, TIMER_FREQUENCY: Option[Long], TIMER_RESOLUTION: Option[Long], TIMER_OVERHEAD: Option[Long])
  /** GetResult implicit for fetching PerformanceTimersRow objects using plain SQL queries */
  implicit def GetResultPerformanceTimersRow(implicit e0: GR[String], e1: GR[Option[Long]]): GR[PerformanceTimersRow] = GR{
    prs => import prs._
    PerformanceTimersRow.tupled((<<[String], <<?[Long], <<?[Long], <<?[Long]))
  }
  /** Table description of table performance_timers. Objects of this class serve as prototypes for rows in queries. */
  class PerformanceTimers(_tableTag: Tag) extends profile.api.Table[PerformanceTimersRow](_tableTag, Some("performance_schema"), "performance_timers") {
    def * = (TIMER_NAME, TIMER_FREQUENCY, TIMER_RESOLUTION, TIMER_OVERHEAD).<>(PerformanceTimersRow.tupled, PerformanceTimersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(TIMER_NAME), TIMER_FREQUENCY, TIMER_RESOLUTION, TIMER_OVERHEAD)).shaped.<>({r=>import r._; _1.map(_=> PerformanceTimersRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column TIMER_NAME SqlType(ENUM), Length(11,true) */
    val TIMER_NAME: Rep[String] = column[String]("TIMER_NAME", O.Length(11,varying=true))
    /** Database column TIMER_FREQUENCY SqlType(BIGINT), Default(None) */
    val TIMER_FREQUENCY: Rep[Option[Long]] = column[Option[Long]]("TIMER_FREQUENCY", O.Default(None))
    /** Database column TIMER_RESOLUTION SqlType(BIGINT), Default(None) */
    val TIMER_RESOLUTION: Rep[Option[Long]] = column[Option[Long]]("TIMER_RESOLUTION", O.Default(None))
    /** Database column TIMER_OVERHEAD SqlType(BIGINT), Default(None) */
    val TIMER_OVERHEAD: Rep[Option[Long]] = column[Option[Long]]("TIMER_OVERHEAD", O.Default(None))
  }
  /** Collection-like TableQuery object for table PerformanceTimers */
  lazy val PerformanceTimers = new TableQuery(tag => new PerformanceTimers(tag))
}
