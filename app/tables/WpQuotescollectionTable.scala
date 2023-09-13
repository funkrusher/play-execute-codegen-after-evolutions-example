package tables
// AUTO-GENERATED Slick data model for table WpQuotescollection
trait WpQuotescollectionTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpQuotescollection
   *  @param quote_id Database column quote_id SqlType(MEDIUMINT), AutoInc, PrimaryKey
   *  @param quote Database column quote SqlType(TEXT)
   *  @param author Database column author SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param source Database column source SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param tags Database column tags SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param public Database column public SqlType(ENUM), Length(3,true), Default('yes')
   *  @param time_added Database column time_added SqlType(DATETIME)
   *  @param time_updated Database column time_updated SqlType(DATETIME), Default(None) */
  case class WpQuotescollectionRow(quote_id: Int, quote: String, author: Option[String], source: Option[String], tags: Option[String], public: String, time_added: java.sql.Timestamp, time_updated: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching WpQuotescollectionRow objects using plain SQL queries */
  implicit def GetResultWpQuotescollectionRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[Option[java.sql.Timestamp]]): GR[WpQuotescollectionRow] = GR{
    prs => import prs._
    WpQuotescollectionRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table wp_quotescollection. Objects of this class serve as prototypes for rows in queries. */
  class WpQuotescollection(_tableTag: Tag) extends profile.api.Table[WpQuotescollectionRow](_tableTag, Some("wp_atopia"), "wp_quotescollection") {
    def * = (quote_id, quote, author, source, tags, public, time_added, time_updated).<>(WpQuotescollectionRow.tupled, WpQuotescollectionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(quote_id), Rep.Some(quote), author, source, tags, Rep.Some(public), Rep.Some(time_added), time_updated)).shaped.<>({r=>import r._; _1.map(_=> WpQuotescollectionRow.tupled((_1.get, _2.get, _3, _4, _5, _6.get, _7.get, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column quote_id SqlType(MEDIUMINT), AutoInc, PrimaryKey */
    val quote_id: Rep[Int] = column[Int]("quote_id", O.AutoInc, O.PrimaryKey)
    /** Database column quote SqlType(TEXT) */
    val quote: Rep[String] = column[String]("quote")
    /** Database column author SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val author: Rep[Option[String]] = column[Option[String]]("author", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column source SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val source: Rep[Option[String]] = column[Option[String]]("source", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column tags SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val tags: Rep[Option[String]] = column[Option[String]]("tags", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column public SqlType(ENUM), Length(3,true), Default('yes') */
    val public: Rep[String] = column[String]("public", O.Length(3,varying=true), O.Default("'yes'"))
    /** Database column time_added SqlType(DATETIME) */
    val time_added: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("time_added")
    /** Database column time_updated SqlType(DATETIME), Default(None) */
    val time_updated: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("time_updated", O.Default(None))
  }
  /** Collection-like TableQuery object for table WpQuotescollection */
  lazy val WpQuotescollection = new TableQuery(tag => new WpQuotescollection(tag))
}
