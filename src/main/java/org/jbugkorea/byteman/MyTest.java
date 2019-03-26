package org.jbugkorea.byteman;

import javax.sound.sampled.AudioSystem;
import java.util.ArrayList;
import java.util.List;

/**
 * -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/mytest.btm
 *
 * <p/>
 *
 * -Dorg.jboss.byteman.verbose=true -Dorg.jboss.byteman.debug=true -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/mytest2.btm
 *
 *  -Dorg.jboss.byteman.transform.all=true -Dorg.jboss.byteman.verbose=true -Dorg.jboss.byteman.debug=true -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/mytest2.btm,boot:/Users/tedwon/byteman/lib/byteman.jar
 */
public class MyTest {

   public int a = 1234;

   public static void main(String[] args) throws Exception {
      new MyTest().test("a", 2, "c", true);
   }

   private void test(String a, int b, String c, boolean d) throws Exception {
      String abc = "abcd";
       List providers = new ArrayList();

       AudioSystem.getAudioFileTypes();

      throw new Exception("my test ex");

   }
}
