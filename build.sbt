import sbt.Keys.{crossScalaVersions, resolvers}

lazy val root =
  project.in(file("."))
    .settings(publishArtifact := false)
    .aggregate(httpCore, httpCore26, shared)

lazy val httpCore =
  commonSetup("http-core")
    .settings(libraryDependencies ++= AppDeps.shared)
    .dependsOn(shared % "compile-internal")

lazy val httpCore26 =
  commonSetup("http-core-26")
    .dependsOn(shared % "compile-internal")
    .settings(
      aggregate           := false,
      libraryDependencies ++= AppDeps.shared,
      libraryDependencies --= AppDeps.playJson25,
      libraryDependencies ++= AppDeps.playJson26
    )

lazy val shared =
    Project("shared", file("shared"))
      .settings(
        commonSettings,
        libraryDependencies := AppDeps.shared ++ AppDeps.playJson25 ++ AppDeps.test
      )

def commonSetup(name: String) =
    Project(name, file(name))
      .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
      .settings(
          commonSettings,
          mappings in (Compile, packageBin) ++= (mappings in (shared, Compile, packageBin)).value,
          mappings in (Compile, packageSrc) ++= (mappings in (shared, Compile, packageBin)).value,
          majorVersion                      := 1,
          makePublicallyAvailableOnBintray  := true
      )
      .disablePlugins(sbt.plugins.JUnitXmlReportPlugin)

lazy val commonSettings =
  Seq(
    scalaVersion       := "2.11.12",
    crossScalaVersions := Seq("2.11.12"),
    scalacOptions      ++= Seq("-deprecation"),
    exportJars         := true,
    resolvers          :=
      Seq(
        Resolver.bintrayRepo("hmrc", "releases"),
        Resolver.typesafeRepo("releases")
      )
  )
