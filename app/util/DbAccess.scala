package util

import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

abstract class DbAccess(dbConfigProvider: DatabaseConfigProvider) {

  // We want the JdbcProfile for this provider
  // it must be defined as protected because we return DBIO as result.
  protected val baseDbConfig = dbConfigProvider.get[JdbcProfile]

  val baseProfile: slick.jdbc.JdbcProfile = slick.jdbc.MySQLProfile

  // These imports are important, the first one brings db into scope, which will let you do the actual db operations.
  // The second one brings the Slick DSL into scope, which lets you define the table and other queries.
  val db  = baseDbConfig.db // import db._
  val api = baseProfile.api // import api._
}
