class Rational(n: Int, d: Int){
  println("Initiated: " + n + "/" + d)
  //private method
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(n, d)
  val numer: Int = n / g
  val denom: Int = d / g
  //auxiliary constructor
  def this(n: Int) = this(n, 1) 
  def +(that: Rational): Rational = 
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  def -(that: Rational): Rational =
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  //below four methods are overload + - * / for Int parameters
  def +(that: Int): Rational = this + new Rational(that)
  def -(that: Int): Rational = this - new Rational(that)
  def *(that: Int): Rational = this * new Rational(that)
  def /(that: Int): Rational = this / new Rational(that)


  def lessThan(that: Rational) = 
    numer * that.denom < that.numer * denom
  def max(that: Rational) = if (lessThan(that)) that else this

  //override toString method to better display content
  override def toString() = numer + "/" + denom
}
//implicit conversion, otherwise 2 * (new Rational(1,2)) doesn't work
implicit def intToRational(x: Int) = new Rational(x)
