object AnimalTest{
  def main(args: Array[String]) = {
    val animal1 = new Animal("Cat")
    val animal2 = new Animal("Bird")
    val animal3 = new Animal("Dog", 12)
    //val animal4 = new Animal(null)
    animal1.greet()
    animal2.greet()
    animal3.greet()
  }
}
