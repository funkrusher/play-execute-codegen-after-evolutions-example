package tables
// AUTO-GENERATED Slick data model for table HostCache
trait HostCacheTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HostCache
   *  @param IP Database column IP SqlType(VARCHAR), Length(64,true)
   *  @param HOST Database column HOST SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param HOST_VALIDATED Database column HOST_VALIDATED SqlType(ENUM), Length(3,true)
   *  @param SUM_CONNECT_ERRORS Database column SUM_CONNECT_ERRORS SqlType(BIGINT)
   *  @param COUNT_HOST_BLOCKED_ERRORS Database column COUNT_HOST_BLOCKED_ERRORS SqlType(BIGINT)
   *  @param COUNT_NAMEINFO_TRANSIENT_ERRORS Database column COUNT_NAMEINFO_TRANSIENT_ERRORS SqlType(BIGINT)
   *  @param COUNT_NAMEINFO_PERMANENT_ERRORS Database column COUNT_NAMEINFO_PERMANENT_ERRORS SqlType(BIGINT)
   *  @param COUNT_FORMAT_ERRORS Database column COUNT_FORMAT_ERRORS SqlType(BIGINT)
   *  @param COUNT_ADDRINFO_TRANSIENT_ERRORS Database column COUNT_ADDRINFO_TRANSIENT_ERRORS SqlType(BIGINT)
   *  @param COUNT_ADDRINFO_PERMANENT_ERRORS Database column COUNT_ADDRINFO_PERMANENT_ERRORS SqlType(BIGINT)
   *  @param COUNT_FCRDNS_ERRORS Database column COUNT_FCRDNS_ERRORS SqlType(BIGINT)
   *  @param COUNT_HOST_ACL_ERRORS Database column COUNT_HOST_ACL_ERRORS SqlType(BIGINT)
   *  @param COUNT_NO_AUTH_PLUGIN_ERRORS Database column COUNT_NO_AUTH_PLUGIN_ERRORS SqlType(BIGINT)
   *  @param COUNT_AUTH_PLUGIN_ERRORS Database column COUNT_AUTH_PLUGIN_ERRORS SqlType(BIGINT)
   *  @param COUNT_HANDSHAKE_ERRORS Database column COUNT_HANDSHAKE_ERRORS SqlType(BIGINT)
   *  @param COUNT_PROXY_USER_ERRORS Database column COUNT_PROXY_USER_ERRORS SqlType(BIGINT)
   *  @param COUNT_PROXY_USER_ACL_ERRORS Database column COUNT_PROXY_USER_ACL_ERRORS SqlType(BIGINT)
   *  @param COUNT_AUTHENTICATION_ERRORS Database column COUNT_AUTHENTICATION_ERRORS SqlType(BIGINT)
   *  @param COUNT_SSL_ERRORS Database column COUNT_SSL_ERRORS SqlType(BIGINT)
   *  @param COUNT_MAX_USER_CONNECTIONS_ERRORS Database column COUNT_MAX_USER_CONNECTIONS_ERRORS SqlType(BIGINT)
   *  @param COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS Database column COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS SqlType(BIGINT)
   *  @param COUNT_DEFAULT_DATABASE_ERRORS Database column COUNT_DEFAULT_DATABASE_ERRORS SqlType(BIGINT)
   *  @param COUNT_INIT_CONNECT_ERRORS Database column COUNT_INIT_CONNECT_ERRORS SqlType(BIGINT)
   *  @param COUNT_LOCAL_ERRORS Database column COUNT_LOCAL_ERRORS SqlType(BIGINT)
   *  @param COUNT_UNKNOWN_ERRORS Database column COUNT_UNKNOWN_ERRORS SqlType(BIGINT)
   *  @param FIRST_SEEN Database column FIRST_SEEN SqlType(TIMESTAMP)
   *  @param LAST_SEEN Database column LAST_SEEN SqlType(TIMESTAMP)
   *  @param FIRST_ERROR_SEEN Database column FIRST_ERROR_SEEN SqlType(TIMESTAMP)
   *  @param LAST_ERROR_SEEN Database column LAST_ERROR_SEEN SqlType(TIMESTAMP) */
  case class HostCacheRow(IP: String, HOST: Option[String], HOST_VALIDATED: String, SUM_CONNECT_ERRORS: Long, COUNT_HOST_BLOCKED_ERRORS: Long, COUNT_NAMEINFO_TRANSIENT_ERRORS: Long, COUNT_NAMEINFO_PERMANENT_ERRORS: Long, COUNT_FORMAT_ERRORS: Long, COUNT_ADDRINFO_TRANSIENT_ERRORS: Long, COUNT_ADDRINFO_PERMANENT_ERRORS: Long, COUNT_FCRDNS_ERRORS: Long, COUNT_HOST_ACL_ERRORS: Long, COUNT_NO_AUTH_PLUGIN_ERRORS: Long, COUNT_AUTH_PLUGIN_ERRORS: Long, COUNT_HANDSHAKE_ERRORS: Long, COUNT_PROXY_USER_ERRORS: Long, COUNT_PROXY_USER_ACL_ERRORS: Long, COUNT_AUTHENTICATION_ERRORS: Long, COUNT_SSL_ERRORS: Long, COUNT_MAX_USER_CONNECTIONS_ERRORS: Long, COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS: Long, COUNT_DEFAULT_DATABASE_ERRORS: Long, COUNT_INIT_CONNECT_ERRORS: Long, COUNT_LOCAL_ERRORS: Long, COUNT_UNKNOWN_ERRORS: Long, FIRST_SEEN: java.sql.Timestamp, LAST_SEEN: java.sql.Timestamp, FIRST_ERROR_SEEN: Option[java.sql.Timestamp], LAST_ERROR_SEEN: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching HostCacheRow objects using plain SQL queries */
  implicit def GetResultHostCacheRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Long], e3: GR[java.sql.Timestamp], e4: GR[Option[java.sql.Timestamp]]): GR[HostCacheRow] = GR{
    prs => import prs._
    HostCacheRow(<<[String], <<?[String], <<[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp])
  }
  /** Table description of table host_cache. Objects of this class serve as prototypes for rows in queries. */
  class HostCache(_tableTag: Tag) extends profile.api.Table[HostCacheRow](_tableTag, Some("performance_schema"), "host_cache") {
    def * = (IP :: HOST :: HOST_VALIDATED :: SUM_CONNECT_ERRORS :: COUNT_HOST_BLOCKED_ERRORS :: COUNT_NAMEINFO_TRANSIENT_ERRORS :: COUNT_NAMEINFO_PERMANENT_ERRORS :: COUNT_FORMAT_ERRORS :: COUNT_ADDRINFO_TRANSIENT_ERRORS :: COUNT_ADDRINFO_PERMANENT_ERRORS :: COUNT_FCRDNS_ERRORS :: COUNT_HOST_ACL_ERRORS :: COUNT_NO_AUTH_PLUGIN_ERRORS :: COUNT_AUTH_PLUGIN_ERRORS :: COUNT_HANDSHAKE_ERRORS :: COUNT_PROXY_USER_ERRORS :: COUNT_PROXY_USER_ACL_ERRORS :: COUNT_AUTHENTICATION_ERRORS :: COUNT_SSL_ERRORS :: COUNT_MAX_USER_CONNECTIONS_ERRORS :: COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS :: COUNT_DEFAULT_DATABASE_ERRORS :: COUNT_INIT_CONNECT_ERRORS :: COUNT_LOCAL_ERRORS :: COUNT_UNKNOWN_ERRORS :: FIRST_SEEN :: LAST_SEEN :: FIRST_ERROR_SEEN :: LAST_ERROR_SEEN :: HNil).mapTo[HostCacheRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(IP) :: HOST :: Rep.Some(HOST_VALIDATED) :: Rep.Some(SUM_CONNECT_ERRORS) :: Rep.Some(COUNT_HOST_BLOCKED_ERRORS) :: Rep.Some(COUNT_NAMEINFO_TRANSIENT_ERRORS) :: Rep.Some(COUNT_NAMEINFO_PERMANENT_ERRORS) :: Rep.Some(COUNT_FORMAT_ERRORS) :: Rep.Some(COUNT_ADDRINFO_TRANSIENT_ERRORS) :: Rep.Some(COUNT_ADDRINFO_PERMANENT_ERRORS) :: Rep.Some(COUNT_FCRDNS_ERRORS) :: Rep.Some(COUNT_HOST_ACL_ERRORS) :: Rep.Some(COUNT_NO_AUTH_PLUGIN_ERRORS) :: Rep.Some(COUNT_AUTH_PLUGIN_ERRORS) :: Rep.Some(COUNT_HANDSHAKE_ERRORS) :: Rep.Some(COUNT_PROXY_USER_ERRORS) :: Rep.Some(COUNT_PROXY_USER_ACL_ERRORS) :: Rep.Some(COUNT_AUTHENTICATION_ERRORS) :: Rep.Some(COUNT_SSL_ERRORS) :: Rep.Some(COUNT_MAX_USER_CONNECTIONS_ERRORS) :: Rep.Some(COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS) :: Rep.Some(COUNT_DEFAULT_DATABASE_ERRORS) :: Rep.Some(COUNT_INIT_CONNECT_ERRORS) :: Rep.Some(COUNT_LOCAL_ERRORS) :: Rep.Some(COUNT_UNKNOWN_ERRORS) :: Rep.Some(FIRST_SEEN) :: Rep.Some(LAST_SEEN) :: FIRST_ERROR_SEEN :: LAST_ERROR_SEEN :: HNil).shaped.<>(r => HostCacheRow(r(0).asInstanceOf[Option[String]].get, r(1).asInstanceOf[Option[String]], r(2).asInstanceOf[Option[String]].get, r(3).asInstanceOf[Option[Long]].get, r(4).asInstanceOf[Option[Long]].get, r(5).asInstanceOf[Option[Long]].get, r(6).asInstanceOf[Option[Long]].get, r(7).asInstanceOf[Option[Long]].get, r(8).asInstanceOf[Option[Long]].get, r(9).asInstanceOf[Option[Long]].get, r(10).asInstanceOf[Option[Long]].get, r(11).asInstanceOf[Option[Long]].get, r(12).asInstanceOf[Option[Long]].get, r(13).asInstanceOf[Option[Long]].get, r(14).asInstanceOf[Option[Long]].get, r(15).asInstanceOf[Option[Long]].get, r(16).asInstanceOf[Option[Long]].get, r(17).asInstanceOf[Option[Long]].get, r(18).asInstanceOf[Option[Long]].get, r(19).asInstanceOf[Option[Long]].get, r(20).asInstanceOf[Option[Long]].get, r(21).asInstanceOf[Option[Long]].get, r(22).asInstanceOf[Option[Long]].get, r(23).asInstanceOf[Option[Long]].get, r(24).asInstanceOf[Option[Long]].get, r(25).asInstanceOf[Option[java.sql.Timestamp]].get, r(26).asInstanceOf[Option[java.sql.Timestamp]].get, r(27).asInstanceOf[Option[java.sql.Timestamp]], r(28).asInstanceOf[Option[java.sql.Timestamp]]), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column IP SqlType(VARCHAR), Length(64,true) */
    val IP: Rep[String] = column[String]("IP", O.Length(64,varying=true))
    /** Database column HOST SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val HOST: Rep[Option[String]] = column[Option[String]]("HOST", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column HOST_VALIDATED SqlType(ENUM), Length(3,true) */
    val HOST_VALIDATED: Rep[String] = column[String]("HOST_VALIDATED", O.Length(3,varying=true))
    /** Database column SUM_CONNECT_ERRORS SqlType(BIGINT) */
    val SUM_CONNECT_ERRORS: Rep[Long] = column[Long]("SUM_CONNECT_ERRORS")
    /** Database column COUNT_HOST_BLOCKED_ERRORS SqlType(BIGINT) */
    val COUNT_HOST_BLOCKED_ERRORS: Rep[Long] = column[Long]("COUNT_HOST_BLOCKED_ERRORS")
    /** Database column COUNT_NAMEINFO_TRANSIENT_ERRORS SqlType(BIGINT) */
    val COUNT_NAMEINFO_TRANSIENT_ERRORS: Rep[Long] = column[Long]("COUNT_NAMEINFO_TRANSIENT_ERRORS")
    /** Database column COUNT_NAMEINFO_PERMANENT_ERRORS SqlType(BIGINT) */
    val COUNT_NAMEINFO_PERMANENT_ERRORS: Rep[Long] = column[Long]("COUNT_NAMEINFO_PERMANENT_ERRORS")
    /** Database column COUNT_FORMAT_ERRORS SqlType(BIGINT) */
    val COUNT_FORMAT_ERRORS: Rep[Long] = column[Long]("COUNT_FORMAT_ERRORS")
    /** Database column COUNT_ADDRINFO_TRANSIENT_ERRORS SqlType(BIGINT) */
    val COUNT_ADDRINFO_TRANSIENT_ERRORS: Rep[Long] = column[Long]("COUNT_ADDRINFO_TRANSIENT_ERRORS")
    /** Database column COUNT_ADDRINFO_PERMANENT_ERRORS SqlType(BIGINT) */
    val COUNT_ADDRINFO_PERMANENT_ERRORS: Rep[Long] = column[Long]("COUNT_ADDRINFO_PERMANENT_ERRORS")
    /** Database column COUNT_FCRDNS_ERRORS SqlType(BIGINT) */
    val COUNT_FCRDNS_ERRORS: Rep[Long] = column[Long]("COUNT_FCRDNS_ERRORS")
    /** Database column COUNT_HOST_ACL_ERRORS SqlType(BIGINT) */
    val COUNT_HOST_ACL_ERRORS: Rep[Long] = column[Long]("COUNT_HOST_ACL_ERRORS")
    /** Database column COUNT_NO_AUTH_PLUGIN_ERRORS SqlType(BIGINT) */
    val COUNT_NO_AUTH_PLUGIN_ERRORS: Rep[Long] = column[Long]("COUNT_NO_AUTH_PLUGIN_ERRORS")
    /** Database column COUNT_AUTH_PLUGIN_ERRORS SqlType(BIGINT) */
    val COUNT_AUTH_PLUGIN_ERRORS: Rep[Long] = column[Long]("COUNT_AUTH_PLUGIN_ERRORS")
    /** Database column COUNT_HANDSHAKE_ERRORS SqlType(BIGINT) */
    val COUNT_HANDSHAKE_ERRORS: Rep[Long] = column[Long]("COUNT_HANDSHAKE_ERRORS")
    /** Database column COUNT_PROXY_USER_ERRORS SqlType(BIGINT) */
    val COUNT_PROXY_USER_ERRORS: Rep[Long] = column[Long]("COUNT_PROXY_USER_ERRORS")
    /** Database column COUNT_PROXY_USER_ACL_ERRORS SqlType(BIGINT) */
    val COUNT_PROXY_USER_ACL_ERRORS: Rep[Long] = column[Long]("COUNT_PROXY_USER_ACL_ERRORS")
    /** Database column COUNT_AUTHENTICATION_ERRORS SqlType(BIGINT) */
    val COUNT_AUTHENTICATION_ERRORS: Rep[Long] = column[Long]("COUNT_AUTHENTICATION_ERRORS")
    /** Database column COUNT_SSL_ERRORS SqlType(BIGINT) */
    val COUNT_SSL_ERRORS: Rep[Long] = column[Long]("COUNT_SSL_ERRORS")
    /** Database column COUNT_MAX_USER_CONNECTIONS_ERRORS SqlType(BIGINT) */
    val COUNT_MAX_USER_CONNECTIONS_ERRORS: Rep[Long] = column[Long]("COUNT_MAX_USER_CONNECTIONS_ERRORS")
    /** Database column COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS SqlType(BIGINT) */
    val COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS: Rep[Long] = column[Long]("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS")
    /** Database column COUNT_DEFAULT_DATABASE_ERRORS SqlType(BIGINT) */
    val COUNT_DEFAULT_DATABASE_ERRORS: Rep[Long] = column[Long]("COUNT_DEFAULT_DATABASE_ERRORS")
    /** Database column COUNT_INIT_CONNECT_ERRORS SqlType(BIGINT) */
    val COUNT_INIT_CONNECT_ERRORS: Rep[Long] = column[Long]("COUNT_INIT_CONNECT_ERRORS")
    /** Database column COUNT_LOCAL_ERRORS SqlType(BIGINT) */
    val COUNT_LOCAL_ERRORS: Rep[Long] = column[Long]("COUNT_LOCAL_ERRORS")
    /** Database column COUNT_UNKNOWN_ERRORS SqlType(BIGINT) */
    val COUNT_UNKNOWN_ERRORS: Rep[Long] = column[Long]("COUNT_UNKNOWN_ERRORS")
    /** Database column FIRST_SEEN SqlType(TIMESTAMP) */
    val FIRST_SEEN: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("FIRST_SEEN")
    /** Database column LAST_SEEN SqlType(TIMESTAMP) */
    val LAST_SEEN: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("LAST_SEEN")
    /** Database column FIRST_ERROR_SEEN SqlType(TIMESTAMP) */
    val FIRST_ERROR_SEEN: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("FIRST_ERROR_SEEN")
    /** Database column LAST_ERROR_SEEN SqlType(TIMESTAMP) */
    val LAST_ERROR_SEEN: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LAST_ERROR_SEEN")
  }
  /** Collection-like TableQuery object for table HostCache */
  lazy val HostCache = new TableQuery(tag => new HostCache(tag))
}
