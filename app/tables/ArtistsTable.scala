package tables
// AUTO-GENERATED Slick data model for table Artists
trait ArtistsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Artists
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param name Database column name SqlType(TEXT), Default(Some(NULL)) */
  case class ArtistsRow(id: Int, name: Option[String])
  /** GetResult implicit for fetching ArtistsRow objects using plain SQL queries */
  implicit def GetResultArtistsRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[ArtistsRow] = GR{
    prs => import prs._
    ArtistsRow.tupled((<<[Int], <<?[String]))
  }
  /** Table description of table artists. Objects of this class serve as prototypes for rows in queries. */
  class Artists(_tableTag: Tag) extends profile.api.Table[ArtistsRow](_tableTag, Some("test"), "artists") {
    def * = (id, name).<>(ArtistsRow.tupled, ArtistsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), name)).shaped.<>({r=>import r._; _1.map(_=> ArtistsRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column name SqlType(TEXT), Default(Some(NULL)) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table Artists */
  lazy val Artists = new TableQuery(tag => new Artists(tag))
}
