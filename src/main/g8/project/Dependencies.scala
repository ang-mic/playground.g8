import sbt._

object Dependencies {
  
  val scalaTestVersion = "3.1.0"

  val testDeps = Seq(
    "org.scalatest" %% "scalatest" % scalaTestVersion % Test
  )

}
