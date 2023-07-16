package cn.clean.main.annotation;

import cn.clean.config.AppConfig;
import cn.clean.service.annotation.ArgsService;
import cn.clean.service.annotation.AspectService;
import cn.clean.service.annotation.AspectServiceForMyAnno;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectMain {
    public static void main(String[] args) {

        // AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(AppConfig.class);
        // AspectService bean = acp.getBean(AspectService.class);
        // bean.aspect("jiruixin","address");

        // 测试自己写的注解实现Aop
        AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(AppConfig.class);
        AspectServiceForMyAnno bean = acp.getBean(AspectServiceForMyAnno.class);
        bean.aspect("jiruixin");

        System.out.println("--------------------------");
        ArgsService argsService = new ArgsService();
        bean.aspect(argsService);

    }
}
