package tables
// AUTO-GENERATED Slick data model for table Pma_CentralColumns
trait Pma_CentralColumnsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_CentralColumns
   *  @param db_name Database column db_name SqlType(VARCHAR), Length(64,true)
   *  @param col_name Database column col_name SqlType(VARCHAR), Length(64,true)
   *  @param col_type Database column col_type SqlType(VARCHAR), Length(64,true)
   *  @param col_length Database column col_length SqlType(TEXT), Default(Some(NULL))
   *  @param col_collation Database column col_collation SqlType(VARCHAR), Length(64,true)
   *  @param col_isNull Database column col_isNull SqlType(BOOLEAN)
   *  @param col_extra Database column col_extra SqlType(VARCHAR), Length(255,true), Default(Some(''))
   *  @param col_default Database column col_default SqlType(TEXT), Default(Some(NULL)) */
  case class Pma_CentralColumnsRow(db_name: String, col_name: String, col_type: String, col_length: Option[String], col_collation: String, col_isNull: Boolean, col_extra: Option[String], col_default: Option[String])
  /** GetResult implicit for fetching Pma_CentralColumnsRow objects using plain SQL queries */
  implicit def GetResultPma_CentralColumnsRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Boolean]): GR[Pma_CentralColumnsRow] = GR{
    prs => import prs._
    Pma_CentralColumnsRow.tupled((<<[String], <<[String], <<[String], <<?[String], <<[String], <<[Boolean], <<?[String], <<?[String]))
  }
  /** Table description of table pma__central_columns. Objects of this class serve as prototypes for rows in queries. */
  class Pma_CentralColumns(_tableTag: Tag) extends profile.api.Table[Pma_CentralColumnsRow](_tableTag, Some("phpmyadmin"), "pma__central_columns") {
    def * = (db_name, col_name, col_type, col_length, col_collation, col_isNull, col_extra, col_default).<>(Pma_CentralColumnsRow.tupled, Pma_CentralColumnsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(db_name), Rep.Some(col_name), Rep.Some(col_type), col_length, Rep.Some(col_collation), Rep.Some(col_isNull), col_extra, col_default)).shaped.<>({r=>import r._; _1.map(_=> Pma_CentralColumnsRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6.get, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column db_name SqlType(VARCHAR), Length(64,true) */
    val db_name: Rep[String] = column[String]("db_name", O.Length(64,varying=true))
    /** Database column col_name SqlType(VARCHAR), Length(64,true) */
    val col_name: Rep[String] = column[String]("col_name", O.Length(64,varying=true))
    /** Database column col_type SqlType(VARCHAR), Length(64,true) */
    val col_type: Rep[String] = column[String]("col_type", O.Length(64,varying=true))
    /** Database column col_length SqlType(TEXT), Default(Some(NULL)) */
    val col_length: Rep[Option[String]] = column[Option[String]]("col_length", O.Default(Some("NULL")))
    /** Database column col_collation SqlType(VARCHAR), Length(64,true) */
    val col_collation: Rep[String] = column[String]("col_collation", O.Length(64,varying=true))
    /** Database column col_isNull SqlType(BOOLEAN) */
    val col_isNull: Rep[Boolean] = column[Boolean]("col_isNull")
    /** Database column col_extra SqlType(VARCHAR), Length(255,true), Default(Some('')) */
    val col_extra: Rep[Option[String]] = column[Option[String]]("col_extra", O.Length(255,varying=true), O.Default(Some("''")))
    /** Database column col_default SqlType(TEXT), Default(Some(NULL)) */
    val col_default: Rep[Option[String]] = column[Option[String]]("col_default", O.Default(Some("NULL")))

    /** Primary key of Pma_CentralColumns (database name pma__central_columns_PK) */
    val pk = primaryKey("pma__central_columns_PK", (db_name, col_name))
  }
  /** Collection-like TableQuery object for table Pma_CentralColumns */
  lazy val Pma_CentralColumns = new TableQuery(tag => new Pma_CentralColumns(tag))
}
