package probs

object P06 {

  def palindrome(l: List[_]): IsPalindrome = P05.reverse(l) == l match {
    case true => APalindrome
    case _ => NotAPalindrome
  }

}

sealed trait IsPalindrome

case object APalindrome extends IsPalindrome
case object NotAPalindrome extends IsPalindrome
