abstract class Set[A]{
  def incl(x: A): Set[A]
  def contains(x: A): Boolean
}
