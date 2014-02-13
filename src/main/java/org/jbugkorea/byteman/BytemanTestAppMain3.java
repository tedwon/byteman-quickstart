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
 *
 *
 * -Dorg.jboss.byteman.compileToBytecode -Dorg.jboss.byteman.verbose=true -Dorg.jboss.byteman.debug=true -Dorg.jboss.byteman.transform.all -javaagent:/usr/local/byteman/lib/byteman.jar=script:/usr/local/byteman/rules/periodic.btm,boot:/usr/local/byteman/lib/byteman.jar,boot:/usr/local/byteman/sample/lib/byteman-sample-2.1.4.1.jar,listener:true,port:9091,address:127.0.0.1
 * -Dorg.jboss.byteman.compileToBytecode -Dorg.jboss.byteman.verbose=true -Dorg.jboss.byteman.debug=true -Dorg.jboss.byteman.transform.all -javaagent:/usr/local/byteman/lib/byteman.jar=script:/usr/local/byteman/sample/scripts/PeriodicStats.btm,boot:/usr/local/byteman/lib/byteman.jar,boot:/usr/local/byteman/sample/lib/byteman-sample-2.1.4.1.jar,listener:true,port:9091,address:127.0.0.1
 *
 * -Dorg.jboss.byteman.compileToBytecode -Dorg.jboss.byteman.verbose=true -Dorg.jboss.byteman.debug=true -Dorg.jboss.byteman.transform.all -javaagent:/usr/local/byteman/lib/byteman.jar=script:/usr/local/byteman/rules/MonitorUsedMemory.btm,boot:/usr/local/byteman/lib/byteman.jar,boot:/usr/local/byteman/sample/lib/byteman-sample-2.1.4.1.jar,listener:true,port:9091,address:127.0.0.1
 * -Dorg.jboss.byteman.compileToBytecode -Dorg.jboss.byteman.verbose=true -Dorg.jboss.byteman.debug=true -Dorg.jboss.byteman.transform.all -javaagent:/usr/local/byteman/lib/byteman.jar=script:/usr/local/byteman/sample/scripts/ClassLoadMonitor.btm,boot:/usr/local/byteman/lib/byteman.jar,boot:/usr/local/byteman/sample/lib/byteman-sample-2.1.4.1.jar,listener:true,port:9091,address:127.0.0.1
 *
 * </pre>
 *
 * @author <a href=mailto:iamtedwon@gmail.com">Ted Won</a>
 * @version 0.1.0
 * @since 0.1.0
 */
public class BytemanTestAppMain3 {

  public BytemanTestAppMain3() {
  }

  private void trigger() {

  }

  public static void main(String[] args) {

    new BytemanTestAppMain3().trigger();

    synchronized (BytemanTestAppMain3.class) {
      try {
        BytemanTestAppMain3.class.wait();
      } catch (InterruptedException e) {

      }
    }
  }
}
