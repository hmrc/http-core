import sbt.Keys.crossScalaVersions

val name = "http-core"

lazy val library = Project(name, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    scalaVersion                     := "2.11.12",
    crossScalaVersions               := Seq("2.11.12", "2.12.8"),
    majorVersion                     := 2,
    makePublicallyAvailableOnBintray := true
  )
  .disablePlugins(sbt.plugins.JUnitXmlReportPlugin)
