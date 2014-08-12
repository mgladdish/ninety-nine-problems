package probs

import org.scalatest.{WordSpec, Matchers}

class P08Spec extends WordSpec with Matchers {

  "compress" should {
    "leave a list without duplicates unchanged" in {
      P08.compress(List(1, 2, 3)) should equal(List(1, 2, 3))
    }

    "leave an empty list unchanged" in {
      P08.compress(List[Int]()) should equal(List[Int]())
    }

    "remove duplicates" in {
      P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List('a, 'b, 'c, 'a, 'd, 'e))
    }
  }

}
