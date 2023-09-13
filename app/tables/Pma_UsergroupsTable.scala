package tables
// AUTO-GENERATED Slick data model for table Pma_Usergroups
trait Pma_UsergroupsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Usergroups
   *  @param usergroup Database column usergroup SqlType(VARCHAR), Length(64,true)
   *  @param tab Database column tab SqlType(VARCHAR), Length(64,true)
   *  @param allowed Database column allowed SqlType(ENUM), Default(N) */
  case class Pma_UsergroupsRow(usergroup: String, tab: String, allowed: Char)
  /** GetResult implicit for fetching Pma_UsergroupsRow objects using plain SQL queries */
  implicit def GetResultPma_UsergroupsRow(implicit e0: GR[String], e1: GR[Char]): GR[Pma_UsergroupsRow] = GR{
    prs => import prs._
    Pma_UsergroupsRow.tupled((<<[String], <<[String], <<[Char]))
  }
  /** Table description of table pma__usergroups. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Usergroups(_tableTag: Tag) extends profile.api.Table[Pma_UsergroupsRow](_tableTag, Some("phpmyadmin"), "pma__usergroups") {
    def * = (usergroup, tab, allowed).<>(Pma_UsergroupsRow.tupled, Pma_UsergroupsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(usergroup), Rep.Some(tab), Rep.Some(allowed))).shaped.<>({r=>import r._; _1.map(_=> Pma_UsergroupsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column usergroup SqlType(VARCHAR), Length(64,true) */
    val usergroup: Rep[String] = column[String]("usergroup", O.Length(64,varying=true))
    /** Database column tab SqlType(VARCHAR), Length(64,true) */
    val tab: Rep[String] = column[String]("tab", O.Length(64,varying=true))
    /** Database column allowed SqlType(ENUM), Default(N) */
    val allowed: Rep[Char] = column[Char]("allowed", O.Default('N'))

    /** Primary key of Pma_Usergroups (database name pma__usergroups_PK) */
    val pk = primaryKey("pma__usergroups_PK", (usergroup, tab, allowed))
  }
  /** Collection-like TableQuery object for table Pma_Usergroups */
  lazy val Pma_Usergroups = new TableQuery(tag => new Pma_Usergroups(tag))
}
