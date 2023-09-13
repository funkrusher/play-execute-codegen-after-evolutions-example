package tables
// AUTO-GENERATED Slick data model for table Pma_Relation
trait Pma_RelationTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Pma_Relation
   *  @param master_db Database column master_db SqlType(VARCHAR), Length(64,true), Default('')
   *  @param master_table Database column master_table SqlType(VARCHAR), Length(64,true), Default('')
   *  @param master_field Database column master_field SqlType(VARCHAR), Length(64,true), Default('')
   *  @param foreign_db Database column foreign_db SqlType(VARCHAR), Length(64,true), Default('')
   *  @param foreign_table Database column foreign_table SqlType(VARCHAR), Length(64,true), Default('')
   *  @param foreign_field Database column foreign_field SqlType(VARCHAR), Length(64,true), Default('') */
  case class Pma_RelationRow(master_db: String, master_table: String, master_field: String, foreign_db: String, foreign_table: String, foreign_field: String)
  /** GetResult implicit for fetching Pma_RelationRow objects using plain SQL queries */
  implicit def GetResultPma_RelationRow(implicit e0: GR[String]): GR[Pma_RelationRow] = GR{
    prs => import prs._
    Pma_RelationRow.tupled((<<[String], <<[String], <<[String], <<[String], <<[String], <<[String]))
  }
  /** Table description of table pma__relation. Objects of this class serve as prototypes for rows in queries. */
  class Pma_Relation(_tableTag: Tag) extends profile.api.Table[Pma_RelationRow](_tableTag, Some("phpmyadmin"), "pma__relation") {
    def * = (master_db, master_table, master_field, foreign_db, foreign_table, foreign_field).<>(Pma_RelationRow.tupled, Pma_RelationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(master_db), Rep.Some(master_table), Rep.Some(master_field), Rep.Some(foreign_db), Rep.Some(foreign_table), Rep.Some(foreign_field))).shaped.<>({r=>import r._; _1.map(_=> Pma_RelationRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column master_db SqlType(VARCHAR), Length(64,true), Default('') */
    val master_db: Rep[String] = column[String]("master_db", O.Length(64,varying=true), O.Default("''"))
    /** Database column master_table SqlType(VARCHAR), Length(64,true), Default('') */
    val master_table: Rep[String] = column[String]("master_table", O.Length(64,varying=true), O.Default("''"))
    /** Database column master_field SqlType(VARCHAR), Length(64,true), Default('') */
    val master_field: Rep[String] = column[String]("master_field", O.Length(64,varying=true), O.Default("''"))
    /** Database column foreign_db SqlType(VARCHAR), Length(64,true), Default('') */
    val foreign_db: Rep[String] = column[String]("foreign_db", O.Length(64,varying=true), O.Default("''"))
    /** Database column foreign_table SqlType(VARCHAR), Length(64,true), Default('') */
    val foreign_table: Rep[String] = column[String]("foreign_table", O.Length(64,varying=true), O.Default("''"))
    /** Database column foreign_field SqlType(VARCHAR), Length(64,true), Default('') */
    val foreign_field: Rep[String] = column[String]("foreign_field", O.Length(64,varying=true), O.Default("''"))

    /** Primary key of Pma_Relation (database name pma__relation_PK) */
    val pk = primaryKey("pma__relation_PK", (master_db, master_table, master_field))

    /** Index over (foreign_db,foreign_table) (database name foreign_field) */
    val index1 = index("foreign_field", (foreign_db, foreign_table))
  }
  /** Collection-like TableQuery object for table Pma_Relation */
  lazy val Pma_Relation = new TableQuery(tag => new Pma_Relation(tag))
}
