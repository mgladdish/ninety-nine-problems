package probs

import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{WordSpec, Matchers}

class P04Spec extends WordSpec with Matchers with GeneratorDrivenPropertyChecks {

  "noElements" should {
    "return 0 for an empty list" in {
      P04.noElements(List.empty) should be (0)
    }

    "be equivalent to built-in length function" in {
      forAll { (l: List[Int]) =>
        l.length should equal(P04.noElements(l))
      }
    }
  }

}
