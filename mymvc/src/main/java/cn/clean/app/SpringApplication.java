package cn.clean.app;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 *
 */
public class SpringApplication {
	public static void run(){
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(10001);
		tomcat.addWebapp("/","d:/");
		try{
			tomcat.start();
		}catch (Exception e){
			e.printStackTrace();
		}
		tomcat.getServer().await();

	}

}
