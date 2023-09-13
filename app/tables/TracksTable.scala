package tables
// AUTO-GENERATED Slick data model for table Tracks
trait TracksTable {

  self:TablesRoot with ArtistsTable  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Tracks
   *  @param traid Database column traid SqlType(INT), Default(None)
   *  @param title Database column title SqlType(TEXT), Default(Some(NULL))
   *  @param artist Database column artist SqlType(INT), Default(None) */
  case class TracksRow(traid: Option[Int], title: Option[String], artist: Option[Int])
  /** GetResult implicit for fetching TracksRow objects using plain SQL queries */
  implicit def GetResultTracksRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]]): GR[TracksRow] = GR{
    prs => import prs._
    TracksRow.tupled((<<?[Int], <<?[String], <<?[Int]))
  }
  /** Table description of table tracks. Objects of this class serve as prototypes for rows in queries. */
  class Tracks(_tableTag: Tag) extends profile.api.Table[TracksRow](_tableTag, Some("test"), "tracks") {
    def * = (traid, title, artist).<>(TracksRow.tupled, TracksRow.unapply)

    /** Database column traid SqlType(INT), Default(None) */
    val traid: Rep[Option[Int]] = column[Option[Int]]("traid", O.Default(None))
    /** Database column title SqlType(TEXT), Default(Some(NULL)) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Default(Some("NULL")))
    /** Database column artist SqlType(INT), Default(None) */
    val artist: Rep[Option[Int]] = column[Option[Int]]("artist", O.Default(None))

    /** Foreign key referencing Artists (database name tracks_ibfk_1) */
    lazy val artistsFk = foreignKey("tracks_ibfk_1", artist, Artists)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table Tracks */
  lazy val Tracks = new TableQuery(tag => new Tracks(tag))
}
