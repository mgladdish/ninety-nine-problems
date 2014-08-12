package probs

object P10 {

  def encode[T](l: List[T]): List[(Int, T)] =
    P09.pack(l).map(li => (li.length, li.head))

}
