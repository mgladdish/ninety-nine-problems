package probs

object P13 {

  def encodeDirect[T](l: List[T]): List[(Int, T)] = l.foldRight(List[(Int, T)]())(
    (item, result) =>
      result
        .headOption
        .filter(p => p._2 == item)
        .map(fp => (fp._1 + 1, item) +: result.tail)
        .getOrElse((1, item) +: result)
  )

}
