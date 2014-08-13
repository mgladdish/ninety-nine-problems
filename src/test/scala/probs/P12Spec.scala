package probs

import org.scalatest.{WordSpec, Matchers}

class P12Spec extends WordSpec with Matchers {

  "decode" should {
    "leave the empty list alone" in {
      P12.decode(List.empty) should equal (List.empty)
    }

    "translate tuples to consecutive repeated list members" in {
      P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should equal(
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

    }
  }

}
