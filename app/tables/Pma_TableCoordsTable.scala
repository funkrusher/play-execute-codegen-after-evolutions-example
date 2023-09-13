package tables
// AUTO-GENERATED Slick data model for table Pma_TableCoords
trait Pma_TableCoordsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_TableCoords
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param table_name Database column table_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param pdf_page_number Database column pdf_page_number SqlType(INT), Default(0)
   *  @param x Database column x SqlType(FLOAT UNSIGNED), Default(0.0)
   *  @param y Database column y SqlType(FLOAT UNSIGNED), Default(0.0) */
  case class Pma_TableCoordsRow(db_name: String, table_name: String, pdf_page_number: Int, x: Float, y: Float)
  /** GetResult implicit for fetching Pma_TableCoordsRow objects using plain SQL queries */
  implicit def GetResultPma_TableCoordsRow(implicit e0: GR[String], e1: GR[Int], e2: GR[Float]): GR[Pma_TableCoordsRow] = GR{
    prs => import prs._
    Pma_TableCoordsRow.tupled((<<[String], <<[String], <<[Int], <<[Float], <<[Float]))
  }
  /** Table description of table pma__table_coords. Objects of this class serve as prototypes for rows in queries. */
  class Pma_TableCoords(_tableTag: Tag) extends profile.api.Table[Pma_TableCoordsRow](_tableTag, Some("phpmyadmin"), "pma__table_coords") {
    def * = (db_name, table_name, pdf_page_number, x, y).<>(Pma_TableCoordsRow.tupled, Pma_TableCoordsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db_name), Rep.Some(table_name), Rep.Some(pdf_page_number), Rep.Some(x), Rep.Some(y))).shaped.<>({r=>import r._; _1.map(_=> Pma_TableCoordsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db_name SqlType(VARCHAR), Length(64,true), Default('') */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column table_name SqlType(VARCHAR), Length(64,true), Default('') */
    val table_name: Rep[String] = column[String]("table_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column pdf_page_number SqlType(INT), Default(0) */
    val pdf_page_number: Rep[Int] = column[Int]("pdf_page_number", O.Default(0))
    /** Database column x SqlType(FLOAT UNSIGNED), Default(0.0) */
    val x: Rep[Float] = column[Float]("x", O.Default(0.0F))
    /** Database column y SqlType(FLOAT UNSIGNED), Default(0.0) */
    val y: Rep[Float] = column[Float]("y", O.Default(0.0F))

    /** Primary key of Pma_TableCoords (database name pma__table_coords_PK) */
    val pk = primaryKey("pma__table_coords_PK", (db_name, table_name, pdf_page_number))
  }
  /** Collection-like TableQuery object for table Pma_TableCoords */
  lazy val Pma_TableCoords = new TableQuery(tag => new Pma_TableCoords(tag))
}
