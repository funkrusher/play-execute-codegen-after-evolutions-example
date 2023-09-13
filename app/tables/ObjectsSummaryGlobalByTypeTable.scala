package tables
// AUTO-GENERATED Slick data model for table ObjectsSummaryGlobalByType
trait ObjectsSummaryGlobalByTypeTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ObjectsSummaryGlobalByType
   *  @param OBJECT_TYPE Database column OBJECT_TYPE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_SCHEMA Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param OBJECT_NAME Database column OBJECT_NAME SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param COUNT_STAR Database column COUNT_STAR SqlType(BIGINT UNSIGNED)
   *  @param SUM_TIMER_WAIT Database column SUM_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MIN_TIMER_WAIT Database column MIN_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param AVG_TIMER_WAIT Database column AVG_TIMER_WAIT SqlType(BIGINT UNSIGNED)
   *  @param MAX_TIMER_WAIT Database column MAX_TIMER_WAIT SqlType(BIGINT UNSIGNED) */
  case class ObjectsSummaryGlobalByTypeRow(OBJECT_TYPE: Option[String], OBJECT_SCHEMA: Option[String], OBJECT_NAME: Option[String], COUNT_STAR: Long, SUM_TIMER_WAIT: Long, MIN_TIMER_WAIT: Long, AVG_TIMER_WAIT: Long, MAX_TIMER_WAIT: Long)
  /** GetResult implicit for fetching ObjectsSummaryGlobalByTypeRow objects using plain SQL queries */
  implicit def GetResultObjectsSummaryGlobalByTypeRow(implicit e0: GR[Option[String]], e1: GR[Long]): GR[ObjectsSummaryGlobalByTypeRow] = GR{
    prs => import prs._
    ObjectsSummaryGlobalByTypeRow.tupled((<<?[String], <<?[String], <<?[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table objects_summary_global_by_type. Objects of this class serve as prototypes for rows in queries. */
  class ObjectsSummaryGlobalByType(_tableTag: Tag) extends profile.api.Table[ObjectsSummaryGlobalByTypeRow](_tableTag, Some("performance_schema"), "objects_summary_global_by_type") {
    def * = (OBJECT_TYPE, OBJECT_SCHEMA, OBJECT_NAME, COUNT_STAR, SUM_TIMER_WAIT, MIN_TIMER_WAIT, AVG_TIMER_WAIT, MAX_TIMER_WAIT).<>(ObjectsSummaryGlobalByTypeRow.tupled, ObjectsSummaryGlobalByTypeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((OBJECT_TYPE, OBJECT_SCHEMA, OBJECT_NAME, Rep.Some(COUNT_STAR), Rep.Some(SUM_TIMER_WAIT), Rep.Some(MIN_TIMER_WAIT), Rep.Some(AVG_TIMER_WAIT), Rep.Some(MAX_TIMER_WAIT))).shaped.<>({r=>import r._; _4.map(_=> ObjectsSummaryGlobalByTypeRow.tupled((_1, _2, _3, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

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
  }
  /** Collection-like TableQuery object for table ObjectsSummaryGlobalByType */
  lazy val ObjectsSummaryGlobalByType = new TableQuery(tag => new ObjectsSummaryGlobalByType(tag))
}
