package tables
// AUTO-GENERATED Slick data model for table IndexStats
trait IndexStatsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table IndexStats
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true)
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true)
   *  @param index_name Database column index_name SqlType(VARCHAR), Length(64,true)
   *  @param prefix_arity Database column prefix_arity SqlType(INT UNSIGNED)
   *  @param avg_frequency Database column avg_frequency SqlType(DECIMAL) */
  case class IndexStatsRow(db_name: String, table_name: String, index_name: String, prefix_arity: Long, avg_frequency: Option[scala.math.BigDecimal])
  /** GetResult implicit for fetching IndexStatsRow objects using plain SQL queries */
  implicit def GetResultIndexStatsRow(implicit e0: GR[String], e1: GR[Long], e2: GR[Option[scala.math.BigDecimal]]): GR[IndexStatsRow] = GR{
    prs => import prs._
    IndexStatsRow.tupled((<<[String], <<[String], <<[String], <<[Long], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table index_stats. Objects of this class serve as prototypes for rows in queries. */
  class IndexStats(_tableTag: Tag) extends profile.api.Table[IndexStatsRow](_tableTag, Some("mysql"), "index_stats") {
    def * = (db_name, table_name, index_name, prefix_arity, avg_frequency).<>(IndexStatsRow.tupled, IndexStatsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db_name), Rep.Some(table_name), Rep.Some(index_name), Rep.Some(prefix_arity), avg_frequency)).shaped.<>({r=>import r._; _1.map(_=> IndexStatsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db_name SqlType(VARCHAR), Length(64,true) */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true))
    /** Database column table_name SqlType(VARCHAR), Length(64,true) */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true))
    /** Database column index_name SqlType(VARCHAR), Length(64,true) */
    val index_name: Rep[String] = column[String]("index_name", O.Length(64,varying=true))
    /** Database column prefix_arity SqlType(INT UNSIGNED) */
    val prefix_arity: Rep[Long] = column[Long]("prefix_arity")
    /** Database column avg_frequency SqlType(DECIMAL) */
    val avg_frequency: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("avg_frequency")

    /** Primary key of IndexStats (database name index_stats_PK) */
    val pk = primaryKey("index_stats_PK", (db_name, table_name, index_name, prefix_arity))
  }
  /** Collection-like TableQuery object for table IndexStats */
  lazy val IndexStats = new TableQuery(tag => new IndexStats(tag))
}
