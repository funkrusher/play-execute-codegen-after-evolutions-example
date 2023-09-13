package tables
// AUTO-GENERATED Slick data model for table SetupTimers
trait SetupTimersTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SetupTimers
   *  @param NAME Database column NAME SqlType(VARCHAR), Length(64,true)
   *  @param TIMER_NAME Database column TIMER_NAME SqlType(ENUM), Length(11,true) */
  case class SetupTimersRow(NAME: String, TIMER_NAME: String)
  /** GetResult implicit for fetching SetupTimersRow objects using plain SQL queries */
  implicit def GetResultSetupTimersRow(implicit e0: GR[String]): GR[SetupTimersRow] = GR{
    prs => import prs._
    SetupTimersRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table setup_timers. Objects of this class serve as prototypes for rows in queries. */
  class SetupTimers(_tableTag: Tag) extends profile.api.Table[SetupTimersRow](_tableTag, Some("performance_schema"), "setup_timers") {
    def * = (NAME, TIMER_NAME).<>(SetupTimersRow.tupled, SetupTimersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(NAME), Rep.Some(TIMER_NAME))).shaped.<>({r=>import r._; _1.map(_=> SetupTimersRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column NAME SqlType(VARCHAR), Length(64,true) */
    val NAME: Rep[String] = column[String]("NAME", O.Length(64,varying=true))
    /** Database column TIMER_NAME SqlType(ENUM), Length(11,true) */
    val TIMER_NAME: Rep[String] = column[String]("TIMER_NAME", O.Length(11,varying=true))
  }
  /** Collection-like TableQuery object for table SetupTimers */
  lazy val SetupTimers = new TableQuery(tag => new SetupTimers(tag))
}
