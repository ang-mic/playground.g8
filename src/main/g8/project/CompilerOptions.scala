object CompilerOptions {

  lazy val appScalacOptions = Seq(
      "-deprecation",
      "-encoding",
      "UTF-8",
      "-language:experimental.macros",
      "-feature",
      "-unchecked",
      "-Xfuture",
      "-Xlint",
      "-Yno-adapted-args",
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-language:existentials",
      "-language:higherKinds",
      "-Ypartial-unification",
      "-Xmacro-settings:materialize-derivations",
      "-Xfatal-warnings",
      "-Ywarn-unused:imports"
  )
}
