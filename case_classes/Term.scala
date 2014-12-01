abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class App(f:Term, v:Term) extends Term

// Scala does not require that new primitive is used, Example:

Fun("x", Fun("y", App(Var("x"), Var("y"))))

