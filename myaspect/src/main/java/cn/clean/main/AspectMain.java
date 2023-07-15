package cn.clean.main;

import cn.clean.config.AppConfig;
import cn.clean.service.AspectService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(AppConfig.class);
        AspectService bean = acp.getBean(AspectService.class);
        bean.aspect();
    }
}
