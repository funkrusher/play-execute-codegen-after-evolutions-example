package tables
// AUTO-GENERATED Slick data model for table Tester2
trait Tester2Table {

  self:TablesRoot  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Tester2
   *  @param test1 Database column test1 SqlType(INT), Default(None)
   *  @param test2 Database column test2 SqlType(INT), Default(None)
   *  @param test3 Database column test3 SqlType(INT)
   *  @param test4 Database column test4 SqlType(VARCHAR), Length(50,true), Default(Some(NULL))
   *  @param test5 Database column test5 SqlType(VARCHAR), Length(50,true), Default(Some(NULL))
   *  @param test6 Database column test6 SqlType(VARCHAR), Length(50,true)
   *  @param test7 Database column test7 SqlType(TIMESTAMP)
   *  @param test8 Database column test8 SqlType(TIMESTAMP), Default(None)
   *  @param test10 Database column test10 SqlType(DECIMAL)
   *  @param test11 Database column test11 SqlType(DECIMAL)
   *  @param test12 Database column test12 SqlType(DECIMAL) */
  case class Tester2Row(test1: Option[Int], test2: Option[Int], test3: Int, test4: Option[String], test5: Option[String], test6: String, test7: java.sql.Timestamp, test8: Option[java.sql.Timestamp], test10: Option[scala.math.BigDecimal], test11: Option[scala.math.BigDecimal], test12: scala.math.BigDecimal)
  /** GetResult implicit for fetching Tester2Row objects using plain SQL queries */
  implicit def GetResultTester2Row(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[String]], e3: GR[String], e4: GR[java.sql.Timestamp], e5: GR[Option[java.sql.Timestamp]], e6: GR[Option[scala.math.BigDecimal]], e7: GR[scala.math.BigDecimal]): GR[Tester2Row] = GR{
    prs => import prs._
    Tester2Row.tupled((<<?[Int], <<?[Int], <<[Int], <<?[String], <<?[String], <<[String], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<[scala.math.BigDecimal]))
  }
  /** Table description of table tester2. Objects of this class serve as prototypes for rows in queries. */
  class Tester2(_tableTag: Tag) extends profile.api.Table[Tester2Row](_tableTag, Some("testdb"), "tester2") {
    def * = (test1, test2, test3, test4, test5, test6, test7, test8, test10, test11, test12).<>(Tester2Row.tupled, Tester2Row.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((test1, test2, Rep.Some(test3), test4, test5, Rep.Some(test6), Rep.Some(test7), test8, test10, test11, Rep.Some(test12))).shaped.<>({r=>import r._; _3.map(_=> Tester2Row.tupled((_1, _2, _3.get, _4, _5, _6.get, _7.get, _8, _9, _10, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column test1 SqlType(INT), Default(None) */
    val test1: Rep[Option[Int]] = column[Option[Int]]("test1", O.Default(None))
    /** Database column test2 SqlType(INT), Default(None) */
    val test2: Rep[Option[Int]] = column[Option[Int]]("test2", O.Default(None))
    /** Database column test3 SqlType(INT) */
    val test3: Rep[Int] = column[Int]("test3")
    /** Database column test4 SqlType(VARCHAR), Length(50,true), Default(Some(NULL)) */
    val test4: Rep[Option[String]] = column[Option[String]]("test4", O.Length(50,varying=true), O.Default(Some("NULL")))
    /** Database column test5 SqlType(VARCHAR), Length(50,true), Default(Some(NULL)) */
    val test5: Rep[Option[String]] = column[Option[String]]("test5", O.Length(50,varying=true), O.Default(Some("NULL")))
    /** Database column test6 SqlType(VARCHAR), Length(50,true) */
    val test6: Rep[String] = column[String]("test6", O.Length(50,varying=true))
    /** Database column test7 SqlType(TIMESTAMP) */
    val test7: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("test7")
    /** Database column test8 SqlType(TIMESTAMP), Default(None) */
    val test8: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("test8", O.Default(None))
    /** Database column test10 SqlType(DECIMAL) */
    val test10: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("test10")
    /** Database column test11 SqlType(DECIMAL) */
    val test11: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("test11")
    /** Database column test12 SqlType(DECIMAL) */
    val test12: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("test12")
  }
  /** Collection-like TableQuery object for table Tester2 */
  lazy val Tester2 = new TableQuery(tag => new Tester2(tag))
}
