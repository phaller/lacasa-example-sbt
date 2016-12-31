lazy val lacasaCore = "io.github.phaller" % "lacasa-core" % "0.1.0-SNAPSHOT" cross CrossVersion.full

lazy val lacasaPlugin = "io.github.phaller" % "lacasa-plugin" % "0.1.0-SNAPSHOT" cross CrossVersion.full

lazy val root = (project in file(".")).
  settings(
    name := "lacasa-example-sbt",
    scalaVersion := "2.11.7",
    libraryDependencies += lacasaCore,
    autoCompilerPlugins := true,
    addCompilerPlugin(lacasaPlugin),
    scalacOptions += "-P:lacasa:enable"
  )
