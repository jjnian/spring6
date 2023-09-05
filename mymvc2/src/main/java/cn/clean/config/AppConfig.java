package cn.clean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;


/**
 *
 */
@Configuration
@ComponentScan("cn.clean")
public class AppConfig {

    @Bean
    public HttpMessageConverter<Object> my(){
        return new MappingJackson2HttpMessageConverter();
    }
}
