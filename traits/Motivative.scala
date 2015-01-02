trait Motivative{
  def create() = "Do some stuff "
}
trait Creative extends Motivative{
  override def create() = super.create() + "new!"
}
class Human extends Motivative{
  def greet() = println("Hello world!")
}
class Entrepreneur extends Human{
}
val elon = new Entrepreneur with Creative
println(elon.create())
