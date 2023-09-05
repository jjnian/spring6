package cn.clean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 */
@Configuration
@ComponentScan("cn.clean")
public class AppConfig {

	public HttpMessageConverter<Object> mappingJackson2HttpMessageConverter(){
		System.out.println("----------------------------------------");
		return new MappingJackson2HttpMessageConverter();
	}

}
