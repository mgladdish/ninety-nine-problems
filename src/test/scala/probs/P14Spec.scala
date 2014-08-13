package probs

import org.scalatest.{WordSpec, Matchers}

class P14Spec extends WordSpec with Matchers {

  "duplicate" should {
    "leave the empty list alone" in {
      P14.duplicate(List[Int]()) should equal(List[Int]())
    }

    "duplicate each member of the list" in {
      P14.duplicate(List('a, 'b, 'c, 'c, 'd)) should equal(
        List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
      )
    }
  }

}
