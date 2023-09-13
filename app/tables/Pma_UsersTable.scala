package tables
// AUTO-GENERATED Slick data model for table Pma_Users
trait Pma_UsersTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Users
   *  @param username Database column username SqlType(VARCHAR), Length(64,true)
   *  @param usergroup Database column usergroup SqlType(VARCHAR), Length(64,true) */
  case class Pma_UsersRow(username: String, usergroup: String)
  /** GetResult implicit for fetching Pma_UsersRow objects using plain SQL queries */
  implicit def GetResultPma_UsersRow(implicit e0: GR[String]): GR[Pma_UsersRow] = GR{
    prs => import prs._
    Pma_UsersRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table pma__users. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Users(_tableTag: Tag) extends profile.api.Table[Pma_UsersRow](_tableTag, Some("phpmyadmin"), "pma__users") {
    def * = (username, usergroup).<>(Pma_UsersRow.tupled, Pma_UsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(username), Rep.Some(usergroup))).shaped.<>({r=>import r._; _1.map(_=> Pma_UsersRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column username SqlType(VARCHAR), Length(64,true) */
    val username: Rep[String] = column[String]("username", O.Length(64,varying=true))
    /** Database column usergroup SqlType(VARCHAR), Length(64,true) */
    val usergroup: Rep[String] = column[String]("usergroup", O.Length(64,varying=true))

    /** Primary key of Pma_Users (database name pma__users_PK) */
    val pk = primaryKey("pma__users_PK", (username, usergroup))
  }
  /** Collection-like TableQuery object for table Pma_Users */
  lazy val Pma_Users = new TableQuery(tag => new Pma_Users(tag))
}
