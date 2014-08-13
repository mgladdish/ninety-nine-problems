package probs

import org.scalatest.{Matchers, WordSpec}

class P13Spec extends WordSpec with Matchers {

  "encodeDirect" should {
    "leave the empty list untouched" in {
      P13.encodeDirect(List[Symbol]()) should equal(List[(Int, Symbol)]())
    }

    "count the number of consecutive duplicate members in a list" in {
      P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(
        List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    }
  }
}
