package probs

object P03 {

  def nth[T](l: List[T], n: Int): T = {
    if (n < 0 || l.lengthCompare(n) < 0) throw new IndexOutOfBoundsException
    n match {
      case 0 => l.head
      case _ => nth(l.tail, n - 1)
    }

  }

}
