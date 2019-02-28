import scala.scalajs.js
import scala.scalajs.js.annotation._

@JSExportTopLevel("HelloWorld")
class HelloWorld(name: String) {
  def greeting(): String = s"Hello $name!"
}
