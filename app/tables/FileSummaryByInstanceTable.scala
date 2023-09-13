package tables
// AUTO-GENERATED Slick data model for table FileSummaryByInstance
trait FileSummaryByInstanceTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table FileSummaryByInstance
   *  @param FILE_NAME Database column FILE_NAME SqlType(VARCHAR), Length(512,true)
   *  @param EVENT_NAME Database column EVENT_NAME SqlType(VARCHAR), Length(128,true)
   *  @param OBJECT_INSTANCE_BEGIN Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED)
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
   *  @param SUM_NUMBER_OF_BYTES_READ Database column SUM_NUMBER_OF_BYTES_READ SqlType(BIGINT)
   *  @param COUNT_WRITE Database column COUNT_WRITE SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WRITE Database column SUM_TIMER_WRITE SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WRITE Database column MIN_TIMER_WRITE SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WRITE Database column AVG_TIMER_WRITE SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WRITE Database column MAX_TIMER_WRITE SqlType(BIGINT UNSIGNED)
   *  @param SUM_NUMBER_OF_BYTES_WRITE Database column SUM_NUMBER_OF_BYTES_WRITE SqlType(BIGINT)
   *  @param COUNT_MISC Database column COUNT_MISC SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_MISC Database column SUM_TIMER_MISC SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_MISC Database column MIN_TIMER_MISC SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_MISC Database column AVG_TIMER_MISC SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_MISC Database column MAX_TIMER_MISC SqlType(BIGINT UNSIGNED) */
  case class FileSummaryByInstanceRow(FILE_NAME: String, EVENT_NAME: String, OBJECT_INSTANCE_BEGIN: Long, COUNT_STAR: Long, SUM_TIMER_WAIT: Long, MIN_TIMER_WAIT: Long, AVG_TIMER_WAIT: Long, MAX_TIMER_WAIT: Long, COUNT_READ: Long, SUM_TIMER_READ: Long, MIN_TIMER_READ: Long, AVG_TIMER_READ: Long, MAX_TIMER_READ: Long, SUM_NUMBER_OF_BYTES_READ: Long, COUNT_WRITE: Long, SUM_TIMER_WRITE: Long, MIN_TIMER_WRITE: Long, AVG_TIMER_WRITE: Long, MAX_TIMER_WRITE: Long, SUM_NUMBER_OF_BYTES_WRITE: Long, COUNT_MISC: Long, SUM_TIMER_MISC: Long, MIN_TIMER_MISC: Long, AVG_TIMER_MISC: Long, MAX_TIMER_MISC: Long)
  /** GetResult implicit for fetching FileSummaryByInstanceRow objects using plain SQL queries */
  implicit def GetResultFileSummaryByInstanceRow(implicit e0: GR[String], e1: GR[Long]): GR[FileSummaryByInstanceRow] = GR{
    prs => import prs._
    FileSummaryByInstanceRow(<<[String], <<[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long])
  }
  /** Table description of table file_summary_by_instance. Objects of this class serve as prototypes for rows in queries. */
  class FileSummaryByInstance(_tableTag: Tag) extends profile.api.Table[FileSummaryByInstanceRow](_tableTag, Some("performance_schema"), "file_summary_by_instance") {
    def * = (FILE_NAME :: EVENT_NAME :: OBJECT_INSTANCE_BEGIN :: COUNT_STAR :: SUM_TIMER_WAIT :: MIN_TIMER_WAIT :: AVG_TIMER_WAIT :: MAX_TIMER_WAIT :: COUNT_READ :: SUM_TIMER_READ :: MIN_TIMER_READ :: AVG_TIMER_READ :: MAX_TIMER_READ :: SUM_NUMBER_OF_BYTES_READ :: COUNT_WRITE :: SUM_TIMER_WRITE :: MIN_TIMER_WRITE :: AVG_TIMER_WRITE :: MAX_TIMER_WRITE :: SUM_NUMBER_OF_BYTES_WRITE :: COUNT_MISC :: SUM_TIMER_MISC :: MIN_TIMER_MISC :: AVG_TIMER_MISC :: MAX_TIMER_MISC :: HNil).mapTo[FileSummaryByInstanceRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(FILE_NAME) :: Rep.Some(EVENT_NAME) :: Rep.Some(OBJECT_INSTANCE_BEGIN) :: Rep.Some(COUNT_STAR) :: Rep.Some(SUM_TIMER_WAIT) :: Rep.Some(MIN_TIMER_WAIT) :: Rep.Some(AVG_TIMER_WAIT) :: Rep.Some(MAX_TIMER_WAIT) :: Rep.Some(COUNT_READ) :: Rep.Some(SUM_TIMER_READ) :: Rep.Some(MIN_TIMER_READ) :: Rep.Some(AVG_TIMER_READ) :: Rep.Some(MAX_TIMER_READ) :: Rep.Some(SUM_NUMBER_OF_BYTES_READ) :: Rep.Some(COUNT_WRITE) :: Rep.Some(SUM_TIMER_WRITE) :: Rep.Some(MIN_TIMER_WRITE) :: Rep.Some(AVG_TIMER_WRITE) :: Rep.Some(MAX_TIMER_WRITE) :: Rep.Some(SUM_NUMBER_OF_BYTES_WRITE) :: Rep.Some(COUNT_MISC) :: Rep.Some(SUM_TIMER_MISC) :: Rep.Some(MIN_TIMER_MISC) :: Rep.Some(AVG_TIMER_MISC) :: Rep.Some(MAX_TIMER_MISC) :: HNil).shaped.<>(r => FileSummaryByInstanceRow(r(0).asInstanceOf[Option[String]].get, r(1).asInstanceOf[Option[String]].get, r(2).asInstanceOf[Option[Long]].get, r(3).asInstanceOf[Option[Long]].get, r(4).asInstanceOf[Option[Long]].get, r(5).asInstanceOf[Option[Long]].get, r(6).asInstanceOf[Option[Long]].get, r(7).asInstanceOf[Option[Long]].get, r(8).asInstanceOf[Option[Long]].get, r(9).asInstanceOf[Option[Long]].get, r(10).asInstanceOf[Option[Long]].get, r(11).asInstanceOf[Option[Long]].get, r(12).asInstanceOf[Option[Long]].get, r(13).asInstanceOf[Option[Long]].get, r(14).asInstanceOf[Option[Long]].get, r(15).asInstanceOf[Option[Long]].get, r(16).asInstanceOf[Option[Long]].get, r(17).asInstanceOf[Option[Long]].get, r(18).asInstanceOf[Option[Long]].get, r(19).asInstanceOf[Option[Long]].get, r(20).asInstanceOf[Option[Long]].get, r(21).asInstanceOf[Option[Long]].get, r(22).asInstanceOf[Option[Long]].get, r(23).asInstanceOf[Option[Long]].get, r(24).asInstanceOf[Option[Long]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FILE_NAME SqlType(VARCHAR), Length(512,true) */
    val FILE_NAME: Rep[String] = column[String]("FILE_NAME", O.Length(512,varying=true))
    /** Database column EVENT_NAME SqlType(VARCHAR), Length(128,true) */
    val EVENT_NAME: Rep[String] = column[String]("EVENT_NAME", O.Length(128,varying=true))
    /** Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED) */
    val OBJECT_INSTANCE_BEGIN: Rep[Long] = column[Long]("OBJECT_INSTANCE_BEGIN")
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
    /** Database column SUM_NUMBER_OF_BYTES_READ SqlType(BIGINT) */
    val SUM_NUMBER_OF_BYTES_READ: Rep[Long] = column[Long]("SUM_NUMBER_OF_BYTES_READ")
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
    /** Database column SUM_NUMBER_OF_BYTES_WRITE SqlType(BIGINT) */
    val SUM_NUMBER_OF_BYTES_WRITE: Rep[Long] = column[Long]("SUM_NUMBER_OF_BYTES_WRITE")
    /** Database column COUNT_MISC SqlType(BIGINT UNSIGNED) */
    val COUNT_MISC: Rep[Long] = column[Long]("COUNT_MISC")
    /** Database column SUM_TIMER_MISC SqlType(BIGINT UNSIGNED) */
    val SUM_TIMER_MISC: Rep[Long] = column[Long]("SUM_TIMER_MISC")
    /** Database column MIN_TIMER_MISC SqlType(BIGINT UNSIGNED) */
    val MIN_TIMER_MISC: Rep[Long] = column[Long]("MIN_TIMER_MISC")
    /** Database column AVG_TIMER_MISC SqlType(BIGINT UNSIGNED) */
    val AVG_TIMER_MISC: Rep[Long] = column[Long]("AVG_TIMER_MISC")
    /** Database column MAX_TIMER_MISC SqlType(BIGINT UNSIGNED) */
    val MAX_TIMER_MISC: Rep[Long] = column[Long]("MAX_TIMER_MISC")
  }
  /** Collection-like TableQuery object for table FileSummaryByInstance */
  lazy val FileSummaryByInstance = new TableQuery(tag => new FileSummaryByInstance(tag))
}
