package probs

object P15 {

  def duplicateN[T](n: Int, l: List[T]): List[T] = l.foldRight(List[T]())(
    (item, result) =>
      (1 to n).map(_ => item) ++: result
  )

}
