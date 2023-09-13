package tables
// AUTO-GENERATED Slick data model for table RwlockInstances
trait RwlockInstancesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RwlockInstances
   *  @param NAME Database column NAME SqlType(VARCHAR), Length(128,true)
   *  @param OBJECT_INSTANCE_BEGIN Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED)
   *  @param WRITE_LOCKED_BY_THREAD_ID Database column WRITE_LOCKED_BY_THREAD_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param READ_LOCKED_BY_COUNT Database column READ_LOCKED_BY_COUNT SqlType(INT UNSIGNED) */
  case class RwlockInstancesRow(NAME: String, OBJECT_INSTANCE_BEGIN: Long, WRITE_LOCKED_BY_THREAD_ID: Option[Long], READ_LOCKED_BY_COUNT: Long)
  /** GetResult implicit for fetching RwlockInstancesRow objects using plain SQL queries */
  implicit def GetResultRwlockInstancesRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Option[Long]]): GR[RwlockInstancesRow] = GR{
    prs => import prs._
    RwlockInstancesRow.tupled((<<[String], <<[Long], <<?[Long], <<[Long]))
  }
  /** Table description of table rwlock_instances. Objects of this class serve as prototypes for rows in queries. */
  class RwlockInstances(_tableTag: Tag) extends profile.api.Table[RwlockInstancesRow](_tableTag, Some("performance_schema"), "rwlock_instances") {
    def * = (NAME, OBJECT_INSTANCE_BEGIN, WRITE_LOCKED_BY_THREAD_ID, READ_LOCKED_BY_COUNT).<>(RwlockInstancesRow.tupled, RwlockInstancesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(NAME), Rep.Some(OBJECT_INSTANCE_BEGIN), WRITE_LOCKED_BY_THREAD_ID, Rep.Some(READ_LOCKED_BY_COUNT))).shaped.<>({r=>import r._; _1.map(_=> RwlockInstancesRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column NAME SqlType(VARCHAR), Length(128,true) */
    val NAME: Rep[String] = column[String]("NAME", O.Length(128,varying=true))
    /** Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED) */
    val OBJECT_INSTANCE_BEGIN: Rep[Long] = column[Long]("OBJECT_INSTANCE_BEGIN")
    /** Database column WRITE_LOCKED_BY_THREAD_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val WRITE_LOCKED_BY_THREAD_ID: Rep[Option[Long]] = column[Option[Long]]("WRITE_LOCKED_BY_THREAD_ID", O.Default(None))
    /** Database column READ_LOCKED_BY_COUNT SqlType(INT UNSIGNED) */
    val READ_LOCKED_BY_COUNT: Rep[Long] = column[Long]("READ_LOCKED_BY_COUNT")
  }
  /** Collection-like TableQuery object for table RwlockInstances */
  lazy val RwlockInstances = new TableQuery(tag => new RwlockInstances(tag))
}
