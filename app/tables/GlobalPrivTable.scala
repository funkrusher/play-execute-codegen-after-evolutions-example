package tables
// AUTO-GENERATED Slick data model for table GlobalPriv
trait GlobalPrivTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table GlobalPriv
   *  @param Host Database column Host SqlType(CHAR), Length(60,false), Default('')
   *  @param User Database column User SqlType(CHAR), Length(80,false), Default('')
   *  @param Priv Database column Priv SqlType(LONGTEXT), Length(2147483647,true), Default('{}') */
  case class GlobalPrivRow(Host: String, User: String, Priv: String)
  /** GetResult implicit for fetching GlobalPrivRow objects using plain SQL queries */
  implicit def GetResultGlobalPrivRow(implicit e0: GR[String]): GR[GlobalPrivRow] = GR{
    prs => import prs._
    GlobalPrivRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table global_priv. Objects of this class serve as prototypes for rows in queries. */
  class GlobalPriv(_tableTag: Tag) extends profile.api.Table[GlobalPrivRow](_tableTag, Some("mysql"), "global_priv") {
    def * = (Host, User, Priv).<>(GlobalPrivRow.tupled, GlobalPrivRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Host), Rep.Some(User), Rep.Some(Priv))).shaped.<>({r=>import r._; _1.map(_=> GlobalPrivRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Host SqlType(CHAR), Length(60,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(60,varying=false), O.Default("''"))
    /** Database column User SqlType(CHAR), Length(80,false), Default('') */
    val User: Rep[String] = column[String]("User", O.Length(80,varying=false), O.Default("''"))
    /** Database column Priv SqlType(LONGTEXT), Length(2147483647,true), Default('{}') */
    val Priv: Rep[String] = column[String]("Priv", O.Length(2147483647,varying=true), O.Default("'{}'"))

    /** Primary key of GlobalPriv (database name global_priv_PK) */
    val pk = primaryKey("global_priv_PK", (Host, User))
  }
  /** Collection-like TableQuery object for table GlobalPriv */
  lazy val GlobalPriv = new TableQuery(tag => new GlobalPriv(tag))
}
