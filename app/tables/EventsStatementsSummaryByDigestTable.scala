package tables
// AUTO-GENERATED Slick data model for table EventsStatementsSummaryByDigest
trait EventsStatementsSummaryByDigestTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table EventsStatementsSummaryByDigest
   *  @param SCHEMA_NAME Database column SCHEMA_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param DIGEST Database column DIGEST SqlType(VARCHAR), Length(32,true), Default(Some(NULL))
   *  @param DIGEST_TEXT Database column DIGEST_TEXT SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param COUNT_STAR Database column COUNT_STAR SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WAIT Database column SUM_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WAIT Database column MIN_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WAIT Database column AVG_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WAIT Database column MAX_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param SUM_LOCK_TIME Database column SUM_LOCK_TIME SqlType(BIGINT UNSIGNED)
   *  @param SUM_ERRORS Database column SUM_ERRORS SqlType(BIGINT UNSIGNED)
   *  @param SUM_WARNINGS Database column SUM_WARNINGS SqlType(BIGINT UNSIGNED)
   *  @param SUM_ROWS_AFFECTED Database column SUM_ROWS_AFFECTED SqlType(BIGINT UNSIGNED)
   *  @param SUM_ROWS_SENT Database column SUM_ROWS_SENT SqlType(BIGINT UNSIGNED)
   *  @param SUM_ROWS_EXAMINED Database column SUM_ROWS_EXAMINED SqlType(BIGINT UNSIGNED)
   *  @param SUM_CREATED_TMP_DISK_TABLES Database column SUM_CREATED_TMP_DISK_TABLES SqlType(BIGINT UNSIGNED)
   *  @param SUM_CREATED_TMP_TABLES Database column SUM_CREATED_TMP_TABLES SqlType(BIGINT UNSIGNED)
   *  @param SUM_SELECT_FULL_JOIN Database column SUM_SELECT_FULL_JOIN SqlType(BIGINT UNSIGNED)
   *  @param SUM_SELECT_FULL_RANGE_JOIN Database column SUM_SELECT_FULL_RANGE_JOIN SqlType(BIGINT UNSIGNED)
   *  @param SUM_SELECT_RANGE Database column SUM_SELECT_RANGE SqlType(BIGINT UNSIGNED)
   *  @param SUM_SELECT_RANGE_CHECK Database column SUM_SELECT_RANGE_CHECK SqlType(BIGINT UNSIGNED)
   *  @param SUM_SELECT_SCAN Database column SUM_SELECT_SCAN SqlType(BIGINT UNSIGNED)
   *  @param SUM_SORT_MERGE_PASSES Database column SUM_SORT_MERGE_PASSES SqlType(BIGINT UNSIGNED)
   *  @param SUM_SORT_RANGE Database column SUM_SORT_RANGE SqlType(BIGINT UNSIGNED)
   *  @param SUM_SORT_ROWS Database column SUM_SORT_ROWS SqlType(BIGINT UNSIGNED)
   *  @param SUM_SORT_SCAN Database column SUM_SORT_SCAN SqlType(BIGINT UNSIGNED)
   *  @param SUM_NO_INDEX_USED Database column SUM_NO_INDEX_USED SqlType(BIGINT UNSIGNED)
   *  @param SUM_NO_GOOD_INDEX_USED Database column SUM_NO_GOOD_INDEX_USED SqlType(BIGINT UNSIGNED)
   *  @param FIRST_SEEN Database column FIRST_SEEN SqlType(TIMESTAMP)
   *  @param LAST_SEEN Database column LAST_SEEN SqlType(TIMESTAMP) */
  case class EventsStatementsSummaryByDigestRow(SCHEMA_NAME: Option[String], DIGEST: Option[String], DIGEST_TEXT: Option[String], COUNT_STAR: Long, SUM_TIMER_WAIT: Long, MIN_TIMER_WAIT: Long, AVG_TIMER_WAIT: Long, MAX_TIMER_WAIT: Long, SUM_LOCK_TIME: Long, SUM_ERRORS: Long, SUM_WARNINGS: Long, SUM_ROWS_AFFECTED: Long, SUM_ROWS_SENT: Long, SUM_ROWS_EXAMINED: Long, SUM_CREATED_TMP_DISK_TABLES: Long, SUM_CREATED_TMP_TABLES: Long, SUM_SELECT_FULL_JOIN: Long, SUM_SELECT_FULL_RANGE_JOIN: Long, SUM_SELECT_RANGE: Long, SUM_SELECT_RANGE_CHECK: Long, SUM_SELECT_SCAN: Long, SUM_SORT_MERGE_PASSES: Long, SUM_SORT_RANGE: Long, SUM_SORT_ROWS: Long, SUM_SORT_SCAN: Long, SUM_NO_INDEX_USED: Long, SUM_NO_GOOD_INDEX_USED: Long, FIRST_SEEN: java.sql.Timestamp, LAST_SEEN: java.sql.Timestamp)
  /** GetResult implicit for fetching EventsStatementsSummaryByDigestRow objects using plain SQL queries */
  implicit def GetResultEventsStatementsSummaryByDigestRow(implicit e0: GR[Option[String]], e1: GR[Long], e2: GR[java.sql.Timestamp]): GR[EventsStatementsSummaryByDigestRow] = GR{
    prs => import prs._
    EventsStatementsSummaryByDigestRow(<<?[String], <<?[String], <<?[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp])
  }
  /** Table description of table events_statements_summary_by_digest. Objects of this class serve as prototypes for rows in queries. */
  class EventsStatementsSummaryByDigest(_tableTag: Tag) extends profile.api.Table[EventsStatementsSummaryByDigestRow](_tableTag, Some("performance_schema"), "events_statements_summary_by_digest") {
    def * = (SCHEMA_NAME :: DIGEST :: DIGEST_TEXT :: COUNT_STAR :: SUM_TIMER_WAIT :: MIN_TIMER_WAIT :: AVG_TIMER_WAIT :: MAX_TIMER_WAIT :: SUM_LOCK_TIME :: SUM_ERRORS :: SUM_WARNINGS :: SUM_ROWS_AFFECTED :: SUM_ROWS_SENT :: SUM_ROWS_EXAMINED :: SUM_CREATED_TMP_DISK_TABLES :: SUM_CREATED_TMP_TABLES :: SUM_SELECT_FULL_JOIN :: SUM_SELECT_FULL_RANGE_JOIN :: SUM_SELECT_RANGE :: SUM_SELECT_RANGE_CHECK :: SUM_SELECT_SCAN :: SUM_SORT_MERGE_PASSES :: SUM_SORT_RANGE :: SUM_SORT_ROWS :: SUM_SORT_SCAN :: SUM_NO_INDEX_USED :: SUM_NO_GOOD_INDEX_USED :: FIRST_SEEN :: LAST_SEEN :: HNil).mapTo[EventsStatementsSummaryByDigestRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (SCHEMA_NAME :: DIGEST :: DIGEST_TEXT :: Rep.Some(COUNT_STAR) :: Rep.Some(SUM_TIMER_WAIT) :: Rep.Some(MIN_TIMER_WAIT) :: Rep.Some(AVG_TIMER_WAIT) :: Rep.Some(MAX_TIMER_WAIT) :: Rep.Some(SUM_LOCK_TIME) :: Rep.Some(SUM_ERRORS) :: Rep.Some(SUM_WARNINGS) :: Rep.Some(SUM_ROWS_AFFECTED) :: Rep.Some(SUM_ROWS_SENT) :: Rep.Some(SUM_ROWS_EXAMINED) :: Rep.Some(SUM_CREATED_TMP_DISK_TABLES) :: Rep.Some(SUM_CREATED_TMP_TABLES) :: Rep.Some(SUM_SELECT_FULL_JOIN) :: Rep.Some(SUM_SELECT_FULL_RANGE_JOIN) :: Rep.Some(SUM_SELECT_RANGE) :: Rep.Some(SUM_SELECT_RANGE_CHECK) :: Rep.Some(SUM_SELECT_SCAN) :: Rep.Some(SUM_SORT_MERGE_PASSES) :: Rep.Some(SUM_SORT_RANGE) :: Rep.Some(SUM_SORT_ROWS) :: Rep.Some(SUM_SORT_SCAN) :: Rep.Some(SUM_NO_INDEX_USED) :: Rep.Some(SUM_NO_GOOD_INDEX_USED) :: Rep.Some(FIRST_SEEN) :: Rep.Some(LAST_SEEN) :: HNil).shaped.<>(r => EventsStatementsSummaryByDigestRow(r(0).asInstanceOf[Option[String]], r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[Long]].get, r(4).asInstanceOf[Option[Long]].get, r(5).asInstanceOf[Option[Long]].get, r(6).asInstanceOf[Option[Long]].get, r(7).asInstanceOf[Option[Long]].get, r(8).asInstanceOf[Option[Long]].get, r(9).asInstanceOf[Option[Long]].get, r(10).asInstanceOf[Option[Long]].get, r(11).asInstanceOf[Option[Long]].get, r(12).asInstanceOf[Option[Long]].get, r(13).asInstanceOf[Option[Long]].get, r(14).asInstanceOf[Option[Long]].get, r(15).asInstanceOf[Option[Long]].get, r(16).asInstanceOf[Option[Long]].get, r(17).asInstanceOf[Option[Long]].get, r(18).asInstanceOf[Option[Long]].get, r(19).asInstanceOf[Option[Long]].get, r(20).asInstanceOf[Option[Long]].get, r(21).asInstanceOf[Option[Long]].get, r(22).asInstanceOf[Option[Long]].get, r(23).asInstanceOf[Option[Long]].get, r(24).asInstanceOf[Option[Long]].get, r(25).asInstanceOf[Option[Long]].get, r(26).asInstanceOf[Option[Long]].get, r(27).asInstanceOf[Option[java.sql.Timestamp]].get, r(28).asInstanceOf[Option[java.sql.Timestamp]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column SCHEMA_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val SCHEMA_NAME: Rep[Option[String]] = column[Option[String]]("SCHEMA_NAME", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column DIGEST SqlType(VARCHAR), Length(32,true), Default(Some(NULL)) */
    val DIGEST: Rep[Option[String]] = column[Option[String]]("DIGEST", O.Length(32,varying=true), O.Default(Some("NULL")))
    /** Database column DIGEST_TEXT SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val DIGEST_TEXT: Rep[Option[String]] = column[Option[String]]("DIGEST_TEXT", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
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
    /** Database column SUM_LOCK_TIME SqlType(BIGINT UNSIGNED) */
    val SUM_LOCK_TIME: Rep[Long] = column[Long]("SUM_LOCK_TIME")
    /** Database column SUM_ERRORS SqlType(BIGINT UNSIGNED) */
    val SUM_ERRORS: Rep[Long] = column[Long]("SUM_ERRORS")
    /** Database column SUM_WARNINGS SqlType(BIGINT UNSIGNED) */
    val SUM_WARNINGS: Rep[Long] = column[Long]("SUM_WARNINGS")
    /** Database column SUM_ROWS_AFFECTED SqlType(BIGINT UNSIGNED) */
    val SUM_ROWS_AFFECTED: Rep[Long] = column[Long]("SUM_ROWS_AFFECTED")
    /** Database column SUM_ROWS_SENT SqlType(BIGINT UNSIGNED) */
    val SUM_ROWS_SENT: Rep[Long] = column[Long]("SUM_ROWS_SENT")
    /** Database column SUM_ROWS_EXAMINED SqlType(BIGINT UNSIGNED) */
    val SUM_ROWS_EXAMINED: Rep[Long] = column[Long]("SUM_ROWS_EXAMINED")
    /** Database column SUM_CREATED_TMP_DISK_TABLES SqlType(BIGINT UNSIGNED) */
    val SUM_CREATED_TMP_DISK_TABLES: Rep[Long] = column[Long]("SUM_CREATED_TMP_DISK_TABLES")
    /** Database column SUM_CREATED_TMP_TABLES SqlType(BIGINT UNSIGNED) */
    val SUM_CREATED_TMP_TABLES: Rep[Long] = column[Long]("SUM_CREATED_TMP_TABLES")
    /** Database column SUM_SELECT_FULL_JOIN SqlType(BIGINT UNSIGNED) */
    val SUM_SELECT_FULL_JOIN: Rep[Long] = column[Long]("SUM_SELECT_FULL_JOIN")
    /** Database column SUM_SELECT_FULL_RANGE_JOIN SqlType(BIGINT UNSIGNED) */
    val SUM_SELECT_FULL_RANGE_JOIN: Rep[Long] = column[Long]("SUM_SELECT_FULL_RANGE_JOIN")
    /** Database column SUM_SELECT_RANGE SqlType(BIGINT UNSIGNED) */
    val SUM_SELECT_RANGE: Rep[Long] = column[Long]("SUM_SELECT_RANGE")
    /** Database column SUM_SELECT_RANGE_CHECK SqlType(BIGINT UNSIGNED) */
    val SUM_SELECT_RANGE_CHECK: Rep[Long] = column[Long]("SUM_SELECT_RANGE_CHECK")
    /** Database column SUM_SELECT_SCAN SqlType(BIGINT UNSIGNED) */
    val SUM_SELECT_SCAN: Rep[Long] = column[Long]("SUM_SELECT_SCAN")
    /** Database column SUM_SORT_MERGE_PASSES SqlType(BIGINT UNSIGNED) */
    val SUM_SORT_MERGE_PASSES: Rep[Long] = column[Long]("SUM_SORT_MERGE_PASSES")
    /** Database column SUM_SORT_RANGE SqlType(BIGINT UNSIGNED) */
    val SUM_SORT_RANGE: Rep[Long] = column[Long]("SUM_SORT_RANGE")
    /** Database column SUM_SORT_ROWS SqlType(BIGINT UNSIGNED) */
    val SUM_SORT_ROWS: Rep[Long] = column[Long]("SUM_SORT_ROWS")
    /** Database column SUM_SORT_SCAN SqlType(BIGINT UNSIGNED) */
    val SUM_SORT_SCAN: Rep[Long] = column[Long]("SUM_SORT_SCAN")
    /** Database column SUM_NO_INDEX_USED SqlType(BIGINT UNSIGNED) */
    val SUM_NO_INDEX_USED: Rep[Long] = column[Long]("SUM_NO_INDEX_USED")
    /** Database column SUM_NO_GOOD_INDEX_USED SqlType(BIGINT UNSIGNED) */
    val SUM_NO_GOOD_INDEX_USED: Rep[Long] = column[Long]("SUM_NO_GOOD_INDEX_USED")
    /** Database column FIRST_SEEN SqlType(TIMESTAMP) */
    val FIRST_SEEN: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("FIRST_SEEN")
    /** Database column LAST_SEEN SqlType(TIMESTAMP) */
    val LAST_SEEN: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("LAST_SEEN")
  }
  /** Collection-like TableQuery object for table EventsStatementsSummaryByDigest */
  lazy val EventsStatementsSummaryByDigest = new TableQuery(tag => new EventsStatementsSummaryByDigest(tag))
}
