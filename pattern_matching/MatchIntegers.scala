object MatchIntegers{
  def mat(x: Int): String = x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "smallest prime number"
    case _ => "non-trivial numbers"
  }
  def main(args: Array[String]) = {
    println(mat(2))
  }
}
