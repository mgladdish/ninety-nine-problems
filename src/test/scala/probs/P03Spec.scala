package probs

import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{WordSpec, Matchers}

class P03Spec extends WordSpec with Matchers with GeneratorDrivenPropertyChecks {

  "nth (0-based)" should {
    "throw an exception if n is greater than the size of the list" in {
      a [IndexOutOfBoundsException] should be thrownBy P03.nth(List(1), 2)
    }

    "throw an exception if n is negative" in {
      a [IndexOutOfBoundsException] should be thrownBy P03.nth(List("a"), -1)
    }

    "return the nth member of the list" in {
      P03.nth(List("1"), 0) should be ("1")
      P03.nth(List(1, 2, 3), 2) should be(3)
      P03.nth(List("a", "b", "c"), 1) should be ("b")
    }

    "check a whole bunch of values for equivalence with built-in function" in {
      forAll { (l: List[Int], n: Int) =>
        whenever(n < l.size && n >= 0) { l(n) should be(P03.nth(l, n))}
      }
    }

  }

}
