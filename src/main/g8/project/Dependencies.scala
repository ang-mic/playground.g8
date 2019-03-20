import sbt._

object Dependencies {
  
  val scalaTestVersion = "3.0.6"

  val testDeps = Seq(
    "org.scalatest" %% "scalatest" % scalaTestVersion % Test
  )

}
