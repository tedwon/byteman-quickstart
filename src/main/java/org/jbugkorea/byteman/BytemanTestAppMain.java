package org.jbugkorea.byteman;

/**
 * Byteman Test App Main Class<p/>
 * <pre>
 * Run:
 * $ java -javaagent:/usr/local/byteman/lib/byteman.jar=script:/usr/local/byteman/rules/appmain.btm,listener:true,port:9091,address:127.0.0.1 org.jbugkorea.byteman.BytemanTestAppMain foo bar ted
 * or
 * $ bmjava.sh -l /usr/local/byteman/rules/appmain.btm org.jbugkorea.byteman.BytemanTestAppMain foo bar ted
 *
 * Expected:
 * entering main
 * foo
 * bar
 * ted
 * exiting main
 * </pre>
 *
 * @author <a href=mailto:iamtedwon@gmail.com">Ted Won</a>
 * @version 0.1.0
 * @since 0.1.0
 */
public class BytemanTestAppMain {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
