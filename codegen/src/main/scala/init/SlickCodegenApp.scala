package init

object SlickCodegenApp extends App {
  val slickCodegen = new SlickCodegen();
  slickCodegen.rebuild(true);
}
