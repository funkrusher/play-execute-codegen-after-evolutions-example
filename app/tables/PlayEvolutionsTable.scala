package tables
// AUTO-GENERATED Slick data model for table PlayEvolutions
trait PlayEvolutionsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table PlayEvolutions
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param hash Database column hash SqlType(VARCHAR), Length(255,true)
   *  @param applied_at Database column applied_at SqlType(TIMESTAMP)
   *  @param apply_script Database column apply_script SqlType(TEXT), Default(Some(NULL))
   *  @param revert_script Database column revert_script SqlType(TEXT), Default(Some(NULL))
   *  @param state Database column state SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param last_problem Database column last_problem SqlType(TEXT), Default(Some(NULL)) */
  case class PlayEvolutionsRow(id: Int, hash: String, applied_at: java.sql.Timestamp, apply_script: Option[String], revert_script: Option[String], state: Option[String], last_problem: Option[String])
  /** GetResult implicit for fetching PlayEvolutionsRow objects using plain SQL queries */
  implicit def GetResultPlayEvolutionsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[String]]): GR[PlayEvolutionsRow] = GR{
    prs => import prs._
    PlayEvolutionsRow.tupled((<<[Int], <<[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table play_evolutions. Objects of this class serve as prototypes for rows in queries. */
  class PlayEvolutions(_tableTag: Tag) extends profile.api.Table[PlayEvolutionsRow](_tableTag, Some("codegen1"), "play_evolutions") {
    def * = (id, hash, applied_at, apply_script, revert_script, state, last_problem).<>(PlayEvolutionsRow.tupled, PlayEvolutionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(hash), Rep.Some(applied_at), apply_script, revert_script, state, last_problem)).shaped.<>({r=>import r._; _1.map(_=> PlayEvolutionsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column hash SqlType(VARCHAR), Length(255,true) */
    val hash: Rep[String] = column[String]("hash", O.Length(255,varying=true))
    /** Database column applied_at SqlType(TIMESTAMP) */
    val applied_at: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("applied_at")
    /** Database column apply_script SqlType(TEXT), Default(Some(NULL)) */
    val apply_script: Rep[Option[String]] = column[Option[String]]("apply_script", O.Default(Some("NULL")))
    /** Database column revert_script SqlType(TEXT), Default(Some(NULL)) */
    val revert_script: Rep[Option[String]] = column[Option[String]]("revert_script", O.Default(Some("NULL")))
    /** Database column state SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column last_problem SqlType(TEXT), Default(Some(NULL)) */
    val last_problem: Rep[Option[String]] = column[Option[String]]("last_problem", O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table PlayEvolutions */
  lazy val PlayEvolutions = new TableQuery(tag => new PlayEvolutions(tag))
}
