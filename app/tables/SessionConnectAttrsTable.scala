package tables
// AUTO-GENERATED Slick data model for table SessionConnectAttrs
trait SessionConnectAttrsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SessionConnectAttrs
   *  @param PROCESSLIST_ID Database column PROCESSLIST_ID SqlType(INT)
   *  @param ATTR_NAME Database column ATTR_NAME SqlType(VARCHAR), Length(32,true)
   *  @param ATTR_VALUE Database column ATTR_VALUE SqlType(VARCHAR), Length(1024,true), Default(Some(NULL))
   *  @param ORDINAL_POSITION Database column ORDINAL_POSITION SqlType(INT), Default(None) */
  case class SessionConnectAttrsRow(PROCESSLIST_ID: Int, ATTR_NAME: String, ATTR_VALUE: Option[String], ORDINAL_POSITION: Option[Int])
  /** GetResult implicit for fetching SessionConnectAttrsRow objects using plain SQL queries */
  implicit def GetResultSessionConnectAttrsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Int]]): GR[SessionConnectAttrsRow] = GR{
    prs => import prs._
    SessionConnectAttrsRow.tupled((<<[Int], <<[String], <<?[String], <<?[Int]))
  }
  /** Table description of table session_connect_attrs. Objects of this class serve as prototypes for rows in queries. */
  class SessionConnectAttrs(_tableTag: Tag) extends profile.api.Table[SessionConnectAttrsRow](_tableTag, Some("performance_schema"), "session_connect_attrs") {
    def * = (PROCESSLIST_ID, ATTR_NAME, ATTR_VALUE, ORDINAL_POSITION).<>(SessionConnectAttrsRow.tupled, SessionConnectAttrsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(PROCESSLIST_ID), Rep.Some(ATTR_NAME), ATTR_VALUE, ORDINAL_POSITION)).shaped.<>({r=>import r._; _1.map(_=> SessionConnectAttrsRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column PROCESSLIST_ID SqlType(INT) */
    val PROCESSLIST_ID: Rep[Int] = column[Int]("PROCESSLIST_ID")
    /** Database column ATTR_NAME SqlType(VARCHAR), Length(32,true) */
    val ATTR_NAME: Rep[String] = column[String]("ATTR_NAME", O.Length(32,varying=true))
    /** Database column ATTR_VALUE SqlType(VARCHAR), Length(1024,true), Default(Some(NULL)) */
    val ATTR_VALUE: Rep[Option[String]] = column[Option[String]]("ATTR_VALUE", O.Length(1024,varying=true), O.Default(Some("NULL")))
    /** Database column ORDINAL_POSITION SqlType(INT), Default(None) */
    val ORDINAL_POSITION: Rep[Option[Int]] = column[Option[Int]]("ORDINAL_POSITION", O.Default(None))
  }
  /** Collection-like TableQuery object for table SessionConnectAttrs */
  lazy val SessionConnectAttrs = new TableQuery(tag => new SessionConnectAttrs(tag))
}
