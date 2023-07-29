package cn.clean.main;

import cn.clean.app.SpringApplication;
import jakarta.servlet.ServletContext;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 */
public class MvcMain {
	public static void main(String[] args) {
		//Tomcat tomcat = new Tomcat();
		//tomcat.addContext("/","d:/");
		//tomcat.setPort(10001);
		//tomcat.addWebapp("/*","d:/");
		//DispatcherServlet dispatcherServlet = new DispatcherServlet();
		//ServletContext servletContext1 = dispatcherServlet.getServletContext();
		//ServletContext servletContext = dispatcherServlet.getServletConfig().getServletContext();
		//
		//tomcat.addServlet("/**","dispatcher",dispatcherServlet);
		SpringApplication.run();
	}
}
