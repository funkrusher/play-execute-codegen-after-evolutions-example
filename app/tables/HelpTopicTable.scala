package tables
// AUTO-GENERATED Slick data model for table HelpTopic
trait HelpTopicTable {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table HelpTopic
   *  @param help_topic_id Database column help_topic_id SqlType(INT UNSIGNED), PrimaryKey
   *  @param name Database column name SqlType(CHAR), Length(64,false)
   *  @param help_category_id Database column help_category_id SqlType(SMALLINT UNSIGNED)
   *  @param description Database column description SqlType(TEXT)
   *  @param example Database column example SqlType(TEXT)
   *  @param url Database column url SqlType(TEXT) */
  case class HelpTopicRow(help_topic_id: Long, name: String, help_category_id: Int, description: String, example: String, url: String)
  /** GetResult implicit for fetching HelpTopicRow objects using plain SQL queries */
  implicit def GetResultHelpTopicRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Int]): GR[HelpTopicRow] = GR{
    prs => import prs._
    HelpTopicRow.tupled((<<[Long], <<[String], <<[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table help_topic. Objects of this class serve as prototypes for rows in queries. */
  class HelpTopic(_tableTag: Tag) extends profile.api.Table[HelpTopicRow](_tableTag, Some("mysql"), "help_topic") {
    def * = (help_topic_id, name, help_category_id, description, example, url).<>(HelpTopicRow.tupled, HelpTopicRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(help_topic_id), Rep.Some(name), Rep.Some(help_category_id), Rep.Some(description), Rep.Some(example), Rep.Some(url))).shaped.<>({r=>import r._; _1.map(_=> HelpTopicRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column help_topic_id SqlType(INT UNSIGNED), PrimaryKey */
    val help_topic_id: Rep[Long] = column[Long]("help_topic_id", O.PrimaryKey)
    /** Database column name SqlType(CHAR), Length(64,false) */
    val name: Rep[String] = column[String]("name", O.Length(64,varying=false))
    /** Database column help_category_id SqlType(SMALLINT UNSIGNED) */
    val help_category_id: Rep[Int] = column[Int]("help_category_id")
    /** Database column description SqlType(TEXT) */
    val description: Rep[String] = column[String]("description")
    /** Database column example SqlType(TEXT) */
    val example: Rep[String] = column[String]("example")
    /** Database column url SqlType(TEXT) */
    val url: Rep[String] = column[String]("url")

    /** Uniqueness Index over (name) (database name name) */
    val index1 = index("name", name, unique=true)
  }
  /** Collection-like TableQuery object for table HelpTopic */
  lazy val HelpTopic = new TableQuery(tag => new HelpTopic(tag))
}
