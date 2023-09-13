package tables
// AUTO-GENERATED Slick data model for table Func
trait FuncTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Func
   *  @param name Database column name SqlType(CHAR), PrimaryKey, Length(64,false), Default('')
   *  @param ret Database column ret SqlType(BOOLEAN), Default(false)
   *  @param dl Database column dl SqlType(CHAR), Length(128,false), Default('')
   *  @param `type` Database column type SqlType(ENUM), Length(9,true) */
  case class FuncRow(name: String, ret: Boolean, dl: String, `type`: String)
  /** GetResult implicit for fetching FuncRow objects using plain SQL queries */
  implicit def GetResultFuncRow(implicit e0: GR[String], e1: GR[Boolean]): GR[FuncRow] = GR{
    prs => import prs._
    FuncRow.tupled((<<[String], <<[Boolean], <<[String], <<[String]))
  }
  /** Table description of table func. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Func(_tableTag: Tag) extends profile.api.Table[FuncRow](_tableTag, Some("mysql"), "func") {
    def * = (name, ret, dl, `type`).<>(FuncRow.tupled, FuncRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(name), Rep.Some(ret), Rep.Some(dl), Rep.Some(`type`))).shaped.<>({r=>import r._; _1.map(_=> FuncRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column name SqlType(CHAR), PrimaryKey, Length(64,false), Default('') */
    val name: Rep[String] = column[String]("name", O.PrimaryKey, O.Length(64,varying=false), O.Default("''"))
    /** Database column ret SqlType(BOOLEAN), Default(false) */
    val ret: Rep[Boolean] = column[Boolean]("ret", O.Default(false))
    /** Database column dl SqlType(CHAR), Length(128,false), Default('') */
    val dl: Rep[String] = column[String]("dl", O.Length(128,varying=false), O.Default("''"))
    /** Database column type SqlType(ENUM), Length(9,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type", O.Length(9,varying=true))
  }
  /** Collection-like TableQuery object for table Func */
  lazy val Func = new TableQuery(tag => new Func(tag))
}
