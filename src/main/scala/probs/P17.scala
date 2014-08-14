package probs

object P17 {

  def split[T](n: Int, l: List[T]): (List[T], List[T]) =
    l.zipWithIndex.foldLeft(List[T](), List[T]())(
      (result, tuple) => if (tuple._2 < n) (result._1 :+ tuple._1, result._2) else (result._1, result._2 :+ tuple._1)
    )

}
