package cn.clean.init.myself;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;
import org.springframework.web.WebApplicationInitializer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/**
 *
 */
@HandlesTypes(MyInit.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {
	@Override
	public void onStartup(Set<Class<?>> myInitImpl, ServletContext ctx) throws ServletException {
		System.out.println("init MyServletContainerInitializer");
		//for (Class cla : myInitImpl){
		//	Constructor constructor = null;
		//	MyInit myInit = null;
		//	try {
		//		constructor = cla.getConstructor();
		//		myInit = (MyInit)constructor.newInstance();
		//		myInit.run();
		//	} catch (NoSuchMethodException e) {
		//		throw new RuntimeException(e);
		//	} catch (InvocationTargetException e) {
		//		throw new RuntimeException(e);
		//	} catch (InstantiationException e) {
		//		throw new RuntimeException(e);
		//	} catch (IllegalAccessException e) {
		//		throw new RuntimeException(e);
		//	}
		//
		//}
	}
}
