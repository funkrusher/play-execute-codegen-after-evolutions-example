package dto

import play.api.libs.json.Json
import play.api.libs.json.OFormat
import tables.Tables.User
import tables.Tables.UserRow

import java.sql.Timestamp

case class UserDTO(
    userId: Int,
    clientId: Int,
    email: String,
    firstname: String,
    lastname: String,
    isAdmin: Boolean,
)

object UserDTO {
  implicit val fmt: OFormat[UserDTO] = Json.format[UserDTO]

  def fromRow(item: UserRow): UserDTO = {
    UserDTO(
      userId = item.userId,
      clientId = item.clientId,
      email = item.email,
      firstname = item.firstname,
      lastname = item.lastname,
      isAdmin = item.isAdmin,
    )
  }

  def toRow(item: UserDTO): UserRow = {
    UserRow(
      userId = item.userId,
      clientId = item.clientId,
      email = item.email,
      firstname = item.firstname,
      lastname = item.lastname,
      isAdmin = item.isAdmin,
    )
  }
}
