package tables
// AUTO-GENERATED Slick data model for table Pma_PdfPages
trait Pma_PdfPagesTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_PdfPages
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true), Default('')
   *  @param page_nr Database column page_nr SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param page_descr Database column page_descr SqlType(VARCHAR), Length(50,true), Default('') */
  case class Pma_PdfPagesRow(db_name: String, page_nr: Long, page_descr: String)
  /** GetResult implicit for fetching Pma_PdfPagesRow objects using plain SQL queries */
  implicit def GetResultPma_PdfPagesRow(implicit e0: GR[String], e1: GR[Long]): GR[Pma_PdfPagesRow] = GR{
    prs => import prs._
    Pma_PdfPagesRow.tupled((<<[String], <<[Long], <<[String]))
  }
  /** Table description of table pma__pdf_pages. Objects of this class serve as prototypes for rows in queries. */
  class Pma_PdfPages(_tableTag: Tag) extends profile.api.Table[Pma_PdfPagesRow](_tableTag, Some("phpmyadmin"), "pma__pdf_pages") {
    def * = (db_name, page_nr, page_descr).<>(Pma_PdfPagesRow.tupled, Pma_PdfPagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db_name), Rep.Some(page_nr), Rep.Some(page_descr))).shaped.<>({r=>import r._; _1.map(_=> Pma_PdfPagesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db_name SqlType(VARCHAR), Length(64,true), Default('') */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true), O.Default("''"))
    /** Database column page_nr SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val page_nr: Rep[Long] = column[Long]("page_nr", O.AutoInc, O.PrimaryKey)
    /** Database column page_descr SqlType(VARCHAR), Length(50,true), Default('') */
    val page_descr: Rep[String] = column[String]("page_descr", O.Length(50,varying=true), O.Default("''"))

    /** Index over (db_name) (database name db_name) */
    val index1 = index("db_name", db_name)
  }
  /** Collection-like TableQuery object for table Pma_PdfPages */
  lazy val Pma_PdfPages = new TableQuery(tag => new Pma_PdfPages(tag))
}
