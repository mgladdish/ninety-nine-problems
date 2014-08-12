package probs

import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{Matchers, WordSpec}

class P05Spec extends WordSpec with Matchers with GeneratorDrivenPropertyChecks {

  "reverse" should {
    "return an empty list given an empty list" in {
      P05.reverse(List.empty) should equal(List.empty)
    }

    "be equivalent to the built-in reverse function" in {
      forAll {(l: List[Int]) => l.reverse should equal(P05.reverse(l))}
    }
  }
}
