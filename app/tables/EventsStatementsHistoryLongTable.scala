package tables
// AUTO-GENERATED Slick data model for table EventsStatementsHistoryLong
trait EventsStatementsHistoryLongTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EventsStatementsHistoryLong
   *  @param THREAD_ID Database column THREAD_ID SqlType(BIGINT UNSIGNED)
   *  @param EVENT_ID Database column EVENT_ID SqlType(BIGINT UNSIGNED)
   *  @param END_EVENT_ID Database column END_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param EVENT_NAME Database column EVENT_NAME SqlType(VARCHAR), Length(128,true)
   *  @param SOURCE Database column SOURCE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param TIMER_START Database column TIMER_START SqlType(BIGINT UNSIGNED), Default(None)
   *  @param TIMER_END Database column TIMER_END SqlType(BIGINT UNSIGNED), Default(None)
   *  @param TIMER_WAIT Database column TIMER_WAIT SqlType(BIGINT UNSIGNED), Default(None)
   *  @param LOCK_TIME Database column LOCK_TIME SqlType(BIGINT UNSIGNED)
   *  @param SQL_TEXT Database column SQL_TEXT SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param DIGEST Database column DIGEST SqlType(VARCHAR), Length(32,true), Default(Some(NULL))
   *  @param DIGEST_TEXT Database column DIGEST_TEXT SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param CURRENT_SCHEMA Database column CURRENT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_TYPE Database column OBJECT_TYPE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_SCHEMA Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_NAME Database column OBJECT_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_INSTANCE_BEGIN Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED), Default(None)
   *  @param MYSQL_ERRNO Database column MYSQL_ERRNO SqlType(INT), Default(None)
   *  @param RETURNED_SQLSTATE Database column RETURNED_SQLSTATE SqlType(VARCHAR), Length(5,true), Default(Some(NULL))
   *  @param MESSAGE_TEXT Database column MESSAGE_TEXT SqlType(VARCHAR), Length(128,true), Default(Some(NULL))
   *  @param ERRORS Database column ERRORS SqlType(BIGINT UNSIGNED)
   *  @param WARNINGS Database column WARNINGS SqlType(BIGINT UNSIGNED)
   *  @param ROWS_AFFECTED Database column ROWS_AFFECTED SqlType(BIGINT UNSIGNED)
   *  @param ROWS_SENT Database column ROWS_SENT SqlType(BIGINT UNSIGNED)
   *  @param ROWS_EXAMINED Database column ROWS_EXAMINED SqlType(BIGINT UNSIGNED)
   *  @param CREATED_TMP_DISK_TABLES Database column CREATED_TMP_DISK_TABLES SqlType(BIGINT UNSIGNED)
   *  @param CREATED_TMP_TABLES Database column CREATED_TMP_TABLES SqlType(BIGINT UNSIGNED)
   *  @param SELECT_FULL_JOIN Database column SELECT_FULL_JOIN SqlType(BIGINT UNSIGNED)
   *  @param SELECT_FULL_RANGE_JOIN Database column SELECT_FULL_RANGE_JOIN SqlType(BIGINT UNSIGNED)
   *  @param SELECT_RANGE Database column SELECT_RANGE SqlType(BIGINT UNSIGNED)
   *  @param SELECT_RANGE_CHECK Database column SELECT_RANGE_CHECK SqlType(BIGINT UNSIGNED)
   *  @param SELECT_SCAN Database column SELECT_SCAN SqlType(BIGINT UNSIGNED)
   *  @param SORT_MERGE_PASSES Database column SORT_MERGE_PASSES SqlType(BIGINT UNSIGNED)
   *  @param SORT_RANGE Database column SORT_RANGE SqlType(BIGINT UNSIGNED)
   *  @param SORT_ROWS Database column SORT_ROWS SqlType(BIGINT UNSIGNED)
   *  @param SORT_SCAN Database column SORT_SCAN SqlType(BIGINT UNSIGNED)
   *  @param NO_INDEX_USED Database column NO_INDEX_USED SqlType(BIGINT UNSIGNED)
   *  @param NO_GOOD_INDEX_USED Database column NO_GOOD_INDEX_USED SqlType(BIGINT UNSIGNED)
   *  @param NESTING_EVENT_ID Database column NESTING_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param NESTING_EVENT_TYPE Database column NESTING_EVENT_TYPE SqlType(ENUM), Length(9,true), Default(Some(NULL)) */
  case class EventsStatementsHistoryLongRow(THREAD_ID: Long, EVENT_ID: Long, END_EVENT_ID: Option[Long], EVENT_NAME: String, SOURCE: Option[String], TIMER_START: Option[Long], TIMER_END: Option[Long], TIMER_WAIT: Option[Long], LOCK_TIME: Long, SQL_TEXT: Option[String], DIGEST: Option[String], DIGEST_TEXT: Option[String], CURRENT_SCHEMA: Option[String], OBJECT_TYPE: Option[String], OBJECT_SCHEMA: Option[String], OBJECT_NAME: Option[String], OBJECT_INSTANCE_BEGIN: Option[Long], MYSQL_ERRNO: Option[Int], RETURNED_SQLSTATE: Option[String], MESSAGE_TEXT: Option[String], ERRORS: Long, WARNINGS: Long, ROWS_AFFECTED: Long, ROWS_SENT: Long, ROWS_EXAMINED: Long, CREATED_TMP_DISK_TABLES: Long, CREATED_TMP_TABLES: Long, SELECT_FULL_JOIN: Long, SELECT_FULL_RANGE_JOIN: Long, SELECT_RANGE: Long, SELECT_RANGE_CHECK: Long, SELECT_SCAN: Long, SORT_MERGE_PASSES: Long, SORT_RANGE: Long, SORT_ROWS: Long, SORT_SCAN: Long, NO_INDEX_USED: Long, NO_GOOD_INDEX_USED: Long, NESTING_EVENT_ID: Option[Long], NESTING_EVENT_TYPE: Option[String])
  /** GetResult implicit for fetching EventsStatementsHistoryLongRow objects using plain SQL queries */
  implicit def GetResultEventsStatementsHistoryLongRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[Int]]): GR[EventsStatementsHistoryLongRow] = GR{
    prs => import prs._
    EventsStatementsHistoryLongRow(<<[Long], <<[Long], <<?[Long], <<[String], <<?[String], <<?[Long], <<?[Long], <<?[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[Int], <<?[String], <<?[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<?[Long], <<?[String])
  }
  /** Table description of table events_statements_history_long. Objects of this class serve as prototypes for rows in queries. */
  class EventsStatementsHistoryLong(_tableTag: Tag) extends profile.api.Table[EventsStatementsHistoryLongRow](_tableTag, Some("performance_schema"), "events_statements_history_long") {
    def * = (THREAD_ID :: EVENT_ID :: END_EVENT_ID :: EVENT_NAME :: SOURCE :: TIMER_START :: TIMER_END :: TIMER_WAIT :: LOCK_TIME :: SQL_TEXT :: DIGEST :: DIGEST_TEXT :: CURRENT_SCHEMA :: OBJECT_TYPE :: OBJECT_SCHEMA :: OBJECT_NAME :: OBJECT_INSTANCE_BEGIN :: MYSQL_ERRNO :: RETURNED_SQLSTATE :: MESSAGE_TEXT :: ERRORS :: WARNINGS :: ROWS_AFFECTED :: ROWS_SENT :: ROWS_EXAMINED :: CREATED_TMP_DISK_TABLES :: CREATED_TMP_TABLES :: SELECT_FULL_JOIN :: SELECT_FULL_RANGE_JOIN :: SELECT_RANGE :: SELECT_RANGE_CHECK :: SELECT_SCAN :: SORT_MERGE_PASSES :: SORT_RANGE :: SORT_ROWS :: SORT_SCAN :: NO_INDEX_USED :: NO_GOOD_INDEX_USED :: NESTING_EVENT_ID :: NESTING_EVENT_TYPE :: HNil).mapTo[EventsStatementsHistoryLongRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(THREAD_ID) :: Rep.Some(EVENT_ID) :: END_EVENT_ID :: Rep.Some(EVENT_NAME) :: SOURCE :: TIMER_START :: TIMER_END :: TIMER_WAIT :: Rep.Some(LOCK_TIME) :: SQL_TEXT :: DIGEST :: DIGEST_TEXT :: CURRENT_SCHEMA :: OBJECT_TYPE :: OBJECT_SCHEMA :: OBJECT_NAME :: OBJECT_INSTANCE_BEGIN :: MYSQL_ERRNO :: RETURNED_SQLSTATE :: MESSAGE_TEXT :: Rep.Some(ERRORS) :: Rep.Some(WARNINGS) :: Rep.Some(ROWS_AFFECTED) :: Rep.Some(ROWS_SENT) :: Rep.Some(ROWS_EXAMINED) :: Rep.Some(CREATED_TMP_DISK_TABLES) :: Rep.Some(CREATED_TMP_TABLES) :: Rep.Some(SELECT_FULL_JOIN) :: Rep.Some(SELECT_FULL_RANGE_JOIN) :: Rep.Some(SELECT_RANGE) :: Rep.Some(SELECT_RANGE_CHECK) :: Rep.Some(SELECT_SCAN) :: Rep.Some(SORT_MERGE_PASSES) :: Rep.Some(SORT_RANGE) :: Rep.Some(SORT_ROWS) :: Rep.Some(SORT_SCAN) :: Rep.Some(NO_INDEX_USED) :: Rep.Some(NO_GOOD_INDEX_USED) :: NESTING_EVENT_ID :: NESTING_EVENT_TYPE :: HNil).shaped.<>(r => EventsStatementsHistoryLongRow(r(0).asInstanceOf[Option[Long]].get, r(1).asInstanceOf[Option[Long]].get, r(2).asInstanceOf[Option[Long]], r(3).asInstanceOf[Option[String]].get, r(4).asInstanceOf[Option[String]], r(5).asInstanceOf[Option[Long]], r(6).asInstanceOf[Option[Long]], r(7).asInstanceOf[Option[Long]], r(8).asInstanceOf[Option[Long]].get, r(9).asInstanceOf[Option[String]], r(10).asInstanceOf[Option[String]], r(11).asInstanceOf[Option[String]], r(12).asInstanceOf[Option[String]], r(13).asInstanceOf[Option[String]], r(14).asInstanceOf[Option[String]], r(15).asInstanceOf[Option[String]], r(16).asInstanceOf[Option[Long]], r(17).asInstanceOf[Option[Int]], r(18).asInstanceOf[Option[String]], r(19).asInstanceOf[Option[String]], r(20).asInstanceOf[Option[Long]].get, r(21).asInstanceOf[Option[Long]].get, r(22).asInstanceOf[Option[Long]].get, r(23).asInstanceOf[Option[Long]].get, r(24).asInstanceOf[Option[Long]].get, r(25).asInstanceOf[Option[Long]].get, r(26).asInstanceOf[Option[Long]].get, r(27).asInstanceOf[Option[Long]].get, r(28).asInstanceOf[Option[Long]].get, r(29).asInstanceOf[Option[Long]].get, r(30).asInstanceOf[Option[Long]].get, r(31).asInstanceOf[Option[Long]].get, r(32).asInstanceOf[Option[Long]].get, r(33).asInstanceOf[Option[Long]].get, r(34).asInstanceOf[Option[Long]].get, r(35).asInstanceOf[Option[Long]].get, r(36).asInstanceOf[Option[Long]].get, r(37).asInstanceOf[Option[Long]].get, r(38).asInstanceOf[Option[Long]], r(39).asInstanceOf[Option[String]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column LOCK_TIME SqlType(BIGINT UNSIGNED) */
    val LOCK_TIME: Rep[Long] = column[Long]("LOCK_TIME")
    /** Database column SQL_TEXT SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val SQL_TEXT: Rep[Option[String]] = column[Option[String]]("SQL_TEXT", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column DIGEST SqlType(VARCHAR), Length(32,true), Default(Some(NULL)) */
    val DIGEST: Rep[Option[String]] = column[Option[String]]("DIGEST", O.Length(32,varying=true), O.Default(Some("NULL")))
    /** Database column DIGEST_TEXT SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val DIGEST_TEXT: Rep[Option[String]] = column[Option[String]]("DIGEST_TEXT", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column CURRENT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val CURRENT_SCHEMA: Rep[Option[String]] = column[Option[String]]("CURRENT_SCHEMA", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_TYPE SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val OBJECT_TYPE: Rep[Option[String]] = column[Option[String]]("OBJECT_TYPE", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val OBJECT_SCHEMA: Rep[Option[String]] = column[Option[String]]("OBJECT_SCHEMA", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val OBJECT_NAME: Rep[Option[String]] = column[Option[String]]("OBJECT_NAME", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED), Default(None) */
    val OBJECT_INSTANCE_BEGIN: Rep[Option[Long]] = column[Option[Long]]("OBJECT_INSTANCE_BEGIN", O.Default(None))
    /** Database column MYSQL_ERRNO SqlType(INT), Default(None) */
    val MYSQL_ERRNO: Rep[Option[Int]] = column[Option[Int]]("MYSQL_ERRNO", O.Default(None))
    /** Database column RETURNED_SQLSTATE SqlType(VARCHAR), Length(5,true), Default(Some(NULL)) */
    val RETURNED_SQLSTATE: Rep[Option[String]] = column[Option[String]]("RETURNED_SQLSTATE", O.Length(5,varying=true), O.Default(Some("NULL")))
    /** Database column MESSAGE_TEXT SqlType(VARCHAR), Length(128,true), Default(Some(NULL)) */
    val MESSAGE_TEXT: Rep[Option[String]] = column[Option[String]]("MESSAGE_TEXT", O.Length(128,varying=true), O.Default(Some("NULL")))
    /** Database column ERRORS SqlType(BIGINT UNSIGNED) */
    val ERRORS: Rep[Long] = column[Long]("ERRORS")
    /** Database column WARNINGS SqlType(BIGINT UNSIGNED) */
    val WARNINGS: Rep[Long] = column[Long]("WARNINGS")
    /** Database column ROWS_AFFECTED SqlType(BIGINT UNSIGNED) */
    val ROWS_AFFECTED: Rep[Long] = column[Long]("ROWS_AFFECTED")
    /** Database column ROWS_SENT SqlType(BIGINT UNSIGNED) */
    val ROWS_SENT: Rep[Long] = column[Long]("ROWS_SENT")
    /** Database column ROWS_EXAMINED SqlType(BIGINT UNSIGNED) */
    val ROWS_EXAMINED: Rep[Long] = column[Long]("ROWS_EXAMINED")
    /** Database column CREATED_TMP_DISK_TABLES SqlType(BIGINT UNSIGNED) */
    val CREATED_TMP_DISK_TABLES: Rep[Long] = column[Long]("CREATED_TMP_DISK_TABLES")
    /** Database column CREATED_TMP_TABLES SqlType(BIGINT UNSIGNED) */
    val CREATED_TMP_TABLES: Rep[Long] = column[Long]("CREATED_TMP_TABLES")
    /** Database column SELECT_FULL_JOIN SqlType(BIGINT UNSIGNED) */
    val SELECT_FULL_JOIN: Rep[Long] = column[Long]("SELECT_FULL_JOIN")
    /** Database column SELECT_FULL_RANGE_JOIN SqlType(BIGINT UNSIGNED) */
    val SELECT_FULL_RANGE_JOIN: Rep[Long] = column[Long]("SELECT_FULL_RANGE_JOIN")
    /** Database column SELECT_RANGE SqlType(BIGINT UNSIGNED) */
    val SELECT_RANGE: Rep[Long] = column[Long]("SELECT_RANGE")
    /** Database column SELECT_RANGE_CHECK SqlType(BIGINT UNSIGNED) */
    val SELECT_RANGE_CHECK: Rep[Long] = column[Long]("SELECT_RANGE_CHECK")
    /** Database column SELECT_SCAN SqlType(BIGINT UNSIGNED) */
    val SELECT_SCAN: Rep[Long] = column[Long]("SELECT_SCAN")
    /** Database column SORT_MERGE_PASSES SqlType(BIGINT UNSIGNED) */
    val SORT_MERGE_PASSES: Rep[Long] = column[Long]("SORT_MERGE_PASSES")
    /** Database column SORT_RANGE SqlType(BIGINT UNSIGNED) */
    val SORT_RANGE: Rep[Long] = column[Long]("SORT_RANGE")
    /** Database column SORT_ROWS SqlType(BIGINT UNSIGNED) */
    val SORT_ROWS: Rep[Long] = column[Long]("SORT_ROWS")
    /** Database column SORT_SCAN SqlType(BIGINT UNSIGNED) */
    val SORT_SCAN: Rep[Long] = column[Long]("SORT_SCAN")
    /** Database column NO_INDEX_USED SqlType(BIGINT UNSIGNED) */
    val NO_INDEX_USED: Rep[Long] = column[Long]("NO_INDEX_USED")
    /** Database column NO_GOOD_INDEX_USED SqlType(BIGINT UNSIGNED) */
    val NO_GOOD_INDEX_USED: Rep[Long] = column[Long]("NO_GOOD_INDEX_USED")
    /** Database column NESTING_EVENT_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val NESTING_EVENT_ID: Rep[Option[Long]] = column[Option[Long]]("NESTING_EVENT_ID", O.Default(None))
    /** Database column NESTING_EVENT_TYPE SqlType(ENUM), Length(9,true), Default(Some(NULL)) */
    val NESTING_EVENT_TYPE: Rep[Option[String]] = column[Option[String]]("NESTING_EVENT_TYPE", O.Length(9,varying=true), O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table EventsStatementsHistoryLong */
  lazy val EventsStatementsHistoryLong = new TableQuery(tag => new EventsStatementsHistoryLong(tag))
}
