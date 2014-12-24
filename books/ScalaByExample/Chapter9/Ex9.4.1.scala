def squareList(xs: List[Int]): List[Int] = xs match{
  case List() => xs
  case y :: ys => y*y :: squareList(ys)
}

def squareList1(xs: List[Int]): List[Int] = 
  xs map (x => x*x)

println(squareList(List(1,2,3,4)))
println(squareList1(List(1,2,3,4)))
