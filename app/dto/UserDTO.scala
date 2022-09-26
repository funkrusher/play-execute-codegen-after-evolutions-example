package dto

import play.api.libs.json.Json
import play.api.libs.json.OFormat
import tables.Tables.User
import tables.Tables.UserRow

import java.sql.Timestamp

case class UserDTO(
                        id: Long,
                        email: String,
                        password: String,
                        fullname: String,
                        isAdmin: Boolean
                      )

object UserDTO {
  implicit val fmt: OFormat[UserDTO] = Json.format[UserDTO]

  def fromRow(item: UserRow): UserDTO = {
    UserDTO(
      id = item.id,
      email = item.email,
      password = item.password,
      fullname = item.fullname,
      isAdmin = item.isAdmin
    )
  }

  def toRow(item: UserDTO): UserRow = {
    UserRow(
      id = item.id,
      email = item.email,
      password = item.password,
      fullname = item.fullname,
      isAdmin = item.isAdmin
    )
  }
}
