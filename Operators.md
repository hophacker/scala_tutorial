Operators
===
Operators are just a nice syntax for ordinary methods calls. `1+2` means the same thing as `(1).+(2)`. In this case, class Int contains a methods named + that takes an Int and returns an Int result. In order to enable a Int to be added to different types(Int,Long,Byte), class Int contains several "overloaded" + methods that take different parameter types.

There are three operator notations: **prefix** , **postfix**, or **infix**:

* In *prefix* notation, method name is put before the object to invoke the method. For example, "-7".
  * The only identifiers that can be used as prefix operators are +,-,!,and ~.
  * *Prefix* notation can be defined by prepending "unary_" to the operator. For example, **unary_+** is the definition for prefix operator **+**. Scala will transform the expression **+2.0** into the method invocation **(2.0).unary_+**
* In *postfix* notation, method is put after the object. For example, "7 toLong".
* In *infix* notation, method is put between the object and the parameter or parameters you with to pass to the method. For example, the + in "7+2"
