package tables
// AUTO-GENERATED Slick data model for table Databasechangelog
trait DatabasechangelogTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Databasechangelog
   *  @param ID Database column ID SqlType(VARCHAR), Length(255,true)
   *  @param AUTHOR Database column AUTHOR SqlType(VARCHAR), Length(255,true)
   *  @param FILENAME Database column FILENAME SqlType(VARCHAR), Length(255,true)
   *  @param DATEEXECUTED Database column DATEEXECUTED SqlType(DATETIME)
   *  @param ORDEREXECUTED Database column ORDEREXECUTED SqlType(INT)
   *  @param EXECTYPE Database column EXECTYPE SqlType(VARCHAR), Length(10,true)
   *  @param MD5SUM Database column MD5SUM SqlType(VARCHAR), Length(35,true), Default(Some(NULL))
   *  @param DESCRIPTION Database column DESCRIPTION SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param COMMENTS Database column COMMENTS SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param TAG Database column TAG SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param LIQUIBASE Database column LIQUIBASE SqlType(VARCHAR), Length(20,true), Default(Some(NULL))
   *  @param CONTEXTS Database column CONTEXTS SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param LABELS Database column LABELS SqlType(VARCHAR), Length(255,true), Default(Some(NULL))
   *  @param DEPLOYMENT_ID Database column DEPLOYMENT_ID SqlType(VARCHAR), Length(10,true), Default(Some(NULL)) */
  case class DatabasechangelogRow(ID: String, AUTHOR: String, FILENAME: String, DATEEXECUTED: java.sql.Timestamp, ORDEREXECUTED: Int, EXECTYPE: String, MD5SUM: Option[String], DESCRIPTION: Option[String], COMMENTS: Option[String], TAG: Option[String], LIQUIBASE: Option[String], CONTEXTS: Option[String], LABELS: Option[String], DEPLOYMENT_ID: Option[String])
  /** GetResult implicit for fetching DatabasechangelogRow objects using plain SQL queries */
  implicit def GetResultDatabasechangelogRow(implicit e0: GR[String], e1: GR[java.sql.Timestamp], e2: GR[Int], e3: GR[Option[String]]): GR[DatabasechangelogRow] = GR{
    prs => import prs._
    DatabasechangelogRow.tupled((<<[String], <<[String], <<[String], <<[java.sql.Timestamp], <<[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table databasechangelog. Objects of this class serve as prototypes for rows in queries. */
  class Databasechangelog(_tableTag: Tag) extends profile.api.Table[DatabasechangelogRow](_tableTag, Some("testshop"), "databasechangelog") {
    def * = (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, EXECTYPE, MD5SUM, DESCRIPTION, COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID).<>(DatabasechangelogRow.tupled, DatabasechangelogRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(ID), Rep.Some(AUTHOR), Rep.Some(FILENAME), Rep.Some(DATEEXECUTED), Rep.Some(ORDEREXECUTED), Rep.Some(EXECTYPE), MD5SUM, DESCRIPTION, COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID)).shaped.<>({r=>import r._; _1.map(_=> DatabasechangelogRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8, _9, _10, _11, _12, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID SqlType(VARCHAR), Length(255,true) */
    val ID: Rep[String] = column[String]("ID", O.Length(255,varying=true))
    /** Database column AUTHOR SqlType(VARCHAR), Length(255,true) */
    val AUTHOR: Rep[String] = column[String]("AUTHOR", O.Length(255,varying=true))
    /** Database column FILENAME SqlType(VARCHAR), Length(255,true) */
    val FILENAME: Rep[String] = column[String]("FILENAME", O.Length(255,varying=true))
    /** Database column DATEEXECUTED SqlType(DATETIME) */
    val DATEEXECUTED: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("DATEEXECUTED")
    /** Database column ORDEREXECUTED SqlType(INT) */
    val ORDEREXECUTED: Rep[Int] = column[Int]("ORDEREXECUTED")
    /** Database column EXECTYPE SqlType(VARCHAR), Length(10,true) */
    val EXECTYPE: Rep[String] = column[String]("EXECTYPE", O.Length(10,varying=true))
    /** Database column MD5SUM SqlType(VARCHAR), Length(35,true), Default(Some(NULL)) */
    val MD5SUM: Rep[Option[String]] = column[Option[String]]("MD5SUM", O.Length(35,varying=true), O.Default(Some("NULL")))
    /** Database column DESCRIPTION SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val DESCRIPTION: Rep[Option[String]] = column[Option[String]]("DESCRIPTION", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column COMMENTS SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val COMMENTS: Rep[Option[String]] = column[Option[String]]("COMMENTS", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column TAG SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val TAG: Rep[Option[String]] = column[Option[String]]("TAG", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column LIQUIBASE SqlType(VARCHAR), Length(20,true), Default(Some(NULL)) */
    val LIQUIBASE: Rep[Option[String]] = column[Option[String]]("LIQUIBASE", O.Length(20,varying=true), O.Default(Some("NULL")))
    /** Database column CONTEXTS SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val CONTEXTS: Rep[Option[String]] = column[Option[String]]("CONTEXTS", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column LABELS SqlType(VARCHAR), Length(255,true), Default(Some(NULL)) */
    val LABELS: Rep[Option[String]] = column[Option[String]]("LABELS", O.Length(255,varying=true), O.Default(Some("NULL")))
    /** Database column DEPLOYMENT_ID SqlType(VARCHAR), Length(10,true), Default(Some(NULL)) */
    val DEPLOYMENT_ID: Rep[Option[String]] = column[Option[String]]("DEPLOYMENT_ID", O.Length(10,varying=true), O.Default(Some("NULL")))
  }
  /** Collection-like TableQuery object for table Databasechangelog */
  lazy val Databasechangelog = new TableQuery(tag => new Databasechangelog(tag))
}
