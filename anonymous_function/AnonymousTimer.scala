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
