package probs

import org.scalatest.{WordSpec, Matchers}

class P06Spec extends WordSpec with Matchers {

  "the empty list" should {
    "be a palindrome" in {
      P06.palindrome(List.empty) should be(APalindrome)
    }
  }

  "the problem example" should {
    "be a palindrome" in {
      P06.palindrome(List(1, 2, 3, 2, 1)) should be (APalindrome)
    }
  }

  "list with a single entry" should {
    "be a palindrome" in {
      P06.palindrome(List("a")) should be (APalindrome)
    }
  }

  "list with two different values" should {
    "not be a palindrome" in {
      P06.palindrome(List(1, 2)) should be (NotAPalindrome)
    }
  }

}
