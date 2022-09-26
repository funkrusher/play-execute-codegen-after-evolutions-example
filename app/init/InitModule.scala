package init

import com.google.inject.AbstractModule

class InitModule extends AbstractModule {
  override def configure() = {
    bind(classOf[CodegenSingleton]).asEagerSingleton()
  }
}
