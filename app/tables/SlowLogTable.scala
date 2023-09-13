package tables
// AUTO-GENERATED Slick data model for table SlowLog
trait SlowLogTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SlowLog
   *  @param start_time Database column start_time SqlType(TIMESTAMP)
   *  @param user_host Database column user_host SqlType(MEDIUMTEXT), Length(16777215,true)
   *  @param query_time Database column query_time SqlType(TIME)
   *  @param lock_time Database column lock_time SqlType(TIME)
   *  @param rows_sent Database column rows_sent SqlType(INT)
   *  @param rows_examined Database column rows_examined SqlType(INT)
   *  @param db Database column db SqlType(VARCHAR), Length(512,true)
   *  @param last_insert_id Database column last_insert_id SqlType(INT)
   *  @param insert_id Database column insert_id SqlType(INT)
   *  @param server_id Database column server_id SqlType(INT UNSIGNED)
   *  @param sql_text Database column sql_text SqlType(MEDIUMTEXT), Length(16777215,true)
   *  @param thread_id Database column thread_id SqlType(BIGINT UNSIGNED)
   *  @param rows_affected Database column rows_affected SqlType(INT) */
  case class SlowLogRow(start_time: java.sql.Timestamp, user_host: String, query_time: java.sql.Time, lock_time: java.sql.Time, rows_sent: Int, rows_examined: Int, db: String, last_insert_id: Int, insert_id: Int, server_id: Long, sql_text: String, thread_id: Long, rows_affected: Int)
  /** GetResult implicit for fetching SlowLogRow objects using plain SQL queries */
  implicit def GetResultSlowLogRow(implicit e0: GR[java.sql.Timestamp], e1: GR[String], e2: GR[java.sql.Time], e3: GR[Int], e4: GR[Long]): GR[SlowLogRow] = GR{
    prs => import prs._
    SlowLogRow.tupled((<<[java.sql.Timestamp], <<[String], <<[java.sql.Time], <<[java.sql.Time], <<[Int], <<[Int], <<[String], <<[Int], <<[Int], <<[Long], <<[String], <<[Long], <<[Int]))
  }
  /** Table description of table slow_log. Objects of this class serve as prototypes for rows in queries. */
  class SlowLog(_tableTag: Tag) extends profile.api.Table[SlowLogRow](_tableTag, Some("mysql"), "slow_log") {
    def * = (start_time, user_host, query_time, lock_time, rows_sent, rows_examined, db, last_insert_id, insert_id, server_id, sql_text, thread_id, rows_affected).<>(SlowLogRow.tupled, SlowLogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(start_time), Rep.Some(user_host), Rep.Some(query_time), Rep.Some(lock_time), Rep.Some(rows_sent), Rep.Some(rows_examined), Rep.Some(db), Rep.Some(last_insert_id), Rep.Some(insert_id), Rep.Some(server_id), Rep.Some(sql_text), Rep.Some(thread_id), Rep.Some(rows_affected))).shaped.<>({r=>import r._; _1.map(_=> SlowLogRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column start_time SqlType(TIMESTAMP) */
    val start_time: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("start_time")
    /** Database column user_host SqlType(MEDIUMTEXT), Length(16777215,true) */
    val user_host: Rep[String] = column[String]("user_host", O.Length(16777215,varying=true))
    /** Database column query_time SqlType(TIME) */
    val query_time: Rep[java.sql.Time] = column[java.sql.Time]("query_time")
    /** Database column lock_time SqlType(TIME) */
    val lock_time: Rep[java.sql.Time] = column[java.sql.Time]("lock_time")
    /** Database column rows_sent SqlType(INT) */
    val rows_sent: Rep[Int] = column[Int]("rows_sent")
    /** Database column rows_examined SqlType(INT) */
    val rows_examined: Rep[Int] = column[Int]("rows_examined")
    /** Database column db SqlType(VARCHAR), Length(512,true) */
    val db: Rep[String] = column[String]("db", O.Length(512,varying=true))
    /** Database column last_insert_id SqlType(INT) */
    val last_insert_id: Rep[Int] = column[Int]("last_insert_id")
    /** Database column insert_id SqlType(INT) */
    val insert_id: Rep[Int] = column[Int]("insert_id")
    /** Database column server_id SqlType(INT UNSIGNED) */
    val server_id: Rep[Long] = column[Long]("server_id")
    /** Database column sql_text SqlType(MEDIUMTEXT), Length(16777215,true) */
    val sql_text: Rep[String] = column[String]("sql_text", O.Length(16777215,varying=true))
    /** Database column thread_id SqlType(BIGINT UNSIGNED) */
    val thread_id: Rep[Long] = column[Long]("thread_id")
    /** Database column rows_affected SqlType(INT) */
    val rows_affected: Rep[Int] = column[Int]("rows_affected")
  }
  /** Collection-like TableQuery object for table SlowLog */
  lazy val SlowLog = new TableQuery(tag => new SlowLog(tag))
}
