package tables
// AUTO-GENERATED Slick data model for table Event
trait EventTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Event
   *  @param db Database column db SqlType(CHAR), Length(64,false), Default('')
   *  @param name Database column name SqlType(CHAR), Length(64,false), Default('')
   *  @param body Database column body SqlType(LONGBLOB)
   *  @param definer Database column definer SqlType(CHAR), Length(141,false), Default('')
   *  @param execute_at Database column execute_at SqlType(DATETIME), Default(None)
   *  @param interval_value Database column interval_value SqlType(INT), Default(None)
   *  @param interval_field Database column interval_field SqlType(ENUM), Length(18,true), Default(Some(NULL))
   *  @param created Database column created SqlType(TIMESTAMP)
   *  @param modified Database column modified SqlType(TIMESTAMP)
   *  @param last_executed Database column last_executed SqlType(DATETIME), Default(None)
   *  @param starts Database column starts SqlType(DATETIME), Default(None)
   *  @param ends Database column ends SqlType(DATETIME), Default(None)
   *  @param status Database column status SqlType(ENUM), Length(18,true), Default('ENABLED')
   *  @param on_completion Database column on_completion SqlType(ENUM), Length(8,true), Default('DROP')
   *  @param sql_mode Database column sql_mode SqlType(SET), Length(561,true), Default('')
   *  @param comment Database column comment SqlType(CHAR), Length(64,false), Default('')
   *  @param originator Database column originator SqlType(INT UNSIGNED)
   *  @param time_zone Database column time_zone SqlType(CHAR), Length(64,false), Default('SYSTEM')
   *  @param character_set_client Database column character_set_client SqlType(CHAR), Length(32,false), Default(Some(NULL))
   *  @param collation_connection Database column collation_connection SqlType(CHAR), Length(32,false), Default(Some(NULL))
   *  @param db_collation Database column db_collation SqlType(CHAR), Length(32,false), Default(Some(NULL))
   *  @param body_utf8 Database column body_utf8 SqlType(LONGBLOB), Default(None) */
  case class EventRow(db: String, name: String, body: java.sql.Blob, definer: String, execute_at: Option[java.sql.Timestamp], interval_value: Option[Int], interval_field: Option[String], created: java.sql.Timestamp, modified: java.sql.Timestamp, last_executed: Option[java.sql.Timestamp], starts: Option[java.sql.Timestamp], ends: Option[java.sql.Timestamp], status: String, on_completion: String, sql_mode: String, comment: String, originator: Long, time_zone: String, character_set_client: Option[String], collation_connection: Option[String], db_collation: Option[String], body_utf8: Option[java.sql.Blob])
  /** GetResult implicit for fetching EventRow objects using plain SQL queries */
  implicit def GetResultEventRow(implicit e0: GR[String], e1: GR[java.sql.Blob], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Int]], e4: GR[Option[String]], e5: GR[java.sql.Timestamp], e6: GR[Long], e7: GR[Option[java.sql.Blob]]): GR[EventRow] = GR{
    prs => import prs._
    EventRow.tupled((<<[String], <<[String], <<[java.sql.Blob], <<[String], <<?[java.sql.Timestamp], <<?[Int], <<?[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<[String], <<[String], <<[String], <<[Long], <<[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Blob]))
  }
  /** Table description of table event. Objects of this class serve as prototypes for rows in queries. */
  class Event(_tableTag: Tag) extends profile.api.Table[EventRow](_tableTag, Some("mysql"), "event") {
    def * = (db, name, body, definer, execute_at, interval_value, interval_field, created, modified, last_executed, starts, ends, status, on_completion, sql_mode, comment, originator, time_zone, character_set_client, collation_connection, db_collation, body_utf8).<>(EventRow.tupled, EventRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db), Rep.Some(name), Rep.Some(body), Rep.Some(definer), execute_at, interval_value, interval_field, Rep.Some(created), Rep.Some(modified), last_executed, starts, ends, Rep.Some(status), Rep.Some(on_completion), Rep.Some(sql_mode), Rep.Some(comment), Rep.Some(originator), Rep.Some(time_zone), character_set_client, collation_connection, db_collation, body_utf8)).shaped.<>({r=>import r._; _1.map(_=> EventRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6, _7, _8.get, _9.get, _10, _11, _12, _13.get, _14.get, _15.get, _16.get, _17.get, _18.get, _19, _20, _21, _22)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db SqlType(CHAR), Length(64,false), Default('') */
    val db: Rep[String] = column[String]("db", O.Length(64,varying=false), O.Default("''"))
    /** Database column name SqlType(CHAR), Length(64,false), Default('') */
    val name: Rep[String] = column[String]("name", O.Length(64,varying=false), O.Default("''"))
    /** Database column body SqlType(LONGBLOB) */
    val body: Rep[java.sql.Blob] = column[java.sql.Blob]("body")
    /** Database column definer SqlType(CHAR), Length(141,false), Default('') */
    val definer: Rep[String] = column[String]("definer", O.Length(141,varying=false), O.Default("''"))
    /** Database column execute_at SqlType(DATETIME), Default(None) */
    val execute_at: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("execute_at", O.Default(None))
    /** Database column interval_value SqlType(INT), Default(None) */
    val interval_value: Rep[Option[Int]] = column[Option[Int]]("interval_value", O.Default(None))
    /** Database column interval_field SqlType(ENUM), Length(18,true), Default(Some(NULL)) */
    val interval_field: Rep[Option[String]] = column[Option[String]]("interval_field", O.Length(18,varying=true), O.Default(Some("NULL")))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created")
    /** Database column modified SqlType(TIMESTAMP) */
    val modified: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified")
    /** Database column last_executed SqlType(DATETIME), Default(None) */
    val last_executed: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_executed", O.Default(None))
    /** Database column starts SqlType(DATETIME), Default(None) */
    val starts: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("starts", O.Default(None))
    /** Database column ends SqlType(DATETIME), Default(None) */
    val ends: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("ends", O.Default(None))
    /** Database column status SqlType(ENUM), Length(18,true), Default('ENABLED') */
    val status: Rep[String] = column[String]("status", O.Length(18,varying=true), O.Default("'ENABLED'"))
    /** Database column on_completion SqlType(ENUM), Length(8,true), Default('DROP') */
    val on_completion: Rep[String] = column[String]("on_completion", O.Length(8,varying=true), O.Default("'DROP'"))
    /** Database column sql_mode SqlType(SET), Length(561,true), Default('') */
    val sql_mode: Rep[String] = column[String]("sql_mode", O.Length(561,varying=true), O.Default("''"))
    /** Database column comment SqlType(CHAR), Length(64,false), Default('') */
    val comment: Rep[String] = column[String]("comment", O.Length(64,varying=false), O.Default("''"))
    /** Database column originator SqlType(INT UNSIGNED) */
    val originator: Rep[Long] = column[Long]("originator")
    /** Database column time_zone SqlType(CHAR), Length(64,false), Default('SYSTEM') */
    val time_zone: Rep[String] = column[String]("time_zone", O.Length(64,varying=false), O.Default("'SYSTEM'"))
    /** Database column character_set_client SqlType(CHAR), Length(32,false), Default(Some(NULL)) */
    val character_set_client: Rep[Option[String]] = column[Option[String]]("character_set_client", O.Length(32,varying=false), O.Default(Some("NULL")))
    /** Database column collation_connection SqlType(CHAR), Length(32,false), Default(Some(NULL)) */
    val collation_connection: Rep[Option[String]] = column[Option[String]]("collation_connection", O.Length(32,varying=false), O.Default(Some("NULL")))
    /** Database column db_collation SqlType(CHAR), Length(32,false), Default(Some(NULL)) */
    val db_collation: Rep[Option[String]] = column[Option[String]]("db_collation", O.Length(32,varying=false), O.Default(Some("NULL")))
    /** Database column body_utf8 SqlType(LONGBLOB), Default(None) */
    val body_utf8: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("body_utf8", O.Default(None))

    /** Primary key of Event (database name event_PK) */
    val pk = primaryKey("event_PK", (db, name))
  }
  /** Collection-like TableQuery object for table Event */
  lazy val Event = new TableQuery(tag => new Event(tag))
}
