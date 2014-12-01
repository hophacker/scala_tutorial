class Complex(real: Double, imaginary: Double){
  def re = real
  def im = imaginary
  override def toString() = 
    "" + re + (if (im < 0 ) "" else "+") + im + "i"
}

val num = new Complex(12, -12)
println(num.toString())
