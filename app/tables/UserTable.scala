package tables
// AUTO-GENERATED Slick data model for table User
trait UserTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table User
   *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
   *  @param email Database column email SqlType(VARCHAR), Length(255,true)
   *  @param password Database column password SqlType(VARCHAR), Length(255,true)
   *  @param fullname Database column fullname SqlType(VARCHAR), Length(255,true)
   *  @param isAdmin Database column isAdmin SqlType(INT) */
  case class UserRow(id: Long, email: String, password: String, fullname: String, isAdmin: Int)
  /** GetResult implicit for fetching UserRow objects using plain SQL queries */
  implicit def GetResultUserRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int]): GR[UserRow] = GR{
    prs => import prs._
    UserRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table user. Objects of this class serve as prototypes for rows in queries. */
  class User(_tableTag: Tag) extends profile.api.Table[UserRow](_tableTag, Some("codegen1"), "user") {
    def * = (id, email, password, fullname, isAdmin) <> (UserRow.tupled, UserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(email), Rep.Some(password), Rep.Some(fullname), Rep.Some(isAdmin))).shaped.<>({r=>import r._; _1.map(_=> UserRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column email SqlType(VARCHAR), Length(255,true) */
    val email: Rep[String] = column[String]("email", O.Length(255,varying=true))
    /** Database column password SqlType(VARCHAR), Length(255,true) */
    val password: Rep[String] = column[String]("password", O.Length(255,varying=true))
    /** Database column fullname SqlType(VARCHAR), Length(255,true) */
    val fullname: Rep[String] = column[String]("fullname", O.Length(255,varying=true))
    /** Database column isAdmin SqlType(INT) */
    val isAdmin: Rep[Int] = column[Int]("isAdmin")
  }
  /** Collection-like TableQuery object for table User */
  lazy val User = new TableQuery(tag => new User(tag))
}
