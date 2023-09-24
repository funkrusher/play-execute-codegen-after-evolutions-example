package tables
// AUTO-GENERATED Slick data model for table User
trait UserTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table User
<<<<<<< Updated upstream
   *  @param Host Database column Host SqlType(CHAR), Length(60,false), Default('')
   *  @param User Database column User SqlType(CHAR), Length(80,false), Default('')
   *  @param Password Database column Password SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL))
   *  @param Select_priv Database column Select_priv SqlType(VARCHAR), Default(None)
   *  @param Insert_priv Database column Insert_priv SqlType(VARCHAR), Default(None)
   *  @param Update_priv Database column Update_priv SqlType(VARCHAR), Default(None)
   *  @param Delete_priv Database column Delete_priv SqlType(VARCHAR), Default(None)
   *  @param Create_priv Database column Create_priv SqlType(VARCHAR), Default(None)
   *  @param Drop_priv Database column Drop_priv SqlType(VARCHAR), Default(None)
   *  @param Reload_priv Database column Reload_priv SqlType(VARCHAR), Default(None)
   *  @param Shutdown_priv Database column Shutdown_priv SqlType(VARCHAR), Default(None)
   *  @param Process_priv Database column Process_priv SqlType(VARCHAR), Default(None)
   *  @param File_priv Database column File_priv SqlType(VARCHAR), Default(None)
   *  @param Grant_priv Database column Grant_priv SqlType(VARCHAR), Default(None)
   *  @param References_priv Database column References_priv SqlType(VARCHAR), Default(None)
   *  @param Index_priv Database column Index_priv SqlType(VARCHAR), Default(None)
   *  @param Alter_priv Database column Alter_priv SqlType(VARCHAR), Default(None)
   *  @param Show_db_priv Database column Show_db_priv SqlType(VARCHAR), Default(None)
   *  @param Super_priv Database column Super_priv SqlType(VARCHAR), Default(None)
   *  @param Create_tmp_table_priv Database column Create_tmp_table_priv SqlType(VARCHAR), Default(None)
   *  @param Lock_tables_priv Database column Lock_tables_priv SqlType(VARCHAR), Default(None)
   *  @param Execute_priv Database column Execute_priv SqlType(VARCHAR), Default(None)
   *  @param Repl_slave_priv Database column Repl_slave_priv SqlType(VARCHAR), Default(None)
   *  @param Repl_client_priv Database column Repl_client_priv SqlType(VARCHAR), Default(None)
   *  @param Create_view_priv Database column Create_view_priv SqlType(VARCHAR), Default(None)
   *  @param Show_view_priv Database column Show_view_priv SqlType(VARCHAR), Default(None)
   *  @param Create_routine_priv Database column Create_routine_priv SqlType(VARCHAR), Default(None)
   *  @param Alter_routine_priv Database column Alter_routine_priv SqlType(VARCHAR), Default(None)
   *  @param Create_user_priv Database column Create_user_priv SqlType(VARCHAR), Default(None)
   *  @param Event_priv Database column Event_priv SqlType(VARCHAR), Default(None)
   *  @param Trigger_priv Database column Trigger_priv SqlType(VARCHAR), Default(None)
   *  @param Create_tablespace_priv Database column Create_tablespace_priv SqlType(VARCHAR), Default(None)
   *  @param Delete_history_priv Database column Delete_history_priv SqlType(VARCHAR), Default(None)
   *  @param ssl_type Database column ssl_type SqlType(VARCHAR), Length(9,true), Default(Some(NULL))
   *  @param ssl_cipher Database column ssl_cipher SqlType(LONGTEXT), Length(2147483647,true), Default('')
   *  @param x509_issuer Database column x509_issuer SqlType(LONGTEXT), Length(2147483647,true), Default('')
   *  @param x509_subject Database column x509_subject SqlType(LONGTEXT), Length(2147483647,true), Default('')
   *  @param max_questions Database column max_questions SqlType(BIGINT UNSIGNED), Default(0)
   *  @param max_updates Database column max_updates SqlType(BIGINT UNSIGNED), Default(0)
   *  @param max_connections Database column max_connections SqlType(BIGINT UNSIGNED), Default(0)
   *  @param max_user_connections Database column max_user_connections SqlType(BIGINT), Default(0)
   *  @param plugin Database column plugin SqlType(LONGTEXT), Length(2147483647,true), Default('')
   *  @param authentication_string Database column authentication_string SqlType(LONGTEXT), Length(2147483647,true), Default('')
   *  @param password_expired Database column password_expired SqlType(VARCHAR)
   *  @param is_role Database column is_role SqlType(VARCHAR), Default(None)
   *  @param default_role Database column default_role SqlType(LONGTEXT), Length(2147483647,true), Default('')
   *  @param max_statement_time Database column max_statement_time SqlType(DECIMAL), Default(0.000000) */
  case class UserRow(Host: String, User: String, Password: Option[String], Select_priv: Option[Char], Insert_priv: Option[Char], Update_priv: Option[Char], Delete_priv: Option[Char], Create_priv: Option[Char], Drop_priv: Option[Char], Reload_priv: Option[Char], Shutdown_priv: Option[Char], Process_priv: Option[Char], File_priv: Option[Char], Grant_priv: Option[Char], References_priv: Option[Char], Index_priv: Option[Char], Alter_priv: Option[Char], Show_db_priv: Option[Char], Super_priv: Option[Char], Create_tmp_table_priv: Option[Char], Lock_tables_priv: Option[Char], Execute_priv: Option[Char], Repl_slave_priv: Option[Char], Repl_client_priv: Option[Char], Create_view_priv: Option[Char], Show_view_priv: Option[Char], Create_routine_priv: Option[Char], Alter_routine_priv: Option[Char], Create_user_priv: Option[Char], Event_priv: Option[Char], Trigger_priv: Option[Char], Create_tablespace_priv: Option[Char], Delete_history_priv: Option[Char], ssl_type: Option[String], ssl_cipher: String, x509_issuer: String, x509_subject: String, max_questions: Long, max_updates: Long, max_connections: Long, max_user_connections: Long, plugin: String, authentication_string: String, password_expired: Char, is_role: Option[Char], default_role: String, max_statement_time: scala.math.BigDecimal)
  /** GetResult implicit for fetching UserRow objects using plain SQL queries */
  implicit def GetResultUserRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[Char]], e3: GR[Long], e4: GR[Char], e5: GR[scala.math.BigDecimal]): GR[UserRow] = GR{
    prs => import prs._
    UserRow(<<[String], <<[String], <<?[String], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[Char], <<?[String], <<[String], <<[String], <<[String], <<[Long], <<[Long], <<[Long], <<[Long], <<[String], <<[String], <<[Char], <<?[Char], <<[String], <<[scala.math.BigDecimal])
=======
   *  @param userId Database column userId SqlType(INT), AutoInc, PrimaryKey
   *  @param clientId Database column clientId SqlType(INT)
   *  @param email Database column email SqlType(VARCHAR), Length(255,true)
   *  @param firstname Database column firstname SqlType(VARCHAR), Length(255,true)
   *  @param lastname Database column lastname SqlType(VARCHAR), Length(255,true)
   *  @param isAdmin Database column isAdmin SqlType(BIT) */
  case class UserRow(userId: Int, clientId: Int, email: String, firstname: String, lastname: String, isAdmin: Boolean)
  /** GetResult implicit for fetching UserRow objects using plain SQL queries */
  implicit def GetResultUserRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Boolean]): GR[UserRow] = GR{
    prs => import prs._
    UserRow.tupled((<<[Int], <<[Int], <<[String], <<[String], <<[String], <<[Boolean]))
>>>>>>> Stashed changes
  }
  /** Table description of table user. Objects of this class serve as prototypes for rows in queries. */
  class User(_tableTag: Tag) extends profile.api.Table[UserRow](_tableTag, Some("mysql"), "user") {
    def * = (Host :: User :: Password :: Select_priv :: Insert_priv :: Update_priv :: Delete_priv :: Create_priv :: Drop_priv :: Reload_priv :: Shutdown_priv :: Process_priv :: File_priv :: Grant_priv :: References_priv :: Index_priv :: Alter_priv :: Show_db_priv :: Super_priv :: Create_tmp_table_priv :: Lock_tables_priv :: Execute_priv :: Repl_slave_priv :: Repl_client_priv :: Create_view_priv :: Show_view_priv :: Create_routine_priv :: Alter_routine_priv :: Create_user_priv :: Event_priv :: Trigger_priv :: Create_tablespace_priv :: Delete_history_priv :: ssl_type :: ssl_cipher :: x509_issuer :: x509_subject :: max_questions :: max_updates :: max_connections :: max_user_connections :: plugin :: authentication_string :: password_expired :: is_role :: default_role :: max_statement_time :: HNil).mapTo[UserRow]
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(Host) :: Rep.Some(User) :: Password :: Select_priv :: Insert_priv :: Update_priv :: Delete_priv :: Create_priv :: Drop_priv :: Reload_priv :: Shutdown_priv :: Process_priv :: File_priv :: Grant_priv :: References_priv :: Index_priv :: Alter_priv :: Show_db_priv :: Super_priv :: Create_tmp_table_priv :: Lock_tables_priv :: Execute_priv :: Repl_slave_priv :: Repl_client_priv :: Create_view_priv :: Show_view_priv :: Create_routine_priv :: Alter_routine_priv :: Create_user_priv :: Event_priv :: Trigger_priv :: Create_tablespace_priv :: Delete_history_priv :: ssl_type :: Rep.Some(ssl_cipher) :: Rep.Some(x509_issuer) :: Rep.Some(x509_subject) :: Rep.Some(max_questions) :: Rep.Some(max_updates) :: Rep.Some(max_connections) :: Rep.Some(max_user_connections) :: Rep.Some(plugin) :: Rep.Some(authentication_string) :: Rep.Some(password_expired) :: is_role :: Rep.Some(default_role) :: Rep.Some(max_statement_time) :: HNil).shaped.<>(r => UserRow(r(0).asInstanceOf[Option[String]].get, r(1).asInstanceOf[Option[String]].get, r(2).asInstanceOf[Option[String]], r(3).asInstanceOf[Option[Char]], r(4).asInstanceOf[Option[Char]], r(5).asInstanceOf[Option[Char]], r(6).asInstanceOf[Option[Char]], r(7).asInstanceOf[Option[Char]], r(8).asInstanceOf[Option[Char]], r(9).asInstanceOf[Option[Char]], r(10).asInstanceOf[Option[Char]], r(11).asInstanceOf[Option[Char]], r(12).asInstanceOf[Option[Char]], r(13).asInstanceOf[Option[Char]], r(14).asInstanceOf[Option[Char]], r(15).asInstanceOf[Option[Char]], r(16).asInstanceOf[Option[Char]], r(17).asInstanceOf[Option[Char]], r(18).asInstanceOf[Option[Char]], r(19).asInstanceOf[Option[Char]], r(20).asInstanceOf[Option[Char]], r(21).asInstanceOf[Option[Char]], r(22).asInstanceOf[Option[Char]], r(23).asInstanceOf[Option[Char]], r(24).asInstanceOf[Option[Char]], r(25).asInstanceOf[Option[Char]], r(26).asInstanceOf[Option[Char]], r(27).asInstanceOf[Option[Char]], r(28).asInstanceOf[Option[Char]], r(29).asInstanceOf[Option[Char]], r(30).asInstanceOf[Option[Char]], r(31).asInstanceOf[Option[Char]], r(32).asInstanceOf[Option[Char]], r(33).asInstanceOf[Option[String]], r(34).asInstanceOf[Option[String]].get, r(35).asInstanceOf[Option[String]].get, r(36).asInstanceOf[Option[String]].get, r(37).asInstanceOf[Option[Long]].get, r(38).asInstanceOf[Option[Long]].get, r(39).asInstanceOf[Option[Long]].get, r(40).asInstanceOf[Option[Long]].get, r(41).asInstanceOf[Option[String]].get, r(42).asInstanceOf[Option[String]].get, r(43).asInstanceOf[Option[Char]].get, r(44).asInstanceOf[Option[Char]], r(45).asInstanceOf[Option[String]].get, r(46).asInstanceOf[Option[scala.math.BigDecimal]].get), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

<<<<<<< Updated upstream
    /** Database column Host SqlType(CHAR), Length(60,false), Default('') */
    val Host: Rep[String] = column[String]("Host", O.Length(60,varying=false), O.Default("''"))
    /** Database column User SqlType(CHAR), Length(80,false), Default('') */
    val User: Rep[String] = column[String]("User", O.Length(80,varying=false), O.Default("''"))
    /** Database column Password SqlType(LONGTEXT), Length(2147483647,true), Default(Some(NULL)) */
    val Password: Rep[Option[String]] = column[Option[String]]("Password", O.Length(2147483647,varying=true), O.Default(Some("NULL")))
    /** Database column Select_priv SqlType(VARCHAR), Default(None) */
    val Select_priv: Rep[Option[Char]] = column[Option[Char]]("Select_priv", O.Default(None))
    /** Database column Insert_priv SqlType(VARCHAR), Default(None) */
    val Insert_priv: Rep[Option[Char]] = column[Option[Char]]("Insert_priv", O.Default(None))
    /** Database column Update_priv SqlType(VARCHAR), Default(None) */
    val Update_priv: Rep[Option[Char]] = column[Option[Char]]("Update_priv", O.Default(None))
    /** Database column Delete_priv SqlType(VARCHAR), Default(None) */
    val Delete_priv: Rep[Option[Char]] = column[Option[Char]]("Delete_priv", O.Default(None))
    /** Database column Create_priv SqlType(VARCHAR), Default(None) */
    val Create_priv: Rep[Option[Char]] = column[Option[Char]]("Create_priv", O.Default(None))
    /** Database column Drop_priv SqlType(VARCHAR), Default(None) */
    val Drop_priv: Rep[Option[Char]] = column[Option[Char]]("Drop_priv", O.Default(None))
    /** Database column Reload_priv SqlType(VARCHAR), Default(None) */
    val Reload_priv: Rep[Option[Char]] = column[Option[Char]]("Reload_priv", O.Default(None))
    /** Database column Shutdown_priv SqlType(VARCHAR), Default(None) */
    val Shutdown_priv: Rep[Option[Char]] = column[Option[Char]]("Shutdown_priv", O.Default(None))
    /** Database column Process_priv SqlType(VARCHAR), Default(None) */
    val Process_priv: Rep[Option[Char]] = column[Option[Char]]("Process_priv", O.Default(None))
    /** Database column File_priv SqlType(VARCHAR), Default(None) */
    val File_priv: Rep[Option[Char]] = column[Option[Char]]("File_priv", O.Default(None))
    /** Database column Grant_priv SqlType(VARCHAR), Default(None) */
    val Grant_priv: Rep[Option[Char]] = column[Option[Char]]("Grant_priv", O.Default(None))
    /** Database column References_priv SqlType(VARCHAR), Default(None) */
    val References_priv: Rep[Option[Char]] = column[Option[Char]]("References_priv", O.Default(None))
    /** Database column Index_priv SqlType(VARCHAR), Default(None) */
    val Index_priv: Rep[Option[Char]] = column[Option[Char]]("Index_priv", O.Default(None))
    /** Database column Alter_priv SqlType(VARCHAR), Default(None) */
    val Alter_priv: Rep[Option[Char]] = column[Option[Char]]("Alter_priv", O.Default(None))
    /** Database column Show_db_priv SqlType(VARCHAR), Default(None) */
    val Show_db_priv: Rep[Option[Char]] = column[Option[Char]]("Show_db_priv", O.Default(None))
    /** Database column Super_priv SqlType(VARCHAR), Default(None) */
    val Super_priv: Rep[Option[Char]] = column[Option[Char]]("Super_priv", O.Default(None))
    /** Database column Create_tmp_table_priv SqlType(VARCHAR), Default(None) */
    val Create_tmp_table_priv: Rep[Option[Char]] = column[Option[Char]]("Create_tmp_table_priv", O.Default(None))
    /** Database column Lock_tables_priv SqlType(VARCHAR), Default(None) */
    val Lock_tables_priv: Rep[Option[Char]] = column[Option[Char]]("Lock_tables_priv", O.Default(None))
    /** Database column Execute_priv SqlType(VARCHAR), Default(None) */
    val Execute_priv: Rep[Option[Char]] = column[Option[Char]]("Execute_priv", O.Default(None))
    /** Database column Repl_slave_priv SqlType(VARCHAR), Default(None) */
    val Repl_slave_priv: Rep[Option[Char]] = column[Option[Char]]("Repl_slave_priv", O.Default(None))
    /** Database column Repl_client_priv SqlType(VARCHAR), Default(None) */
    val Repl_client_priv: Rep[Option[Char]] = column[Option[Char]]("Repl_client_priv", O.Default(None))
    /** Database column Create_view_priv SqlType(VARCHAR), Default(None) */
    val Create_view_priv: Rep[Option[Char]] = column[Option[Char]]("Create_view_priv", O.Default(None))
    /** Database column Show_view_priv SqlType(VARCHAR), Default(None) */
    val Show_view_priv: Rep[Option[Char]] = column[Option[Char]]("Show_view_priv", O.Default(None))
    /** Database column Create_routine_priv SqlType(VARCHAR), Default(None) */
    val Create_routine_priv: Rep[Option[Char]] = column[Option[Char]]("Create_routine_priv", O.Default(None))
    /** Database column Alter_routine_priv SqlType(VARCHAR), Default(None) */
    val Alter_routine_priv: Rep[Option[Char]] = column[Option[Char]]("Alter_routine_priv", O.Default(None))
    /** Database column Create_user_priv SqlType(VARCHAR), Default(None) */
    val Create_user_priv: Rep[Option[Char]] = column[Option[Char]]("Create_user_priv", O.Default(None))
    /** Database column Event_priv SqlType(VARCHAR), Default(None) */
    val Event_priv: Rep[Option[Char]] = column[Option[Char]]("Event_priv", O.Default(None))
    /** Database column Trigger_priv SqlType(VARCHAR), Default(None) */
    val Trigger_priv: Rep[Option[Char]] = column[Option[Char]]("Trigger_priv", O.Default(None))
    /** Database column Create_tablespace_priv SqlType(VARCHAR), Default(None) */
    val Create_tablespace_priv: Rep[Option[Char]] = column[Option[Char]]("Create_tablespace_priv", O.Default(None))
    /** Database column Delete_history_priv SqlType(VARCHAR), Default(None) */
    val Delete_history_priv: Rep[Option[Char]] = column[Option[Char]]("Delete_history_priv", O.Default(None))
    /** Database column ssl_type SqlType(VARCHAR), Length(9,true), Default(Some(NULL)) */
    val ssl_type: Rep[Option[String]] = column[Option[String]]("ssl_type", O.Length(9,varying=true), O.Default(Some("NULL")))
    /** Database column ssl_cipher SqlType(LONGTEXT), Length(2147483647,true), Default('') */
    val ssl_cipher: Rep[String] = column[String]("ssl_cipher", O.Length(2147483647,varying=true), O.Default("''"))
    /** Database column x509_issuer SqlType(LONGTEXT), Length(2147483647,true), Default('') */
    val x509_issuer: Rep[String] = column[String]("x509_issuer", O.Length(2147483647,varying=true), O.Default("''"))
    /** Database column x509_subject SqlType(LONGTEXT), Length(2147483647,true), Default('') */
    val x509_subject: Rep[String] = column[String]("x509_subject", O.Length(2147483647,varying=true), O.Default("''"))
    /** Database column max_questions SqlType(BIGINT UNSIGNED), Default(0) */
    val max_questions: Rep[Long] = column[Long]("max_questions", O.Default(0L))
    /** Database column max_updates SqlType(BIGINT UNSIGNED), Default(0) */
    val max_updates: Rep[Long] = column[Long]("max_updates", O.Default(0L))
    /** Database column max_connections SqlType(BIGINT UNSIGNED), Default(0) */
    val max_connections: Rep[Long] = column[Long]("max_connections", O.Default(0L))
    /** Database column max_user_connections SqlType(BIGINT), Default(0) */
    val max_user_connections: Rep[Long] = column[Long]("max_user_connections", O.Default(0L))
    /** Database column plugin SqlType(LONGTEXT), Length(2147483647,true), Default('') */
    val plugin: Rep[String] = column[String]("plugin", O.Length(2147483647,varying=true), O.Default("''"))
    /** Database column authentication_string SqlType(LONGTEXT), Length(2147483647,true), Default('') */
    val authentication_string: Rep[String] = column[String]("authentication_string", O.Length(2147483647,varying=true), O.Default("''"))
    /** Database column password_expired SqlType(VARCHAR) */
    val password_expired: Rep[Char] = column[Char]("password_expired")
    /** Database column is_role SqlType(VARCHAR), Default(None) */
    val is_role: Rep[Option[Char]] = column[Option[Char]]("is_role", O.Default(None))
    /** Database column default_role SqlType(LONGTEXT), Length(2147483647,true), Default('') */
    val default_role: Rep[String] = column[String]("default_role", O.Length(2147483647,varying=true), O.Default("''"))
    /** Database column max_statement_time SqlType(DECIMAL), Default(0.000000) */
    val max_statement_time: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("max_statement_time", O.Default(scala.math.BigDecimal("0.000000")))
=======
    /** Database column userId SqlType(INT), AutoInc, PrimaryKey */
    val userId: Rep[Int] = column[Int]("userId", O.AutoInc, O.PrimaryKey)
    /** Database column clientId SqlType(INT) */
    val clientId: Rep[Int] = column[Int]("clientId")
    /** Database column email SqlType(VARCHAR), Length(255,true) */
    val email: Rep[String] = column[String]("email", O.Length(255,varying=true))
    /** Database column firstname SqlType(VARCHAR), Length(255,true) */
    val firstname: Rep[String] = column[String]("firstname", O.Length(255,varying=true))
    /** Database column lastname SqlType(VARCHAR), Length(255,true) */
    val lastname: Rep[String] = column[String]("lastname", O.Length(255,varying=true))
    /** Database column isAdmin SqlType(BIT) */
    val isAdmin: Rep[Boolean] = column[Boolean]("isAdmin")

    /** Foreign key referencing Client (database name fk_user_clientId) */
    lazy val clientFk = foreignKey("fk_user_clientId", clientId, Client)(r => r.clientId, onUpdate=ForeignKeyAction.Restrict, onDelete=ForeignKeyAction.Cascade)
>>>>>>> Stashed changes
  }
  /** Collection-like TableQuery object for table User */
  lazy val User = new TableQuery(tag => new User(tag))
}
