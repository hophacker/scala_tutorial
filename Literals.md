Literals 
===
Integer literals
---
```scala
val dec = 55 //Int = 55
val hex = 0x55  //Int = 85
val hex2 = 0x5500 //Int = 21760
val oct = 055 //Int = 45
```
If an integer ends with an *L* or *l*, it is a long, otherwise it is an *Int*
```scala
val long = 0X55L // Long = 85
val long: Long = 0x55 // Long = 85
val short: Short = 0x55 // Short = 85
val byte: Byte = 0x55 // Byte = 85
```

Floating point literals
---
* Appending *E* or *e* as an exponent.
* Default is *Double* type, *Float* literal should ends with *F* or *f*.
```scala
val pi = 3.14 // Double = 3.14
val pi = 0.314e1 // Double = 3.14
val pi = 0.314e1f // Float = 3.14
```

Character literals
---
* Character literals can be any Unicode Character.
* Character can be expressed by octal prepending with backslash(between '\0' and '\377').
* A character literal in hex form must have four digits and be preceded by a "\u".
```scala
val A = 'A' // Char = A
val B = '\102' // Char = B
val C = '\u0043' // Char = C
val dragon = '龙' // Char = 龙
```

String literals
---
Multi-line string is defined within a pair of three quotation marks """. The inner content of a multi-line string may contain any characters, including newlines, quotation marks, and other special characters except three quotation marks. 
```scala
println("""I'm hophacker,
           and I'm writing this tutorial for fun!""")
/* output will be:
I'm hophacker,
               and I'm writing this tutorial for fun!
*/
```
The output of the example has unnecessarily included some leading spaces.  In order to remove them, one needs to use method *stripMargin* and put a pipe character '|' after the spaces to be removed. 
```scala
println("""|I'm hophacker,
           |and I'm writing this tutorial for fun!""".stripMargin)
/* output will be:
I'm hophacker,
and I'm writing this tutorial for fun!
*/
```
The above two examples can be found [here][MultiLineString]


[MultiLineString]: examples/MultiLineString.scala
