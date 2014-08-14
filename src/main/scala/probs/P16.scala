package probs

object P16 {

  def dropNth[T](n: Int, l: List[T]): List[T] = l.zipWithIndex.foldLeft(List[T]())(
    (result, tuple) => if ((tuple._2 + 1) % n == 0) result else result :+ tuple._1
  )
}
