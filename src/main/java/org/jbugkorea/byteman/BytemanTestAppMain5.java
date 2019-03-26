package org.jbugkorea.byteman;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

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
 *
 * -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/appmain.btm
 * -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/rh/build/upstream/byteman/byteman-quickstart/rules/hashmap.btm
 * -Dorg.jboss.byteman.transform.all=true -Dorg.jboss.byteman.verbose=true -Dorg.jboss.byteman.debug=true -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/rh/build/upstream/byteman/byteman-quickstart/rules/hashmap.btm,boot:/Users/tedwon/byteman/lib/byteman.jar"
 * <p/>
 * -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/MeasureExecutionTime2.btm
 * -Dorg.jboss.byteman.transform.all -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/scripts/ClassLoadMonitor.btm,boot:/Users/tedwon/byteman/lib/byteman.jar
 * -Dorg.jboss.byteman.transform.all -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/scripts/ClassLoadMonitor.btm,sys:/Users/tedwon/byteman/lib/byteman.jar
 * -Dorg.jboss.byteman.transform.all -javaagent:/Users/tedwon/byteman/lib/byteman.jar=script:/Users/tedwon/build/byteman/byteman-quickstart/rules/scripts/ClassLoadMonitor.btm,sys:/Users/tedwon/byteman/lib/byteman.jar,boot:/Users/tedwon/byteman/lib/byteman.jar
 *
 * export BYTEMAN_OPTS="-Dorg.jboss.byteman.verbose=true -Dorg.jboss.byteman.debug=true -Dorg.jboss.byteman.transform.all \
 -javaagent:$BYTEMAN_HOME/lib/byteman.jar=script:/Users/tedwon/rh/build/byteman/byteman-quickstart/rules/scripts/ThreadMonitorHistory.btm,boot:$BYTEMAN_HOME/lib/byteman.jar,boot:/Users/tedwon/rh/build/byteman/byteman-quickstart/rules/lib/byteman-sample.jar,listener:true,port:9551,address:127.0.0.1"
 *
 *
 *
 * @author <a href=mailto:iamtedwon@gmail.com">Ted Won</a>
 * @version 0.1.0
 * @since 0.1.0
 */
public class BytemanTestAppMain5 {

  public static void main(String[] args) throws Exception {

    Map queryInfos = new HashMap();

    queryInfos.put("mykey", "myvalue");

//    System.out.println(queryInfos);
    System.out.println(String.format("%1$tr", System.currentTimeMillis()));



  }
}
