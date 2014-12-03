Traits
======

**Traits** provide another way to import code in Scala. One can view them as interfaces in Java which can also contain code.

In Scala, when a class inherits from a trait, it implements that trait's interface, and inherits all the code contained in the trait.


*Trait* for comparison
----------------------

```scala
trait comparable {
  def < (that: Any): Boolean
  def <= (that: Any): Boolean = (this < that) || (this == that)
  def > (that: Any): Boolean = !(this <= that)
  def >= (that: Any): Boolean = !(this < that)
}
```

To make objects of a class comparable, use *extends* in the definition of the class. Below is a *Elapse* class which is used to maintain the elapse of time:

```scala
```





