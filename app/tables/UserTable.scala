package tables
// AUTO-GENERATED Slick data model for table User
trait UserTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table User
   *  @param userId Database column userId SqlType(INT), AutoInc, PrimaryKey
   *  @param clientId Database column clientId SqlType(INT)
   *  @param email Database column email SqlType(VARCHAR), Length(255,true)
   *  @param firstname Database column firstname SqlType(VARCHAR), Length(255,true)
   *  @param lastname Database column lastname SqlType(VARCHAR), Length(255,true)
   *  @param isAdmin Database column isAdmin SqlType(INT) */
  case class UserRow(userId: Int, clientId: Int, email: String, firstname: String, lastname: String, isAdmin: Int)
  /** GetResult implicit for fetching UserRow objects using plain SQL queries */
  implicit def GetResultUserRow(implicit e0: GR[Int], e1: GR[String]): GR[UserRow] = GR{
    prs => import prs._
    UserRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table user. Objects of this class serve as prototypes for rows in queries. */
  class User(_tableTag: Tag) extends profile.api.Table[UserRow](_tableTag, Some("codegen1"), "user") {
    def * = (userId, clientId, email, firstname, lastname, isAdmin) <> (UserRow.tupled, UserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(userId), Rep.Some(clientId), Rep.Some(email), Rep.Some(firstname), Rep.Some(lastname), Rep.Some(isAdmin))).shaped.<>({r=>import r._; _1.map(_=> UserRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column userId SqlType(INT), AutoInc, PrimaryKey */
    val userId: Rep[Int] = column[Int]("userId", O.AutoInc, O.PrimaryKey)
    /** Database column clientId SqlType(INT) */
    val clientId: Rep[Int] = column[Int]("clientId")
    /** Database column email SqlType(VARCHAR), Length(255,true) */
    val email: Rep[String] = column[String]("email", O.Length(255,varying=true))
    /** Database column firstname SqlType(VARCHAR), Length(255,true) */
    val firstname: Rep[String] = column[String]("firstname", O.Length(255,varying=true))
    /** Database column lastname SqlType(VARCHAR), Length(255,true) */
    val lastname: Rep[String] = column[String]("lastname", O.Length(255,varying=true))
    /** Database column isAdmin SqlType(INT) */
    val isAdmin: Rep[Int] = column[Int]("isAdmin")

    /** Foreign key referencing Client (database name fk_user_clientId) */
    lazy val clientFk = foreignKey("fk_user_clientId", clientId, Client)(r => r.clientId, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table User */
  implicit class UserRowExtension[C[_]](q: Query[User, UserRow, C]) {
  
    def clients = q.join(TableQuery[Client]).on((_.clientId === _.clientId)).map(_._2)

  
    def clients_users(implicit q: Query[Client, ClientRow, Seq]): Query[User, UserRow, Seq] =
      q.join(TableQuery[User]).on((_.clientId === _.clientId)).map(_._2)

  }

  lazy val User = new TableQuery(tag => new User(tag))
}
