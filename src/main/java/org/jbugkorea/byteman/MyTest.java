package org.jbugkorea.byteman;

/**
 * -javaagent:/Users/tedwon/runtime/byteman-3.0.10/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/mytest.btm
 */
public class MyTest {

   public int a = 1234;

   public static void main(String[] args) {
      new MyTest().test("a", 2, "c", true);
   }

   private void test(String a, int b, String c, boolean d) {

   }
}
