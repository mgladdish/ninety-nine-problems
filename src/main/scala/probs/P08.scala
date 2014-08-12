package probs

object P08 {

  def compress[T](l: List[T]): List[T] = l.foldLeft(List[T]())((result, item) =>
    if (result.headOption.map(h => h != item).getOrElse(true)) {
      item +: result
    } else {
      result
    }
  ).reverse

}
