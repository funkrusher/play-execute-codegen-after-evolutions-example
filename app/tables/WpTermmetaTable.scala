package tables
// AUTO-GENERATED Slick data model for table WpTermmeta
trait WpTermmetaTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpTermmeta
   *  @param meta_id Database column meta_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param term_id Database column term_id SqlType(BIGINT UNSIGNED), Default(0)
   *  @param meta_key Database column meta_key SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param meta_value Database column meta_value SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
  case class WpTermmetaRow(meta_id: Long, term_id: Long, meta_key: Option[String], meta_value: Option[String])
  /** GetResult implicit for fetching WpTermmetaRow objects using plain SQL queries */
  implicit def GetResultWpTermmetaRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[WpTermmetaRow] = GR{
    prs => import prs._
    WpTermmetaRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table wp_termmeta. Objects of this class serve as prototypes for rows in queries. */
  class WpTermmeta(_tableTag: Tag) extends profile.api.Table[WpTermmetaRow](_tableTag, Some("wp_atopia"), "wp_termmeta") {
    def * = (meta_id, term_id, meta_key, meta_value).<>(WpTermmetaRow.tupled, WpTermmetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(meta_id), Rep.Some(term_id), meta_key, meta_value)).shaped.<>({r=>import r._; _1.map(_=> WpTermmetaRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column meta_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val meta_id: Rep[Long] = column[Long]("meta_id", O.AutoInc, O.PrimaryKey)
    /** Database column term_id SqlType(BIGINT UNSIGNED), Default(0) */
    val term_id: Rep[Long] = column[Long]("term_id", O.Default(0L))
    /** Database column meta_key SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val meta_key: Rep[Option[String]] = column[Option[String]]("meta_key", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column meta_value SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val meta_value: Rep[Option[String]] = column[Option[String]]("meta_value", O.Length(2147483647,varying=true), O.Default(Some("NULL")))

    /** Index over (meta_key) (database name meta_key) */
    val index1 = index("meta_key", meta_key)
    /** Index over (term_id) (database name term_id) */
    val index2 = index("term_id", term_id)
  }
  /** Collection-like TableQuery object for table WpTermmeta */
  lazy val WpTermmeta = new TableQuery(tag => new WpTermmeta(tag))
}
