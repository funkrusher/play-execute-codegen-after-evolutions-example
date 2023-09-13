package tables
// AUTO-GENERATED Slick data model for table WpYoastMigrations
trait WpYoastMigrationsTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table WpYoastMigrations
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param version Database column version SqlType(VARCHAR), Length(191,true), Default(Some(NULL)) */
  case class WpYoastMigrationsRow(id: Long, version: Option[String])
  /** GetResult implicit for fetching WpYoastMigrationsRow objects using plain SQL queries */
  implicit def GetResultWpYoastMigrationsRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[WpYoastMigrationsRow] = GR{
    prs => import prs._
    WpYoastMigrationsRow.tupled((<<[Long], <<?[String]))
  }
  /** Table description of table wp_yoast_migrations. Objects of this class serve as prototypes for rows in queries. */
  class WpYoastMigrations(_tableTag: Tag) extends profile.api.Table[WpYoastMigrationsRow](_tableTag, Some("wp_atopia"), "wp_yoast_migrations") {
    def * = (id, version).<>(WpYoastMigrationsRow.tupled, WpYoastMigrationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), version)).shaped.<>({r=>import r._; _1.map(_=> WpYoastMigrationsRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column version SqlType(VARCHAR), Length(191,true), Default(Some(NULL)) */
    val version: Rep[Option[String]] = column[Option[String]]("version", O.Length(191,varying=true), O.Default(Some("NULL")))

    /** Uniqueness Index over (version) (database name idx_wp_yoast_migrations_version) */
    val index1 = index("idx_wp_yoast_migrations_version", version, unique=true)
  }
  /** Collection-like TableQuery object for table WpYoastMigrations */
  lazy val WpYoastMigrations = new TableQuery(tag => new WpYoastMigrations(tag))
}
