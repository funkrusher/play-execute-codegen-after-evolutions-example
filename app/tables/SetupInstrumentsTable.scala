package tables
// AUTO-GENERATED Slick data model for table SetupInstruments
trait SetupInstrumentsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SetupInstruments
   *  @param NAME Database column NAME SqlType(VARCHAR), Length(128,true)
   *  @param ENABLED Database column ENABLED SqlType(ENUM), Length(3,true)
   *  @param TIMED Database column TIMED SqlType(ENUM), Length(3,true) */
  case class SetupInstrumentsRow(NAME: String, ENABLED: String, TIMED: String)
  /** GetResult implicit for fetching SetupInstrumentsRow objects using plain SQL queries */
  implicit def GetResultSetupInstrumentsRow(implicit e0: GR[String]): GR[SetupInstrumentsRow] = GR{
    prs => import prs._
    SetupInstrumentsRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table setup_instruments. Objects of this class serve as prototypes for rows in queries. */
  class SetupInstruments(_tableTag: Tag) extends profile.api.Table[SetupInstrumentsRow](_tableTag, Some("performance_schema"), "setup_instruments") {
    def * = (NAME, ENABLED, TIMED).<>(SetupInstrumentsRow.tupled, SetupInstrumentsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(NAME), Rep.Some(ENABLED), Rep.Some(TIMED))).shaped.<>({r=>import r._; _1.map(_=> SetupInstrumentsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column NAME SqlType(VARCHAR), Length(128,true) */
    val NAME: Rep[String] = column[String]("NAME", O.Length(128,varying=true))
    /** Database column ENABLED SqlType(ENUM), Length(3,true) */
    val ENABLED: Rep[String] = column[String]("ENABLED", O.Length(3,varying=true))
    /** Database column TIMED SqlType(ENUM), Length(3,true) */
    val TIMED: Rep[String] = column[String]("TIMED", O.Length(3,varying=true))
  }
  /** Collection-like TableQuery object for table SetupInstruments */
  lazy val SetupInstruments = new TableQuery(tag => new SetupInstruments(tag))
}
