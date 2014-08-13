package probs

object P14 {

  def duplicate[T](l: List[T]): List[T] = l.foldLeft(List[T]())(
    (result, item) => result :+ item :+ item
  )

}
