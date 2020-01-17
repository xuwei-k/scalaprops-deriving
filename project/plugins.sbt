addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.0")
addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "0.3.2")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.8.1")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
)
