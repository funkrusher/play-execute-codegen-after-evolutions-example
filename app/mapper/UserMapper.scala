package mapper

import dao.UserDAO
import dto.UserDTO
import play.api.db.slick.DatabaseConfigProvider
import util.DbAccess

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class UserMapper @Inject()(dbcp: DatabaseConfigProvider, userDAO: UserDAO)(implicit ec: ExecutionContext) extends DbAccess(dbcp) {


  def fetchAll(): Future[Seq[UserDTO]] = {
    db.run(userDAO.fetchAll()).map(x => x.map(UserDTO.fromRow(_)))
  }
}
