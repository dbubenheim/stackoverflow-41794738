# stackoverflow-41794738

Includes an answer to this question http://stackoverflow.com/q/41794738/6372139


The controller can be called via curl

```
curl -XGET localhost:8080/hello
```

The output should look similar to this:

```
2017-01-27 18:07:15.878  INFO 3481 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2017-01-27 18:07:15.938  INFO 3481 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2017-01-27 18:07:15.945  INFO 3481 --- [           main] com.stackoverflow.Application            : Started Application in 2.72 seconds (JVM running for 3.112)
2017-01-27 18:07:18.735  INFO 3481 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2017-01-27 18:07:18.735  INFO 3481 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2017-01-27 18:07:18.746  INFO 3481 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 11 ms
in preHandle
in postHandle
in afterCompletion
```

As you can see the interceptor methods will be called during the request.
