def flattern[A](xss: List[List[A]]): List[A] = 
  for (xs <- xss; x <- xs) yield x
  //(xss :\ (Nil: List[A])) ((xs, ys) => xs ::: ys)

println(flattern(List(List(1,2,3), List(4,5,6))))
