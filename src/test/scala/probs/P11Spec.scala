package probs

import org.scalatest.{WordSpec, Matchers}

class P11Spec extends WordSpec with Matchers {

  "encodeModified" should {
    "leave the empty list alone" in {
      P11.encodeModified(List[Int]()) should equal(List[Int]())
    }
    "not include a count if there is not a consecutive duplicate for a member" in {
      P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(
        List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
    }
  }

}
