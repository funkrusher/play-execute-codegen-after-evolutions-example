package init

import slick.codegen.SourceCodeGenerator

class CustomCodeGenerator(model: slick.model.Model) extends SourceCodeGenerator(model) {
  // Add your customizations here

  private def pluralize(word: String): String = {
    if (word.endsWith("s")) word + "es" else word + "s"
  }

  // Add your customizations here
  override def code = {
    "import slick.lifted.ForeignKeyQuery\n" +
      "import slick.lifted.TableQuery\n\n" +
      super.code
  }

  override def tableName =
    dbTableName => dbTableName.toLowerCase.toCamelCase

  // override table generator

  override def Table =
    new Table(_) {

      // override contained column generator
      override def Column =
        new Column(_) {
          override def rawName = this.model.name

          override def rawType =
            if (model.name.startsWith("fineWithAnswer")) "Boolean" else super.rawType
        }

      // Modify the code for each table here
      override def TableValue =
        new TableValue {


          // Generate query extensions for relationships
          override def code = {

            val tablesReferencingThisTable = tables.filter(table => {
              table.model.foreignKeys.find(foreignKey => foreignKey.referencedTable.table == model.name.table).isDefined
            })

            val tableName          = model.name.table
            val tableNameCamelCase = model.name.table.toCamelCase
            val tableClassName     = model.name.table.toCamelCase + "Row" // Construct the table class name

            // Generate query extensions for all foreign key relationships
            val foreignKeyExtensions = model.foreignKeys.map { foreignKey =>
              val targetTableName          = foreignKey.referencedTable.table
              val targetTableNameCamelCase = targetTableName.toCamelCase
              val targetTableClassName     = targetTableNameCamelCase + "Row" // Construct the target table class name

              // Retrieve referencing and referenced column names
              val referencingColumnNames = foreignKey.referencingColumns.map(_.name)
              val referencedColumnNames  = foreignKey.referencedColumns.map(_.name)

              // Generate join condition based on referencing and referenced column names
              val joinCondition = referencingColumnNames
                .zip(referencedColumnNames)
                .map {
                  case (refCol, targetCol) =>
                    s"_.$refCol === _.${targetCol}"
                }
                .mkString(" && ")

              val targetTablePluralizedName = pluralize(targetTableName.toLowerCase)
              val backRelationMethodName    = targetTablePluralizedName + "_" + pluralize(tableName.toLowerCase)

              val forwardExtensionCode =
                s"""
                   |  def ${targetTablePluralizedName} = q.join(TableQuery[${targetTableNameCamelCase}]).on((${joinCondition})).map(_._2)
                   |""".stripMargin

              val backRelationExtensionCode =
                s"""
                   |  def ${backRelationMethodName}(implicit q: Query[${targetTableNameCamelCase}, ${targetTableClassName}, Seq]): Query[${tableNameCamelCase}, ${tableClassName}, Seq] =
                   |    q.join(TableQuery[${tableNameCamelCase}]).on((${joinCondition})).map(_._2)
                   |""".stripMargin

              Seq(forwardExtensionCode, backRelationExtensionCode)
            }

            if (foreignKeyExtensions.nonEmpty) {
              s"implicit class ${tableClassName}Extension[C[_]](q: Query[${tableNameCamelCase}, ${tableClassName}, C]) {\n" +
                foreignKeyExtensions.flatten.distinct.mkString("\n") +
                "\n}\n\n" + super.code
            } else {
              super.code
            }
          }
        }
    }
}
