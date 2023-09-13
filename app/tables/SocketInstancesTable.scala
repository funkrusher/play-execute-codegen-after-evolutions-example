package tables
// AUTO-GENERATED Slick data model for table SocketInstances
trait SocketInstancesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SocketInstances
   *  @param EVENT_NAME Database column EVENT_NAME SqlType(VARCHAR), Length(128,true)
   *  @param OBJECT_INSTANCE_BEGIN Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED)
   *  @param THREAD_ID Database column THREAD_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param SOCKET_ID Database column SOCKET_ID SqlType(INT)
   *  @param IP Database column IP SqlType(VARCHAR), Length(64,true)
   *  @param PORT Database column PORT SqlType(INT)
   *  @param STATE Database column STATE SqlType(ENUM), Length(6,true) */
  case class SocketInstancesRow(EVENT_NAME: String, OBJECT_INSTANCE_BEGIN: Long, THREAD_ID: Option[Long], SOCKET_ID: Int, IP: String, PORT: Int, STATE: String)
  /** GetResult implicit for fetching SocketInstancesRow objects using plain SQL queries */
  implicit def GetResultSocketInstancesRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Option[Long]], e3: GR[Int]): GR[SocketInstancesRow] = GR{
    prs => import prs._
    SocketInstancesRow.tupled((<<[String], <<[Long], <<?[Long], <<[Int], <<[String], <<[Int], <<[String]))
  }
  /** Table description of table socket_instances. Objects of this class serve as prototypes for rows in queries. */
  class SocketInstances(_tableTag: Tag) extends profile.api.Table[SocketInstancesRow](_tableTag, Some("performance_schema"), "socket_instances") {
    def * = (EVENT_NAME, OBJECT_INSTANCE_BEGIN, THREAD_ID, SOCKET_ID, IP, PORT, STATE).<>(SocketInstancesRow.tupled, SocketInstancesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(EVENT_NAME), Rep.Some(OBJECT_INSTANCE_BEGIN), THREAD_ID, Rep.Some(SOCKET_ID), Rep.Some(IP), Rep.Some(PORT), Rep.Some(STATE))).shaped.<>({r=>import r._; _1.map(_=> SocketInstancesRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column EVENT_NAME SqlType(VARCHAR), Length(128,true) */
    val EVENT_NAME: Rep[String] = column[String]("EVENT_NAME", O.Length(128,varying=true))
    /** Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED) */
    val OBJECT_INSTANCE_BEGIN: Rep[Long] = column[Long]("OBJECT_INSTANCE_BEGIN")
    /** Database column THREAD_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val THREAD_ID: Rep[Option[Long]] = column[Option[Long]]("THREAD_ID", O.Default(None))
    /** Database column SOCKET_ID SqlType(INT) */
    val SOCKET_ID: Rep[Int] = column[Int]("SOCKET_ID")
    /** Database column IP SqlType(VARCHAR), Length(64,true) */
    val IP: Rep[String] = column[String]("IP", O.Length(64,varying=true))
    /** Database column PORT SqlType(INT) */
    val PORT: Rep[Int] = column[Int]("PORT")
    /** Database column STATE SqlType(ENUM), Length(6,true) */
    val STATE: Rep[String] = column[String]("STATE", O.Length(6,varying=true))
  }
  /** Collection-like TableQuery object for table SocketInstances */
  lazy val SocketInstances = new TableQuery(tag => new SocketInstances(tag))
}
