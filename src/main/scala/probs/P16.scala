package probs

object P16 {

  def dropNth[T](n: Int, l: List[T]): List[T] =
    l.zipWithIndex
      .filter(tuple => (tuple._2 + 1) % n  != 0)
      .map(_._1)

}
