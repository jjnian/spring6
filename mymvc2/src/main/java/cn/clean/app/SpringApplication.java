package cn.clean.app;

import cn.clean.config.AppConfig;
import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 */
public class SpringApplication {

	public static void run(){
		AnnotationConfigWebApplicationContext awc = new AnnotationConfigWebApplicationContext();
		awc.register(AppConfig.class);
		awc.refresh();

		startTomcat(awc);

	}

	private static void startTomcat(WebApplicationContext applicationContext){
		Tomcat tomcat = new Tomcat();

		Server server = tomcat.getServer();
		Service service = server.findService("Tomcat");

		Connector connector = new Connector();
		// 设置默认tomcat启动端口
		connector.setPort(10004);

		Engine engine = new StandardEngine();
		engine.setDefaultHost("localhost");

		Host host = new StandardHost();
		host.setName("localhost");

		String contextPath = "";
		Context context = new StandardContext();
		context.setPath(contextPath);
		context.addLifecycleListener(new Tomcat.FixContextListener());

		host.addChild(context);
		engine.addChild(host);

		service.setContainer(engine);
		service.addConnector(connector);

		// 2.2 创建DispatcherServlet对象，并与Spring容器绑定，并将DispatcherServlet对象添加至Tomcat中
		tomcat.addServlet(contextPath, "dispatcher", new DispatcherServlet(applicationContext));
		context.addServletMappingDecoded("/*", "dispatcher");

		// 2.3 启动tomcat
		try {
			tomcat.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}

}
