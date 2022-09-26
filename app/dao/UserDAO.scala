package dao

import play.api.db.slick.DatabaseConfigProvider
import tables.Tables.{User, UserRow}
import util.DbAccess

import javax.inject.{Inject, Singleton}
import scala.concurrent.ExecutionContext

/**
 * QuestionDAO
 *
 * @param ec
 */
@Singleton
class UserDAO @Inject()(dbcp: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends DbAccess(dbcp) {

  import api._

  def fetchAll(): DBIO[Seq[UserRow]] =
    User.result

  def fetchOne(id: Long): DBIO[Option[UserRow]] =
    User.filter(_.id === id).result.headOption

  def insertOne(item: UserRow): DBIO[Int] =
    User += item

  def insertMany(items: Seq[UserRow]): DBIO[Option[Int]] =
    User ++= items

  def deleteOne(id: Long): DBIO[Int] =
    User.filter(_.id === id).delete

  def updateOne(item: UserRow): DBIO[Int] =
    User.filter(_.id === item.id).update(item)

}
