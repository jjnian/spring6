package cn.clean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 *
 */
@Configuration
@EnableWebMvc
public class MyWebMvcConfigurationSupport implements WebMvcConfigurer {
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new MappingJackson2HttpMessageConverter());
	}

	//@Bean
	public HttpMessageConverter<Object> my(){
		return new MappingJackson2HttpMessageConverter();
	}

}
