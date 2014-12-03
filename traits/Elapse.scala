object Main{
  trait Comparable {
    def < (that: Any): Boolean
    def <= (that: Any): Boolean = (this < that) || (this == that)
    def > (that: Any): Boolean = !(this <= that)
    def >= (that: Any): Boolean = !(this < that)
  }
  class Elapse(h: Int, m: Int, s: Int) extends Comparable{
    def hour = h
    def minute = m
    def second = s
    override def toString(): String = hour + ":" + minute + ":" + second 
    override def equals(that: Any): Boolean = 
      that.isInstanceOf[Elapse] && {
        var o = that.asInstanceOf[Elapse]
        o.hour == hour && o.minute == minute && o.second == second
      }
    def <(that: Any): Boolean = {
      if (!that.isInstanceOf[Elapse])
        sys.error("Error: comparison beteen different types!")
      val o = that.asInstanceOf[Elapse]
      if (hour != o.hour)  hour < o.hour
      else if (minute != o.minute)  minute < o.minute
      else second < o.second
    }
  }
  def main(args: Array[String]){
    var a = new Elapse(1,2,3)
    var b = new Elapse(1,13,3)
    println(a)
    println(b)
    println(a < b)
  }
}
