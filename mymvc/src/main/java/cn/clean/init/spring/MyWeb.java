package cn.clean.init.spring;

import cn.clean.config.AppConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 */
public class MyWeb implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("init MyWebApplicationInitializer");
		AnnotationConfigWebApplicationContext aca = new AnnotationConfigWebApplicationContext();
		aca.register(AppConfig.class);
		//aca.refresh();
		DispatcherServlet dispatcherServlet = new DispatcherServlet(aca);
		servletContext.addServlet("/*",dispatcherServlet);
	}
}
