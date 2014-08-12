package probs

import org.scalatest.{WordSpec, Matchers}

class P02Spec extends WordSpec with Matchers {

  "penultimate" should {
    "throw an exception for the empty list" in {
      a [NoSuchElementException] should be thrownBy P02.penultimate(List.empty)
    }

    "throw an exception for a list with one member" in {
      a [NoSuchElementException] should be thrownBy P02.penultimate(List(1))
    }

    "return the first element when there are only two" in {
      P02.penultimate(List("a", "b")) should be ("a")
    }

    "return the penultimate when there are many" in {
      P02.penultimate(List("a", "b", "c", "d")) should be ("c")
    }
  }



}
