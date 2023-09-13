package tables
// AUTO-GENERATED Slick data model for table Pma_Tracking
trait Pma_TrackingTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Tracking
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true)
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true)
   *  @param version Database column version SqlType(INT UNSIGNED)
   *  @param date_created Database column date_created SqlType(DATETIME)
   *  @param date_updated Database column date_updated SqlType(DATETIME)
   *  @param schema_snapshot Database column schema_snapshot SqlType(TEXT)
   *  @param schema_sql Database column schema_sql SqlType(TEXT), Default(Some(NULL))
   *  @param data_sql Database column data_sql SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param tracking Database column tracking SqlType(SET), Length(188,true), Default(Some(NULL))
   *  @param tracking_active Database column tracking_active SqlType(INT UNSIGNED), Default(1) */
  case class Pma_TrackingRow(db_name: String, table_name: String, version: Long, date_created: java.sql.Timestamp, date_updated: java.sql.Timestamp, schema_snapshot: String, schema_sql: Option[String], data_sql: Option[String], tracking: Option[String], tracking_active: Long)
  /** GetResult implicit for fetching Pma_TrackingRow objects using plain SQL queries */
  implicit def GetResultPma_TrackingRow(implicit e0: GR[String], e1: GR[Long], e2: GR[java.sql.Timestamp], e3: GR[Option[String]]): GR[Pma_TrackingRow] = GR{
    prs => import prs._
    Pma_TrackingRow.tupled((<<[String], <<[String], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<?[String], <<?[String], <<?[String], <<[Long]))
  }
  /** Table description of table pma__tracking. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Tracking(_tableTag: Tag) extends profile.api.Table[Pma_TrackingRow](_tableTag, Some("phpmyadmin"), "pma__tracking") {
    def * = (db_name, table_name, version, date_created, date_updated, schema_snapshot, schema_sql, data_sql, tracking, tracking_active).<>(Pma_TrackingRow.tupled, Pma_TrackingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db_name), Rep.Some(table_name), Rep.Some(version), Rep.Some(date_created), Rep.Some(date_updated), Rep.Some(schema_snapshot), schema_sql, data_sql, tracking, Rep.Some(tracking_active))).shaped.<>({r=>import r._; _1.map(_=> Pma_TrackingRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8, _9, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db_name SqlType(VARCHAR), Length(64,true) */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true))
    /** Database column table_name SqlType(VARCHAR), Length(64,true) */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true))
    /** Database column version SqlType(INT UNSIGNED) */
    val version: Rep[Long] = column[Long]("version")
    /** Database column date_created SqlType(DATETIME) */
    val date_created: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("date_created")
    /** Database column date_updated SqlType(DATETIME) */
    val date_updated: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("date_updated")
    /** Database column schema_snapshot SqlType(TEXT) */
    val schema_snapshot: Rep[String] = column[String]("schema_snapshot")
    /** Database column schema_sql SqlType(TEXT), Default(Some(NULL)) */
    val schema_sql: Rep[Option[String]] = column[Option[String]]("schema_sql", O.Default(Some("NULL")))
    /** Database column data_sql SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val data_sql: Rep[Option[String]] = column[Option[String]]("data_sql", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column tracking SqlType(SET), Length(188,true), Default(Some(NULL)) */
    val tracking: Rep[Option[String]] = column[Option[String]]("tracking", O.Length(188,varying=true), O.Default(Some("NULL")))
    /** Database column tracking_active SqlType(INT UNSIGNED), Default(1) */
    val tracking_active: Rep[Long] = column[Long]("tracking_active", O.Default(1L))

    /** Primary key of Pma_Tracking (database name pma__tracking_PK) */
    val pk = primaryKey("pma__tracking_PK", (db_name, table_name, version))
  }
  /** Collection-like TableQuery object for table Pma_Tracking */
  lazy val Pma_Tracking = new TableQuery(tag => new Pma_Tracking(tag))
}
