name := "spray-shapeless-experiments"

version := "1.0"

scalaVersion := "2.11.6"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.2.2",
  "io.spray" %%  "spray-json" % "1.3.2",
  "org.ensime" %% "spray-json-shapeless" % "0.9.10-SNAPSHOT"
)
