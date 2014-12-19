object Main {
  def sort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        //def filter(p: T => Boolean): Array[T]
        sort(xs filter (pivot >)),
        xs filter (pivot == ),
        sort(xs filter (pivot <)))
    }
  }
  def main(args: Array[String]) {
    var arr = Array(1, 3, 2)
    arr = sort(arr)
    for (i <- 0 to (arr.length - 1)) print(arr(i))
  }
}

