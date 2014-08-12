package probs

object P11 {

  def encodeModified(l: List[_]): List[Any] = P09.pack(l).map(
    pl => if (pl.size > 1) {
      (pl.size, pl.head)
    } else {
      pl.head
    }

  )
}
