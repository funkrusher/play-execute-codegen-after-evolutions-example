package dao

import play.api.db.slick.DatabaseConfigProvider
import tables.Tables.User
import tables.Tables.UserRow
import util.DbAccess

import javax.inject.Inject
import javax.inject.Singleton
import scala.concurrent.ExecutionContext

/**
 * QuestionDAO
 *
 * @param ec
 */
@Singleton
class UserDAO @Inject() (dbcp: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends DbAccess(dbcp) {

  import api._

  def fetchAll(): DBIO[Seq[UserRow]] =
    User.result

  def fetchOne(userId: Int): DBIO[Option[UserRow]] =
    User.filter(_.userId === userId).result.headOption

  def insertOne(item: UserRow): DBIO[Int] =
    User += item

  def insertMany(items: Seq[UserRow]): DBIO[Option[Int]] =
    User ++= items

  def deleteOne(userId: Int): DBIO[Int] =
    User.filter(_.userId === userId).delete

  def updateOne(item: UserRow): DBIO[Int] =
    User.filter(_.userId === item.userId).update(item)

}
