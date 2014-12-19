package IntSet
abstract class IntSet{
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(x: IntSet): IntSet
  def isEmpty: Boolean
  def excl(x: Int): IntSet
  def include(x: Int): Boolean
  def intersection(x: IntSet): IntSet
}
