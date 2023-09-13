import com.typesafe.config.ConfigFactory

name := """play-execute-codegen-after-evolutions-example"""

lazy val settings = Seq(
  organization := "org.acme",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.13.8",
)

lazy val dependencies = Seq(
  guice,
  "com.typesafe.play"  %% "play-slick"            % "5.1.0",
  "com.typesafe.play"  %% "play-slick-evolutions" % "5.1.0",
  "com.typesafe.slick" %% "slick-codegen"         % "3.4.1",
  "org.mariadb.jdbc"    % "mariadb-java-client"   % "3.1.2",
  "org.scalaz"         %% "scalaz-core"           % "7.3.2",
)

lazy val codegen = (project in file("codegen"))
  .settings(
    settings,
    libraryDependencies ++= dependencies,
  )

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .aggregate(codegen)
  .dependsOn(codegen)
  .settings(
    settings,
    libraryDependencies ++= dependencies,
    PlayKeys.playDefaultPort := 9000,
  )

TaskKey[Unit]("codegen") := (runMain in Compile).toTask(" init SlickCodegenApp").value