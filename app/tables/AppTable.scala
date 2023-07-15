package tables

// AUTO-GENERATED Slick data model for table App
trait AppTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table App
   *  @param testdataReady Database column testdataReady SqlType(BIT), Default(false) */
  case class AppRow(testdataReady: Boolean = false)
  /** GetResult implicit for fetching AppRow objects using plain SQL queries */
  implicit def GetResultAppRow(implicit e0: GR[Boolean]): GR[AppRow] = GR{
    prs => import prs._
    AppRow(<<[Boolean])
  }
  /** Table description of table app. Objects of this class serve as prototypes for rows in queries. */
  class App(_tableTag: Tag) extends profile.api.Table[AppRow](_tableTag, Some("codegen1"), "app") {
    def * = testdataReady <> (AppRow, AppRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(testdataReady)).shaped.<>(r => r.map(_=> AppRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column testdataReady SqlType(BIT), Default(false) */
    val testdataReady: Rep[Boolean] = column[Boolean]("testdataReady", O.Default(false))
  }
  /** Collection-like TableQuery object for table App */
  lazy val App = new TableQuery(tag => new App(tag))
}
