package IntSet
import IntSet._

object BaseTreeSet extends IntSet{
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new TreeSet(x, BaseTreeSet, BaseTreeSet)
  override def toString = "*"
  def union(that: IntSet) = that
  def isEmpty: Boolean = true
  def excl(x: Int): IntSet = this
  def intersection(x: IntSet): IntSet = this
  def include(x: Int): Boolean = false
}

class TreeSet(elem: Int, left: IntSet, right: IntSet) extends IntSet{
  def this(elem: Int) = 
    this(elem,  BaseTreeSet,  BaseTreeSet)
  override def toString = elem + "(" + left + "," + right + ")"
  override def contains(x: Int): Boolean = 
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  override def incl(x: Int): IntSet = 
    if (x < elem) new TreeSet(elem, left incl x, right)
    else if (x > elem) new TreeSet(elem, left, right incl x)
    else this
  override def union(that: IntSet): IntSet = {
    val cur = that.incl(elem)
    right.union(left.union(cur))
  }
  override def isEmpty: Boolean = false
  override def excl(x: Int): IntSet = {
    if (x < elem) new TreeSet(elem, left.excl(x), right)
    else if (x > elem) new TreeSet(elem, left, right.excl(x))
    else if (left.isEmpty) right
    else if (right.isEmpty) left
    else left.union(right)
  }
  override def include(x: Int): Boolean = {
    if (x == elem) true
    else if (x < elem) left.include(x)
    else right.include(x)
  }
  override def intersection(x: IntSet): IntSet = {
    val L = left.intersection(x)
    val R = right.intersection(x)
    if (x.include(elem)) new TreeSet(elem, L, R)
    else L.union(R)
  }
}
