package tables
// AUTO-GENERATED Slick data model for table Runtimeappconfig
trait RuntimeappconfigTable {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Runtimeappconfig
   *  @param key Database column key SqlType(VARCHAR), Length(255,true)
   *  @param value Database column value SqlType(VARCHAR), Length(255,true) */
  case class RuntimeappconfigRow(key: String, value: String)
  /** GetResult implicit for fetching RuntimeappconfigRow objects using plain SQL queries */
  implicit def GetResultRuntimeappconfigRow(implicit e0: GR[String]): GR[RuntimeappconfigRow] = GR{
    prs => import prs._
    RuntimeappconfigRow.tupled((<<[String], <<[String]))
  }
  /** Table description of table runtimeappconfig. Objects of this class serve as prototypes for rows in queries. */
  class Runtimeappconfig(_tableTag: Tag) extends profile.api.Table[RuntimeappconfigRow](_tableTag, Some("codegen1"), "runtimeappconfig") {
    def * = (key, value) <> (RuntimeappconfigRow.tupled, RuntimeappconfigRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(key), Rep.Some(value))).shaped.<>({r=>import r._; _1.map(_=> RuntimeappconfigRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column key SqlType(VARCHAR), Length(255,true) */
    val key: Rep[String] = column[String]("key", O.Length(255,varying=true))
    /** Database column value SqlType(VARCHAR), Length(255,true) */
    val value: Rep[String] = column[String]("value", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table Runtimeappconfig */
  lazy val Runtimeappconfig = new TableQuery(tag => new Runtimeappconfig(tag))
}
