ThisBuild / organization := "janjaali"

ThisBuild / version := "1.0.0-SNAPSHOT"
ThisBuild / versionScheme := Some("semver-spec")

ThisBuild / licenses := Seq(
  "MIT License" -> url("https://opensource.org/licenses/MIT")
)

ThisBuild / scalaVersion := "2.12.20"

ThisBuild / scalafixDependencies += {
  "com.github.liancheng" %% "organize-imports" % "0.6.0"
}

lazy val service = (project in file("."))
  .settings(
    name := "scala-service",
    libraryDependencies ++= Seq(
      // tests
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
