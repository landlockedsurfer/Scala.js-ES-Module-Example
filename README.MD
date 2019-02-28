
# Scala.js ES Module Example

Scala.js has a great feature to export ES modules from Scala.js projects.
This further simplifies the integration of Scala.js with Javascript.

The Scala.js website describes the requried steps to export ES modules on this page:
http://www.scala-js.org/doc/project/module.html

Although the example project in this repository tries to follow the described steps, it generates an error when trying to import the emitted ES module via the `<script src="..." type="module"></script>` syntax.

Running
```
npx http-server
```

and opening index.html in the browser show the following error messages:

Google Chrome shows the following error:

```
Uncaught TypeError: Cannot read property 'Object' of undefined
    at scalajsenv.js:39
```

Firefox shows:

```
TypeError: $g is undefined
```

It looks like some environment settings are missing.
How to fix this problem?
