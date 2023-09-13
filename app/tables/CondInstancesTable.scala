package tables
// AUTO-GENERATED Slick data model for table CondInstances
trait CondInstancesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table CondInstances
   *  @param NAME Database column NAME SqlType(VARCHAR), Length(128,true)
   *  @param OBJECT_INSTANCE_BEGIN Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED) */
  case class CondInstancesRow(NAME: String, OBJECT_INSTANCE_BEGIN: Long)
  /** GetResult implicit for fetching CondInstancesRow objects using plain SQL queries */
  implicit def GetResultCondInstancesRow(implicit e0: GR[String], e1: GR[Long]): GR[CondInstancesRow] = GR{
    prs => import prs._
    CondInstancesRow.tupled((<<[String], <<[Long]))
  }
  /** Table description of table cond_instances. Objects of this class serve as prototypes for rows in queries. */
  class CondInstances(_tableTag: Tag) extends profile.api.Table[CondInstancesRow](_tableTag, Some("performance_schema"), "cond_instances") {
    def * = (NAME, OBJECT_INSTANCE_BEGIN).<>(CondInstancesRow.tupled, CondInstancesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(NAME), Rep.Some(OBJECT_INSTANCE_BEGIN))).shaped.<>({r=>import r._; _1.map(_=> CondInstancesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column NAME SqlType(VARCHAR), Length(128,true) */
    val NAME: Rep[String] = column[String]("NAME", O.Length(128,varying=true))
    /** Database column OBJECT_INSTANCE_BEGIN SqlType(BIGINT UNSIGNED) */
    val OBJECT_INSTANCE_BEGIN: Rep[Long] = column[Long]("OBJECT_INSTANCE_BEGIN")
  }
  /** Collection-like TableQuery object for table CondInstances */
  lazy val CondInstances = new TableQuery(tag => new CondInstances(tag))
}
