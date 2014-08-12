package probs

import org.scalatest.{Matchers, WordSpec}

class P10Spec extends WordSpec with Matchers {

  "encode" should {
    "leave the empty list alone" in {
      P10.encode(List[Int]()) should equal(List[Int]())
    }

    "produce a list of tuples, containing the count of each consecutive member and the member" in {
      P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(
        List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    }
  }
}
