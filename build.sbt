name := "barista-backend"

version := "0.0.1"

scalaVersion := "2.12.6"

scalacOptions := Seq(
  "-deprecation",
  "-encoding", "UTF-8", // yes, this is 2 args
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ywarn-unused-import"
)

libraryDependencies ++= {
  val mxNetV = "1.2.1"

  Seq(
    "org.apache.mxnet" % "mxnet-full_2.11-osx-x86_64-cpu" % mxNetV
  )
}
// define setting key to write configuration to .scalafmt.conf
SettingKey[Unit]("scalafmtGenerateConfig") :=
  IO.write( // writes to file once when build is loaded
    file(".scalafmt.conf"),
    """style = IntelliJ
      |# Your configuration here
    """.stripMargin.getBytes("UTF-8")
  )