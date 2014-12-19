import IntSet._

object TreeSetTest{
  def main(args: Array[String]){
    var tree1 = new TreeSet(3).incl(1).incl(4)
    var tree2 = new TreeSet(8).incl(6).incl(9)
    println(tree1.toString())
    println(tree2.toString())
    var tree3 = tree1.union(tree2)
    println(tree3)
    println(tree3.include(6))
    var tree4 = tree3.excl(6)
    println(tree4)
    println(tree4.include(6))
    println(tree4.intersection(tree3))
  }
}
