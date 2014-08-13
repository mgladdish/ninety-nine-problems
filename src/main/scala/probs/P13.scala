package probs

object P13 {

  def encodeDirect[T](l: List[T]): List[(Int, T)] = l.foldRight(List[(Int, T)]())((item, result) =>
    result.headOption.map(h =>
      if (h._2 == item) {
        (h._1 + 1, item) +: result.tail
      } else {
        (1, item) +: result
      }
    ).getOrElse(
        (1, item) +: result
      )
  )

}
