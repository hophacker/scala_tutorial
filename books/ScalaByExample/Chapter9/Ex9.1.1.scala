object isortMain{
  def insert(x: Int, xs: List[Int]): List[Int] = xs match{
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs  else y :: insert(x, ys)
  }
  def isort(xs: List[Int]): List[Int] = xs match{
    case List() => List()
    case x :: xsl => insert(x, isort(xsl))
  }
  def main(args: Array[String]){
    var nums = 1 :: (3 :: (2:: (4 :: Nil)))
    println(nums)
    nums = isort(nums)
    println(nums)
  }
}
