val tolerance = 0.00001
def isCloseEnough(x: Double, y: Double) = abs((x - y) / x) < tolerance
def abs(x: Double) = if (x > 0) x else -x
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    println(next)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}
def sqrt(x: Double) = fixedPoint(y => (x/(y*y)+y)/2)(1.0)
