package tables
// AUTO-GENERATED Slick data model for table EventsStagesSummaryByThreadByEventName
trait EventsStagesSummaryByThreadByEventNameTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EventsStagesSummaryByThreadByEventName
   *  @param THREAD_ID Database column THREAD_ID SqlType(BIGINT UNSIGNED)
   *  @param EVENT_NAME Database column EVENT_NAME SqlType(VARCHAR), Length(128,true)
   *  @param COUNT_STAR Database column COUNT_STAR SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WAIT Database column SUM_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WAIT Database column MIN_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WAIT Database column AVG_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WAIT Database column MAX_TIMER_WAIT SqlType(BIGINT UNSIGNED) */
  case class EventsStagesSummaryByThreadByEventNameRow(THREAD_ID: Long, EVENT_NAME: String, COUNT_STAR: Long, SUM_TIMER_WAIT: Long, MIN_TIMER_WAIT: Long, AVG_TIMER_WAIT: Long, MAX_TIMER_WAIT: Long)
  /** GetResult implicit for fetching EventsStagesSummaryByThreadByEventNameRow objects using plain SQL queries */
  implicit def GetResultEventsStagesSummaryByThreadByEventNameRow(implicit e0: GR[Long], e1: GR[String]): GR[EventsStagesSummaryByThreadByEventNameRow] = GR{
    prs => import prs._
    EventsStagesSummaryByThreadByEventNameRow.tupled((<<[Long], <<[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table events_stages_summary_by_thread_by_event_name. Objects of this class serve as prototypes for rows in queries. */
  class EventsStagesSummaryByThreadByEventName(_tableTag: Tag) extends profile.api.Table[EventsStagesSummaryByThreadByEventNameRow](_tableTag, Some("performance_schema"), "events_stages_summary_by_thread_by_event_name") {
    def * = (THREAD_ID, EVENT_NAME, COUNT_STAR, SUM_TIMER_WAIT, MIN_TIMER_WAIT, AVG_TIMER_WAIT, MAX_TIMER_WAIT).<>(EventsStagesSummaryByThreadByEventNameRow.tupled, EventsStagesSummaryByThreadByEventNameRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(THREAD_ID), Rep.Some(EVENT_NAME), Rep.Some(COUNT_STAR), Rep.Some(SUM_TIMER_WAIT), Rep.Some(MIN_TIMER_WAIT), Rep.Some(AVG_TIMER_WAIT), Rep.Some(MAX_TIMER_WAIT))).shaped.<>({r=>import r._; _1.map(_=> EventsStagesSummaryByThreadByEventNameRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column THREAD_ID SqlType(BIGINT UNSIGNED) */
    val THREAD_ID: Rep[Long] = column[Long]("THREAD_ID")
    /** Database column EVENT_NAME SqlType(VARCHAR), Length(128,true) */
    val EVENT_NAME: Rep[String] = column[String]("EVENT_NAME", O.Length(128,varying=true))
    /** Database column COUNT_STAR SqlType(BIGINT UNSIGNED) */
    val COUNT_STAR: Rep[Long] = column[Long]("COUNT_STAR")
    /** Database column SUM_TIMER_WAIT SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_WAIT: Rep[Long] = column[Long]("SUM_TIMER_WAIT")
    /** Database column MIN_TIMER_WAIT SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_WAIT: Rep[Long] = column[Long]("MIN_TIMER_WAIT")
    /** Database column AVG_TIMER_WAIT SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_WAIT: Rep[Long] = column[Long]("AVG_TIMER_WAIT")
    /** Database column MAX_TIMER_WAIT SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_WAIT: Rep[Long] = column[Long]("MAX_TIMER_WAIT")
  }
  /** Collection-like TableQuery object for table EventsStagesSummaryByThreadByEventName */
  lazy val EventsStagesSummaryByThreadByEventName = new TableQuery(tag => new EventsStagesSummaryByThreadByEventName(tag))
}
