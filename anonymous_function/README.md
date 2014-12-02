Anonymous Function
===================
**Anonymous function** is a function without a name. It saves your time since you use it *on demand* instead of declaring it first.

Below is an example of using anonymous function as call back function:

```scala
import java.util.Calendar
object AnonymousTimer {
  def runForFileSeconds(callback: () => Unit) {
    for (i <- 1 to 5) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    runForFileSeconds(() => println("Wait for one second..."))
    runForFileSeconds(() => println(Calendar.getInstance().getTime()))
  }
}
```
