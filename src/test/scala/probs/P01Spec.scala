package probs

import org.scalatest.{Matchers, WordSpec}

class P01Spec extends WordSpec with Matchers {

  "last" should {
    "throw an exception for the empty list" in {
      a [NoSuchElementException] should be thrownBy P01.last(List.empty)
    }

    "return the element when there is only one" in {
      P01.last(List(1)) should be(1)
    }

    "return the second element when there are two" in {
      P01.last(List("a", "b")) should be("b")
    }
  }

}
