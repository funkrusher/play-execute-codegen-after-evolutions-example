package tables
// AUTO-GENERATED Slick data model for table Hosts
trait HostsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Hosts
   *  @param HOST Database column HOST SqlType(CHAR), Length(60,false), Default(Some(NULL))
   *  @param CURRENT_CONNECTIONS Database column CURRENT_CONNECTIONS SqlType(BIGINT)
   *  @param TOTAL_CONNECTIONS Database column TOTAL_CONNECTIONS SqlType(BIGINT) */
  case class HostsRow(HOST: Option[String], CURRENT_CONNECTIONS: Long, TOTAL_CONNECTIONS: Long)
  /** GetResult implicit for fetching HostsRow objects using plain SQL queries */
  implicit def GetResultHostsRow(implicit e0: GR[Option[String]], e1: GR[Long]): GR[HostsRow] = GR{
    prs => import prs._
    HostsRow.tupled((<<?[String], <<[Long], <<[Long]))
  }
  /** Table description of table hosts. Objects of this class serve as prototypes for rows in queries. */
  class Hosts(_tableTag: Tag) extends profile.api.Table[HostsRow](_tableTag, Some("performance_schema"), "hosts") {
    def * = (HOST, CURRENT_CONNECTIONS, TOTAL_CONNECTIONS).<>(HostsRow.tupled, HostsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((HOST, Rep.Some(CURRENT_CONNECTIONS), Rep.Some(TOTAL_CONNECTIONS))).shaped.<>({r=>import r._; _2.map(_=> HostsRow.tupled((_1, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column HOST SqlType(CHAR), Length(60,false), Default(Some(NULL)) */
    val HOST: Rep[Option[String]] = column[Option[String]]("HOST", O.Length(60,varying=false), O.Default(Some("NULL")))
    /** Database column CURRENT_CONNECTIONS SqlType(BIGINT) */
    val CURRENT_CONNECTIONS: Rep[Long] = column[Long]("CURRENT_CONNECTIONS")
    /** Database column TOTAL_CONNECTIONS SqlType(BIGINT) */
    val TOTAL_CONNECTIONS: Rep[Long] = column[Long]("TOTAL_CONNECTIONS")
  }
  /** Collection-like TableQuery object for table Hosts */
  lazy val Hosts = new TableQuery(tag => new Hosts(tag))
}
