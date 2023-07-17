package cn.clean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.clean")
public class AppConfig {
    @Bean(initMethod = "init")
    public void myBean() {
        System.out.println("appconfig 的 binit");
    }

}
