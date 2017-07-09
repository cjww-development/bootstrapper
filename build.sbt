import com.typesafe.config.ConfigFactory
import scala.util.{Try, Success, Failure}

val btVersion: String = Try(ConfigFactory.load.getString("version")) match {
  case Success(ver) => ver
  case Failure(_) => "0.1.0"
}

name := "bootstrapper"
version := btVersion
scalaVersion := "2.11.11"
organization := "com.cjww-dev.libs"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.2.1",
  "org.scalatestplus.play" % "scalatestplus-play_2.11" % "3.1.0" % Test
)

resolvers += "cjww-dev" at "http://dl.bintray.com/cjww-development/releases"

bintrayOrganization := Some("cjww-development")
bintrayReleaseOnPublish in ThisBuild := true
bintrayRepository := "releases"
bintrayOmitLicense := true
