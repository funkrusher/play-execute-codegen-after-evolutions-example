package tables
// AUTO-GENERATED Slick data model for table TableIoWaitsSummaryByTable
trait TableIoWaitsSummaryByTableTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TableIoWaitsSummaryByTable
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
   *  @param COUNT_FETCH Database column COUNT_FETCH SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_FETCH Database column SUM_TIMER_FETCH SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_FETCH Database column MIN_TIMER_FETCH SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_FETCH Database column AVG_TIMER_FETCH SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_FETCH Database column MAX_TIMER_FETCH SqlType(BIGINT UNSIGNED)
   *  @param COUNT_INSERT Database column COUNT_INSERT SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_INSERT Database column SUM_TIMER_INSERT SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_INSERT Database column MIN_TIMER_INSERT SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_INSERT Database column AVG_TIMER_INSERT SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_INSERT Database column MAX_TIMER_INSERT SqlType(BIGINT UNSIGNED)
   *  @param COUNT_UPDATE Database column COUNT_UPDATE SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_UPDATE Database column SUM_TIMER_UPDATE SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_UPDATE Database column MIN_TIMER_UPDATE SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_UPDATE Database column AVG_TIMER_UPDATE SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_UPDATE Database column MAX_TIMER_UPDATE SqlType(BIGINT UNSIGNED)
   *  @param COUNT_DELETE Database column COUNT_DELETE SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_DELETE Database column SUM_TIMER_DELETE SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_DELETE Database column MIN_TIMER_DELETE SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_DELETE Database column AVG_TIMER_DELETE SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_DELETE Database column MAX_TIMER_DELETE SqlType(BIGINT UNSIGNED) */
  case class TableIoWaitsSummaryByTableRow(OBJECT_TYPE: Option[String], OBJECT_SCHEMA: Option[String], OBJECT_NAME: Option[String], COUNT_STAR: Long, SUM_TIMER_WAIT: Long, MIN_TIMER_WAIT: Long, AVG_TIMER_WAIT: Long, MAX_TIMER_WAIT: Long, COUNT_READ: Long, SUM_TIMER_READ: Long, MIN_TIMER_READ: Long, AVG_TIMER_READ: Long, MAX_TIMER_READ: Long, COUNT_WRITE: Long, SUM_TIMER_WRITE: Long, MIN_TIMER_WRITE: Long, AVG_TIMER_WRITE: Long, MAX_TIMER_WRITE: Long, COUNT_FETCH: Long, SUM_TIMER_FETCH: Long, MIN_TIMER_FETCH: Long, AVG_TIMER_FETCH: Long, MAX_TIMER_FETCH: Long, COUNT_INSERT: Long, SUM_TIMER_INSERT: Long, MIN_TIMER_INSERT: Long, AVG_TIMER_INSERT: Long, MAX_TIMER_INSERT: Long, COUNT_UPDATE: Long, SUM_TIMER_UPDATE: Long, MIN_TIMER_UPDATE: Long, AVG_TIMER_UPDATE: Long, MAX_TIMER_UPDATE: Long, COUNT_DELETE: Long, SUM_TIMER_DELETE: Long, MIN_TIMER_DELETE: Long, AVG_TIMER_DELETE: Long, MAX_TIMER_DELETE: Long)
  /** GetResult implicit for fetching TableIoWaitsSummaryByTableRow objects using plain SQL queries */
  implicit def GetResultTableIoWaitsSummaryByTableRow(implicit e0: GR[Option[String]], e1: GR[Long]): GR[TableIoWaitsSummaryByTableRow] = GR{
    prs => import prs._
    TableIoWaitsSummaryByTableRow(<<?[String], <<?[String], <<?[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long])
  }
  /** Table description of table table_io_waits_summary_by_table. Objects of this class serve as prototypes for rows in queries. */
  class TableIoWaitsSummaryByTable(_tableTag: Tag) extends profile.api.Table[TableIoWaitsSummaryByTableRow](_tableTag, Some("performance_schema"), "table_io_waits_summary_by_table") {
    def * = (OBJECT_TYPE :: OBJECT_SCHEMA :: OBJECT_NAME :: COUNT_STAR :: SUM_TIMER_WAIT :: MIN_TIMER_WAIT :: AVG_TIMER_WAIT :: MAX_TIMER_WAIT :: COUNT_READ :: SUM_TIMER_READ :: MIN_TIMER_READ :: AVG_TIMER_READ :: MAX_TIMER_READ :: COUNT_WRITE :: SUM_TIMER_WRITE :: MIN_TIMER_WRITE :: AVG_TIMER_WRITE :: MAX_TIMER_WRITE :: COUNT_FETCH :: SUM_TIMER_FETCH :: MIN_TIMER_FETCH :: AVG_TIMER_FETCH :: MAX_TIMER_FETCH :: COUNT_INSERT :: SUM_TIMER_INSERT :: MIN_TIMER_INSERT :: AVG_TIMER_INSERT :: MAX_TIMER_INSERT :: COUNT_UPDATE :: SUM_TIMER_UPDATE :: MIN_TIMER_UPDATE :: AVG_TIMER_UPDATE :: MAX_TIMER_UPDATE :: COUNT_DELETE :: SUM_TIMER_DELETE :: MIN_TIMER_DELETE :: AVG_TIMER_DELETE :: MAX_TIMER_DELETE :: HNil).mapTo[TableIoWaitsSummaryByTableRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (OBJECT_TYPE :: OBJECT_SCHEMA :: OBJECT_NAME :: Rep.Some(COUNT_STAR) :: Rep.Some(SUM_TIMER_WAIT) :: Rep.Some(MIN_TIMER_WAIT) :: Rep.Some(AVG_TIMER_WAIT) :: Rep.Some(MAX_TIMER_WAIT) :: Rep.Some(COUNT_READ) :: Rep.Some(SUM_TIMER_READ) :: Rep.Some(MIN_TIMER_READ) :: Rep.Some(AVG_TIMER_READ) :: Rep.Some(MAX_TIMER_READ) :: Rep.Some(COUNT_WRITE) :: Rep.Some(SUM_TIMER_WRITE) :: Rep.Some(MIN_TIMER_WRITE) :: Rep.Some(AVG_TIMER_WRITE) :: Rep.Some(MAX_TIMER_WRITE) :: Rep.Some(COUNT_FETCH) :: Rep.Some(SUM_TIMER_FETCH) :: Rep.Some(MIN_TIMER_FETCH) :: Rep.Some(AVG_TIMER_FETCH) :: Rep.Some(MAX_TIMER_FETCH) :: Rep.Some(COUNT_INSERT) :: Rep.Some(SUM_TIMER_INSERT) :: Rep.Some(MIN_TIMER_INSERT) :: Rep.Some(AVG_TIMER_INSERT) :: Rep.Some(MAX_TIMER_INSERT) :: Rep.Some(COUNT_UPDATE) :: Rep.Some(SUM_TIMER_UPDATE) :: Rep.Some(MIN_TIMER_UPDATE) :: Rep.Some(AVG_TIMER_UPDATE) :: Rep.Some(MAX_TIMER_UPDATE) :: Rep.Some(COUNT_DELETE) :: Rep.Some(SUM_TIMER_DELETE) :: Rep.Some(MIN_TIMER_DELETE) :: Rep.Some(AVG_TIMER_DELETE) :: Rep.Some(MAX_TIMER_DELETE) :: HNil).shaped.<>(r => TableIoWaitsSummaryByTableRow(r(0).asInstanceOf[Option[String]], r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[Long]].get, r(4).asInstanceOf[Option[Long]].get, r(5).asInstanceOf[Option[Long]].get, r(6).asInstanceOf[Option[Long]].get, r(7).asInstanceOf[Option[Long]].get, r(8).asInstanceOf[Option[Long]].get, r(9).asInstanceOf[Option[Long]].get, r(10).asInstanceOf[Option[Long]].get, r(11).asInstanceOf[Option[Long]].get, r(12).asInstanceOf[Option[Long]].get, r(13).asInstanceOf[Option[Long]].get, r(14).asInstanceOf[Option[Long]].get, r(15).asInstanceOf[Option[Long]].get, r(16).asInstanceOf[Option[Long]].get, r(17).asInstanceOf[Option[Long]].get, r(18).asInstanceOf[Option[Long]].get, r(19).asInstanceOf[Option[Long]].get, r(20).asInstanceOf[Option[Long]].get, r(21).asInstanceOf[Option[Long]].get, r(22).asInstanceOf[Option[Long]].get, r(23).asInstanceOf[Option[Long]].get, r(24).asInstanceOf[Option[Long]].get, r(25).asInstanceOf[Option[Long]].get, r(26).asInstanceOf[Option[Long]].get, r(27).asInstanceOf[Option[Long]].get, r(28).asInstanceOf[Option[Long]].get, r(29).asInstanceOf[Option[Long]].get, r(30).asInstanceOf[Option[Long]].get, r(31).asInstanceOf[Option[Long]].get, r(32).asInstanceOf[Option[Long]].get, r(33).asInstanceOf[Option[Long]].get, r(34).asInstanceOf[Option[Long]].get, r(35).asInstanceOf[Option[Long]].get, r(36).asInstanceOf[Option[Long]].get, r(37).asInstanceOf[Option[Long]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
    /** Database column COUNT_FETCH SqlType(BIGINT UNSIGNED) */
    val COUNT_FETCH: Rep[Long] = column[Long]("COUNT_FETCH")
    /** Database column SUM_TIMER_FETCH SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_FETCH: Rep[Long] = column[Long]("SUM_TIMER_FETCH")
    /** Database column MIN_TIMER_FETCH SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_FETCH: Rep[Long] = column[Long]("MIN_TIMER_FETCH")
    /** Database column AVG_TIMER_FETCH SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_FETCH: Rep[Long] = column[Long]("AVG_TIMER_FETCH")
    /** Database column MAX_TIMER_FETCH SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_FETCH: Rep[Long] = column[Long]("MAX_TIMER_FETCH")
    /** Database column COUNT_INSERT SqlType(BIGINT UNSIGNED) */
    val COUNT_INSERT: Rep[Long] = column[Long]("COUNT_INSERT")
    /** Database column SUM_TIMER_INSERT SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_INSERT: Rep[Long] = column[Long]("SUM_TIMER_INSERT")
    /** Database column MIN_TIMER_INSERT SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_INSERT: Rep[Long] = column[Long]("MIN_TIMER_INSERT")
    /** Database column AVG_TIMER_INSERT SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_INSERT: Rep[Long] = column[Long]("AVG_TIMER_INSERT")
    /** Database column MAX_TIMER_INSERT SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_INSERT: Rep[Long] = column[Long]("MAX_TIMER_INSERT")
    /** Database column COUNT_UPDATE SqlType(BIGINT UNSIGNED) */
    val COUNT_UPDATE: Rep[Long] = column[Long]("COUNT_UPDATE")
    /** Database column SUM_TIMER_UPDATE SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_UPDATE: Rep[Long] = column[Long]("SUM_TIMER_UPDATE")
    /** Database column MIN_TIMER_UPDATE SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_UPDATE: Rep[Long] = column[Long]("MIN_TIMER_UPDATE")
    /** Database column AVG_TIMER_UPDATE SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_UPDATE: Rep[Long] = column[Long]("AVG_TIMER_UPDATE")
    /** Database column MAX_TIMER_UPDATE SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_UPDATE: Rep[Long] = column[Long]("MAX_TIMER_UPDATE")
    /** Database column COUNT_DELETE SqlType(BIGINT UNSIGNED) */
    val COUNT_DELETE: Rep[Long] = column[Long]("COUNT_DELETE")
    /** Database column SUM_TIMER_DELETE SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_DELETE: Rep[Long] = column[Long]("SUM_TIMER_DELETE")
    /** Database column MIN_TIMER_DELETE SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_DELETE: Rep[Long] = column[Long]("MIN_TIMER_DELETE")
    /** Database column AVG_TIMER_DELETE SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_DELETE: Rep[Long] = column[Long]("AVG_TIMER_DELETE")
    /** Database column MAX_TIMER_DELETE SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_DELETE: Rep[Long] = column[Long]("MAX_TIMER_DELETE")
  }
  /** Collection-like TableQuery object for table TableIoWaitsSummaryByTable */
  lazy val TableIoWaitsSummaryByTable = new TableQuery(tag => new TableIoWaitsSummaryByTable(tag))
}
