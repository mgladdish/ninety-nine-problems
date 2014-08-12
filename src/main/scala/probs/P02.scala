package probs

object P02 {

  def penultimate[T](l: List[T]): T = {

    l.length.compareTo(2) match {
      case -1 => throw new NoSuchElementException
      case 0 => l.head
      case _ => penultimate(l.tail)
    }

  }

}
