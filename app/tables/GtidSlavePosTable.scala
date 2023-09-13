package tables
// AUTO-GENERATED Slick data model for table GtidSlavePos
trait GtidSlavePosTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table GtidSlavePos
   *  @param domain_id Database column domain_id SqlType(INT UNSIGNED)
   *  @param sub_id Database column sub_id SqlType(BIGINT UNSIGNED)
   *  @param server_id Database column server_id SqlType(INT UNSIGNED)
   *  @param seq_no Database column seq_no SqlType(BIGINT UNSIGNED) */
  case class GtidSlavePosRow(domain_id: Long, sub_id: Long, server_id: Long, seq_no: Long)
  /** GetResult implicit for fetching GtidSlavePosRow objects using plain SQL queries */
  implicit def GetResultGtidSlavePosRow(implicit e0: GR[Long]): GR[GtidSlavePosRow] = GR{
    prs => import prs._
    GtidSlavePosRow.tupled((<<[Long], <<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table gtid_slave_pos. Objects of this class serve as prototypes for rows in queries. */
  class GtidSlavePos(_tableTag: Tag) extends profile.api.Table[GtidSlavePosRow](_tableTag, Some("mysql"), "gtid_slave_pos") {
    def * = (domain_id, sub_id, server_id, seq_no).<>(GtidSlavePosRow.tupled, GtidSlavePosRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(domain_id), Rep.Some(sub_id), Rep.Some(server_id), Rep.Some(seq_no))).shaped.<>({r=>import r._; _1.map(_=> GtidSlavePosRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column domain_id SqlType(INT UNSIGNED) */
    val domain_id: Rep[Long] = column[Long]("domain_id")
    /** Database column sub_id SqlType(BIGINT UNSIGNED) */
    val sub_id: Rep[Long] = column[Long]("sub_id")
    /** Database column server_id SqlType(INT UNSIGNED) */
    val server_id: Rep[Long] = column[Long]("server_id")
    /** Database column seq_no SqlType(BIGINT UNSIGNED) */
    val seq_no: Rep[Long] = column[Long]("seq_no")

    /** Primary key of GtidSlavePos (database name gtid_slave_pos_PK) */
    val pk = primaryKey("gtid_slave_pos_PK", (domain_id, sub_id))
  }
  /** Collection-like TableQuery object for table GtidSlavePos */
  lazy val GtidSlavePos = new TableQuery(tag => new GtidSlavePos(tag))
}
