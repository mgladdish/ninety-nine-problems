package probs

object P08 {

  def compress[T](l: List[T]): List[T] = l.foldRight(List[T]())((item, result) =>
    if (result.headOption.map(_ != item).getOrElse(true)) {
      item +: result
    } else {
      result
    }
  )

  def compressWithMatch[T](l: List[T]): List[T] = l match {
    case (a :: b :: t) if a == b => compress(b :: t)
    case (h :: t) => h +: compress(t)
    case o@_ => o
  }


}
