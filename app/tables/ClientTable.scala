package tables
// AUTO-GENERATED Slick data model for table Client
trait ClientTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Client
   *  @param clientId Database column clientId SqlType(INT), AutoInc, PrimaryKey */
  case class ClientRow(clientId: Int)
  /** GetResult implicit for fetching ClientRow objects using plain SQL queries */
  implicit def GetResultClientRow(implicit e0: GR[Int]): GR[ClientRow] = GR{
    prs => import prs._
    ClientRow(<<[Int])
  }
  /** Table description of table client. Objects of this class serve as prototypes for rows in queries. */
  class Client(_tableTag: Tag) extends profile.api.Table[ClientRow](_tableTag, Some("codegen1"), "client") {
    def * = clientId <> (ClientRow, ClientRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(clientId)).shaped.<>(r => r.map(_=> ClientRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column clientId SqlType(INT), AutoInc, PrimaryKey */
    val clientId: Rep[Int] = column[Int]("clientId", O.AutoInc, O.PrimaryKey)
  }
  /** Collection-like TableQuery object for table Client */
  lazy val Client = new TableQuery(tag => new Client(tag))
}
