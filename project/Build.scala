import sbt._
import Keys._


object NinetyNineProblemsBuild extends Build {
	lazy val root = Project(
		id = "NinetyNineProblems",
		base = file(".")
	).settings(
      libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.1.5" % "test",
        "org.scalacheck" %% "scalacheck" % "1.11.5" % "test")
    )
}
