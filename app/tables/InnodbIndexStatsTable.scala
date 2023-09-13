package tables
// AUTO-GENERATED Slick data model for table InnodbIndexStats
trait InnodbIndexStatsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table InnodbIndexStats
   *  @param database_name Database column database_name SqlType(VARCHAR), Length(64,true)
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(199,true)
   *  @param index_name Database column index_name SqlType(VARCHAR), Length(64,true)
   *  @param last_update Database column last_update SqlType(TIMESTAMP)
   *  @param stat_name Database column stat_name SqlType(VARCHAR), Length(64,true)
   *  @param stat_value Database column stat_value SqlType(BIGINT UNSIGNED)
   *  @param sample_size Database column sample_size SqlType(BIGINT UNSIGNED), Default(None)
   *  @param stat_description Database column stat_description SqlType(VARCHAR), Length(1024,true) */
  case class InnodbIndexStatsRow(database_name: String, table_name: String, index_name: String, last_update: java.sql.Timestamp, stat_name: String, stat_value: Long, sample_size: Option[Long], stat_description: String)
  /** GetResult implicit for fetching InnodbIndexStatsRow objects using plain SQL queries */
  implicit def GetResultInnodbIndexStatsRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Long], e3: GR[Option[Long]]): GR[InnodbIndexStatsRow] = GR{
    prs => import prs._
    InnodbIndexStatsRow.tupled((<<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[String], <<[Long], <<?[Long], <<[String]))
  }
  /** Table description of table innodb_index_stats. Objects of this class serve as prototypes for rows in queries. */
  class InnodbIndexStats(_tableTag: Tag) extends profile.api.Table[InnodbIndexStatsRow](_tableTag, Some("mysql"), "innodb_index_stats") {
    def * = (database_name, table_name, index_name, last_update, stat_name, stat_value, sample_size, stat_description).<>(InnodbIndexStatsRow.tupled, InnodbIndexStatsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(database_name), Rep.Some(table_name), Rep.Some(index_name), Rep.Some(last_update), Rep.Some(stat_name), Rep.Some(stat_value), sample_size, Rep.Some(stat_description))).shaped.<>({r=>import r._; _1.map(_=> InnodbIndexStatsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column database_name SqlType(VARCHAR), Length(64,true) */
    val database_name: Rep[String] = column[String]("database_name", O.Length(64,varying=true))
    /** Database column table_name SqlType(VARCHAR), Length(199,true) */
    val table_name: Rep[String] = column[String]("table_name", O.Length(199,varying=true))
    /** Database column index_name SqlType(VARCHAR), Length(64,true) */
    val index_name: Rep[String] = column[String]("index_name", O.Length(64,varying=true))
    /** Database column last_update SqlType(TIMESTAMP) */
    val last_update: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("last_update")
    /** Database column stat_name SqlType(VARCHAR), Length(64,true) */
    val stat_name: Rep[String] = column[String]("stat_name", O.Length(64,varying=true))
    /** Database column stat_value SqlType(BIGINT UNSIGNED) */
    val stat_value: Rep[Long] = column[Long]("stat_value")
    /** Database column sample_size SqlType(BIGINT UNSIGNED), Default(None) */
    val sample_size: Rep[Option[Long]] = column[Option[Long]]("sample_size", O.Default(None))
    /** Database column stat_description SqlType(VARCHAR), Length(1024,true) */
    val stat_description: Rep[String] = column[String]("stat_description", O.Length(1024,varying=true))

    /** Primary key of InnodbIndexStats (database name innodb_index_stats_PK) */
    val pk = primaryKey("innodb_index_stats_PK", (database_name, table_name, index_name, stat_name))
  }
  /** Collection-like TableQuery object for table InnodbIndexStats */
  lazy val InnodbIndexStats = new TableQuery(tag => new InnodbIndexStats(tag))
}
