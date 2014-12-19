def general(f: Int => Int)(h: (Int, Int) => Int)(a: Int, b: Int): Int = {
  def iter(a: Int, result: Int): Int = {
    if (a > b) result
    else iter(a+1, h(result,  f(a)))
  }
  iter(a, 1)
}
println(general(x=>x*x)( ((a:Int, b:Int) => a*b))(1,4))
