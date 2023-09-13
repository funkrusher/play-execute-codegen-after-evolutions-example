package tables
// AUTO-GENERATED Slick data model for table TableStats
trait TableStatsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TableStats
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true)
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true)
   *  @param cardinality Database column cardinality SqlType(BIGINT UNSIGNED), Default(None) */
  case class TableStatsRow(db_name: String, table_name: String, cardinality: Option[Long])
  /** GetResult implicit for fetching TableStatsRow objects using plain SQL queries */
  implicit def GetResultTableStatsRow(implicit e0: GR[String], e1: GR[Option[Long]]): GR[TableStatsRow] = GR{
    prs => import prs._
    TableStatsRow.tupled((<<[String], <<[String], <<?[Long]))
  }
  /** Table description of table table_stats. Objects of this class serve as prototypes for rows in queries. */
  class TableStats(_tableTag: Tag) extends profile.api.Table[TableStatsRow](_tableTag, Some("mysql"), "table_stats") {
    def * = (db_name, table_name, cardinality).<>(TableStatsRow.tupled, TableStatsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db_name), Rep.Some(table_name), cardinality)).shaped.<>({r=>import r._; _1.map(_=> TableStatsRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db_name SqlType(VARCHAR), Length(64,true) */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true))
    /** Database column table_name SqlType(VARCHAR), Length(64,true) */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true))
    /** Database column cardinality SqlType(BIGINT UNSIGNED), Default(None) */
    val cardinality: Rep[Option[Long]] = column[Option[Long]]("cardinality", O.Default(None))

    /** Primary key of TableStats (database name table_stats_PK) */
    val pk = primaryKey("table_stats_PK", (db_name, table_name))
  }
  /** Collection-like TableQuery object for table TableStats */
  lazy val TableStats = new TableQuery(tag => new TableStats(tag))
}
