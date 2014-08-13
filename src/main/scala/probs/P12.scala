package probs

object P12 {

  def decode[T](l: List[(Int, T)]): List[T] =
    l.flatMap(li => (1 to li._1).map(_ => li._2))

}
