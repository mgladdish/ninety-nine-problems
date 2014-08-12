package probs

object P04 {

  def noElements(l: List[_]): Int = l.foldLeft(0)((res, c) => res + 1)

}
