package tables
// AUTO-GENERATED Slick data model for table Role
trait RoleTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Role
   *  @param roleId Database column roleId SqlType(VARCHAR), PrimaryKey, Length(50,true) */
  case class RoleRow(roleId: String)
  /** GetResult implicit for fetching RoleRow objects using plain SQL queries */
  implicit def GetResultRoleRow(implicit e0: GR[String]): GR[RoleRow] = GR{
    prs => import prs._
    RoleRow(<<[String])
  }
  /** Table description of table role. Objects of this class serve as prototypes for rows in queries. */
  class Role(_tableTag: Tag) extends profile.api.Table[RoleRow](_tableTag, Some("testshop"), "role") {
    def * = roleId.<>(RoleRow, RoleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(roleId)).shaped.<>(r => r.map(_=> RoleRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column roleId SqlType(VARCHAR), PrimaryKey, Length(50,true) */
    val roleId: Rep[String] = column[String]("roleId", O.PrimaryKey, O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table Role */
  lazy val Role = new TableQuery(tag => new Role(tag))
}
