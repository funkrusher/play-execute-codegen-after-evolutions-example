package tables
// AUTO-GENERATED Slick data model for table Pma_TableInfo
trait Pma_TableInfoTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_TableInfo
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param display_field Database column display_field SqlType(VARCHAR), Length(64,true), Default('') */
  case class Pma_TableInfoRow(db_name: String, table_name: String, display_field: String)
  /** GetResult implicit for fetching Pma_TableInfoRow objects using plain SQL queries */
  implicit def GetResultPma_TableInfoRow(implicit e0: GR[String]): GR[Pma_TableInfoRow] = GR{
    prs => import prs._
    Pma_TableInfoRow.tupled((<<[String], <<[String], <<[String]))
  }
  /** Table description of table pma__table_info. Objects of this class serve as prototypes for rows in queries. */
  class Pma_TableInfo(_tableTag: Tag) extends profile.api.Table[Pma_TableInfoRow](_tableTag, Some("phpmyadmin"), "pma__table_info") {
    def * = (db_name, table_name, display_field).<>(Pma_TableInfoRow.tupled, Pma_TableInfoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db_name), Rep.Some(table_name), Rep.Some(display_field))).shaped.<>({r=>import r._; _1.map(_=> Pma_TableInfoRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db_name SqlType(VARCHAR), Length(64,true), Default('') */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column table_name SqlType(VARCHAR), Length(64,true), Default('') */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column display_field SqlType(VARCHAR), Length(64,true), Default('') */
    val display_field: Rep[String] = column[String]("display_field", O.Length(64,varying=true), O.Default("''"))

    /** Primary key of Pma_TableInfo (database name pma__table_info_PK) */
    val pk = primaryKey("pma__table_info_PK", (db_name, table_name))
  }
  /** Collection-like TableQuery object for table Pma_TableInfo */
  lazy val Pma_TableInfo = new TableQuery(tag => new Pma_TableInfo(tag))
}
