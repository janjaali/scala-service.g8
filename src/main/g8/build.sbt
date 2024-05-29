ThisBuild / organization := "$organization$"

ThisBuild / scalaVersion := "3.3.0"

ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

ThisBuild / scalafixDependencies += {
  "com.github.liancheng" %% "organize-imports" % "0.6.0"
}

lazy val service = (project in file("service"))
  .settings(
    name := "$project_name;format="lower,hyphen"$",

    libraryDependencies ++= Seq(
      // tests
      "org.scalameta" %% "munit" % "1.0.0" % Test
    )
  )
