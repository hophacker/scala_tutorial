Genericity
==========
**Genericity** is the ability to write code parametrized by *types*.

In the code below:

* **T** is used as type parameter for class **Reference**
* _ is used to represent a default value, it is **0** for *numeric*  types, **false** for *Boolean* types, **()** for *Unit* types and **null** for all *object* types.

```scala
class Reference[T] {
  private var contents: T = _
  def set(value: T) { contents = value }
  def get: T = contents
}
```

In order to use a generalized class, one declares a variable like this:
```scala
val cell = new Reference[Int]
```

Upper bounds and Lower bounds
----------------------------
**Upper bounds**: In a type parameter declaration such as **T <: U** , the type parameter *T* is restricted to range only over subtypes of type *U*.  
**Lower bounds**: Symmetrical to this are lower bounds in Scala. In a type parameter declaration **T >: S** , the type parameter *T* is restricted to range only over supertypes of type *S*.
