package tables
// AUTO-GENERATED Slick data model for table Language
trait LanguageTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Language
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param cd Database column cd SqlType(CHAR), Length(2,false)
   *  @param description Database column description SqlType(VARCHAR), Length(50,true), Default(Some(NULL)) */
  case class LanguageRow(id: Int, cd: String, description: Option[String])
  /** GetResult implicit for fetching LanguageRow objects using plain SQL queries */
  implicit def GetResultLanguageRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[LanguageRow] = GR{
    prs => import prs._
    LanguageRow.tupled((<<[Int], <<[String], <<?[String]))
  }
  /** Table description of table language. Objects of this class serve as prototypes for rows in queries. */
  class Language(_tableTag: Tag) extends profile.api.Table[LanguageRow](_tableTag, Some("testdb"), "language") {
    def * = (id, cd, description).<>(LanguageRow.tupled, LanguageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(cd), description)).shaped.<>({r=>import r._; _1.map(_=> LanguageRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column cd SqlType(CHAR), Length(2,false) */
    val cd: Rep[String] = column[String]("cd", O.Length(2,varying=false))
    /** Database column description SqlType(VARCHAR), Length(50,true), Default(Some(NULL)) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(50,varying=true), O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table Language */
  lazy val Language = new TableQuery(tag => new Language(tag))
}
