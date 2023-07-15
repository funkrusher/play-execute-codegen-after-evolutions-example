package tables
// AUTO-GENERATED Slick data model for table UserRole
trait UserRoleTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table UserRole
   *  @param userId Database column userId SqlType(INT)
   *  @param roleId Database column roleId SqlType(VARCHAR), Length(50,true) */
  case class UserRoleRow(userId: Int, roleId: String)
  /** GetResult implicit for fetching UserRoleRow objects using plain SQL queries */
  implicit def GetResultUserRoleRow(implicit e0: GR[Int], e1: GR[String]): GR[UserRoleRow] = GR{
    prs => import prs._
    UserRoleRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table user_role. Objects of this class serve as prototypes for rows in queries. */
  class UserRole(_tableTag: Tag) extends profile.api.Table[UserRoleRow](_tableTag, Some("codegen1"), "user_role") {
    def * = (userId, roleId) <> (UserRoleRow.tupled, UserRoleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(userId), Rep.Some(roleId))).shaped.<>({r=>import r._; _1.map(_=> UserRoleRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column userId SqlType(INT) */
    val userId: Rep[Int] = column[Int]("userId")
    /** Database column roleId SqlType(VARCHAR), Length(50,true) */
    val roleId: Rep[String] = column[String]("roleId", O.Length(50,varying=true))

    /** Primary key of UserRole (database name user_role_PK) */
    val pk = primaryKey("user_role_PK", (userId, roleId))

    /** Foreign key referencing Role (database name fk_user_role_roleId) */
    lazy val roleFk = foreignKey("fk_user_role_roleId", roleId, Role)(r => r.roleId, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
    /** Foreign key referencing User (database name fk_user_role_userId) */
    lazy val userFk = foreignKey("fk_user_role_userId", userId, User)(r => r.userId, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table UserRole */
  implicit class UserRoleRowExtension[C[_]](q: Query[UserRole, UserRoleRow, C]) {
    def roles = q.join(Role).on(_.roleId === _.roleId).map(_._2)
    def users = q.join(User).on(_.userId === _.userId).map(_._2)
  }

  lazy val UserRole = new TableQuery(tag => new UserRole(tag))
}
