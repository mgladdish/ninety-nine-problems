package probs

object P13 {

  def encodeDirect[T](l: List[T]): List[(Int, T)] = l.foldRight(List[(Int, T)]())((item, result) =>
    if (result.headOption.map(h => h._2 != item).getOrElse(true)) {
      (1, item) +: result
    } else {
      result.headOption.map(h => (if (h._2 == item) h._1 + 1 else h._1, h._2)).getOrElse((1, item)) +: result.tail
    }
  )

}
