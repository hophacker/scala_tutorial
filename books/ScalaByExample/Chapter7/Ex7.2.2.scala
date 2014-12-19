abstract class IntTree

case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

object Main{
  def contains(t: IntTree, v: Int): Boolean = t match{
    case EmptyTree =>false
    case Node(e,l,r) => {
      if (v == e) true
      else if (v < e) contains(l, v)
      else contains(r, v)
    }
  }
  def insert(t: IntTree, v: Int): IntTree = t match{
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case Node(e,l,r) => {
      if (v == e) t
      else if (v < e)
        Node(e,insert(l,v),r)
      else 
        Node(e,l,insert(r,v))
    }
  }
  def main(args: Array[String]){
    var n = Node(2,Node(1,EmptyTree,EmptyTree),Node(3,EmptyTree,EmptyTree))
    println(contains(n,3))
    var m = insert(n,4)
    println(contains(m,4))
  }
}
