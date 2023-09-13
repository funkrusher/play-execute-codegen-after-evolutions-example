package tables
// AUTO-GENERATED Slick data model for table ColumnsPriv
trait ColumnsPrivTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ColumnsPriv
   *  @param Host Database column Host SqlType(CHAR), Length(60,false), Default('')
   *  @param Db Database column Db SqlType(CHAR), Length(64,false), Default('')
   *  @param User Database column User SqlType(CHAR), Length(80,false), Default('')
   *  @param Table_name Database column Table_name SqlType(CHAR), Length(64,false), Default('')
   *  @param Column_name Database column Column_name SqlType(CHAR), Length(64,false), Default('')
   *  @param Timestamp Database column Timestamp SqlType(TIMESTAMP)
   *  @param Column_priv Database column Column_priv SqlType(SET), Length(31,true), Default('') */
  case class ColumnsPrivRow(Host: String, Db: String, User: String, Table_name: String, Column_name: String, Timestamp: java.sql.Timestamp, Column_priv: String)
  /** GetResult implicit for fetching ColumnsPrivRow objects using plain SQL queries */
  implicit def GetResultColumnsPrivRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp]): GR[ColumnsPrivRow] = GR{
    prs => import prs._
    ColumnsPrivRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[String]))
  }
  /** Table description of table columns_priv. Objects of this class serve as prototypes for rows in queries. */
  class ColumnsPriv(_tableTag: Tag) extends profile.api.Table[ColumnsPrivRow](_tableTag, Some("mysql"), "columns_priv") {
    def * = (Host, Db, User, Table_name, Column_name, Timestamp, Column_priv).<>(ColumnsPrivRow.tupled, ColumnsPrivRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Host), Rep.Some(Db), Rep.Some(User), Rep.Some(Table_name), Rep.Some(Column_name), Rep.Some(Timestamp), Rep.Some(Column_priv))).shaped.<>({r=>import r._; _1.map(_=> ColumnsPrivRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Host SqlType(CHAR), Length(60,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(60,varying=false), O.Default("''"))
    /** Database column Db SqlType(CHAR), Length(64,false), Default('') */
    val Db: Rep[String] = column[String]("Db", O.Length(64,varying=false), O.Default("''"))
    /** Database column User SqlType(CHAR), Length(80,false), Default('') */
    val User: Rep[String] = column[String]("User", O.Length(80,varying=false), O.Default("''"))
    /** Database column Table_name SqlType(CHAR), Length(64,false), Default('') */
    val Table_name: Rep[String] = column[String]("Table_name", O.Length(64,varying=false), O.Default("''"))
    /** Database column Column_name SqlType(CHAR), Length(64,false), Default('') */
    val Column_name: Rep[String] = column[String]("Column_name", O.Length(64,varying=false), O.Default("''"))
    /** Database column Timestamp SqlType(TIMESTAMP) */
    val Timestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("Timestamp")
    /** Database column Column_priv SqlType(SET), Length(31,true), Default('') */
    val Column_priv: Rep[String] = column[String]("Column_priv", O.Length(31,varying=true), O.Default("''"))

    /** Primary key of ColumnsPriv (database name columns_priv_PK) */
    val pk = primaryKey("columns_priv_PK", (Host, Db, User, Table_name, Column_name))
  }
  /** Collection-like TableQuery object for table ColumnsPriv */
  lazy val ColumnsPriv = new TableQuery(tag => new ColumnsPriv(tag))
}
