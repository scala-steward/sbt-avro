name := "settings-test"
crossScalaVersions += "2.11.11"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "4.6.0" % "test"
)

(stringType in AvroConfig) := "String"
(fieldVisibility in AvroConfig) := "public"
