package tables
// AUTO-GENERATED Slick data model for table MutexInstances
trait MutexInstancesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table MutexInstances
   *  @param NAME Database column NAME SqlType(VARCHAR), Length(128,true)
   *  @param OBJECT_INSTANCE_BEGIN Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED)
   *  @param LOCKED_BY_THREAD_ID Database column LOCKED_BY_THREAD_ID SqlType(BIGINT UNSIGNED), Default(None) */
  case class MutexInstancesRow(NAME: String, OBJECT_INSTANCE_BEGIN: Long, LOCKED_BY_THREAD_ID: Option[Long])
  /** GetResult implicit for fetching MutexInstancesRow objects using plain SQL queries */
  implicit def GetResultMutexInstancesRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Option[Long]]): GR[MutexInstancesRow] = GR{
    prs => import prs._
    MutexInstancesRow.tupled((<<[String], <<[Long], <<?[Long]))
  }
  /** Table description of table mutex_instances. Objects of this class serve as prototypes for rows in queries. */
  class MutexInstances(_tableTag: Tag) extends profile.api.Table[MutexInstancesRow](_tableTag, Some("performance_schema"), "mutex_instances") {
    def * = (NAME, OBJECT_INSTANCE_BEGIN, LOCKED_BY_THREAD_ID).<>(MutexInstancesRow.tupled, MutexInstancesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(NAME), Rep.Some(OBJECT_INSTANCE_BEGIN), LOCKED_BY_THREAD_ID)).shaped.<>({r=>import r._; _1.map(_=> MutexInstancesRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column NAME SqlType(VARCHAR), Length(128,true) */
    val NAME: Rep[String] = column[String]("NAME", O.Length(128,varying=true))
    /** Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED) */
    val OBJECT_INSTANCE_BEGIN: Rep[Long] = column[Long]("OBJECT_INSTANCE_BEGIN")
    /** Database column LOCKED_BY_THREAD_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val LOCKED_BY_THREAD_ID: Rep[Option[Long]] = column[Option[Long]]("LOCKED_BY_THREAD_ID", O.Default(None))
  }
  /** Collection-like TableQuery object for table MutexInstances */
  lazy val MutexInstances = new TableQuery(tag => new MutexInstances(tag))
}
