package init

import slick.codegen.SourceCodeGenerator

class SimpleCodeGenerator(model: slick.model.Model) extends SourceCodeGenerator(model) {

  // Add your customizations here

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

    }

}
