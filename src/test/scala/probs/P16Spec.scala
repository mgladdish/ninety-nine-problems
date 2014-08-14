package probs

import org.scalacheck.Gen
import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{WordSpec, Matchers}

class P16Spec extends WordSpec with Matchers with GeneratorDrivenPropertyChecks {

  "dropNth" should {
    "given any list return the empty list for {n = 1}" in {
      forAll {(l: List[Int]) => P16.dropNth(1, l) should equal(List[Int]())}
    }
    "given the empty list return the empty list for any {n}" in {
      forAll(Gen.posNum[Int]) {pn => P16.dropNth(pn, List[Int]())}
    }
    "drop every {n}th member from the list" in {
      P16.dropNth(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal (
        List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
      )
    }
  }
}
