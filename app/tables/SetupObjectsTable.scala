package tables
// AUTO-GENERATED Slick data model for table SetupObjects
trait SetupObjectsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table SetupObjects
   *  @param OBJECT_TYPE Database column OBJECT_TYPE SqlType(ENUM), Length(5,true), Default('TABLE')
   *  @param OBJECT_SCHEMA Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some('%'))
   *  @param OBJECT_NAME Database column OBJECT_NAME SqlType(VARCHAR), Length(64,true), Default('%')
   *  @param ENABLED Database column ENABLED SqlType(ENUM), Length(3,true), Default('YES')
   *  @param TIMED Database column TIMED SqlType(ENUM), Length(3,true), Default('YES') */
  case class SetupObjectsRow(OBJECT_TYPE: String, OBJECT_SCHEMA: Option[String], OBJECT_NAME: String, ENABLED: String, TIMED: String)
  /** GetResult implicit for fetching SetupObjectsRow objects using plain SQL queries */
  implicit def GetResultSetupObjectsRow(implicit e0: GR[String], e1: GR[Option[String]]): GR[SetupObjectsRow] = GR{
    prs => import prs._
    SetupObjectsRow.tupled((<<[String], <<?[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table setup_objects. Objects of this class serve as prototypes for rows in queries. */
  class SetupObjects(_tableTag: Tag) extends profile.api.Table[SetupObjectsRow](_tableTag, Some("performance_schema"), "setup_objects") {
    def * = (OBJECT_TYPE, OBJECT_SCHEMA, OBJECT_NAME, ENABLED, TIMED).<>(SetupObjectsRow.tupled, SetupObjectsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(OBJECT_TYPE), OBJECT_SCHEMA, Rep.Some(OBJECT_NAME), Rep.Some(ENABLED), Rep.Some(TIMED))).shaped.<>({r=>import r._; _1.map(_=> SetupObjectsRow.tupled((_1.get, _2, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column OBJECT_TYPE SqlType(ENUM), Length(5,true), Default('TABLE') */
    val OBJECT_TYPE: Rep[String] = column[String]("OBJECT_TYPE", O.Length(5,varying=true), O.Default("'TABLE'"))
    /** Database column OBJECT_SCHEMA SqlType(VARCHAR), Length(64,true), Default(Some('%')) */
    val OBJECT_SCHEMA: Rep[Option[String]] = column[Option[String]]("OBJECT_SCHEMA", O.Length(64,varying=true), O.Default(Some("'%'")))
    /** Database column OBJECT_NAME SqlType(VARCHAR), Length(64,true), Default('%') */
    val OBJECT_NAME: Rep[String] = column[String]("OBJECT_NAME", O.Length(64,varying=true), O.Default("'%'"))
    /** Database column ENABLED SqlType(ENUM), Length(3,true), Default('YES') */
    val ENABLED: Rep[String] = column[String]("ENABLED", O.Length(3,varying=true), O.Default("'YES'"))
    /** Database column TIMED SqlType(ENUM), Length(3,true), Default('YES') */
    val TIMED: Rep[String] = column[String]("TIMED", O.Length(3,varying=true), O.Default("'YES'"))
  }
  /** Collection-like TableQuery object for table SetupObjects */
  lazy val SetupObjects = new TableQuery(tag => new SetupObjects(tag))
}
