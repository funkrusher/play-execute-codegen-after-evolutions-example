package tables
// AUTO-GENERATED Slick data model for table EventsStagesHistoryLong
trait EventsStagesHistoryLongTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EventsStagesHistoryLong
   *  @param THREAD_ID Database column THREAD_ID SqlType(BIGINT UNSIGNED)
   *  @param EVENT_ID Database column EVENT_ID SqlType(BIGINT UNSIGNED)
   *  @param END_EVENT_ID Database column END_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param EVENT_NAME Database column EVENT_NAME SqlType(VARCHAR), Length(128,true)
   *  @param SOURCE Database column SOURCE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param TIMER_START Database column TIMER_START SqlType(BIGINT UNSIGNED), Default(None)
   *  @param TIMER_END Database column TIMER_END SqlType(BIGINT UNSIGNED), Default(None)
   *  @param TIMER_WAIT Database column TIMER_WAIT SqlType(BIGINT UNSIGNED), Default(None)
   *  @param NESTING_EVENT_ID Database column NESTING_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param NESTING_EVENT_TYPE Database column NESTING_EVENT_TYPE SqlType(ENUM), Length(9,true), Default(Some(NULL)) */
  case class EventsStagesHistoryLongRow(THREAD_ID: Long, EVENT_ID: Long, END_EVENT_ID: Option[Long], EVENT_NAME: String, SOURCE: Option[String], TIMER_START: Option[Long], TIMER_END: Option[Long], TIMER_WAIT: Option[Long], NESTING_EVENT_ID: Option[Long], NESTING_EVENT_TYPE: Option[String])
  /** GetResult implicit for fetching EventsStagesHistoryLongRow objects using plain SQL queries */
  implicit def GetResultEventsStagesHistoryLongRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[String], e3: GR[Option[String]]): GR[EventsStagesHistoryLongRow] = GR{
    prs => import prs._
    EventsStagesHistoryLongRow.tupled((<<[Long], <<[Long], <<?[Long], <<[String], <<?[String], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[String]))
  }
  /** Table description of table events_stages_history_long. Objects of this class serve as prototypes for rows in queries. */
  class EventsStagesHistoryLong(_tableTag: Tag) extends profile.api.Table[EventsStagesHistoryLongRow](_tableTag, Some("performance_schema"), "events_stages_history_long") {
    def * = (THREAD_ID, EVENT_ID, END_EVENT_ID, EVENT_NAME, SOURCE, TIMER_START, TIMER_END, TIMER_WAIT, NESTING_EVENT_ID, NESTING_EVENT_TYPE).<>(EventsStagesHistoryLongRow.tupled, EventsStagesHistoryLongRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(THREAD_ID), Rep.Some(EVENT_ID), END_EVENT_ID, Rep.Some(EVENT_NAME), SOURCE, TIMER_START, TIMER_END, TIMER_WAIT, NESTING_EVENT_ID, NESTING_EVENT_TYPE)).shaped.<>({r=>import r._; _1.map(_=> EventsStagesHistoryLongRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8, _9, _10)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column THREAD_ID SqlType(BIGINT UNSIGNED) */
    val THREAD_ID: Rep[Long] = column[Long]("THREAD_ID")
    /** Database column EVENT_ID SqlType(BIGINT UNSIGNED) */
    val EVENT_ID: Rep[Long] = column[Long]("EVENT_ID")
    /** Database column END_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val END_EVENT_ID: Rep[Option[Long]] = column[Option[Long]]("END_EVENT_ID", O.Default(None))
    /** Database column EVENT_NAME SqlType(VARCHAR), Length(128,true) */
    val EVENT_NAME: Rep[String] = column[String]("EVENT_NAME", O.Length(128,varying=true))
    /** Database column SOURCE SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val SOURCE: Rep[Option[String]] = column[Option[String]]("SOURCE", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column TIMER_START SqlType(BIGINT UNSIGNED), Default(None) */
    val TIMER_START: Rep[Option[Long]] = column[Option[Long]]("TIMER_START", O.Default(None))
    /** Database column TIMER_END SqlType(BIGINT UNSIGNED), Default(None) */
    val TIMER_END: Rep[Option[Long]] = column[Option[Long]]("TIMER_END", O.Default(None))
    /** Database column TIMER_WAIT SqlType(BIGINT UNSIGNED), Default(None) */
    val TIMER_WAIT: Rep[Option[Long]] = column[Option[Long]]("TIMER_WAIT", O.Default(None))
    /** Database column NESTING_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val NESTING_EVENT_ID: Rep[Option[Long]] = column[Option[Long]]("NESTING_EVENT_ID", O.Default(None))
    /** Database column NESTING_EVENT_TYPE SqlType(ENUM), Length(9,true), Default(Some(NULL)) */
    val NESTING_EVENT_TYPE: Rep[Option[String]] = column[Option[String]]("NESTING_EVENT_TYPE", O.Length(9,varying=true), O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table EventsStagesHistoryLong */
  lazy val EventsStagesHistoryLong = new TableQuery(tag => new EventsStagesHistoryLong(tag))
}
