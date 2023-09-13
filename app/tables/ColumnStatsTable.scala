package tables
// AUTO-GENERATED Slick data model for table ColumnStats
trait ColumnStatsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table ColumnStats
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true)
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true)
   *  @param column_name Database column column_name SqlType(VARCHAR), Length(64,true)
   *  @param min_value Database column min_value SqlType(VARBINARY), Default(None)
   *  @param max_value Database column max_value SqlType(VARBINARY), Default(None)
   *  @param nulls_ratio Database column nulls_ratio SqlType(DECIMAL)
   *  @param avg_length Database column avg_length SqlType(DECIMAL)
   *  @param avg_frequency Database column avg_frequency SqlType(DECIMAL)
   *  @param hist_size Database column hist_size SqlType(TINYINT UNSIGNED), Default(None)
   *  @param hist_type Database column hist_type SqlType(ENUM), Length(14,true), Default(Some(NULL))
   *  @param histogram Database column histogram SqlType(VARBINARY), Default(None) */
  case class ColumnStatsRow(db_name: String, table_name: String, column_name: String, min_value: Option[java.sql.Blob], max_value: Option[java.sql.Blob], nulls_ratio: Option[scala.math.BigDecimal], avg_length: Option[scala.math.BigDecimal], avg_frequency: Option[scala.math.BigDecimal], hist_size: Option[Short], hist_type: Option[String], histogram: Option[java.sql.Blob])
  /** GetResult implicit for fetching ColumnStatsRow objects using plain SQL queries */
  implicit def GetResultColumnStatsRow(implicit e0: GR[String], e1: GR[Option[java.sql.Blob]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[Short]], e4: GR[Option[String]]): GR[ColumnStatsRow] = GR{
    prs => import prs._
    ColumnStatsRow.tupled((<<[String], <<[String], <<[String], <<?[java.sql.Blob], <<?[java.sql.Blob], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[Short], <<?[String], <<?[java.sql.Blob]))
  }
  /** Table description of table column_stats. Objects of this class serve as prototypes for rows in queries. */
  class ColumnStats(_tableTag: Tag) extends profile.api.Table[ColumnStatsRow](_tableTag, Some("mysql"), "column_stats") {
    def * = (db_name, table_name, column_name, min_value, max_value, nulls_ratio, avg_length, avg_frequency, hist_size, hist_type, histogram).<>(ColumnStatsRow.tupled, ColumnStatsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db_name), Rep.Some(table_name), Rep.Some(column_name), min_value, max_value, nulls_ratio, avg_length, avg_frequency, hist_size, hist_type, histogram)).shaped.<>({r=>import r._; _1.map(_=> ColumnStatsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db_name SqlType(VARCHAR), Length(64,true) */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true))
    /** Database column table_name SqlType(VARCHAR), Length(64,true) */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true))
    /** Database column column_name SqlType(VARCHAR), Length(64,true) */
    val column_name: Rep[String] = column[String]("column_name", O.Length(64,varying=true))
    /** Database column min_value SqlType(VARBINARY), Default(None) */
    val min_value: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("min_value", O.Default(None))
    /** Database column max_value SqlType(VARBINARY), Default(None) */
    val max_value: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("max_value", O.Default(None))
    /** Database column nulls_ratio SqlType(DECIMAL) */
    val nulls_ratio: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("nulls_ratio")
    /** Database column avg_length SqlType(DECIMAL) */
    val avg_length: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("avg_length")
    /** Database column avg_frequency SqlType(DECIMAL) */
    val avg_frequency: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("avg_frequency")
    /** Database column hist_size SqlType(TINYINT UNSIGNED), Default(None) */
    val hist_size: Rep[Option[Short]] = column[Option[Short]]("hist_size", O.Default(None))
    /** Database column hist_type SqlType(ENUM), Length(14,true), Default(Some(NULL)) */
    val hist_type: Rep[Option[String]] = column[Option[String]]("hist_type", O.Length(14,varying=true), O.Default(Some("NULL")))
    /** Database column histogram SqlType(VARBINARY), Default(None) */
    val histogram: Rep[Option[java.sql.Blob]] = column[Option[java.sql.Blob]]("histogram", O.Default(None))

    /** Primary key of ColumnStats (database name column_stats_PK) */
    val pk = primaryKey("column_stats_PK", (db_name, table_name, column_name))
  }
  /** Collection-like TableQuery object for table ColumnStats */
  lazy val ColumnStats = new TableQuery(tag => new ColumnStats(tag))
}
