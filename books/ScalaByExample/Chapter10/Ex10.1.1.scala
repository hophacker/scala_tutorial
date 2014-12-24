import Math._
def isSafe(col: Int, queens: List[Int]): Boolean = {
  for { i <- List.range(0,queens.length) 
  if (abs(queens(i)-col) == i+1)} return false 
  true
}
def queens(n: Int): List[List[Int]] = {
  def placeQueens(k: Int): List[List[Int]] =
    if (k == 0) List(List())
    else 
      for { queens <- placeQueens(k - 1) 
      column <- List.range(1, n + 1) 
      if isSafe(column, queens) } 
      yield column :: queens
    placeQueens(n)
}
println(queens(8))
