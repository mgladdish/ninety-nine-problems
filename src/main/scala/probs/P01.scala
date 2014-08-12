package probs

object P01 {

  def last[T](l: List[T]): T = {
    l match {
      case (h :: Nil) => h
      case (h :: t) => last(t)
      case _ => throw new NoSuchElementException
    }

  }

}
