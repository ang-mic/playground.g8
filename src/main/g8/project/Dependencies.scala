import sbt._

object Dependencies {
  
  val scalaTestVersion = "3.2.2"

  val testDeps = Seq(
    "org.scalatest" %% "scalatest" % scalaTestVersion % Test
  )

}
