import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "JulepPoker"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.typesafe.slick" %% "slick" % "1.0.0",
      "org.slf4j" % "slf4j-simple" % "1.6.4"
      // Add your project dependencies here,
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here      
    )

}
