package tables
// AUTO-GENERATED Slick data model for table SetupConsumers
trait SetupConsumersTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SetupConsumers
   *  @param NAME Database column NAME SqlType(VARCHAR), Length(64,true)
   *  @param ENABLED Database column ENABLED SqlType(ENUM), Length(3,true) */
  case class SetupConsumersRow(NAME: String, ENABLED: String)
  /** GetResult implicit for fetching SetupConsumersRow objects using plain SQL queries */
  implicit def GetResultSetupConsumersRow(implicit e0: GR[String]): GR[SetupConsumersRow] = GR{
    prs => import prs._
    SetupConsumersRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table setup_consumers. Objects of this class serve as prototypes for rows in queries. */
  class SetupConsumers(_tableTag: Tag) extends profile.api.Table[SetupConsumersRow](_tableTag, Some("performance_schema"), "setup_consumers") {
    def * = (NAME, ENABLED).<>(SetupConsumersRow.tupled, SetupConsumersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(NAME), Rep.Some(ENABLED))).shaped.<>({r=>import r._; _1.map(_=> SetupConsumersRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column NAME SqlType(VARCHAR), Length(64,true) */
    val NAME: Rep[String] = column[String]("NAME", O.Length(64,varying=true))
    /** Database column ENABLED SqlType(ENUM), Length(3,true) */
    val ENABLED: Rep[String] = column[String]("ENABLED", O.Length(3,varying=true))
  }
  /** Collection-like TableQuery object for table SetupConsumers */
  lazy val SetupConsumers = new TableQuery(tag => new SetupConsumers(tag))
}
