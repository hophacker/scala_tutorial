def multiTable = {
  val table = for (i <- 1 to 10) yield{
    val row = for (j <- 1 to 10) yield {
      String.format("%4s", (i*j).toString)
    }
    row.mkString + '\n'
  }
  table.mkString
}
println(multiTable)
