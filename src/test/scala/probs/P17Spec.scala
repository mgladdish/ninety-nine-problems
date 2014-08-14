package probs

import org.scalatest.prop.GeneratorDrivenPropertyChecks
import org.scalatest.{Matchers, WordSpec}

class P17Spec extends WordSpec with Matchers with GeneratorDrivenPropertyChecks {

  "split" should {
    "return the entire list in the second item of the tuple for {n} == 0" in {
      forAll {l: List[Int] => P17.split(0, l) should equal((List[Int](), l))}
    }

    "return the first {n} members in the first item of the tuple, the rest in the second" in {
      P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
        List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }
  }

}
