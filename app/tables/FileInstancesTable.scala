package tables
// AUTO-GENERATED Slick data model for table FileInstances
trait FileInstancesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table FileInstances
   *  @param FILE_NAME Database column FILE_NAME SqlType(VARCHAR), Length(512,true)
   *  @param EVENT_NAME Database column EVENT_NAME SqlType(VARCHAR), Length(128,true)
   *  @param OPEN_COUNT Database column OPEN_COUNT SqlType(INT UNSIGNED) */
  case class FileInstancesRow(FILE_NAME: String, EVENT_NAME: String, OPEN_COUNT: Long)
  /** GetResult implicit for fetching FileInstancesRow objects using plain SQL queries */
  implicit def GetResultFileInstancesRow(implicit e0: GR[String], e1: GR[Long]): GR[FileInstancesRow] = GR{
    prs => import prs._
    FileInstancesRow.tupled((<<[String], <<[String], <<[Long]))
  }
  /** Table description of table file_instances. Objects of this class serve as prototypes for rows in queries. */
  class FileInstances(_tableTag: Tag) extends profile.api.Table[FileInstancesRow](_tableTag, Some("performance_schema"), "file_instances") {
    def * = (FILE_NAME, EVENT_NAME, OPEN_COUNT).<>(FileInstancesRow.tupled, FileInstancesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(FILE_NAME), Rep.Some(EVENT_NAME), Rep.Some(OPEN_COUNT))).shaped.<>({r=>import r._; _1.map(_=> FileInstancesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column FILE_NAME SqlType(VARCHAR), Length(512,true) */
    val FILE_NAME: Rep[String] = column[String]("FILE_NAME", O.Length(512,varying=true))
    /** Database column EVENT_NAME SqlType(VARCHAR), Length(128,true) */
    val EVENT_NAME: Rep[String] = column[String]("EVENT_NAME", O.Length(128,varying=true))
    /** Database column OPEN_COUNT SqlType(INT UNSIGNED) */
    val OPEN_COUNT: Rep[Long] = column[Long]("OPEN_COUNT")
  }
  /** Collection-like TableQuery object for table FileInstances */
  lazy val FileInstances = new TableQuery(tag => new FileInstances(tag))
}
