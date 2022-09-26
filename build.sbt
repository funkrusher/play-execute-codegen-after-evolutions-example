import com.typesafe.config.ConfigFactory

name := """play-execute-codegen-after-evolutions-example"""

version := "1.0-SNAPSHOT"

resolvers += Resolver.sonatypeRepo("snapshots")

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  guice,
  "com.typesafe.play"       %% "play-slick"            % "4.0.2",
  "com.typesafe.play"       %% "play-slick-evolutions" % "4.0.2",
  "com.typesafe.slick"      %% "slick-codegen"         % "3.3.3",
  "org.mariadb.jdbc"         % "mariadb-java-client"   % "2.4.3",
  "org.scalaz"              %% "scalaz-core"           % "7.3.2",
)
