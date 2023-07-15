package cn.clean.main;

import cn.clean.config.AppConfig;
import cn.clean.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService bean = apc.getBean(TestService.class);
		System.out.println(bean.hello());

	}
}
