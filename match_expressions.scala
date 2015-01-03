val firstArg = if (args.length > 0) args(0) else ""
println firstArg match{
  case "CMU" => println("Carnegie Mellon University")
  case "JHU" => println("The Johns Hopkins University")
  case "MIT" => println("Masachusetts Institute of Technology")
  case _ => println("huh?")
}

