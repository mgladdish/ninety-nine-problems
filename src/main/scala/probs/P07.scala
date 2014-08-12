package probs

object P07 {

  def flatten(l: List[Any]): List[Any] = l.foldLeft(List[Any]())((res, i) =>
    i match {
      case (h :: t) => (res :+ h) ++ flatten(t)
      case o@_ => res :+ o
    }
  )

}
