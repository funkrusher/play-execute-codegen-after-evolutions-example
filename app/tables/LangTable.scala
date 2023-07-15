package tables
// AUTO-GENERATED Slick data model for table Lang
trait LangTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Lang
   *  @param langId Database column langId SqlType(INT), AutoInc, PrimaryKey
   *  @param code Database column code SqlType(CHAR), Length(2,false)
   *  @param description Database column description SqlType(VARCHAR), Length(50,true), Default(Some(NULL)) */
  case class LangRow(langId: Int, code: String, description: Option[String] = Some("NULL"))
  /** GetResult implicit for fetching LangRow objects using plain SQL queries */
  implicit def GetResultLangRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[LangRow] = GR{
    prs => import prs._
    LangRow.tupled((<<[Int], <<[String], <<?[String]))
  }
  /** Table description of table lang. Objects of this class serve as prototypes for rows in queries. */
  class Lang(_tableTag: Tag) extends profile.api.Table[LangRow](_tableTag, Some("codegen1"), "lang") {
    def * = (langId, code, description) <> (LangRow.tupled, LangRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(langId), Rep.Some(code), description)).shaped.<>({r=>import r._; _1.map(_=> LangRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column langId SqlType(INT), AutoInc, PrimaryKey */
    val langId: Rep[Int] = column[Int]("langId", O.AutoInc, O.PrimaryKey)
    /** Database column code SqlType(CHAR), Length(2,false) */
    val code: Rep[String] = column[String]("code", O.Length(2,varying=false))
    /** Database column description SqlType(VARCHAR), Length(50,true), Default(Some(NULL)) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(50,varying=true), O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table Lang */
  lazy val Lang = new TableQuery(tag => new Lang(tag))
}
