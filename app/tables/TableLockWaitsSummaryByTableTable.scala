package tables
// AUTO-GENERATED Slick data model for table TableLockWaitsSummaryByTable
trait TableLockWaitsSummaryByTableTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TableLockWaitsSummaryByTable
   *  @param OBJECT_TYPE Database column OBJECT_TYPE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_SCHEMA Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_NAME Database column OBJECT_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param COUNT_STAR Database column COUNT_STAR SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WAIT Database column SUM_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WAIT Database column MIN_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WAIT Database column AVG_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WAIT Database column MAX_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param COUNT_READ Database column COUNT_READ SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_READ Database column SUM_TIMER_READ SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_READ Database column MIN_TIMER_READ SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_READ Database column AVG_TIMER_READ SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_READ Database column MAX_TIMER_READ SqlType(BIGINT UNSIGNED)
   *  @param COUNT_WRITE Database column COUNT_WRITE SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WRITE Database column SUM_TIMER_WRITE SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WRITE Database column MIN_TIMER_WRITE SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WRITE Database column AVG_TIMER_WRITE SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WRITE Database column MAX_TIMER_WRITE SqlType(BIGINT UNSIGNED)
   *  @param COUNT_READ_NORMAL Database column COUNT_READ_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_READ_NORMAL Database column SUM_TIMER_READ_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_READ_NORMAL Database column MIN_TIMER_READ_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_READ_NORMAL Database column AVG_TIMER_READ_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_READ_NORMAL Database column MAX_TIMER_READ_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param COUNT_READ_WITH_SHARED_LOCKS Database column COUNT_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_READ_WITH_SHARED_LOCKS Database column SUM_TIMER_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_READ_WITH_SHARED_LOCKS Database column MIN_TIMER_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_READ_WITH_SHARED_LOCKS Database column AVG_TIMER_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_READ_WITH_SHARED_LOCKS Database column MAX_TIMER_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED)
   *  @param COUNT_READ_HIGH_PRIORITY Database column COUNT_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_READ_HIGH_PRIORITY Database column SUM_TIMER_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_READ_HIGH_PRIORITY Database column MIN_TIMER_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_READ_HIGH_PRIORITY Database column AVG_TIMER_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_READ_HIGH_PRIORITY Database column MAX_TIMER_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param COUNT_READ_NO_INSERT Database column COUNT_READ_NO_INSERT SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_READ_NO_INSERT Database column SUM_TIMER_READ_NO_INSERT SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_READ_NO_INSERT Database column MIN_TIMER_READ_NO_INSERT SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_READ_NO_INSERT Database column AVG_TIMER_READ_NO_INSERT SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_READ_NO_INSERT Database column MAX_TIMER_READ_NO_INSERT SqlType(BIGINT UNSIGNED)
   *  @param COUNT_READ_EXTERNAL Database column COUNT_READ_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_READ_EXTERNAL Database column SUM_TIMER_READ_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_READ_EXTERNAL Database column MIN_TIMER_READ_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_READ_EXTERNAL Database column AVG_TIMER_READ_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_READ_EXTERNAL Database column MAX_TIMER_READ_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param COUNT_WRITE_ALLOW_WRITE Database column COUNT_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WRITE_ALLOW_WRITE Database column SUM_TIMER_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WRITE_ALLOW_WRITE Database column MIN_TIMER_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WRITE_ALLOW_WRITE Database column AVG_TIMER_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WRITE_ALLOW_WRITE Database column MAX_TIMER_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED)
   *  @param COUNT_WRITE_CONCURRENT_INSERT Database column COUNT_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WRITE_CONCURRENT_INSERT Database column SUM_TIMER_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WRITE_CONCURRENT_INSERT Database column MIN_TIMER_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WRITE_CONCURRENT_INSERT Database column AVG_TIMER_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WRITE_CONCURRENT_INSERT Database column MAX_TIMER_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED)
   *  @param COUNT_WRITE_DELAYED Database column COUNT_WRITE_DELAYED SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WRITE_DELAYED Database column SUM_TIMER_WRITE_DELAYED SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WRITE_DELAYED Database column MIN_TIMER_WRITE_DELAYED SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WRITE_DELAYED Database column AVG_TIMER_WRITE_DELAYED SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WRITE_DELAYED Database column MAX_TIMER_WRITE_DELAYED SqlType(BIGINT UNSIGNED)
   *  @param COUNT_WRITE_LOW_PRIORITY Database column COUNT_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WRITE_LOW_PRIORITY Database column SUM_TIMER_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WRITE_LOW_PRIORITY Database column MIN_TIMER_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WRITE_LOW_PRIORITY Database column AVG_TIMER_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WRITE_LOW_PRIORITY Database column MAX_TIMER_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED)
   *  @param COUNT_WRITE_NORMAL Database column COUNT_WRITE_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WRITE_NORMAL Database column SUM_TIMER_WRITE_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WRITE_NORMAL Database column MIN_TIMER_WRITE_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WRITE_NORMAL Database column AVG_TIMER_WRITE_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WRITE_NORMAL Database column MAX_TIMER_WRITE_NORMAL SqlType(BIGINT UNSIGNED)
   *  @param COUNT_WRITE_EXTERNAL Database column COUNT_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WRITE_EXTERNAL Database column SUM_TIMER_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WRITE_EXTERNAL Database column MIN_TIMER_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WRITE_EXTERNAL Database column AVG_TIMER_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WRITE_EXTERNAL Database column MAX_TIMER_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED) */
  case class TableLockWaitsSummaryByTableRow(OBJECT_TYPE: Option[String], OBJECT_SCHEMA: Option[String], OBJECT_NAME: Option[String], COUNT_STAR: Long, SUM_TIMER_WAIT: Long, MIN_TIMER_WAIT: Long, AVG_TIMER_WAIT: Long, MAX_TIMER_WAIT: Long, COUNT_READ: Long, SUM_TIMER_READ: Long, MIN_TIMER_READ: Long, AVG_TIMER_READ: Long, MAX_TIMER_READ: Long, COUNT_WRITE: Long, SUM_TIMER_WRITE: Long, MIN_TIMER_WRITE: Long, AVG_TIMER_WRITE: Long, MAX_TIMER_WRITE: Long, COUNT_READ_NORMAL: Long, SUM_TIMER_READ_NORMAL: Long, MIN_TIMER_READ_NORMAL: Long, AVG_TIMER_READ_NORMAL: Long, MAX_TIMER_READ_NORMAL: Long, COUNT_READ_WITH_SHARED_LOCKS: Long, SUM_TIMER_READ_WITH_SHARED_LOCKS: Long, MIN_TIMER_READ_WITH_SHARED_LOCKS: Long, AVG_TIMER_READ_WITH_SHARED_LOCKS: Long, MAX_TIMER_READ_WITH_SHARED_LOCKS: Long, COUNT_READ_HIGH_PRIORITY: Long, SUM_TIMER_READ_HIGH_PRIORITY: Long, MIN_TIMER_READ_HIGH_PRIORITY: Long, AVG_TIMER_READ_HIGH_PRIORITY: Long, MAX_TIMER_READ_HIGH_PRIORITY: Long, COUNT_READ_NO_INSERT: Long, SUM_TIMER_READ_NO_INSERT: Long, MIN_TIMER_READ_NO_INSERT: Long, AVG_TIMER_READ_NO_INSERT: Long, MAX_TIMER_READ_NO_INSERT: Long, COUNT_READ_EXTERNAL: Long, SUM_TIMER_READ_EXTERNAL: Long, MIN_TIMER_READ_EXTERNAL: Long, AVG_TIMER_READ_EXTERNAL: Long, MAX_TIMER_READ_EXTERNAL: Long, COUNT_WRITE_ALLOW_WRITE: Long, SUM_TIMER_WRITE_ALLOW_WRITE: Long, MIN_TIMER_WRITE_ALLOW_WRITE: Long, AVG_TIMER_WRITE_ALLOW_WRITE: Long, MAX_TIMER_WRITE_ALLOW_WRITE: Long, COUNT_WRITE_CONCURRENT_INSERT: Long, SUM_TIMER_WRITE_CONCURRENT_INSERT: Long, MIN_TIMER_WRITE_CONCURRENT_INSERT: Long, AVG_TIMER_WRITE_CONCURRENT_INSERT: Long, MAX_TIMER_WRITE_CONCURRENT_INSERT: Long, COUNT_WRITE_DELAYED: Long, SUM_TIMER_WRITE_DELAYED: Long, MIN_TIMER_WRITE_DELAYED: Long, AVG_TIMER_WRITE_DELAYED: Long, MAX_TIMER_WRITE_DELAYED: Long, COUNT_WRITE_LOW_PRIORITY: Long, SUM_TIMER_WRITE_LOW_PRIORITY: Long, MIN_TIMER_WRITE_LOW_PRIORITY: Long, AVG_TIMER_WRITE_LOW_PRIORITY: Long, MAX_TIMER_WRITE_LOW_PRIORITY: Long, COUNT_WRITE_NORMAL: Long, SUM_TIMER_WRITE_NORMAL: Long, MIN_TIMER_WRITE_NORMAL: Long, AVG_TIMER_WRITE_NORMAL: Long, MAX_TIMER_WRITE_NORMAL: Long, COUNT_WRITE_EXTERNAL: Long, SUM_TIMER_WRITE_EXTERNAL: Long, MIN_TIMER_WRITE_EXTERNAL: Long, AVG_TIMER_WRITE_EXTERNAL: Long, MAX_TIMER_WRITE_EXTERNAL: Long)
  /** GetResult implicit for fetching TableLockWaitsSummaryByTableRow objects using plain SQL queries */
  implicit def GetResultTableLockWaitsSummaryByTableRow(implicit e0: GR[Option[String]], e1: GR[Long]): GR[TableLockWaitsSummaryByTableRow] = GR{
    prs => import prs._
    TableLockWaitsSummaryByTableRow(<<?[String], <<?[String], <<?[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long])
  }
  /** Table description of table table_lock_waits_summary_by_table. Objects of this class serve as prototypes for rows in queries. */
  class TableLockWaitsSummaryByTable(_tableTag: Tag) extends profile.api.Table[TableLockWaitsSummaryByTableRow](_tableTag, Some("performance_schema"), "table_lock_waits_summary_by_table") {
    def * = (OBJECT_TYPE :: OBJECT_SCHEMA :: OBJECT_NAME :: COUNT_STAR :: SUM_TIMER_WAIT :: MIN_TIMER_WAIT :: AVG_TIMER_WAIT :: MAX_TIMER_WAIT :: COUNT_READ :: SUM_TIMER_READ :: MIN_TIMER_READ :: AVG_TIMER_READ :: MAX_TIMER_READ :: COUNT_WRITE :: SUM_TIMER_WRITE :: MIN_TIMER_WRITE :: AVG_TIMER_WRITE :: MAX_TIMER_WRITE :: COUNT_READ_NORMAL :: SUM_TIMER_READ_NORMAL :: MIN_TIMER_READ_NORMAL :: AVG_TIMER_READ_NORMAL :: MAX_TIMER_READ_NORMAL :: COUNT_READ_WITH_SHARED_LOCKS :: SUM_TIMER_READ_WITH_SHARED_LOCKS :: MIN_TIMER_READ_WITH_SHARED_LOCKS :: AVG_TIMER_READ_WITH_SHARED_LOCKS :: MAX_TIMER_READ_WITH_SHARED_LOCKS :: COUNT_READ_HIGH_PRIORITY :: SUM_TIMER_READ_HIGH_PRIORITY :: MIN_TIMER_READ_HIGH_PRIORITY :: AVG_TIMER_READ_HIGH_PRIORITY :: MAX_TIMER_READ_HIGH_PRIORITY :: COUNT_READ_NO_INSERT :: SUM_TIMER_READ_NO_INSERT :: MIN_TIMER_READ_NO_INSERT :: AVG_TIMER_READ_NO_INSERT :: MAX_TIMER_READ_NO_INSERT :: COUNT_READ_EXTERNAL :: SUM_TIMER_READ_EXTERNAL :: MIN_TIMER_READ_EXTERNAL :: AVG_TIMER_READ_EXTERNAL :: MAX_TIMER_READ_EXTERNAL :: COUNT_WRITE_ALLOW_WRITE :: SUM_TIMER_WRITE_ALLOW_WRITE :: MIN_TIMER_WRITE_ALLOW_WRITE :: AVG_TIMER_WRITE_ALLOW_WRITE :: MAX_TIMER_WRITE_ALLOW_WRITE :: COUNT_WRITE_CONCURRENT_INSERT :: SUM_TIMER_WRITE_CONCURRENT_INSERT :: MIN_TIMER_WRITE_CONCURRENT_INSERT :: AVG_TIMER_WRITE_CONCURRENT_INSERT :: MAX_TIMER_WRITE_CONCURRENT_INSERT :: COUNT_WRITE_DELAYED :: SUM_TIMER_WRITE_DELAYED :: MIN_TIMER_WRITE_DELAYED :: AVG_TIMER_WRITE_DELAYED :: MAX_TIMER_WRITE_DELAYED :: COUNT_WRITE_LOW_PRIORITY :: SUM_TIMER_WRITE_LOW_PRIORITY :: MIN_TIMER_WRITE_LOW_PRIORITY :: AVG_TIMER_WRITE_LOW_PRIORITY :: MAX_TIMER_WRITE_LOW_PRIORITY :: COUNT_WRITE_NORMAL :: SUM_TIMER_WRITE_NORMAL :: MIN_TIMER_WRITE_NORMAL :: AVG_TIMER_WRITE_NORMAL :: MAX_TIMER_WRITE_NORMAL :: COUNT_WRITE_EXTERNAL :: SUM_TIMER_WRITE_EXTERNAL :: MIN_TIMER_WRITE_EXTERNAL :: AVG_TIMER_WRITE_EXTERNAL :: MAX_TIMER_WRITE_EXTERNAL :: HNil).mapTo[TableLockWaitsSummaryByTableRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (OBJECT_TYPE :: OBJECT_SCHEMA :: OBJECT_NAME :: Rep.Some(COUNT_STAR) :: Rep.Some(SUM_TIMER_WAIT) :: Rep.Some(MIN_TIMER_WAIT) :: Rep.Some(AVG_TIMER_WAIT) :: Rep.Some(MAX_TIMER_WAIT) :: Rep.Some(COUNT_READ) :: Rep.Some(SUM_TIMER_READ) :: Rep.Some(MIN_TIMER_READ) :: Rep.Some(AVG_TIMER_READ) :: Rep.Some(MAX_TIMER_READ) :: Rep.Some(COUNT_WRITE) :: Rep.Some(SUM_TIMER_WRITE) :: Rep.Some(MIN_TIMER_WRITE) :: Rep.Some(AVG_TIMER_WRITE) :: Rep.Some(MAX_TIMER_WRITE) :: Rep.Some(COUNT_READ_NORMAL) :: Rep.Some(SUM_TIMER_READ_NORMAL) :: Rep.Some(MIN_TIMER_READ_NORMAL) :: Rep.Some(AVG_TIMER_READ_NORMAL) :: Rep.Some(MAX_TIMER_READ_NORMAL) :: Rep.Some(COUNT_READ_WITH_SHARED_LOCKS) :: Rep.Some(SUM_TIMER_READ_WITH_SHARED_LOCKS) :: Rep.Some(MIN_TIMER_READ_WITH_SHARED_LOCKS) :: Rep.Some(AVG_TIMER_READ_WITH_SHARED_LOCKS) :: Rep.Some(MAX_TIMER_READ_WITH_SHARED_LOCKS) :: Rep.Some(COUNT_READ_HIGH_PRIORITY) :: Rep.Some(SUM_TIMER_READ_HIGH_PRIORITY) :: Rep.Some(MIN_TIMER_READ_HIGH_PRIORITY) :: Rep.Some(AVG_TIMER_READ_HIGH_PRIORITY) :: Rep.Some(MAX_TIMER_READ_HIGH_PRIORITY) :: Rep.Some(COUNT_READ_NO_INSERT) :: Rep.Some(SUM_TIMER_READ_NO_INSERT) :: Rep.Some(MIN_TIMER_READ_NO_INSERT) :: Rep.Some(AVG_TIMER_READ_NO_INSERT) :: Rep.Some(MAX_TIMER_READ_NO_INSERT) :: Rep.Some(COUNT_READ_EXTERNAL) :: Rep.Some(SUM_TIMER_READ_EXTERNAL) :: Rep.Some(MIN_TIMER_READ_EXTERNAL) :: Rep.Some(AVG_TIMER_READ_EXTERNAL) :: Rep.Some(MAX_TIMER_READ_EXTERNAL) :: Rep.Some(COUNT_WRITE_ALLOW_WRITE) :: Rep.Some(SUM_TIMER_WRITE_ALLOW_WRITE) :: Rep.Some(MIN_TIMER_WRITE_ALLOW_WRITE) :: Rep.Some(AVG_TIMER_WRITE_ALLOW_WRITE) :: Rep.Some(MAX_TIMER_WRITE_ALLOW_WRITE) :: Rep.Some(COUNT_WRITE_CONCURRENT_INSERT) :: Rep.Some(SUM_TIMER_WRITE_CONCURRENT_INSERT) :: Rep.Some(MIN_TIMER_WRITE_CONCURRENT_INSERT) :: Rep.Some(AVG_TIMER_WRITE_CONCURRENT_INSERT) :: Rep.Some(MAX_TIMER_WRITE_CONCURRENT_INSERT) :: Rep.Some(COUNT_WRITE_DELAYED) :: Rep.Some(SUM_TIMER_WRITE_DELAYED) :: Rep.Some(MIN_TIMER_WRITE_DELAYED) :: Rep.Some(AVG_TIMER_WRITE_DELAYED) :: Rep.Some(MAX_TIMER_WRITE_DELAYED) :: Rep.Some(COUNT_WRITE_LOW_PRIORITY) :: Rep.Some(SUM_TIMER_WRITE_LOW_PRIORITY) :: Rep.Some(MIN_TIMER_WRITE_LOW_PRIORITY) :: Rep.Some(AVG_TIMER_WRITE_LOW_PRIORITY) :: Rep.Some(MAX_TIMER_WRITE_LOW_PRIORITY) :: Rep.Some(COUNT_WRITE_NORMAL) :: Rep.Some(SUM_TIMER_WRITE_NORMAL) :: Rep.Some(MIN_TIMER_WRITE_NORMAL) :: Rep.Some(AVG_TIMER_WRITE_NORMAL) :: Rep.Some(MAX_TIMER_WRITE_NORMAL) :: Rep.Some(COUNT_WRITE_EXTERNAL) :: Rep.Some(SUM_TIMER_WRITE_EXTERNAL) :: Rep.Some(MIN_TIMER_WRITE_EXTERNAL) :: Rep.Some(AVG_TIMER_WRITE_EXTERNAL) :: Rep.Some(MAX_TIMER_WRITE_EXTERNAL) :: HNil).shaped.<>(r => TableLockWaitsSummaryByTableRow(r(0).asInstanceOf[Option[String]], r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[Long]].get, r(4).asInstanceOf[Option[Long]].get, r(5).asInstanceOf[Option[Long]].get, r(6).asInstanceOf[Option[Long]].get, r(7).asInstanceOf[Option[Long]].get, r(8).asInstanceOf[Option[Long]].get, r(9).asInstanceOf[Option[Long]].get, r(10).asInstanceOf[Option[Long]].get, r(11).asInstanceOf[Option[Long]].get, r(12).asInstanceOf[Option[Long]].get, r(13).asInstanceOf[Option[Long]].get, r(14).asInstanceOf[Option[Long]].get, r(15).asInstanceOf[Option[Long]].get, r(16).asInstanceOf[Option[Long]].get, r(17).asInstanceOf[Option[Long]].get, r(18).asInstanceOf[Option[Long]].get, r(19).asInstanceOf[Option[Long]].get, r(20).asInstanceOf[Option[Long]].get, r(21).asInstanceOf[Option[Long]].get, r(22).asInstanceOf[Option[Long]].get, r(23).asInstanceOf[Option[Long]].get, r(24).asInstanceOf[Option[Long]].get, r(25).asInstanceOf[Option[Long]].get, r(26).asInstanceOf[Option[Long]].get, r(27).asInstanceOf[Option[Long]].get, r(28).asInstanceOf[Option[Long]].get, r(29).asInstanceOf[Option[Long]].get, r(30).asInstanceOf[Option[Long]].get, r(31).asInstanceOf[Option[Long]].get, r(32).asInstanceOf[Option[Long]].get, r(33).asInstanceOf[Option[Long]].get, r(34).asInstanceOf[Option[Long]].get, r(35).asInstanceOf[Option[Long]].get, r(36).asInstanceOf[Option[Long]].get, r(37).asInstanceOf[Option[Long]].get, r(38).asInstanceOf[Option[Long]].get, r(39).asInstanceOf[Option[Long]].get, r(40).asInstanceOf[Option[Long]].get, r(41).asInstanceOf[Option[Long]].get, r(42).asInstanceOf[Option[Long]].get, r(43).asInstanceOf[Option[Long]].get, r(44).asInstanceOf[Option[Long]].get, r(45).asInstanceOf[Option[Long]].get, r(46).asInstanceOf[Option[Long]].get, r(47).asInstanceOf[Option[Long]].get, r(48).asInstanceOf[Option[Long]].get, r(49).asInstanceOf[Option[Long]].get, r(50).asInstanceOf[Option[Long]].get, r(51).asInstanceOf[Option[Long]].get, r(52).asInstanceOf[Option[Long]].get, r(53).asInstanceOf[Option[Long]].get, r(54).asInstanceOf[Option[Long]].get, r(55).asInstanceOf[Option[Long]].get, r(56).asInstanceOf[Option[Long]].get, r(57).asInstanceOf[Option[Long]].get, r(58).asInstanceOf[Option[Long]].get, r(59).asInstanceOf[Option[Long]].get, r(60).asInstanceOf[Option[Long]].get, r(61).asInstanceOf[Option[Long]].get, r(62).asInstanceOf[Option[Long]].get, r(63).asInstanceOf[Option[Long]].get, r(64).asInstanceOf[Option[Long]].get, r(65).asInstanceOf[Option[Long]].get, r(66).asInstanceOf[Option[Long]].get, r(67).asInstanceOf[Option[Long]].get, r(68).asInstanceOf[Option[Long]].get, r(69).asInstanceOf[Option[Long]].get, r(70).asInstanceOf[Option[Long]].get, r(71).asInstanceOf[Option[Long]].get, r(72).asInstanceOf[Option[Long]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECT_TYPE SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val OBJECT_TYPE: Rep[Option[String]] = column[Option[String]]("OBJECT_TYPE", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val OBJECT_SCHEMA: Rep[Option[String]] = column[Option[String]]("OBJECT_SCHEMA", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column OBJECT_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val OBJECT_NAME: Rep[Option[String]] = column[Option[String]]("OBJECT_NAME", O.Length(64,varying=true), O.Default(Some("NULL")))
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
    /** Database column COUNT_READ SqlType(BIGINT UNSIGNED) */
    val COUNT_READ: Rep[Long] = column[Long]("COUNT_READ")
    /** Database column SUM_TIMER_READ SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_READ: Rep[Long] = column[Long]("SUM_TIMER_READ")
    /** Database column MIN_TIMER_READ SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_READ: Rep[Long] = column[Long]("MIN_TIMER_READ")
    /** Database column AVG_TIMER_READ SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_READ: Rep[Long] = column[Long]("AVG_TIMER_READ")
    /** Database column MAX_TIMER_READ SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_READ: Rep[Long] = column[Long]("MAX_TIMER_READ")
    /** Database column COUNT_WRITE SqlType(BIGINT UNSIGNED) */
    val COUNT_WRITE: Rep[Long] = column[Long]("COUNT_WRITE")
    /** Database column SUM_TIMER_WRITE SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_WRITE: Rep[Long] = column[Long]("SUM_TIMER_WRITE")
    /** Database column MIN_TIMER_WRITE SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_WRITE: Rep[Long] = column[Long]("MIN_TIMER_WRITE")
    /** Database column AVG_TIMER_WRITE SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_WRITE: Rep[Long] = column[Long]("AVG_TIMER_WRITE")
    /** Database column MAX_TIMER_WRITE SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_WRITE: Rep[Long] = column[Long]("MAX_TIMER_WRITE")
    /** Database column COUNT_READ_NORMAL SqlType(BIGINT UNSIGNED) */
    val COUNT_READ_NORMAL: Rep[Long] = column[Long]("COUNT_READ_NORMAL")
    /** Database column SUM_TIMER_READ_NORMAL SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_READ_NORMAL: Rep[Long] = column[Long]("SUM_TIMER_READ_NORMAL")
    /** Database column MIN_TIMER_READ_NORMAL SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_READ_NORMAL: Rep[Long] = column[Long]("MIN_TIMER_READ_NORMAL")
    /** Database column AVG_TIMER_READ_NORMAL SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_READ_NORMAL: Rep[Long] = column[Long]("AVG_TIMER_READ_NORMAL")
    /** Database column MAX_TIMER_READ_NORMAL SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_READ_NORMAL: Rep[Long] = column[Long]("MAX_TIMER_READ_NORMAL")
    /** Database column COUNT_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED) */
    val COUNT_READ_WITH_SHARED_LOCKS: Rep[Long] = column[Long]("COUNT_READ_WITH_SHARED_LOCKS")
    /** Database column SUM_TIMER_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_READ_WITH_SHARED_LOCKS: Rep[Long] = column[Long]("SUM_TIMER_READ_WITH_SHARED_LOCKS")
    /** Database column MIN_TIMER_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_READ_WITH_SHARED_LOCKS: Rep[Long] = column[Long]("MIN_TIMER_READ_WITH_SHARED_LOCKS")
    /** Database column AVG_TIMER_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_READ_WITH_SHARED_LOCKS: Rep[Long] = column[Long]("AVG_TIMER_READ_WITH_SHARED_LOCKS")
    /** Database column MAX_TIMER_READ_WITH_SHARED_LOCKS SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_READ_WITH_SHARED_LOCKS: Rep[Long] = column[Long]("MAX_TIMER_READ_WITH_SHARED_LOCKS")
    /** Database column COUNT_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED) */
    val COUNT_READ_HIGH_PRIORITY: Rep[Long] = column[Long]("COUNT_READ_HIGH_PRIORITY")
    /** Database column SUM_TIMER_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_READ_HIGH_PRIORITY: Rep[Long] = column[Long]("SUM_TIMER_READ_HIGH_PRIORITY")
    /** Database column MIN_TIMER_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_READ_HIGH_PRIORITY: Rep[Long] = column[Long]("MIN_TIMER_READ_HIGH_PRIORITY")
    /** Database column AVG_TIMER_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_READ_HIGH_PRIORITY: Rep[Long] = column[Long]("AVG_TIMER_READ_HIGH_PRIORITY")
    /** Database column MAX_TIMER_READ_HIGH_PRIORITY SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_READ_HIGH_PRIORITY: Rep[Long] = column[Long]("MAX_TIMER_READ_HIGH_PRIORITY")
    /** Database column COUNT_READ_NO_INSERT SqlType(BIGINT UNSIGNED) */
    val COUNT_READ_NO_INSERT: Rep[Long] = column[Long]("COUNT_READ_NO_INSERT")
    /** Database column SUM_TIMER_READ_NO_INSERT SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_READ_NO_INSERT: Rep[Long] = column[Long]("SUM_TIMER_READ_NO_INSERT")
    /** Database column MIN_TIMER_READ_NO_INSERT SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_READ_NO_INSERT: Rep[Long] = column[Long]("MIN_TIMER_READ_NO_INSERT")
    /** Database column AVG_TIMER_READ_NO_INSERT SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_READ_NO_INSERT: Rep[Long] = column[Long]("AVG_TIMER_READ_NO_INSERT")
    /** Database column MAX_TIMER_READ_NO_INSERT SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_READ_NO_INSERT: Rep[Long] = column[Long]("MAX_TIMER_READ_NO_INSERT")
    /** Database column COUNT_READ_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val COUNT_READ_EXTERNAL: Rep[Long] = column[Long]("COUNT_READ_EXTERNAL")
    /** Database column SUM_TIMER_READ_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_READ_EXTERNAL: Rep[Long] = column[Long]("SUM_TIMER_READ_EXTERNAL")
    /** Database column MIN_TIMER_READ_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_READ_EXTERNAL: Rep[Long] = column[Long]("MIN_TIMER_READ_EXTERNAL")
    /** Database column AVG_TIMER_READ_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_READ_EXTERNAL: Rep[Long] = column[Long]("AVG_TIMER_READ_EXTERNAL")
    /** Database column MAX_TIMER_READ_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_READ_EXTERNAL: Rep[Long] = column[Long]("MAX_TIMER_READ_EXTERNAL")
    /** Database column COUNT_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED) */
    val COUNT_WRITE_ALLOW_WRITE: Rep[Long] = column[Long]("COUNT_WRITE_ALLOW_WRITE")
    /** Database column SUM_TIMER_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_WRITE_ALLOW_WRITE: Rep[Long] = column[Long]("SUM_TIMER_WRITE_ALLOW_WRITE")
    /** Database column MIN_TIMER_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_WRITE_ALLOW_WRITE: Rep[Long] = column[Long]("MIN_TIMER_WRITE_ALLOW_WRITE")
    /** Database column AVG_TIMER_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_WRITE_ALLOW_WRITE: Rep[Long] = column[Long]("AVG_TIMER_WRITE_ALLOW_WRITE")
    /** Database column MAX_TIMER_WRITE_ALLOW_WRITE SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_WRITE_ALLOW_WRITE: Rep[Long] = column[Long]("MAX_TIMER_WRITE_ALLOW_WRITE")
    /** Database column COUNT_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED) */
    val COUNT_WRITE_CONCURRENT_INSERT: Rep[Long] = column[Long]("COUNT_WRITE_CONCURRENT_INSERT")
    /** Database column SUM_TIMER_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_WRITE_CONCURRENT_INSERT: Rep[Long] = column[Long]("SUM_TIMER_WRITE_CONCURRENT_INSERT")
    /** Database column MIN_TIMER_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_WRITE_CONCURRENT_INSERT: Rep[Long] = column[Long]("MIN_TIMER_WRITE_CONCURRENT_INSERT")
    /** Database column AVG_TIMER_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_WRITE_CONCURRENT_INSERT: Rep[Long] = column[Long]("AVG_TIMER_WRITE_CONCURRENT_INSERT")
    /** Database column MAX_TIMER_WRITE_CONCURRENT_INSERT SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_WRITE_CONCURRENT_INSERT: Rep[Long] = column[Long]("MAX_TIMER_WRITE_CONCURRENT_INSERT")
    /** Database column COUNT_WRITE_DELAYED SqlType(BIGINT UNSIGNED) */
    val COUNT_WRITE_DELAYED: Rep[Long] = column[Long]("COUNT_WRITE_DELAYED")
    /** Database column SUM_TIMER_WRITE_DELAYED SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_WRITE_DELAYED: Rep[Long] = column[Long]("SUM_TIMER_WRITE_DELAYED")
    /** Database column MIN_TIMER_WRITE_DELAYED SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_WRITE_DELAYED: Rep[Long] = column[Long]("MIN_TIMER_WRITE_DELAYED")
    /** Database column AVG_TIMER_WRITE_DELAYED SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_WRITE_DELAYED: Rep[Long] = column[Long]("AVG_TIMER_WRITE_DELAYED")
    /** Database column MAX_TIMER_WRITE_DELAYED SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_WRITE_DELAYED: Rep[Long] = column[Long]("MAX_TIMER_WRITE_DELAYED")
    /** Database column COUNT_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED) */
    val COUNT_WRITE_LOW_PRIORITY: Rep[Long] = column[Long]("COUNT_WRITE_LOW_PRIORITY")
    /** Database column SUM_TIMER_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_WRITE_LOW_PRIORITY: Rep[Long] = column[Long]("SUM_TIMER_WRITE_LOW_PRIORITY")
    /** Database column MIN_TIMER_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_WRITE_LOW_PRIORITY: Rep[Long] = column[Long]("MIN_TIMER_WRITE_LOW_PRIORITY")
    /** Database column AVG_TIMER_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_WRITE_LOW_PRIORITY: Rep[Long] = column[Long]("AVG_TIMER_WRITE_LOW_PRIORITY")
    /** Database column MAX_TIMER_WRITE_LOW_PRIORITY SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_WRITE_LOW_PRIORITY: Rep[Long] = column[Long]("MAX_TIMER_WRITE_LOW_PRIORITY")
    /** Database column COUNT_WRITE_NORMAL SqlType(BIGINT UNSIGNED) */
    val COUNT_WRITE_NORMAL: Rep[Long] = column[Long]("COUNT_WRITE_NORMAL")
    /** Database column SUM_TIMER_WRITE_NORMAL SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_WRITE_NORMAL: Rep[Long] = column[Long]("SUM_TIMER_WRITE_NORMAL")
    /** Database column MIN_TIMER_WRITE_NORMAL SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_WRITE_NORMAL: Rep[Long] = column[Long]("MIN_TIMER_WRITE_NORMAL")
    /** Database column AVG_TIMER_WRITE_NORMAL SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_WRITE_NORMAL: Rep[Long] = column[Long]("AVG_TIMER_WRITE_NORMAL")
    /** Database column MAX_TIMER_WRITE_NORMAL SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_WRITE_NORMAL: Rep[Long] = column[Long]("MAX_TIMER_WRITE_NORMAL")
    /** Database column COUNT_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val COUNT_WRITE_EXTERNAL: Rep[Long] = column[Long]("COUNT_WRITE_EXTERNAL")
    /** Database column SUM_TIMER_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_WRITE_EXTERNAL: Rep[Long] = column[Long]("SUM_TIMER_WRITE_EXTERNAL")
    /** Database column MIN_TIMER_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_WRITE_EXTERNAL: Rep[Long] = column[Long]("MIN_TIMER_WRITE_EXTERNAL")
    /** Database column AVG_TIMER_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_WRITE_EXTERNAL: Rep[Long] = column[Long]("AVG_TIMER_WRITE_EXTERNAL")
    /** Database column MAX_TIMER_WRITE_EXTERNAL SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_WRITE_EXTERNAL: Rep[Long] = column[Long]("MAX_TIMER_WRITE_EXTERNAL")
  }
  /** Collection-like TableQuery object for table TableLockWaitsSummaryByTable */
  lazy val TableLockWaitsSummaryByTable = new TableQuery(tag => new TableLockWaitsSummaryByTable(tag))
}
