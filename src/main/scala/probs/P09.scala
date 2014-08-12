package probs

object P09 {

  def pack[T](l: List[T]): List[List[T]] = l.foldRight(List[List[T]]())((item, result) =>
    if (result.headOption.map(ho => !ho.contains(item)).getOrElse(true)) {
      List[T](item) +: result
    } else {
      (result.head :+ item) :: result.tail
    }
  )

}
