byteman-quickstart
==================

Byteman Quick Start

http://tedwon.com/display/dev/Byteman

sudo ln -s /Users/USER/byteman-2.1.3/ /usr/local/byteman


Run:

$ java -javaagent:/usr/local/byteman/lib/byteman.jar=script:/usr/local/byteman/rules/appmain.btm,listener:true,port:9091,address:127.0.0.1 org.jbugkorea.byteman.BytemanTestAppMain foo bar ted
or
$ bmjava.sh -l /usr/local/byteman/rules/appmain.btm org.jbugkorea.byteman.BytemanTestAppMain foo bar ted


Expected:

entering main
foo
bar
ted
exiting main
