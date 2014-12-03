object IntReference {
  class Reference[T] {
    private var contents: T = _
    def set(value: T) { contents = value }
    def get: T = contents
  }
  def main(args: Array[String]) {
    val cell = new Reference[Int]
    cell.set(10)
    println("The referenced value is " + cell.get)
  }
}
