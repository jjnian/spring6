package cn.clean.main.inter;

import cn.clean.config.AppConfig;
import cn.clean.service.inter.InterAspectService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class InterAspectMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(AppConfig.class);
		InterAspectService bean = acp.getBean(InterAspectService.class);
		bean.interAspect();

	}
}
