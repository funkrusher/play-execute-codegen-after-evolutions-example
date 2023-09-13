package tables
// AUTO-GENERATED Slick data model for table WpCommentmeta
trait WpCommentmetaTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpCommentmeta
   *  @param meta_id Database column meta_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param comment_id Database column comment_id SqlType(BIGINT UNSIGNED), Default(0)
   *  @param meta_key Database column meta_key SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param meta_value Database column meta_value SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
  case class WpCommentmetaRow(meta_id: Long, comment_id: Long, meta_key: Option[String], meta_value: Option[String])
  /** GetResult implicit for fetching WpCommentmetaRow objects using plain SQL queries */
  implicit def GetResultWpCommentmetaRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[WpCommentmetaRow] = GR{
    prs => import prs._
    WpCommentmetaRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table wp_commentmeta. Objects of this class serve as prototypes for rows in queries. */
  class WpCommentmeta(_tableTag: Tag) extends profile.api.Table[WpCommentmetaRow](_tableTag, Some("wp_atopia"), "wp_commentmeta") {
    def * = (meta_id, comment_id, meta_key, meta_value).<>(WpCommentmetaRow.tupled, WpCommentmetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(meta_id), Rep.Some(comment_id), meta_key, meta_value)).shaped.<>({r=>import r._; _1.map(_=> WpCommentmetaRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column meta_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val meta_id: Rep[Long] = column[Long]("meta_id", O.AutoInc, O.PrimaryKey)
    /** Database column comment_id SqlType(BIGINT UNSIGNED), Default(0) */
    val comment_id: Rep[Long] = column[Long]("comment_id", O.Default(0L))
    /** Database column meta_key SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val meta_key: Rep[Option[String]] = column[Option[String]]("meta_key", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column meta_value SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val meta_value: Rep[Option[String]] = column[Option[String]]("meta_value", O.Length(2147483647,varying=true), O.Default(Some("NULL")))

    /** Index over (comment_id) (database name comment_id) */
    val index1 = index("comment_id", comment_id)
    /** Index over (meta_key) (database name meta_key) */
    val index2 = index("meta_key", meta_key)
  }
  /** Collection-like TableQuery object for table WpCommentmeta */
  lazy val WpCommentmeta = new TableQuery(tag => new WpCommentmeta(tag))
}
