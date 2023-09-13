package tables
// AUTO-GENERATED Slick data model for table TablesPriv
trait TablesPrivTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TablesPriv
   *  @param Host Database column Host SqlType(CHAR), Length(60,false), Default('')
   *  @param Db Database column Db SqlType(CHAR), Length(64,false), Default('')
   *  @param User Database column User SqlType(CHAR), Length(80,false), Default('')
   *  @param Table_name Database column Table_name SqlType(CHAR), Length(64,false), Default('')
   *  @param Grantor Database column Grantor SqlType(CHAR), Length(141,false), Default('')
   *  @param Timestamp Database column Timestamp SqlType(TIMESTAMP)
   *  @param Table_priv Database column Table_priv SqlType(SET), Length(121,true), Default('')
   *  @param Column_priv Database column Column_priv SqlType(SET), Length(31,true), Default('') */
  case class TablesPrivRow(Host: String, Db: String, User: String, Table_name: String, Grantor: String, Timestamp: java.sql.Timestamp, Table_priv: String, Column_priv: String)
  /** GetResult implicit for fetching TablesPrivRow objects using plain SQL queries */
  implicit def GetResultTablesPrivRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp]): GR[TablesPrivRow] = GR{
    prs => import prs._
    TablesPrivRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table tables_priv. Objects of this class serve as prototypes for rows in queries. */
  class TablesPriv(_tableTag: Tag) extends profile.api.Table[TablesPrivRow](_tableTag, Some("mysql"), "tables_priv") {
    def * = (Host, Db, User, Table_name, Grantor, Timestamp, Table_priv, Column_priv).<>(TablesPrivRow.tupled, TablesPrivRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Host), Rep.Some(Db), Rep.Some(User), Rep.Some(Table_name), Rep.Some(Grantor), Rep.Some(Timestamp), Rep.Some(Table_priv), Rep.Some(Column_priv))).shaped.<>({r=>import r._; _1.map(_=> TablesPrivRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Host SqlType(CHAR), Length(60,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(60,varying=false), O.Default("''"))
    /** Database column Db SqlType(CHAR), Length(64,false), Default('') */
    val Db: Rep[String] = column[String]("Db", O.Length(64,varying=false), O.Default("''"))
    /** Database column User SqlType(CHAR), Length(80,false), Default('') */
    val User: Rep[String] = column[String]("User", O.Length(80,varying=false), O.Default("''"))
    /** Database column Table_name SqlType(CHAR), Length(64,false), Default('') */
    val Table_name: Rep[String] = column[String]("Table_name", O.Length(64,varying=false), O.Default("''"))
    /** Database column Grantor SqlType(CHAR), Length(141,false), Default('') */
    val Grantor: Rep[String] = column[String]("Grantor", O.Length(141,varying=false), O.Default("''"))
    /** Database column Timestamp SqlType(TIMESTAMP) */
    val Timestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("Timestamp")
    /** Database column Table_priv SqlType(SET), Length(121,true), Default('') */
    val Table_priv: Rep[String] = column[String]("Table_priv", O.Length(121,varying=true), O.Default("''"))
    /** Database column Column_priv SqlType(SET), Length(31,true), Default('') */
    val Column_priv: Rep[String] = column[String]("Column_priv", O.Length(31,varying=true), O.Default("''"))

    /** Primary key of TablesPriv (database name tables_priv_PK) */
    val pk = primaryKey("tables_priv_PK", (Host, Db, User, Table_name))

    /** Index over (Grantor) (database name Grantor) */
    val index1 = index("Grantor", Grantor)
  }
  /** Collection-like TableQuery object for table TablesPriv */
  lazy val TablesPriv = new TableQuery(tag => new TablesPriv(tag))
}
