package probs

import org.scalatest.{WordSpec, Matchers}

class P09Spec extends WordSpec with Matchers {

  "pack" should {
    "leave the empty list unchanged" in {
      P09.pack(List[Int]()) should equal(List[Int]())
    }

    "convert to a list of lists, each sublist being a list of consecutive duplicates" in {
      P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    }
  }

}
