package cn.clean.main.annotation;

import cn.clean.config.AppConfig;
import cn.clean.service.annotation.ArgsService;
import cn.clean.service.annotation.AnnoAspectService;
import cn.clean.service.annotation.AspectService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectMain {
    public static void main(String[] args) {

         //AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(AppConfig.class);
         //AspectService bean = acp.getBean(AspectService.class);
         //bean.aspect("jiruixin","address");

        // 测试自己写的注解实现Aop
        AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnoAspectService bean = acp.getBean(AnnoAspectService.class);
        bean.aspect("jiruixin");

        System.out.println("--------------------------");
        ArgsService argsService = new ArgsService();
        bean.aspect(argsService);
    }
}
