import uk.gov.hmrc.DefaultBuildSettings.{defaultSettings, targetJvm}

enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning)

name := "http-core"

scalaVersion := "2.11.8"
crossScalaVersions := Seq("2.11.8")
targetJvm := "jvm-1.8"

libraryDependencies ++= AppDependencies()

resolvers := Seq(
  Resolver.bintrayRepo("hmrc", "releases"),
  Resolver.typesafeRepo("releases")
)