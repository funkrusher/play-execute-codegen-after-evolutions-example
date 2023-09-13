package tables
// AUTO-GENERATED Slick data model for table EventsStagesSummaryByHostByEventName
trait EventsStagesSummaryByHostByEventNameTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EventsStagesSummaryByHostByEventName
   *  @param HOST Database column HOST SqlType(CHAR), Length(60,false), Default(Some(NULL))
   *  @param EVENT_NAME Database column EVENT_NAME SqlType(VARCHAR), Length(128,true)
   *  @param COUNT_STAR Database column COUNT_STAR SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WAIT Database column SUM_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WAIT Database column MIN_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WAIT Database column AVG_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WAIT Database column MAX_TIMER_WAIT SqlType(BIGINT UNSIGNED) */
  case class EventsStagesSummaryByHostByEventNameRow(HOST: Option[String], EVENT_NAME: String, COUNT_STAR: Long, SUM_TIMER_WAIT: Long, MIN_TIMER_WAIT: Long, AVG_TIMER_WAIT: Long, MAX_TIMER_WAIT: Long)
  /** GetResult implicit for fetching EventsStagesSummaryByHostByEventNameRow objects using plain SQL queries */
  implicit def GetResultEventsStagesSummaryByHostByEventNameRow(implicit e0: GR[Option[String]], e1: GR[String], e2: GR[Long]): GR[EventsStagesSummaryByHostByEventNameRow] = GR{
    prs => import prs._
    EventsStagesSummaryByHostByEventNameRow.tupled((<<?[String], <<[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table events_stages_summary_by_host_by_event_name. Objects of this class serve as prototypes for rows in queries. */
  class EventsStagesSummaryByHostByEventName(_tableTag: Tag) extends profile.api.Table[EventsStagesSummaryByHostByEventNameRow](_tableTag, Some("performance_schema"), "events_stages_summary_by_host_by_event_name") {
    def * = (HOST, EVENT_NAME, COUNT_STAR, SUM_TIMER_WAIT, MIN_TIMER_WAIT, AVG_TIMER_WAIT, MAX_TIMER_WAIT).<>(EventsStagesSummaryByHostByEventNameRow.tupled, EventsStagesSummaryByHostByEventNameRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((HOST, Rep.Some(EVENT_NAME), Rep.Some(COUNT_STAR), Rep.Some(SUM_TIMER_WAIT), Rep.Some(MIN_TIMER_WAIT), Rep.Some(AVG_TIMER_WAIT), Rep.Some(MAX_TIMER_WAIT))).shaped.<>({r=>import r._; _2.map(_=> EventsStagesSummaryByHostByEventNameRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column HOST SqlType(CHAR), Length(60,false), Default(Some(NULL)) */
    val HOST: Rep[Option[String]] = column[Option[String]]("HOST", O.Length(60,varying=false), O.Default(Some("NULL")))
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
  /** Collection-like TableQuery object for table EventsStagesSummaryByHostByEventName */
  lazy val EventsStagesSummaryByHostByEventName = new TableQuery(tag => new EventsStagesSummaryByHostByEventName(tag))
}
