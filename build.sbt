
enablePlugins(ScalaJSPlugin)

name := "Scala.js ES Module Example"
scalaVersion := "2.12.8"

scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) }

