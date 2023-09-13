package tables
// AUTO-GENERATED Slick data model for table WpPostmeta
trait WpPostmetaTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpPostmeta
   *  @param meta_id Database column meta_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param post_id Database column post_id SqlType(BIGINT UNSIGNED), Default(0)
   *  @param meta_key Database column meta_key SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param meta_value Database column meta_value SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
  case class WpPostmetaRow(meta_id: Long, post_id: Long, meta_key: Option[String], meta_value: Option[String])
  /** GetResult implicit for fetching WpPostmetaRow objects using plain SQL queries */
  implicit def GetResultWpPostmetaRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[WpPostmetaRow] = GR{
    prs => import prs._
    WpPostmetaRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table wp_postmeta. Objects of this class serve as prototypes for rows in queries. */
  class WpPostmeta(_tableTag: Tag) extends profile.api.Table[WpPostmetaRow](_tableTag, Some("wp_atopia"), "wp_postmeta") {
    def * = (meta_id, post_id, meta_key, meta_value).<>(WpPostmetaRow.tupled, WpPostmetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(meta_id), Rep.Some(post_id), meta_key, meta_value)).shaped.<>({r=>import r._; _1.map(_=> WpPostmetaRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column meta_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val meta_id: Rep[Long] = column[Long]("meta_id", O.AutoInc, O.PrimaryKey)
    /** Database column post_id SqlType(BIGINT UNSIGNED), Default(0) */
    val post_id: Rep[Long] = column[Long]("post_id", O.Default(0L))
    /** Database column meta_key SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val meta_key: Rep[Option[String]] = column[Option[String]]("meta_key", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column meta_value SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val meta_value: Rep[Option[String]] = column[Option[String]]("meta_value", O.Length(2147483647,varying=true), O.Default(Some("NULL")))

    /** Index over (meta_key) (database name meta_key) */
    val index1 = index("meta_key", meta_key)
    /** Index over (post_id) (database name post_id) */
    val index2 = index("post_id", post_id)
  }
  /** Collection-like TableQuery object for table WpPostmeta */
  lazy val WpPostmeta = new TableQuery(tag => new WpPostmeta(tag))
}
