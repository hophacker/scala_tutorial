Pattern Matching
===============

**Pattern matching** is the act of checking a given sequence of tokens for the presence of the constituents of some pattern.

*Scala* has a pattern matching mechanism which allows matching with a first-match policy.  The `match` keyword matches an object to another object.

Match against integer values
----------------------------
```scala
object MatchIntegers{
  def mat(x: Int): String = x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "smallest prime number"
    case _ => "non-trivial numbers"
  }
}
```

Match against different types
-----------------------------
```scala
object MatchDifferentTypes{
  def mat(x: Any): Any = x match {
    case 0 => "zero"
    case "one" => 1
    case x: Int => "Integer"
  }
}
```
