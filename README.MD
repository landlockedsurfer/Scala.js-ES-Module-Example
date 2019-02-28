
# Scala.js ES Module Example

Scala.js has a great feature to export ES modules.
The further simplifies the integration of Scala.js and Javascript.

However the example project implemented in this repository does not work properly.
It follows the instructions given at
http://www.scala-js.org/doc/project/module.html

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
