Scala tutorial
================================
This repository services as a cheat sheet of scala and contains my learning experience from the following resources:
* [Scala By Example](http://www.scala-lang.org/docu/files/ScalaByExample.pdf) by Martin Odersky
* [A Scala Tutorial
for Java programmers](http://www.scala-lang.org/docu/files/ScalaTutorial.pdf) by Michel Schinz, Philipp
Haller

Copy&Paste from the above resourcess is unavoidable simpy because I want to remember those hardcores!

Howerver, if there's any issue, don't hesitate to shoot me an email: jiefeng.hopkins@gmail.com 


Compile
---------
`scala -classpath .   Filename.scala`

Run
---
#### Run as shell script
```scala
#!/bin/sh
exec scala "$0" "$@"
!#
//scala program goes here
```
[EXAMPLE](./examples/using-arguments.scala)


Examples
--------


Terms
-----
`() => Unit` is the type of all functions which take no arguments and return nothing

##### Class comparison and conversion

* *Comparison*: `object.isInstanceOf[class]`
* *Conversion*: `= object.asInstanceOf[class]`

#####  Call-by-value evaluation by using `=>`
```scala
def constOne(x: Int, y: => Int) = 1
```

##### Tail calls
If the last action of a function is a call to another (possibly the same) function, only a single stack frame is needed for both functions. Such calls are called *tail calls*.

##### Higher-order function
Functions which take other functions as parameters or return them as results as results are called *higher-order* functions. Examples:
```scala
def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sum(f, a + 1, b)
```

##### Anonymous functions
An anonymous function is an expression that evaluates to a function; the function is defined without giving it a name. Examples:
```scala
(x: Int) => x * x
(x: Int, y: Int) => x * y
```

##### Currying
A curried function definition looks like: `def f (args_1) ... (args_n) = E`. Examples:
```scala
def sum(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sum(f)(a + 1, b)
// or
def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sumF(a + 1, b)
  sumF
}
// tail recursive 
def sum(f: Int => Int)(a: Int, b: Int): Int = {
  def iter(a: Int, result: Int): Int = {
    if (a > b) result
    else iter(a+1, result + f(a))
  }
  iter(a, 0)
}
```
Function calls:
```scala
def sumSquares = sum(x => x*x)
sumSquares(1, 100)
// or
sum(x => x*x)(1,100)
```

##### Abstract class
```scala
abstract class IntSet{
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}
```
Two good points:

* *deferred* members which are declared but which do not have an implementation
* Since an abstract class might have unimplemented members, no objects of that class may be created using **new**

##### Traits
Traits are just like abstract classes expect that they are meant to be added to some other classes.
Example:
```scala
trait IntSet{
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}
```
#### Covariant subtyping. 
In the example below, if *T* is a subtype of type *S*, that implies that **Stack[S]** is a subtype of **Stack[T]**.
```scala
class Stack[+A]{
}
```
#### Contra-variant subtyping. 
In the example below, if *T* is a subtype of type *S*, that implies that **Stack[T]** is a subtype of **Stack[S]**.
```scala
class Stack[-A]{
}
```
