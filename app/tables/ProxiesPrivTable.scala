package tables
// AUTO-GENERATED Slick data model for table ProxiesPriv
trait ProxiesPrivTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ProxiesPriv
   *  @param Host Database column Host SqlType(CHAR), Length(60,false), Default('')
   *  @param User Database column User SqlType(CHAR), Length(80,false), Default('')
   *  @param Proxied_host Database column Proxied_host SqlType(CHAR), Length(60,false), Default('')
   *  @param Proxied_user Database column Proxied_user SqlType(CHAR), Length(80,false), Default('')
   *  @param With_grant Database column With_grant SqlType(BOOLEAN), Default(false)
   *  @param Grantor Database column Grantor SqlType(CHAR), Length(141,false), Default('')
   *  @param Timestamp Database column Timestamp SqlType(TIMESTAMP) */
  case class ProxiesPrivRow(Host: String, User: String, Proxied_host: String, Proxied_user: String, With_grant: Boolean, Grantor: String, Timestamp: java.sql.Timestamp)
  /** GetResult implicit for fetching ProxiesPrivRow objects using plain SQL queries */
  implicit def GetResultProxiesPrivRow(implicit e0: GR[String], e1: GR[Boolean], e2: GR[java.sql.Timestamp]): GR[ProxiesPrivRow] = GR{
    prs => import prs._
    ProxiesPrivRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[Boolean], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table proxies_priv. Objects of this class serve as prototypes for rows in queries. */
  class ProxiesPriv(_tableTag: Tag) extends profile.api.Table[ProxiesPrivRow](_tableTag, Some("mysql"), "proxies_priv") {
    def * = (Host, User, Proxied_host, Proxied_user, With_grant, Grantor, Timestamp).<>(ProxiesPrivRow.tupled, ProxiesPrivRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Host), Rep.Some(User), Rep.Some(Proxied_host), Rep.Some(Proxied_user), Rep.Some(With_grant), Rep.Some(Grantor), Rep.Some(Timestamp))).shaped.<>({r=>import r._; _1.map(_=> ProxiesPrivRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Host SqlType(CHAR), Length(60,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(60,varying=false), O.Default("''"))
    /** Database column User SqlType(CHAR), Length(80,false), Default('') */
    val User: Rep[String] = column[String]("User", O.Length(80,varying=false), O.Default("''"))
    /** Database column Proxied_host SqlType(CHAR), Length(60,false), Default('') */
    val Proxied_host: Rep[String] = column[String]("Proxied_host", O.Length(60,varying=false), O.Default("''"))
    /** Database column Proxied_user SqlType(CHAR), Length(80,false), Default('') */
    val Proxied_user: Rep[String] = column[String]("Proxied_user", O.Length(80,varying=false), O.Default("''"))
    /** Database column With_grant SqlType(BOOLEAN), Default(false) */
    val With_grant: Rep[Boolean] = column[Boolean]("With_grant", O.Default(false))
    /** Database column Grantor SqlType(CHAR), Length(141,false), Default('') */
    val Grantor: Rep[String] = column[String]("Grantor", O.Length(141,varying=false), O.Default("''"))
    /** Database column Timestamp SqlType(TIMESTAMP) */
    val Timestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("Timestamp")

    /** Primary key of ProxiesPriv (database name proxies_priv_PK) */
    val pk = primaryKey("proxies_priv_PK", (Host, User, Proxied_host, Proxied_user))

    /** Index over (Grantor) (database name Grantor) */
    val index1 = index("Grantor", Grantor)
  }
  /** Collection-like TableQuery object for table ProxiesPriv */
  lazy val ProxiesPriv = new TableQuery(tag => new ProxiesPriv(tag))
}
