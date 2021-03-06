package com.windrift.java.general.questions001.question92

import com.windrift.test.BaseUnitSpec

/**
 * @author Gary Xu
 */
class TestStringSpec extends BaseUnitSpec {
  "TestString test1 " should "return \"4247\"" in (
    assertResult("4247")(TestString.test1())
    )

  "StringBuilder.delete" should "not throw exception when the second param is grater than the string length" in (
     try {
       TestString.deleteFromStringBuilder()
     } catch {
       case e : Exception => fail("an Exception caught", e)
     }
    )

}
