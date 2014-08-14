package probs

import org.scalacheck.Gen
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{Matchers, WordSpec}

class P15Spec extends WordSpec with Matchers with GeneratorDrivenPropertyChecks {

  "duplicateN" should {
    "leave the empty list alone for any {n}" in {
      forAll { (n: Int) =>
        P15.duplicateN(n, List[Int]()) should equal(List[Int]())
      }
    }

    "duplicate each member of the list {n} times" in {
      P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should equal(
        List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
      )
    }

    "leave the list alone for {n = 1}" in {
      forAll {
        (l: List[Int]) =>
          P15.duplicateN(1, l) should equal(l)
      }
    }

    "result in a list {n} times the length of the original list" in {
      forAll(Gen.posNum[Int], Gen.containerOf[List,Int](Gen.choose[Int](1, 10000))) { (n, l) =>
          P15.duplicateN(n, l).length should equal(l.length * n)
      }
    }
  }

}
