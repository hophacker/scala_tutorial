def sqrt(x: Double) = {
  def abs(x: Double) = if (x >= 0) x else -x
  def square(x: Double) = x * x
  def isGoodEnough(guess: Double,  x: Double) = 
    abs(square(guess) - x) < x/1000000.0
  def improve(guess: Double, x: Double): Double = 
    (guess + x / guess) / 2
  def sqrtIter(guess: Double, x: Double): Double = 
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)
  sqrtIter(1.0, x)
}
def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
def factorial(n: Int): Int = {
  def fac(n: Int, mul: Int): Int = if (n == 0) mul else fac(n-1, mul*n)
  fac(n, 1)
}
println(sqrt(20))
println(gcd(12,3))
println(factorial(12))
