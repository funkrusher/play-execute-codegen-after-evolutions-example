package tables
// AUTO-GENERATED Slick data model for table Databasechangeloglock
trait DatabasechangeloglockTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Databasechangeloglock
   *  @param ID Database column ID SqlType(INT), PrimaryKey
   *  @param LOCKED Database column LOCKED SqlType(BIT)
   *  @param LOCKGRANTED Database column LOCKGRANTED SqlType(DATETIME), Default(None)
   *  @param LOCKEDBY Database column LOCKEDBY SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
  case class DatabasechangeloglockRow(ID: Int, LOCKED: Boolean, LOCKGRANTED: Option[java.sql.Timestamp], LOCKEDBY: Option[String])
  /** GetResult implicit for fetching DatabasechangeloglockRow objects using plain SQL queries */
  implicit def GetResultDatabasechangeloglockRow(implicit e0: GR[Int], e1: GR[Boolean], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]]): GR[DatabasechangeloglockRow] = GR{
    prs => import prs._
    DatabasechangeloglockRow.tupled((<<[Int], <<[Boolean], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table databasechangeloglock. Objects of this class serve as prototypes for rows in queries. */
  class Databasechangeloglock(_tableTag: Tag) extends profile.api.Table[DatabasechangeloglockRow](_tableTag, Some("testshop"), "databasechangeloglock") {
    def * = (ID, LOCKED, LOCKGRANTED, LOCKEDBY).<>(DatabasechangeloglockRow.tupled, DatabasechangeloglockRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(ID), Rep.Some(LOCKED), LOCKGRANTED, LOCKEDBY)).shaped.<>({r=>import r._; _1.map(_=> DatabasechangeloglockRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID SqlType(INT), PrimaryKey */
    val ID: Rep[Int] = column[Int]("ID", O.PrimaryKey)
    /** Database column LOCKED SqlType(BIT) */
    val LOCKED: Rep[Boolean] = column[Boolean]("LOCKED")
    /** Database column LOCKGRANTED SqlType(DATETIME), Default(None) */
    val LOCKGRANTED: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("LOCKGRANTED", O.Default(None))
    /** Database column LOCKEDBY SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val LOCKEDBY: Rep[Option[String]] = column[Option[String]]("LOCKEDBY", O.Length(255,varying=true), O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table Databasechangeloglock */
  lazy val Databasechangeloglock = new TableQuery(tag => new Databasechangeloglock(tag))
}
