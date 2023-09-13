package tables
// AUTO-GENERATED Slick data model for table GeneralLog
trait GeneralLogTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table GeneralLog
   *  @param event_time Database column event_time SqlType(TIMESTAMP)
   *  @param user_host Database column user_host SqlType(MEDIUMTEXT), Length(16777215,true)
   *  @param thread_id Database column thread_id SqlType(BIGINT UNSIGNED)
   *  @param server_id Database column server_id SqlType(INT UNSIGNED)
   *  @param command_type Database column command_type SqlType(VARCHAR), Length(64,true)
   *  @param argument Database column argument SqlType(MEDIUMTEXT), Length(16777215,true) */
  case class GeneralLogRow(event_time: java.sql.Timestamp, user_host: String, thread_id: Long, server_id: Long, command_type: String, argument: String)
  /** GetResult implicit for fetching GeneralLogRow objects using plain SQL queries */
  implicit def GetResultGeneralLogRow(implicit e0: GR[java.sql.Timestamp], e1: GR[String], e2: GR[Long]): GR[GeneralLogRow] = GR{
    prs => import prs._
    GeneralLogRow.tupled((<<[java.sql.Timestamp], <<[String], <<[Long], <<[Long], <<[String], <<[String]))
  }
  /** Table description of table general_log. Objects of this class serve as prototypes for rows in queries. */
  class GeneralLog(_tableTag: Tag) extends profile.api.Table[GeneralLogRow](_tableTag, Some("mysql"), "general_log") {
    def * = (event_time, user_host, thread_id, server_id, command_type, argument).<>(GeneralLogRow.tupled, GeneralLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(event_time), Rep.Some(user_host), Rep.Some(thread_id), Rep.Some(server_id), Rep.Some(command_type), Rep.Some(argument))).shaped.<>({r=>import r._; _1.map(_=> GeneralLogRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column event_time SqlType(TIMESTAMP) */
    val event_time: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("event_time")
    /** Database column user_host SqlType(MEDIUMTEXT), Length(16777215,true) */
    val user_host: Rep[String] = column[String]("user_host", O.Length(16777215,varying=true))
    /** Database column thread_id SqlType(BIGINT UNSIGNED) */
    val thread_id: Rep[Long] = column[Long]("thread_id")
    /** Database column server_id SqlType(INT UNSIGNED) */
    val server_id: Rep[Long] = column[Long]("server_id")
    /** Database column command_type SqlType(VARCHAR), Length(64,true) */
    val command_type: Rep[String] = column[String]("command_type", O.Length(64,varying=true))
    /** Database column argument SqlType(MEDIUMTEXT), Length(16777215,true) */
    val argument: Rep[String] = column[String]("argument", O.Length(16777215,varying=true))
  }
  /** Collection-like TableQuery object for table GeneralLog */
  lazy val GeneralLog = new TableQuery(tag => new GeneralLog(tag))
}
