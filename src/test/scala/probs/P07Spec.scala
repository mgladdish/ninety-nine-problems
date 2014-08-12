package probs

import org.scalatest.{WordSpec, Matchers}

class P07Spec extends WordSpec with Matchers {

  "flatten" should {

    "return the same if the list is already flat" in {
      P07.flatten(List(1, 2, 3)) should equal(List(1, 2, 3))
    }

    "handle the special case of single-entry sublists" in {
      P07.flatten(List(1, List(2), 3)) should equal(List(1, 2, 3))
    }

    "expand any sublists into a single list" in {
      P07.flatten(
        List(
          List(1, 2),
          3,
          List(4,
            List(5, 6)
          )
        )
      ) should equal(List(1, 2, 3, 4, 5, 6))
    }
  }
}
