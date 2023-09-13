package tables
// AUTO-GENERATED Slick data model for table InnodbTableStats
trait InnodbTableStatsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InnodbTableStats
   *  @param database_name Database column database_name SqlType(VARCHAR), Length(64,true)
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(199,true)
   *  @param last_update Database column last_update SqlType(TIMESTAMP)
   *  @param n_rows Database column n_rows SqlType(BIGINT UNSIGNED)
   *  @param clustered_index_size Database column clustered_index_size SqlType(BIGINT UNSIGNED)
   *  @param sum_of_other_index_sizes Database column sum_of_other_index_sizes SqlType(BIGINT UNSIGNED) */
  case class InnodbTableStatsRow(database_name: String, table_name: String, last_update: java.sql.Timestamp, n_rows: Long, clustered_index_size: Long, sum_of_other_index_sizes: Long)
  /** GetResult implicit for fetching InnodbTableStatsRow objects using plain SQL queries */
  implicit def GetResultInnodbTableStatsRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Long]): GR[InnodbTableStatsRow] = GR{
    prs => import prs._
    InnodbTableStatsRow.tupled((<<[String], <<[String], <<[java.sql.Timestamp], <<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table innodb_table_stats. Objects of this class serve as prototypes for rows in queries. */
  class InnodbTableStats(_tableTag: Tag) extends profile.api.Table[InnodbTableStatsRow](_tableTag, Some("mysql"), "innodb_table_stats") {
    def * = (database_name, table_name, last_update, n_rows, clustered_index_size, sum_of_other_index_sizes).<>(InnodbTableStatsRow.tupled, InnodbTableStatsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(database_name), Rep.Some(table_name), Rep.Some(last_update), Rep.Some(n_rows), Rep.Some(clustered_index_size), Rep.Some(sum_of_other_index_sizes))).shaped.<>({r=>import r._; _1.map(_=> InnodbTableStatsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column database_name SqlType(VARCHAR), Length(64,true) */
    val database_name: Rep[String] = column[String]("database_name", O.Length(64,varying=true))
    /** Database column table_name SqlType(VARCHAR), Length(199,true) */
    val table_name: Rep[String] = column[String]("table_name", O.Length(199,varying=true))
    /** Database column last_update SqlType(TIMESTAMP) */
    val last_update: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("last_update")
    /** Database column n_rows SqlType(BIGINT UNSIGNED) */
    val n_rows: Rep[Long] = column[Long]("n_rows")
    /** Database column clustered_index_size SqlType(BIGINT UNSIGNED) */
    val clustered_index_size: Rep[Long] = column[Long]("clustered_index_size")
    /** Database column sum_of_other_index_sizes SqlType(BIGINT UNSIGNED) */
    val sum_of_other_index_sizes: Rep[Long] = column[Long]("sum_of_other_index_sizes")

    /** Primary key of InnodbTableStats (database name innodb_table_stats_PK) */
    val pk = primaryKey("innodb_table_stats_PK", (database_name, table_name))
  }
  /** Collection-like TableQuery object for table InnodbTableStats */
  lazy val InnodbTableStats = new TableQuery(tag => new InnodbTableStats(tag))
}
