
# Scala.js ES Module Example

Scala.js has a great feature to export ES modules from Scala.js projects.
This further simplifies the integration of Scala.js with Javascript.

:warning: As explain by Sébastien Doeraene in this [Gitter chat](https://gitter.im/scala-js/scala-js/archives/2019/02/28), the emission of ES modules will only work in the next release of Scala.js (1.x). :warning:

The Scala.js website describes the requried steps to export ES modules on this page:
http://www.scala-js.org/doc/project/module.html

Note how the emitted ES module is included via the `<script src="..." type="module"></script>` syntax.

Running
```
npx http-server
```

will print `Greeting: Hello world!!` to the Javascript console.
