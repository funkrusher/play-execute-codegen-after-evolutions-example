package tables
// AUTO-GENERATED Slick data model for table Accounts
trait AccountsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Accounts
   *  @param USER Database column USER SqlType(CHAR), Length(16,false), Default(Some(NULL))
   *  @param HOST Database column HOST SqlType(CHAR), Length(60,false), Default(Some(NULL))
   *  @param CURRENT_CONNECTIONS Database column CURRENT_CONNECTIONS SqlType(BIGINT)
   *  @param TOTAL_CONNECTIONS Database column TOTAL_CONNECTIONS SqlType(BIGINT) */
  case class AccountsRow(USER: Option[String], HOST: Option[String], CURRENT_CONNECTIONS: Long, TOTAL_CONNECTIONS: Long)
  /** GetResult implicit for fetching AccountsRow objects using plain SQL queries */
  implicit def GetResultAccountsRow(implicit e0: GR[Option[String]], e1: GR[Long]): GR[AccountsRow] = GR{
    prs => import prs._
    AccountsRow.tupled((<<?[String], <<?[String], <<[Long], <<[Long]))
  }
  /** Table description of table accounts. Objects of this class serve as prototypes for rows in queries. */
  class Accounts(_tableTag: Tag) extends profile.api.Table[AccountsRow](_tableTag, Some("performance_schema"), "accounts") {
    def * = (USER, HOST, CURRENT_CONNECTIONS, TOTAL_CONNECTIONS).<>(AccountsRow.tupled, AccountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((USER, HOST, Rep.Some(CURRENT_CONNECTIONS), Rep.Some(TOTAL_CONNECTIONS))).shaped.<>({r=>import r._; _3.map(_=> AccountsRow.tupled((_1, _2, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column USER SqlType(CHAR), Length(16,false), Default(Some(NULL)) */
    val USER: Rep[Option[String]] = column[Option[String]]("USER", O.Length(16,varying=false), O.Default(Some("NULL")))
    /** Database column HOST SqlType(CHAR), Length(60,false), Default(Some(NULL)) */
    val HOST: Rep[Option[String]] = column[Option[String]]("HOST", O.Length(60,varying=false), O.Default(Some("NULL")))
    /** Database column CURRENT_CONNECTIONS SqlType(BIGINT) */
    val CURRENT_CONNECTIONS: Rep[Long] = column[Long]("CURRENT_CONNECTIONS")
    /** Database column TOTAL_CONNECTIONS SqlType(BIGINT) */
    val TOTAL_CONNECTIONS: Rep[Long] = column[Long]("TOTAL_CONNECTIONS")
  }
  /** Collection-like TableQuery object for table Accounts */
  lazy val Accounts = new TableQuery(tag => new Accounts(tag))
}
