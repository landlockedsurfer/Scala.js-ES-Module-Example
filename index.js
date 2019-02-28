import { HelloWorld } from "./target/scala-2.12/scala-js-es-module-example-fastopt.js"

const helloWorld = new HelloWorld("world!");
console.log("Greeting: " + helloWorld.greeting());
