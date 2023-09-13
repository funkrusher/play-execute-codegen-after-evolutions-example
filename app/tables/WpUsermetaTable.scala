package tables
// AUTO-GENERATED Slick data model for table WpUsermeta
trait WpUsermetaTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpUsermeta
   *  @param umeta_id Database column umeta_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey
   *  @param user_id Database column user_id SqlType(BIGINT UNSIGNED), Default(0)
   *  @param meta_key Database column meta_key SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param meta_value Database column meta_value SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
  case class WpUsermetaRow(umeta_id: Long, user_id: Long, meta_key: Option[String], meta_value: Option[String])
  /** GetResult implicit for fetching WpUsermetaRow objects using plain SQL queries */
  implicit def GetResultWpUsermetaRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[WpUsermetaRow] = GR{
    prs => import prs._
    WpUsermetaRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String]))
  }
  /** Table description of table wp_usermeta. Objects of this class serve as prototypes for rows in queries. */
  class WpUsermeta(_tableTag: Tag) extends profile.api.Table[WpUsermetaRow](_tableTag, Some("wp_atopia"), "wp_usermeta") {
    def * = (umeta_id, user_id, meta_key, meta_value).<>(WpUsermetaRow.tupled, WpUsermetaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(umeta_id), Rep.Some(user_id), meta_key, meta_value)).shaped.<>({r=>import r._; _1.map(_=> WpUsermetaRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column umeta_id SqlType(BIGINT UNSIGNED), AutoInc, PrimaryKey */
    val umeta_id: Rep[Long] = column[Long]("umeta_id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(BIGINT UNSIGNED), Default(0) */
    val user_id: Rep[Long] = column[Long]("user_id", O.Default(0L))
    /** Database column meta_key SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val meta_key: Rep[Option[String]] = column[Option[String]]("meta_key", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column meta_value SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val meta_value: Rep[Option[String]] = column[Option[String]]("meta_value", O.Length(2147483647,varying=true), O.Default(Some("NULL")))

    /** Index over (meta_key) (database name meta_key) */
    val index1 = index("meta_key", meta_key)
    /** Index over (user_id) (database name user_id) */
    val index2 = index("user_id", user_id)
  }
  /** Collection-like TableQuery object for table WpUsermeta */
  lazy val WpUsermeta = new TableQuery(tag => new WpUsermeta(tag))
}
