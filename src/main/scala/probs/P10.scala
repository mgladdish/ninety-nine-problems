package probs

object P10 {

  def encode[T](l: List[T]): List[(Int, T)] = P09.pack(l).foldLeft(List[(Int, T)]())((result, item) =>
    result :+ (item.length, item.head)
  )

}
