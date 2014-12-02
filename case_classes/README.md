Case classes
============


**Case classes** are standard classes which export their constructor parameters and provide a recursive decomposition mechanism via [pattern matching](../pattern_matching)


They differ from standard classes in several aspects:
* the **new** keyword is not required to create instances
* getter functions are automatically defined for the constructor parameters
* default definitions for methods **equals**, **hashCode**, **toString** are provided
* instances of these classes can be decomposed through pattern matching as
we will see below.


Usages
------

##### Wildcard(used as default condition): [Tree]
```scala  case _ => Const(0)
```
##### *if* condition: [Tree]
```scala
case Var(n) if (v == n) => Const(1)
```


[Tree]: Tree.scala
