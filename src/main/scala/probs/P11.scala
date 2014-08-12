package probs

object P11 {

  def encodeModified(l: List[_]): List[Any] = P09.pack(l).map {
    case (h :: Nil) => h
    case pl@(h :: t) => (pl.size, h)
  }
}
