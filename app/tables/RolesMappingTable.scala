package tables
// AUTO-GENERATED Slick data model for table RolesMapping
trait RolesMappingTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table RolesMapping
   *  @param Host Database column Host SqlType(CHAR), Length(60,false), Default('')
   *  @param User Database column User SqlType(CHAR), Length(80,false), Default('')
   *  @param Role Database column Role SqlType(CHAR), Length(80,false), Default('')
   *  @param Admin_option Database column Admin_option SqlType(ENUM), Default(N) */
  case class RolesMappingRow(Host: String, User: String, Role: String, Admin_option: Char)
  /** GetResult implicit for fetching RolesMappingRow objects using plain SQL queries */
  implicit def GetResultRolesMappingRow(implicit e0: GR[String], e1: GR[Char]): GR[RolesMappingRow] = GR{
    prs => import prs._
    RolesMappingRow.tupled((<<[String], <<[String], <<[String], <<[Char]))
  }
  /** Table description of table roles_mapping. Objects of this class serve as prototypes for rows in queries. */
  class RolesMapping(_tableTag: Tag) extends profile.api.Table[RolesMappingRow](_tableTag, Some("mysql"), "roles_mapping") {
    def * = (Host, User, Role, Admin_option).<>(RolesMappingRow.tupled, RolesMappingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Host), Rep.Some(User), Rep.Some(Role), Rep.Some(Admin_option))).shaped.<>({r=>import r._; _1.map(_=> RolesMappingRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Host SqlType(CHAR), Length(60,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(60,varying=false), O.Default("''"))
    /** Database column User SqlType(CHAR), Length(80,false), Default('') */
    val User: Rep[String] = column[String]("User", O.Length(80,varying=false), O.Default("''"))
    /** Database column Role SqlType(CHAR), Length(80,false), Default('') */
    val Role: Rep[String] = column[String]("Role", O.Length(80,varying=false), O.Default("''"))
    /** Database column Admin_option SqlType(ENUM), Default(N) */
    val Admin_option: Rep[Char] = column[Char]("Admin_option", O.Default('N'))

    /** Uniqueness Index over (Host,User,Role) (database name Host) */
    val index1 = index("Host", (Host, User, Role), unique=true)
  }
  /** Collection-like TableQuery object for table RolesMapping */
  lazy val RolesMapping = new TableQuery(tag => new RolesMapping(tag))
}
