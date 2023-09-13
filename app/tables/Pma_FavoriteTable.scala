package tables
// AUTO-GENERATED Slick data model for table Pma_Favorite
trait Pma_FavoriteTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Favorite
   *  @param username Database column username SqlType(VARCHAR), PrimaryKey, Length(64,true)
   *  @param tables Database column tables SqlType(TEXT) */
  case class Pma_FavoriteRow(username: String, tables: String)
  /** GetResult implicit for fetching Pma_FavoriteRow objects using plain SQL queries */
  implicit def GetResultPma_FavoriteRow(implicit e0: GR[String]): GR[Pma_FavoriteRow] = GR{
    prs => import prs._
    Pma_FavoriteRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table pma__favorite. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Favorite(_tableTag: Tag) extends profile.api.Table[Pma_FavoriteRow](_tableTag, Some("phpmyadmin"), "pma__favorite") {
    def * = (username, tables).<>(Pma_FavoriteRow.tupled, Pma_FavoriteRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(username), Rep.Some(tables))).shaped.<>({r=>import r._; _1.map(_=> Pma_FavoriteRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column username SqlType(VARCHAR), PrimaryKey, Length(64,true) */
    val username: Rep[String] = column[String]("username", O.PrimaryKey, O.Length(64,varying=true))
    /** Database column tables SqlType(TEXT) */
    val tables: Rep[String] = column[String]("tables")
  }
  /** Collection-like TableQuery object for table Pma_Favorite */
  lazy val Pma_Favorite = new TableQuery(tag => new Pma_Favorite(tag))
}
