package cn.clean.web.context;


import cn.clean.web.servlet.TomcatStarter;
import org.apache.catalina.Host;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.GenericWebApplicationContext;

import java.io.File;
import java.util.Collections;

/**
 *
 */
public class ServletWebServerApplicationContext{

	public void onFresh(){
		Tomcat tomcat = new Tomcat();
		//tomcat.addWebapp("/*","d:");
		//tomcat.setPort(10004);
		//
		//
		Host host = tomcat.getHost();
		StandardContext context = new StandardContext();
		TomcatStarter starter = new TomcatStarter();
		context.addServletContainerInitializer(starter, Collections.emptySet());
		//host.addChild(context);
		//
		//
		//Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		//connector.setThrowOnFailure(true);
		//tomcat.getService().addConnector(connector);
		//tomcat.setConnector(connector);
		//tomcat.getHost().setAutoDeploy(false);
		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
