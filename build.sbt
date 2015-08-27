name := "gfc-kinesis"

organization := "com.gilt"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.11.4", "2.10.4", "2.11.7")

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.10.13",
  "com.amazonaws" % "amazon-kinesis-client" % "1.6.0",
  "com.gilt" %% "gfc-logging" % "0.0.2",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test",
  "org.mockito" % "mockito-all" % "1.10.8" % "test"
)

releaseSettings

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("Apache-style" -> url("https://raw.githubusercontent.com/gilt/gfc-kinesis/master/LICENSE?token=AH3VGCWJcYjTwNQrRpLm1kx3OkVvYtt7ks5UmVzWwA%3D%3D"))

homepage := Some(url("https://github.com/gilt/gfc-kinesis"))

pomExtra := (
  <scm>
    <url>https://github.com/gilt/gfc-kinesis.git</url>
    <connection>scm:git:git@github.com:gilt/gfc-kinesis.git</connection>
  </scm>
  <developers>
    <developer>
      <id>cclifford</id>
      <name>Conor Clifford</name>
      <url>https://github.com/conorclifford</url>
    </developer>
  </developers>
)

