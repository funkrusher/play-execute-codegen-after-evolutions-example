package tables
// AUTO-GENERATED Slick data model for table ProcsPriv
trait ProcsPrivTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ProcsPriv
   *  @param Host Database column Host SqlType(CHAR), Length(60,false), Default('')
   *  @param Db Database column Db SqlType(CHAR), Length(64,false), Default('')
   *  @param User Database column User SqlType(CHAR), Length(80,false), Default('')
   *  @param Routine_name Database column Routine_name SqlType(CHAR), Length(64,false), Default('')
   *  @param Routine_type Database column Routine_type SqlType(ENUM), Length(12,true)
   *  @param Grantor Database column Grantor SqlType(CHAR), Length(141,false), Default('')
   *  @param Proc_priv Database column Proc_priv SqlType(SET), Length(27,true), Default('')
   *  @param Timestamp Database column Timestamp SqlType(TIMESTAMP) */
  case class ProcsPrivRow(Host: String, Db: String, User: String, Routine_name: String, Routine_type: String, Grantor: String, Proc_priv: String, Timestamp: java.sql.Timestamp)
  /** GetResult implicit for fetching ProcsPrivRow objects using plain SQL queries */
  implicit def GetResultProcsPrivRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp]): GR[ProcsPrivRow] = GR{
    prs => import prs._
    ProcsPrivRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table procs_priv. Objects of this class serve as prototypes for rows in queries. */
  class ProcsPriv(_tableTag: Tag) extends profile.api.Table[ProcsPrivRow](_tableTag, Some("mysql"), "procs_priv") {
    def * = (Host, Db, User, Routine_name, Routine_type, Grantor, Proc_priv, Timestamp).<>(ProcsPrivRow.tupled, ProcsPrivRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Host), Rep.Some(Db), Rep.Some(User), Rep.Some(Routine_name), Rep.Some(Routine_type), Rep.Some(Grantor), Rep.Some(Proc_priv), Rep.Some(Timestamp))).shaped.<>({r=>import r._; _1.map(_=> ProcsPrivRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Host SqlType(CHAR), Length(60,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(60,varying=false), O.Default("''"))
    /** Database column Db SqlType(CHAR), Length(64,false), Default('') */
    val Db: Rep[String] = column[String]("Db", O.Length(64,varying=false), O.Default("''"))
    /** Database column User SqlType(CHAR), Length(80,false), Default('') */
    val User: Rep[String] = column[String]("User", O.Length(80,varying=false), O.Default("''"))
    /** Database column Routine_name SqlType(CHAR), Length(64,false), Default('') */
    val Routine_name: Rep[String] = column[String]("Routine_name", O.Length(64,varying=false), O.Default("''"))
    /** Database column Routine_type SqlType(ENUM), Length(12,true) */
    val Routine_type: Rep[String] = column[String]("Routine_type", O.Length(12,varying=true))
    /** Database column Grantor SqlType(CHAR), Length(141,false), Default('') */
    val Grantor: Rep[String] = column[String]("Grantor", O.Length(141,varying=false), O.Default("''"))
    /** Database column Proc_priv SqlType(SET), Length(27,true), Default('') */
    val Proc_priv: Rep[String] = column[String]("Proc_priv", O.Length(27,varying=true), O.Default("''"))
    /** Database column Timestamp SqlType(TIMESTAMP) */
    val Timestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("Timestamp")

    /** Primary key of ProcsPriv (database name procs_priv_PK) */
    val pk = primaryKey("procs_priv_PK", (Host, Db, User, Routine_name, Routine_type))

    /** Index over (Grantor) (database name Grantor) */
    val index1 = index("Grantor", Grantor)
  }
  /** Collection-like TableQuery object for table ProcsPriv */
  lazy val ProcsPriv = new TableQuery(tag => new ProcsPriv(tag))
}
