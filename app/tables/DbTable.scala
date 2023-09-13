package tables
// AUTO-GENERATED Slick data model for table Db
trait DbTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Db
   *  @param Host Database column Host SqlType(CHAR), Length(60,false), Default('')
   *  @param Db Database column Db SqlType(CHAR), Length(64,false), Default('')
   *  @param User Database column User SqlType(CHAR), Length(80,false), Default('')
   *  @param Select_priv Database column Select_priv SqlType(ENUM), Default(N)
   *  @param Insert_priv Database column Insert_priv SqlType(ENUM), Default(N)
   *  @param Update_priv Database column Update_priv SqlType(ENUM), Default(N)
   *  @param Delete_priv Database column Delete_priv SqlType(ENUM), Default(N)
   *  @param Create_priv Database column Create_priv SqlType(ENUM), Default(N)
   *  @param Drop_priv Database column Drop_priv SqlType(ENUM), Default(N)
   *  @param Grant_priv Database column Grant_priv SqlType(ENUM), Default(N)
   *  @param References_priv Database column References_priv SqlType(ENUM), Default(N)
   *  @param Index_priv Database column Index_priv SqlType(ENUM), Default(N)
   *  @param Alter_priv Database column Alter_priv SqlType(ENUM), Default(N)
   *  @param Create_tmp_table_priv Database column Create_tmp_table_priv SqlType(ENUM), Default(N)
   *  @param Lock_tables_priv Database column Lock_tables_priv SqlType(ENUM), Default(N)
   *  @param Create_view_priv Database column Create_view_priv SqlType(ENUM), Default(N)
   *  @param Show_view_priv Database column Show_view_priv SqlType(ENUM), Default(N)
   *  @param Create_routine_priv Database column Create_routine_priv SqlType(ENUM), Default(N)
   *  @param Alter_routine_priv Database column Alter_routine_priv SqlType(ENUM), Default(N)
   *  @param Execute_priv Database column Execute_priv SqlType(ENUM), Default(N)
   *  @param Event_priv Database column Event_priv SqlType(ENUM), Default(N)
   *  @param Trigger_priv Database column Trigger_priv SqlType(ENUM), Default(N)
   *  @param Delete_history_priv Database column Delete_history_priv SqlType(ENUM), Default(N) */
  case class DbRow(Host: String, Db: String, User: String, Select_priv: Char, Insert_priv: Char, Update_priv: Char, Delete_priv: Char, Create_priv: Char, Drop_priv: Char, Grant_priv: Char, References_priv: Char, Index_priv: Char, Alter_priv: Char, Create_tmp_table_priv: Char, Lock_tables_priv: Char, Create_view_priv: Char, Show_view_priv: Char, Create_routine_priv: Char, Alter_routine_priv: Char, Execute_priv: Char, Event_priv: Char, Trigger_priv: Char, Delete_history_priv: Char)
  /** GetResult implicit for fetching DbRow objects using plain SQL queries */
  implicit def GetResultDbRow(implicit e0: GR[String], e1: GR[Char]): GR[DbRow] = GR{
    prs => import prs._
    DbRow(<<[String], <<[String], <<[String], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char], <<[Char])
  }
  /** Table description of table db. Objects of this class serve as prototypes for rows in queries. */
  class Db(_tableTag: Tag) extends profile.api.Table[DbRow](_tableTag, Some("mysql"), "db") {
    def * = (Host :: Db :: User :: Select_priv :: Insert_priv :: Update_priv :: Delete_priv :: Create_priv :: Drop_priv :: Grant_priv :: References_priv :: Index_priv :: Alter_priv :: Create_tmp_table_priv :: Lock_tables_priv :: Create_view_priv :: Show_view_priv :: Create_routine_priv :: Alter_routine_priv :: Execute_priv :: Event_priv :: Trigger_priv :: Delete_history_priv :: HNil).mapTo[DbRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(Host) :: Rep.Some(Db) :: Rep.Some(User) :: Rep.Some(Select_priv) :: Rep.Some(Insert_priv) :: Rep.Some(Update_priv) :: Rep.Some(Delete_priv) :: Rep.Some(Create_priv) :: Rep.Some(Drop_priv) :: Rep.Some(Grant_priv) :: Rep.Some(References_priv) :: Rep.Some(Index_priv) :: Rep.Some(Alter_priv) :: Rep.Some(Create_tmp_table_priv) :: Rep.Some(Lock_tables_priv) :: Rep.Some(Create_view_priv) :: Rep.Some(Show_view_priv) :: Rep.Some(Create_routine_priv) :: Rep.Some(Alter_routine_priv) :: Rep.Some(Execute_priv) :: Rep.Some(Event_priv) :: Rep.Some(Trigger_priv) :: Rep.Some(Delete_history_priv) :: HNil).shaped.<>(r => DbRow(r(0).asInstanceOf[Option[String]].get, r(1).asInstanceOf[Option[String]].get, r(2).asInstanceOf[Option[String]].get, r(3).asInstanceOf[Option[Char]].get, r(4).asInstanceOf[Option[Char]].get, r(5).asInstanceOf[Option[Char]].get, r(6).asInstanceOf[Option[Char]].get, r(7).asInstanceOf[Option[Char]].get, r(8).asInstanceOf[Option[Char]].get, r(9).asInstanceOf[Option[Char]].get, r(10).asInstanceOf[Option[Char]].get, r(11).asInstanceOf[Option[Char]].get, r(12).asInstanceOf[Option[Char]].get, r(13).asInstanceOf[Option[Char]].get, r(14).asInstanceOf[Option[Char]].get, r(15).asInstanceOf[Option[Char]].get, r(16).asInstanceOf[Option[Char]].get, r(17).asInstanceOf[Option[Char]].get, r(18).asInstanceOf[Option[Char]].get, r(19).asInstanceOf[Option[Char]].get, r(20).asInstanceOf[Option[Char]].get, r(21).asInstanceOf[Option[Char]].get, r(22).asInstanceOf[Option[Char]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column Host SqlType(CHAR), Length(60,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(60,varying=false), O.Default("''"))
    /** Database column Db SqlType(CHAR), Length(64,false), Default('') */
    val Db: Rep[String] = column[String]("Db", O.Length(64,varying=false), O.Default("''"))
    /** Database column User SqlType(CHAR), Length(80,false), Default('') */
    val User: Rep[String] = column[String]("User", O.Length(80,varying=false), O.Default("''"))
    /** Database column Select_priv SqlType(ENUM), Default(N) */
    val Select_priv: Rep[Char] = column[Char]("Select_priv", O.Default('N'))
    /** Database column Insert_priv SqlType(ENUM), Default(N) */
    val Insert_priv: Rep[Char] = column[Char]("Insert_priv", O.Default('N'))
    /** Database column Update_priv SqlType(ENUM), Default(N) */
    val Update_priv: Rep[Char] = column[Char]("Update_priv", O.Default('N'))
    /** Database column Delete_priv SqlType(ENUM), Default(N) */
    val Delete_priv: Rep[Char] = column[Char]("Delete_priv", O.Default('N'))
    /** Database column Create_priv SqlType(ENUM), Default(N) */
    val Create_priv: Rep[Char] = column[Char]("Create_priv", O.Default('N'))
    /** Database column Drop_priv SqlType(ENUM), Default(N) */
    val Drop_priv: Rep[Char] = column[Char]("Drop_priv", O.Default('N'))
    /** Database column Grant_priv SqlType(ENUM), Default(N) */
    val Grant_priv: Rep[Char] = column[Char]("Grant_priv", O.Default('N'))
    /** Database column References_priv SqlType(ENUM), Default(N) */
    val References_priv: Rep[Char] = column[Char]("References_priv", O.Default('N'))
    /** Database column Index_priv SqlType(ENUM), Default(N) */
    val Index_priv: Rep[Char] = column[Char]("Index_priv", O.Default('N'))
    /** Database column Alter_priv SqlType(ENUM), Default(N) */
    val Alter_priv: Rep[Char] = column[Char]("Alter_priv", O.Default('N'))
    /** Database column Create_tmp_table_priv SqlType(ENUM), Default(N) */
    val Create_tmp_table_priv: Rep[Char] = column[Char]("Create_tmp_table_priv", O.Default('N'))
    /** Database column Lock_tables_priv SqlType(ENUM), Default(N) */
    val Lock_tables_priv: Rep[Char] = column[Char]("Lock_tables_priv", O.Default('N'))
    /** Database column Create_view_priv SqlType(ENUM), Default(N) */
    val Create_view_priv: Rep[Char] = column[Char]("Create_view_priv", O.Default('N'))
    /** Database column Show_view_priv SqlType(ENUM), Default(N) */
    val Show_view_priv: Rep[Char] = column[Char]("Show_view_priv", O.Default('N'))
    /** Database column Create_routine_priv SqlType(ENUM), Default(N) */
    val Create_routine_priv: Rep[Char] = column[Char]("Create_routine_priv", O.Default('N'))
    /** Database column Alter_routine_priv SqlType(ENUM), Default(N) */
    val Alter_routine_priv: Rep[Char] = column[Char]("Alter_routine_priv", O.Default('N'))
    /** Database column Execute_priv SqlType(ENUM), Default(N) */
    val Execute_priv: Rep[Char] = column[Char]("Execute_priv", O.Default('N'))
    /** Database column Event_priv SqlType(ENUM), Default(N) */
    val Event_priv: Rep[Char] = column[Char]("Event_priv", O.Default('N'))
    /** Database column Trigger_priv SqlType(ENUM), Default(N) */
    val Trigger_priv: Rep[Char] = column[Char]("Trigger_priv", O.Default('N'))
    /** Database column Delete_history_priv SqlType(ENUM), Default(N) */
    val Delete_history_priv: Rep[Char] = column[Char]("Delete_history_priv", O.Default('N'))

    /** Primary key of Db (database name db_PK) */
    val pk = primaryKey("db_PK", Host :: Db :: User :: HNil)

    /** Index over (User) (database name User) */
    val index1 = index("User", User :: HNil)
  }
  /** Collection-like TableQuery object for table Db */
  lazy val Db = new TableQuery(tag => new Db(tag))
}
