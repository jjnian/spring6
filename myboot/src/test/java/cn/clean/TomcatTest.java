package cn.clean;

import cn.clean.web.servlet.TomcatStarter;
import org.apache.catalina.Host;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.junit.jupiter.api.Test;
import org.springframework.util.ClassUtils;

import java.io.File;

/**
 *
 */
public class TomcatTest {

	@Test
	public void test() throws LifecycleException {
		Tomcat tomcat = new Tomcat();

		// 添加Web应用程序，可以指定上下文路径和WAR文件的位置
		//tomcat.addWebapp("/myapp", "/");

		//tomcat.setPort(10005);
		//Connector connector = new Connector();
		//connector.setThrowOnFailure(true);
		//tomcat.getService().addConnector(connector);

		//tomcat.setConnector(connector);
		//tomcat.getHost().setAutoDeploy(false);
		prepareContext(tomcat.getHost());

		// 启动Tomcat服务器
		tomcat.start();
		tomcat.getServer().await();
	}

	public void prepareContext(Host host){
		TomcatStarter starter = new TomcatStarter();
		StandardContext context = new StandardContext();
		context.addServletContainerInitializer(starter,null);
		context.setName("JI");
		context.setDisplayName("JI");
		context.setPath("/ji");
		context.setDocBase("d:/");

		context.addLifecycleListener(new Tomcat.FixContextListener());
		context.setParentClassLoader(this.getClass().getClassLoader());
		context.setCreateUploadTargets(true);
		host.addChild(context);
	}

}
