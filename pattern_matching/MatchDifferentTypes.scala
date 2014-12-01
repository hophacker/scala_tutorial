object MatchIntegers{
  def mat(x: Any): Any = x match {
    case 0 => "zero"
    case "one" => 1
    case x: Int => "Integer"
  }
  def main(args: Array[String]) = {
    println(mat(2))
  }
}
