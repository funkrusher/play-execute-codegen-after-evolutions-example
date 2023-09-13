package tables
// AUTO-GENERATED Slick data model for table Proc
trait ProcTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Proc
   *  @param db Database column db SqlType(CHAR), Length(64,false), Default('')
   *  @param name Database column name SqlType(CHAR), Length(64,false), Default('')
   *  @param `type` Database column type SqlType(ENUM), Length(12,true)
   *  @param specific_name Database column specific_name SqlType(CHAR), Length(64,false), Default('')
   *  @param language Database column language SqlType(ENUM), Length(3,true), Default('SQL')
   *  @param sql_data_access Database column sql_data_access SqlType(ENUM), Length(17,true), Default('CONTAINS_SQL')
   *  @param is_deterministic Database column is_deterministic SqlType(ENUM), Length(3,true), Default('NO')
   *  @param security_type Database column security_type SqlType(ENUM), Length(7,true), Default('DEFINER')
   *  @param param_list Database column param_list SqlType(BLOB)
   *  @param returns Database column returns SqlType(LONGBLOB)
   *  @param body Database column body SqlType(LONGBLOB)
   *  @param definer Database column definer SqlType(CHAR), Length(141,false), Default('')
   *  @param created Database column created SqlType(TIMESTAMP)
   *  @param modified Database column modified SqlType(TIMESTAMP)
   *  @param sql_mode Database column sql_mode SqlType(SET), Length(561,true), Default('')
   *  @param comment Database column comment SqlType(TEXT)
   *  @param character_set_client Database column character_set_client SqlType(CHAR), Length(32,false), Default(Some(NULL))
   *  @param collation_connection Database column collation_connection SqlType(CHAR), Length(32,false), Default(Some(NULL))
   *  @param db_collation Database column db_collation SqlType(CHAR), Length(32,false), Default(Some(NULL))
   *  @param body_utf8 Database column body_utf8 SqlType(LONGBLOB), Default(None)
   *  @param aggregate Database column aggregate SqlType(ENUM), Length(5,true), Default('NONE') */
  case class ProcRow(db: String, name: String, `type`: String, specific_name: String, language: String, sql_data_access: String, is_deterministic: String, security_type: String, param_list: java.sql.Blob, returns: java.sql.Blob, body: java.sql.Blob, definer: String, created: java.sql.Timestamp, modified: java.sql.Timestamp, sql_mode: String, comment: String, character_set_client: Option[String], collation_connection: Option[String], db_collation: Option[String], body_utf8: Option[java.sql.Blob], aggregate: String)
  /** GetResult implicit for fetching ProcRow objects using plain SQL queries */
  implicit def GetResultProcRow(implicit e0: GR[String], e1: GR[java.sql.Blob], e2: GR[java.sql.Timestamp], e3: GR[Option[String]], e4: GR[Option[java.sql.Blob]]): GR[ProcRow] = GR{
    prs => import prs._
    ProcRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Blob], <<[java.sql.Blob], <<[java.sql.Blob], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Blob], <<[String]))
  }
  /** Table description of table proc. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Proc(_tableTag: Tag) extends profile.api.Table[ProcRow](_tableTag, Some("mysql"), "proc") {
    def * = (db, name, `type`, specific_name, language, sql_data_access, is_deterministic, security_type, param_list, returns, body, definer, created, modified, sql_mode, comment, character_set_client, collation_connection, db_collation, body_utf8, aggregate).<>(ProcRow.tupled, ProcRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db), Rep.Some(name), Rep.Some(`type`), Rep.Some(specific_name), Rep.Some(language), Rep.Some(sql_data_access), Rep.Some(is_deterministic), Rep.Some(security_type), Rep.Some(param_list), Rep.Some(returns), Rep.Some(body), Rep.Some(definer), Rep.Some(created), Rep.Some(modified), Rep.Some(sql_mode), Rep.Some(comment), character_set_client, collation_connection, db_collation, body_utf8, Rep.Some(aggregate))).shaped.<>({r=>import r._; _1.map(_=> ProcRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13.get, _14.get, _15.get, _16.get, _17, _18, _19, _20, _21.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db SqlType(CHAR), Length(64,false), Default('') */
    val db: Rep[String] = column[String]("db", O.Length(64,varying=false), O.Default("''"))
    /** Database column name SqlType(CHAR), Length(64,false), Default('') */
    val name: Rep[String] = column[String]("name", O.Length(64,varying=false), O.Default("''"))
    /** Database column type SqlType(ENUM), Length(12,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type", O.Length(12,varying=true))
    /** Database column specific_name SqlType(CHAR), Length(64,false), Default('') */
    val specific_name: Rep[String] = column[String]("specific_name", O.Length(64,varying=false), O.Default("''"))
    /** Database column language SqlType(ENUM), Length(3,true), Default('SQL') */
    val language: Rep[String] = column[String]("language", O.Length(3,varying=true), O.Default("'SQL'"))
    /** Database column sql_data_access SqlType(ENUM), Length(17,true), Default('CONTAINS_SQL') */
    val sql_data_access: Rep[String] = column[String]("sql_data_access", O.Length(17,varying=true), O.Default("'CONTAINS_SQL'"))
    /** Database column is_deterministic SqlType(ENUM), Length(3,true), Default('NO') */
    val is_deterministic: Rep[String] = column[String]("is_deterministic", O.Length(3,varying=true), O.Default("'NO'"))
    /** Database column security_type SqlType(ENUM), Length(7,true), Default('DEFINER') */
    val security_type: Rep[String] = column[String]("security_type", O.Length(7,varying=true), O.Default("'DEFINER'"))
    /** Database column param_list SqlType(BLOB) */
    val param_list: Rep[java.sql.Blob] = column[java.sql.Blob]("param_list")
    /** Database column returns SqlType(LONGBLOB) */
    val returns: Rep[java.sql.Blob] = column[java.sql.Blob]("returns")
    /** Database column body SqlType(LONGBLOB) */
    val body: Rep[java.sql.Blob] = column[java.sql.Blob]("body")
    /** Database column definer SqlType(CHAR), Length(141,false), Default('') */
    val definer: Rep[String] = column[String]("definer", O.Length(141,varying=false), O.Default("''"))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created")
    /** Database column modified SqlType(TIMESTAMP) */
    val modified: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("modified")
    /** Database column sql_mode SqlType(SET), Length(561,true), Default('') */
    val sql_mode: Rep[String] = column[String]("sql_mode", O.Length(561,varying=true), O.Default("''"))
    /** Database column comment SqlType(TEXT) */
    val comment: Rep[String] = column[String]("comment")
    /** Database column character_set_client SqlType(CHAR), Length(32,false), Default(Some(NULL)) */
    val character_set_client: Rep[Option[String]] = column[Option[String]]("character_set_client", O.Length(32,varying=false), O.Default(Some("NULL")))
    /** Database column collation_connection SqlType(CHAR), Length(32,false), Default(Some(NULL)) */
    val collation_connection: Rep[Option[String]] = column[Option[String]]("collation_connection", O.Length(32,varying=false), O.Default(Some("NULL")))
    /** Database column db_collation SqlType(CHAR), Length(32,false), Default(Some(NULL)) */
    val db_collation: Rep[Option[String]] = column[Option[String]]("db_collation", O.Length(32,varying=false), O.Default(Some("NULL")))
    /** Database column body_utf8 SqlType(LONGBLOB), Default(None) */
    val body_utf8: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("body_utf8", O.Default(None))
    /** Database column aggregate SqlType(ENUM), Length(5,true), Default('NONE') */
    val aggregate: Rep[String] = column[String]("aggregate", O.Length(5,varying=true), O.Default("'NONE'"))

    /** Primary key of Proc (database name proc_PK) */
    val pk = primaryKey("proc_PK", (db, name, `type`))
  }
  /** Collection-like TableQuery object for table Proc */
  lazy val Proc = new TableQuery(tag => new Proc(tag))
}
