package org.jbugkorea.byteman;

/**
 * Byteman Test App Main Class<p/>
 * <pre>
 * Run:
 * $ java -javaagent:/usr/local/byteman/lib/byteman.jar=script:/usr/local/byteman/rules/thread.btm,boot:/usr/local/byteman/lib/byteman.jar,listener:true,port:9091,address:127.0.0.1 -Dorg.jboss.byteman.transform.all org.jbugkorea.byteman.BytemanTestAppMain2 foo bar ted
 * or
 * $ bmjava.sh -l /usr/local/byteman/rules/thread.btm org.jbugkorea.byteman.BytemanTestAppMain2 foo bar ted
 *
 * Expected:
 * *** start for thread foo
 * foo
 * ** start for thread bar
 * bar
 * ** start for thread ted
 * ted
 * </pre>
 *
 * @author <a href=mailto:iamtedwon@gmail.com">Ted Won</a>
 * @version 0.1.0
 * @since 0.1.0
 */
public class BytemanTestAppMain2 {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      final String arg = args[i];
      Thread thread = new Thread(arg) {
        public void run() {
          System.out.println(arg);
        }
      };
      thread.start();
      try {
        thread.join();
      } catch (Exception e) {
      }
    }
  }
}
