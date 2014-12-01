Scala traning for me and for you
================================
This repository services as a  cheat sheet of scala and contains my learning experience from the following resources:
* [Scala By Example](http://www.scala-lang.org/docu/files/ScalaByExample.pdf) by Martin Odersky
* [A Scala Tutorial
for Java programmers](http://www.scala-lang.org/docu/files/ScalaTutorial.pdf) by Michel Schinz, Philipp
Haller

Copy&Paste from the above resourcess is unavoidable simpy because I want to remember those hardcores!

Howerver, if there's any issue, don't hesitate to shoot me an email: jiefeng.hopkins@gmail.com 


Compiling
---------
`scala -classpath .   Filename.scala`


Fresh meat
----------
`() => Unit` is the type of all functions which take no arguments and return nothing

**Case class**
```scala
abstract class Tree
case class Sum(l: Tree, r: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(v: Int) extends Tree
```
The fact that classes Sum , Var and Const are declared as case classes means that they
differ from standard classes in several respects:
* the new keyword is not mandatory to create instances of these classes (i.e. one
can write Const(5) instead of new Const(5) )
* getter functions are automatically defined for the constructor parameters (i.e.
it is possible to get the value of the v constructor parameter of some instance
c of class Const just by writing c.v )
* default definitions for methods equals and hashCode are provided, which work
on the structure of the instances and not on their identity
* a default definition for method toString is provided, and prints the value in a
“source form” (e.g. the tree for expression x+1 prints as Sum(Var(x),Const(1)) )
* instances of these classes can be decomposed through pattern matching as
we will see below.
