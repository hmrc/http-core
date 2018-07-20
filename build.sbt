import sbt.Keys.crossScalaVersions

val name = "http-core"

lazy val library = Project(name, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    scalaVersion                     := "2.11.12",
    crossScalaVersions               := Seq("2.11.12"),
    majorVersion                     := 1,
    makePublicallyAvailableOnBintray := true,
    libraryDependencies              ++= AppDependencies.compile ++ AppDependencies.test,
    scalacOptions                    ++= Seq("-deprecation"),
    resolvers                        := Seq(
      Resolver.bintrayRepo("hmrc", "releases"),
      Resolver.typesafeRepo("releases")
    )
  )
  .disablePlugins(sbt.plugins.JUnitXmlReportPlugin)
