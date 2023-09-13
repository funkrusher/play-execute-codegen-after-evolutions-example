package tables
// AUTO-GENERATED Slick data model for table TransactionRegistry
trait TransactionRegistryTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table TransactionRegistry
   *  @param transaction_id Database column transaction_id SqlType(BIGINT UNSIGNED), PrimaryKey
   *  @param commit_id Database column commit_id SqlType(BIGINT UNSIGNED)
   *  @param begin_timestamp Database column begin_timestamp SqlType(TIMESTAMP)
   *  @param commit_timestamp Database column commit_timestamp SqlType(TIMESTAMP)
   *  @param isolation_level Database column isolation_level SqlType(ENUM), Length(16,true) */
  case class TransactionRegistryRow(transaction_id: Long, commit_id: Long, begin_timestamp: java.sql.Timestamp, commit_timestamp: java.sql.Timestamp, isolation_level: String)
  /** GetResult implicit for fetching TransactionRegistryRow objects using plain SQL queries */
  implicit def GetResultTransactionRegistryRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String]): GR[TransactionRegistryRow] = GR{
    prs => import prs._
    TransactionRegistryRow.tupled((<<[Long], <<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String]))
  }
  /** Table description of table transaction_registry. Objects of this class serve as prototypes for rows in queries. */
  class TransactionRegistry(_tableTag: Tag) extends profile.api.Table[TransactionRegistryRow](_tableTag, Some("mysql"), "transaction_registry") {
    def * = (transaction_id, commit_id, begin_timestamp, commit_timestamp, isolation_level).<>(TransactionRegistryRow.tupled, TransactionRegistryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(transaction_id), Rep.Some(commit_id), Rep.Some(begin_timestamp), Rep.Some(commit_timestamp), Rep.Some(isolation_level))).shaped.<>({r=>import r._; _1.map(_=> TransactionRegistryRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column transaction_id SqlType(BIGINT UNSIGNED), PrimaryKey */
    val transaction_id: Rep[Long] = column[Long]("transaction_id", O.PrimaryKey)
    /** Database column commit_id SqlType(BIGINT UNSIGNED) */
    val commit_id: Rep[Long] = column[Long]("commit_id")
    /** Database column begin_timestamp SqlType(TIMESTAMP) */
    val begin_timestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("begin_timestamp")
    /** Database column commit_timestamp SqlType(TIMESTAMP) */
    val commit_timestamp: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("commit_timestamp")
    /** Database column isolation_level SqlType(ENUM), Length(16,true) */
    val isolation_level: Rep[String] = column[String]("isolation_level", O.Length(16,varying=true))

    /** Index over (begin_timestamp) (database name begin_timestamp) */
    val index1 = index("begin_timestamp", begin_timestamp)
    /** Uniqueness Index over (commit_id) (database name commit_id) */
    val index2 = index("commit_id", commit_id, unique=true)
    /** Index over (commit_timestamp,transaction_id) (database name commit_timestamp) */
    val index3 = index("commit_timestamp", (commit_timestamp, transaction_id))
  }
  /** Collection-like TableQuery object for table TransactionRegistry */
  lazy val TransactionRegistry = new TableQuery(tag => new TransactionRegistry(tag))
}
