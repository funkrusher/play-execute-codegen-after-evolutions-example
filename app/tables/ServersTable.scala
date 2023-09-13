package tables
// AUTO-GENERATED Slick data model for table Servers
trait ServersTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Servers
   *  @param Server_name Database column Server_name SqlType(CHAR), PrimaryKey, Length(64,false), Default('')
   *  @param Host Database column Host SqlType(CHAR), Length(64,false), Default('')
   *  @param Db Database column Db SqlType(CHAR), Length(64,false), Default('')
   *  @param Username Database column Username SqlType(CHAR), Length(80,false), Default('')
   *  @param Password Database column Password SqlType(CHAR), Length(64,false), Default('')
   *  @param Port Database column Port SqlType(INT), Default(0)
   *  @param Socket Database column Socket SqlType(CHAR), Length(64,false), Default('')
   *  @param Wrapper Database column Wrapper SqlType(CHAR), Length(64,false), Default('')
   *  @param Owner Database column Owner SqlType(CHAR), Length(64,false), Default('') */
  case class ServersRow(Server_name: String, Host: String, Db: String, Username: String, Password: String, Port: Int, Socket: String, Wrapper: String, Owner: String)
  /** GetResult implicit for fetching ServersRow objects using plain SQL queries */
  implicit def GetResultServersRow(implicit e0: GR[String], e1: GR[Int]): GR[ServersRow] = GR{
    prs => import prs._
    ServersRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[String], <<[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table servers. Objects of this class serve as prototypes for rows in queries. */
  class Servers(_tableTag: Tag) extends profile.api.Table[ServersRow](_tableTag, Some("mysql"), "servers") {
    def * = (Server_name, Host, Db, Username, Password, Port, Socket, Wrapper, Owner).<>(ServersRow.tupled, ServersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(Server_name), Rep.Some(Host), Rep.Some(Db), Rep.Some(Username), Rep.Some(Password), Rep.Some(Port), Rep.Some(Socket), Rep.Some(Wrapper), Rep.Some(Owner))).shaped.<>({r=>import r._; _1.map(_=> ServersRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Server_name SqlType(CHAR), PrimaryKey, Length(64,false), Default('') */
    val Server_name: Rep[String] = column[String]("Server_name", O.PrimaryKey, O.Length(64,varying=false), O.Default("''"))
    /** Database column Host SqlType(CHAR), Length(64,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(64,varying=false), O.Default("''"))
    /** Database column Db SqlType(CHAR), Length(64,false), Default('') */
    val Db: Rep[String] = column[String]("Db", O.Length(64,varying=false), O.Default("''"))
    /** Database column Username SqlType(CHAR), Length(80,false), Default('') */
    val Username: Rep[String] = column[String]("Username", O.Length(80,varying=false), O.Default("''"))
    /** Database column Password SqlType(CHAR), Length(64,false), Default('') */
    val Password: Rep[String] = column[String]("Password", O.Length(64,varying=false), O.Default("''"))
    /** Database column Port SqlType(INT), Default(0) */
    val Port: Rep[Int] = column[Int]("Port", O.Default(0))
    /** Database column Socket SqlType(CHAR), Length(64,false), Default('') */
    val Socket: Rep[String] = column[String]("Socket", O.Length(64,varying=false), O.Default("''"))
    /** Database column Wrapper SqlType(CHAR), Length(64,false), Default('') */
    val Wrapper: Rep[String] = column[String]("Wrapper", O.Length(64,varying=false), O.Default("''"))
    /** Database column Owner SqlType(CHAR), Length(64,false), Default('') */
    val Owner: Rep[String] = column[String]("Owner", O.Length(64,varying=false), O.Default("''"))
  }
  /** Collection-like TableQuery object for table Servers */
  lazy val Servers = new TableQuery(tag => new Servers(tag))
}
