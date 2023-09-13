package tables
// AUTO-GENERATED Slick data model for table SetupActors
trait SetupActorsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SetupActors
   *  @param HOST Database column HOST SqlType(CHAR), Length(60,false), Default('%')
   *  @param USER Database column USER SqlType(CHAR), Length(16,false), Default('%')
   *  @param ROLE Database column ROLE SqlType(CHAR), Length(16,false), Default('%') */
  case class SetupActorsRow(HOST: String, USER: String, ROLE: String)
  /** GetResult implicit for fetching SetupActorsRow objects using plain SQL queries */
  implicit def GetResultSetupActorsRow(implicit e0: GR[String]): GR[SetupActorsRow] = GR{
    prs => import prs._
    SetupActorsRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table setup_actors. Objects of this class serve as prototypes for rows in queries. */
  class SetupActors(_tableTag: Tag) extends profile.api.Table[SetupActorsRow](_tableTag, Some("performance_schema"), "setup_actors") {
    def * = (HOST, USER, ROLE).<>(SetupActorsRow.tupled, SetupActorsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(HOST), Rep.Some(USER), Rep.Some(ROLE))).shaped.<>({r=>import r._; _1.map(_=> SetupActorsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column HOST SqlType(CHAR), Length(60,false), Default('%') */
    val HOST: Rep[String] = column[String]("HOST", O.Length(60,varying=false), O.Default("'%'"))
    /** Database column USER SqlType(CHAR), Length(16,false), Default('%') */
    val USER: Rep[String] = column[String]("USER", O.Length(16,varying=false), O.Default("'%'"))
    /** Database column ROLE SqlType(CHAR), Length(16,false), Default('%') */
    val ROLE: Rep[String] = column[String]("ROLE", O.Length(16,varying=false), O.Default("'%'"))
  }
  /** Collection-like TableQuery object for table SetupActors */
  lazy val SetupActors = new TableQuery(tag => new SetupActors(tag))
}
