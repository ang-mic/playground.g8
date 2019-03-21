// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file(".")).
  settings(
    name := "$name$"
  )

//Check dependency for updates 
onLoad in Global := { "dependencyUpdates" :: _ }

