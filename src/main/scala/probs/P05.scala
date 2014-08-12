package probs

object P05 {

  def reverse[T](l: List[T]): List[T] = l.foldLeft(List[T]())((res, t) => t :: res)

}
