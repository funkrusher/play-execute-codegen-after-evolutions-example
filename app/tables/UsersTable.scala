package tables
// AUTO-GENERATED Slick data model for table Users
trait UsersTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Users
   *  @param USER Database column USER SqlType(CHAR), Length(16,false), Default(Some(NULL))
   *  @param CURRENT_CONNECTIONS Database column CURRENT_CONNECTIONS SqlType(BIGINT)
   *  @param TOTAL_CONNECTIONS Database column TOTAL_CONNECTIONS SqlType(BIGINT) */
  case class UsersRow(USER: Option[String], CURRENT_CONNECTIONS: Long, TOTAL_CONNECTIONS: Long)
  /** GetResult implicit for fetching UsersRow objects using plain SQL queries */
  implicit def GetResultUsersRow(implicit e0: GR[Option[String]], e1: GR[Long]): GR[UsersRow] = GR{
    prs => import prs._
    UsersRow.tupled((<<?[String], <<[Long], <<[Long]))
  }
  /** Table description of table users. Objects of this class serve as prototypes for rows in queries. */
  class Users(_tableTag: Tag) extends profile.api.Table[UsersRow](_tableTag, Some("performance_schema"), "users") {
    def * = (USER, CURRENT_CONNECTIONS, TOTAL_CONNECTIONS).<>(UsersRow.tupled, UsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((USER, Rep.Some(CURRENT_CONNECTIONS), Rep.Some(TOTAL_CONNECTIONS))).shaped.<>({r=>import r._; _2.map(_=> UsersRow.tupled((_1, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column USER SqlType(CHAR), Length(16,false), Default(Some(NULL)) */
    val USER: Rep[Option[String]] = column[Option[String]]("USER", O.Length(16,varying=false), O.Default(Some("NULL")))
    /** Database column CURRENT_CONNECTIONS SqlType(BIGINT) */
    val CURRENT_CONNECTIONS: Rep[Long] = column[Long]("CURRENT_CONNECTIONS")
    /** Database column TOTAL_CONNECTIONS SqlType(BIGINT) */
    val TOTAL_CONNECTIONS: Rep[Long] = column[Long]("TOTAL_CONNECTIONS")
  }
  /** Collection-like TableQuery object for table Users */
  lazy val Users = new TableQuery(tag => new Users(tag))
}
