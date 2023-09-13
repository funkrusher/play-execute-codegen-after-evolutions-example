package tables
// AUTO-GENERATED Slick data model for table EventsWaitsCurrent
trait EventsWaitsCurrentTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EventsWaitsCurrent
   *  @param THREAD_ID Database column THREAD_ID SqlType(BIGINT UNSIGNED)
   *  @param EVENT_ID Database column EVENT_ID SqlType(BIGINT UNSIGNED)
   *  @param END_EVENT_ID Database column END_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param EVENT_NAME Database column EVENT_NAME SqlType(VARCHAR), Length(128,true)
   *  @param SOURCE Database column SOURCE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param TIMER_START Database column TIMER_START SqlType(BIGINT UNSIGNED), Default(None)
   *  @param TIMER_END Database column TIMER_END SqlType(BIGINT UNSIGNED), Default(None)
   *  @param TIMER_WAIT Database column TIMER_WAIT SqlType(BIGINT UNSIGNED), Default(None)
   *  @param SPINS Database column SPINS SqlType(INT UNSIGNED), Default(None)
   *  @param OBJECT_SCHEMA Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_NAME Database column OBJECT_NAME SqlType(VARCHAR), Length(512,true), Default(Some(NULL))
   *  @param INDEX_NAME Database column INDEX_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_TYPE Database column OBJECT_TYPE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_INSTANCE_BEGIN Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED)
   *  @param NESTING_EVENT_ID Database column NESTING_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param NESTING_EVENT_TYPE Database column NESTING_EVENT_TYPE SqlType(ENUM), Length(9,true), Default(Some(NULL))
   *  @param OPERATION Database column OPERATION SqlType(VARCHAR), Length(32,true)
   *  @param NUMBER_OF_BYTES Database column NUMBER_OF_BYTES SqlType(BIGINT), Default(None)
   *  @param FLAGS Database column FLAGS SqlType(INT UNSIGNED), Default(None) */
  case class EventsWaitsCurrentRow(THREAD_ID: Long, EVENT_ID: Long, END_EVENT_ID: Option[Long], EVENT_NAME: String, SOURCE: Option[String], TIMER_START: Option[Long], TIMER_END: Option[Long], TIMER_WAIT: Option[Long], SPINS: Option[Long], OBJECT_SCHEMA: Option[String], OBJECT_NAME: Option[String], INDEX_NAME: Option[String], OBJECT_TYPE: Option[String], OBJECT_INSTANCE_BEGIN: Long, NESTING_EVENT_ID: Option[Long], NESTING_EVENT_TYPE: Option[String], OPERATION: String, NUMBER_OF_BYTES: Option[Long], FLAGS: Option[Long])
  /** GetResult implicit for fetching EventsWaitsCurrentRow objects using plain SQL queries */
  implicit def GetResultEventsWaitsCurrentRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[String], e3: GR[Option[String]]): GR[EventsWaitsCurrentRow] = GR{
    prs => import prs._
    EventsWaitsCurrentRow.tupled((<<[Long], <<[Long], <<?[Long], <<[String], <<?[String], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<[Long], <<?[Long], <<?[String], <<[String], <<?[Long], <<?[Long]))
  }
  /** Table description of table events_waits_current. Objects of this class serve as prototypes for rows in queries. */
  class EventsWaitsCurrent(_tableTag: Tag) extends profile.api.Table[EventsWaitsCurrentRow](_tableTag, Some("performance_schema"), "events_waits_current") {
    def * = (THREAD_ID, EVENT_ID, END_EVENT_ID, EVENT_NAME, SOURCE, TIMER_START, TIMER_END, TIMER_WAIT, SPINS, OBJECT_SCHEMA, OBJECT_NAME, INDEX_NAME, OBJECT_TYPE, OBJECT_INSTANCE_BEGIN, NESTING_EVENT_ID, NESTING_EVENT_TYPE, OPERATION, NUMBER_OF_BYTES, FLAGS).<>(EventsWaitsCurrentRow.tupled, EventsWaitsCurrentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(THREAD_ID), Rep.Some(EVENT_ID), END_EVENT_ID, Rep.Some(EVENT_NAME), SOURCE, TIMER_START, TIMER_END, TIMER_WAIT, SPINS, OBJECT_SCHEMA, OBJECT_NAME, INDEX_NAME, OBJECT_TYPE, Rep.Some(OBJECT_INSTANCE_BEGIN), NESTING_EVENT_ID, NESTING_EVENT_TYPE, Rep.Some(OPERATION), NUMBER_OF_BYTES, FLAGS)).shaped.<>({r=>import r._; _1.map(_=> EventsWaitsCurrentRow.tupled((_1.get, _2.get, _3, _4.get, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14.get, _15, _16, _17.get, _18, _19)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column SPINS SqlType(INT UNSIGNED), Default(None) */
    val SPINS: Rep[Option[Long]] = column[Option[Long]]("SPINS", O.Default(None))
    /** Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val OBJECT_SCHEMA: Rep[Option[String]] = column[Option[String]]("OBJECT_SCHEMA", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_NAME SqlType(VARCHAR), Length(512,true), Default(Some(NULL)) */
    val OBJECT_NAME: Rep[Option[String]] = column[Option[String]]("OBJECT_NAME", O.Length(512,varying=true), O.Default(Some("NULL")))
    /** Database column INDEX_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val INDEX_NAME: Rep[Option[String]] = column[Option[String]]("INDEX_NAME", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_TYPE SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val OBJECT_TYPE: Rep[Option[String]] = column[Option[String]]("OBJECT_TYPE", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED) */
    val OBJECT_INSTANCE_BEGIN: Rep[Long] = column[Long]("OBJECT_INSTANCE_BEGIN")
    /** Database column NESTING_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val NESTING_EVENT_ID: Rep[Option[Long]] = column[Option[Long]]("NESTING_EVENT_ID", O.Default(None))
    /** Database column NESTING_EVENT_TYPE SqlType(ENUM), Length(9,true), Default(Some(NULL)) */
    val NESTING_EVENT_TYPE: Rep[Option[String]] = column[Option[String]]("NESTING_EVENT_TYPE", O.Length(9,varying=true), O.Default(Some("NULL")))
    /** Database column OPERATION SqlType(VARCHAR), Length(32,true) */
    val OPERATION: Rep[String] = column[String]("OPERATION", O.Length(32,varying=true))
    /** Database column NUMBER_OF_BYTES SqlType(BIGINT), Default(None) */
    val NUMBER_OF_BYTES: Rep[Option[Long]] = column[Option[Long]]("NUMBER_OF_BYTES", O.Default(None))
    /** Database column FLAGS SqlType(INT UNSIGNED), Default(None) */
    val FLAGS: Rep[Option[Long]] = column[Option[Long]]("FLAGS", O.Default(None))
  }
  /** Collection-like TableQuery object for table EventsWaitsCurrent */
  lazy val EventsWaitsCurrent = new TableQuery(tag => new EventsWaitsCurrent(tag))
}
