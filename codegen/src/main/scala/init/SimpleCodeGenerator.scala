package init

import slick.codegen.SourceCodeGenerator

class SimpleCodeGenerator(model: slick.model.Model) extends SourceCodeGenerator(model) {

  override def tableName =
    dbTableName => dbTableName.toLowerCase.toCamelCase

  override def Table = {
    new Table(_) {
      // override contained column generator
      override def Column =
        new Column(_) {

          // override def asOption: Boolean = if (model.nullable) super.asOption else true

          override def rawName = this.model.name
        }

      override def EntityType =
        new EntityType {
          override def code: String = {
            val args = columns.map(c =>
                s"${c.name}: ${c.exposedType}"
            ).mkString(", ")
            if (classEnabled) {
              val prns = (parents.take(1).map(" extends " + _) ++ parents.drop(1).map(" with " + _)).mkString("")
              (if (caseClassFinal) "final " else "") +
                s"""case class $name($args)$prns"""
            } else {
              if (columns.size > 254)
                s"type $name = $types" // constructor method would exceed JVM parameter limit
              else
                s"""
                type $name = $types
                /** Constructor for $name providing default values if available in the database schema. */
                def $name($args): $name = {
                ${compoundValue(columns.map(_.name))}
                }
                  """.trim
            }
          }
        }
    }


  }

}
