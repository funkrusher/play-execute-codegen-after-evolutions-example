package tables
// AUTO-GENERATED Slick data model for table Threads
trait ThreadsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Threads
   *  @param THREAD_ID Database column THREAD_ID SqlType(BIGINT UNSIGNED)
   *  @param NAME Database column NAME SqlType(VARCHAR), Length(128,true)
   *  @param TYPE Database column TYPE SqlType(VARCHAR), Length(10,true)
   *  @param PROCESSLIST_ID Database column PROCESSLIST_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param PROCESSLIST_USER Database column PROCESSLIST_USER SqlType(VARCHAR), Length(16,true), Default(Some(NULL))
   *  @param PROCESSLIST_HOST Database column PROCESSLIST_HOST SqlType(VARCHAR), Length(60,true), Default(Some(NULL))
   *  @param PROCESSLIST_DB Database column PROCESSLIST_DB SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param PROCESSLIST_COMMAND Database column PROCESSLIST_COMMAND SqlType(VARCHAR), Length(16,true), Default(Some(NULL))
   *  @param PROCESSLIST_TIME Database column PROCESSLIST_TIME SqlType(BIGINT), Default(None)
   *  @param PROCESSLIST_STATE Database column PROCESSLIST_STATE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param PROCESSLIST_INFO Database column PROCESSLIST_INFO SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param PARENT_THREAD_ID Database column PARENT_THREAD_ID SqlType(BIGINT UNSIGNED), Default(None)
   *  @param ROLE Database column ROLE SqlType(VARCHAR), Length(64,true), Default(Some(NULL))
   *  @param INSTRUMENTED Database column INSTRUMENTED SqlType(ENUM), Length(3,true) */
  case class ThreadsRow(THREAD_ID: Long, NAME: String, TYPE: String, PROCESSLIST_ID: Option[Long], PROCESSLIST_USER: Option[String], PROCESSLIST_HOST: Option[String], PROCESSLIST_DB: Option[String], PROCESSLIST_COMMAND: Option[String], PROCESSLIST_TIME: Option[Long], PROCESSLIST_STATE: Option[String], PROCESSLIST_INFO: Option[String], PARENT_THREAD_ID: Option[Long], ROLE: Option[String], INSTRUMENTED: String)
  /** GetResult implicit for fetching ThreadsRow objects using plain SQL queries */
  implicit def GetResultThreadsRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Long]], e3: GR[Option[String]]): GR[ThreadsRow] = GR{
    prs => import prs._
    ThreadsRow.tupled((<<[Long], <<[String], <<[String], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Long], <<?[String], <<?[String], <<?[Long], <<?[String], <<[String]))
  }
  /** Table description of table threads. Objects of this class serve as prototypes for rows in queries. */
  class Threads(_tableTag: Tag) extends profile.api.Table[ThreadsRow](_tableTag, Some("performance_schema"), "threads") {
    def * = (THREAD_ID, NAME, TYPE, PROCESSLIST_ID, PROCESSLIST_USER, PROCESSLIST_HOST, PROCESSLIST_DB, PROCESSLIST_COMMAND, PROCESSLIST_TIME, PROCESSLIST_STATE, PROCESSLIST_INFO, PARENT_THREAD_ID, ROLE, INSTRUMENTED).<>(ThreadsRow.tupled, ThreadsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(THREAD_ID), Rep.Some(NAME), Rep.Some(TYPE), PROCESSLIST_ID, PROCESSLIST_USER, PROCESSLIST_HOST, PROCESSLIST_DB, PROCESSLIST_COMMAND, PROCESSLIST_TIME, PROCESSLIST_STATE, PROCESSLIST_INFO, PARENT_THREAD_ID, ROLE, Rep.Some(INSTRUMENTED))).shaped.<>({r=>import r._; _1.map(_=> ThreadsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column THREAD_ID SqlType(BIGINT UNSIGNED) */
    val THREAD_ID: Rep[Long] = column[Long]("THREAD_ID")
    /** Database column NAME SqlType(VARCHAR), Length(128,true) */
    val NAME: Rep[String] = column[String]("NAME", O.Length(128,varying=true))
    /** Database column TYPE SqlType(VARCHAR), Length(10,true) */
    val TYPE: Rep[String] = column[String]("TYPE", O.Length(10,varying=true))
    /** Database column PROCESSLIST_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val PROCESSLIST_ID: Rep[Option[Long]] = column[Option[Long]]("PROCESSLIST_ID", O.Default(None))
    /** Database column PROCESSLIST_USER SqlType(VARCHAR), Length(16,true), Default(Some(NULL)) */
    val PROCESSLIST_USER: Rep[Option[String]] = column[Option[String]]("PROCESSLIST_USER", O.Length(16,varying=true), O.Default(Some("NULL")))
    /** Database column PROCESSLIST_HOST SqlType(VARCHAR), Length(60,true), Default(Some(NULL)) */
    val PROCESSLIST_HOST: Rep[Option[String]] = column[Option[String]]("PROCESSLIST_HOST", O.Length(60,varying=true), O.Default(Some("NULL")))
    /** Database column PROCESSLIST_DB SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val PROCESSLIST_DB: Rep[Option[String]] = column[Option[String]]("PROCESSLIST_DB", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column PROCESSLIST_COMMAND SqlType(VARCHAR), Length(16,true), Default(Some(NULL)) */
    val PROCESSLIST_COMMAND: Rep[Option[String]] = column[Option[String]]("PROCESSLIST_COMMAND", O.Length(16,varying=true), O.Default(Some("NULL")))
    /** Database column PROCESSLIST_TIME SqlType(BIGINT), Default(None) */
    val PROCESSLIST_TIME: Rep[Option[Long]] = column[Option[Long]]("PROCESSLIST_TIME", O.Default(None))
    /** Database column PROCESSLIST_STATE SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val PROCESSLIST_STATE: Rep[Option[String]] = column[Option[String]]("PROCESSLIST_STATE", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column PROCESSLIST_INFO SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val PROCESSLIST_INFO: Rep[Option[String]] = column[Option[String]]("PROCESSLIST_INFO", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column PARENT_THREAD_ID SqlType(BIGINT UNSIGNED), Default(None) */
    val PARENT_THREAD_ID: Rep[Option[Long]] = column[Option[Long]]("PARENT_THREAD_ID", O.Default(None))
    /** Database column ROLE SqlType(VARCHAR), Length(64,true), Default(Some(NULL)) */
    val ROLE: Rep[Option[String]] = column[Option[String]]("ROLE", O.Length(64,varying=true), O.Default(Some("NULL")))
    /** Database column INSTRUMENTED SqlType(ENUM), Length(3,true) */
    val INSTRUMENTED: Rep[String] = column[String]("INSTRUMENTED", O.Length(3,varying=true))
  }
  /** Collection-like TableQuery object for table Threads */
  lazy val Threads = new TableQuery(tag => new Threads(tag))
}
