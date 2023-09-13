package tables
// AUTO-GENERATED Slick data model for table Pma_Navigationhiding
trait Pma_NavigationhidingTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Navigationhiding
   *  @param username Database column username SqlType(VARCHAR), Length(64,true)
   *  @param item_name Database column item_name SqlType(VARCHAR), Length(64,true)
   *  @param item_type Database column item_type SqlType(VARCHAR), Length(64,true)
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true)
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true) */
  case class Pma_NavigationhidingRow(username: String, item_name: String, item_type: String, db_name: String, table_name: String)
  /** GetResult implicit for fetching Pma_NavigationhidingRow objects using plain SQL queries */
  implicit def GetResultPma_NavigationhidingRow(implicit e0: GR[String]): GR[Pma_NavigationhidingRow] = GR{
    prs => import prs._
    Pma_NavigationhidingRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table pma__navigationhiding. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Navigationhiding(_tableTag: Tag) extends profile.api.Table[Pma_NavigationhidingRow](_tableTag, Some("phpmyadmin"), "pma__navigationhiding") {
    def * = (username, item_name, item_type, db_name, table_name).<>(Pma_NavigationhidingRow.tupled, Pma_NavigationhidingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(username), Rep.Some(item_name), Rep.Some(item_type), Rep.Some(db_name), Rep.Some(table_name))).shaped.<>({r=>import r._; _1.map(_=> Pma_NavigationhidingRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column username SqlType(VARCHAR), Length(64,true) */
    val username: Rep[String] = column[String]("username", O.Length(64,varying=true))
    /** Database column item_name SqlType(VARCHAR), Length(64,true) */
    val item_name: Rep[String] = column[String]("item_name", O.Length(64,varying=true))
    /** Database column item_type SqlType(VARCHAR), Length(64,true) */
    val item_type: Rep[String] = column[String]("item_type", O.Length(64,varying=true))
    /** Database column db_name SqlType(VARCHAR), Length(64,true) */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true))
    /** Database column table_name SqlType(VARCHAR), Length(64,true) */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true))

    /** Primary key of Pma_Navigationhiding (database name pma__navigationhiding_PK) */
    val pk = primaryKey("pma__navigationhiding_PK", (username, item_name, item_type, db_name, table_name))
  }
  /** Collection-like TableQuery object for table Pma_Navigationhiding */
  lazy val Pma_Navigationhiding = new TableQuery(tag => new Pma_Navigationhiding(tag))
}
