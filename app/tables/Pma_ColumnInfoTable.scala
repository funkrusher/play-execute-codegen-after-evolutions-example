package tables
// AUTO-GENERATED Slick data model for table Pma_ColumnInfo
trait Pma_ColumnInfoTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_ColumnInfo
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param column_name Database column column_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param comment Database column comment SqlType(VARCHAR), Length(255,true), Default('')
   *  @param mimetype Database column mimetype SqlType(VARCHAR), Length(255,true), Default('')
   *  @param transformation Database column transformation SqlType(VARCHAR), Length(255,true), Default('')
   *  @param transformation_options Database column transformation_options SqlType(VARCHAR), Length(255,true), Default('')
   *  @param input_transformation Database column input_transformation SqlType(VARCHAR), Length(255,true), Default('')
   *  @param input_transformation_options Database column input_transformation_options SqlType(VARCHAR), Length(255,true), Default('') */
  case class Pma_ColumnInfoRow(id: Long, db_name: String, table_name: String, column_name: String, comment: String, mimetype: String, transformation: String, transformation_options: String, input_transformation: String, input_transformation_options: String)
  /** GetResult implicit for fetching Pma_ColumnInfoRow objects using plain SQL queries */
  implicit def GetResultPma_ColumnInfoRow(implicit e0: GR[Long], e1: GR[String]): GR[Pma_ColumnInfoRow] = GR{
    prs => import prs._
    Pma_ColumnInfoRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table pma__column_info. Objects of this class serve as prototypes for rows in queries. */
  class Pma_ColumnInfo(_tableTag: Tag) extends profile.api.Table[Pma_ColumnInfoRow](_tableTag, Some("phpmyadmin"), "pma__column_info") {
    def * = (id, db_name, table_name, column_name, comment, mimetype, transformation, transformation_options, input_transformation, input_transformation_options).<>(Pma_ColumnInfoRow.tupled, Pma_ColumnInfoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(db_name), Rep.Some(table_name), Rep.Some(column_name), Rep.Some(comment), Rep.Some(mimetype), Rep.Some(transformation), Rep.Some(transformation_options), Rep.Some(input_transformation), Rep.Some(input_transformation_options))).shaped.<>({r=>import r._; _1.map(_=> Pma_ColumnInfoRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column db_name SqlType(VARCHAR), Length(64,true), Default('') */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column table_name SqlType(VARCHAR), Length(64,true), Default('') */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column column_name SqlType(VARCHAR), Length(64,true), Default('') */
    val column_name: Rep[String] = column[String]("column_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column comment SqlType(VARCHAR), Length(255,true), Default('') */
    val comment: Rep[String] = column[String]("comment", O.Length(255,varying=true), O.Default("''"))
    /** Database column mimetype SqlType(VARCHAR), Length(255,true), Default('') */
    val mimetype: Rep[String] = column[String]("mimetype", O.Length(255,varying=true), O.Default("''"))
    /** Database column transformation SqlType(VARCHAR), Length(255,true), Default('') */
    val transformation: Rep[String] = column[String]("transformation", O.Length(255,varying=true), O.Default("''"))
    /** Database column transformation_options SqlType(VARCHAR), Length(255,true), Default('') */
    val transformation_options: Rep[String] = column[String]("transformation_options", O.Length(255,varying=true), O.Default("''"))
    /** Database column input_transformation SqlType(VARCHAR), Length(255,true), Default('') */
    val input_transformation: Rep[String] = column[String]("input_transformation", O.Length(255,varying=true), O.Default("''"))
    /** Database column input_transformation_options SqlType(VARCHAR), Length(255,true), Default('') */
    val input_transformation_options: Rep[String] = column[String]("input_transformation_options", O.Length(255,varying=true), O.Default("''"))

    /** Uniqueness Index over (db_name,table_name,column_name) (database name db_name) */
    val index1 = index("db_name", (db_name, table_name, column_name), unique=true)
  }
  /** Collection-like TableQuery object for table Pma_ColumnInfo */
  lazy val Pma_ColumnInfo = new TableQuery(tag => new Pma_ColumnInfo(tag))
}
