class Animal(species: String, age: Int) {
  if (species == null)
    throw new NullPointerException("species is null")
  def this(species: String) = this(species, -1)
  def greet() = {
    println(Animal.greetString(species, age))
  }
}
object Animal{ //Singleton object
  def greetString(species: String, age: Int) = {
    var str = ""
    species match{
      case "Cat" => 
        str += "meow!"
      case "Dog" => 
        str += "woof!"
      case _ =>
        str += "damn!"
    }
    if (age < 0) str += (" I don't know my age")
    else str += (" My age is " + age)
    str
  }
}
