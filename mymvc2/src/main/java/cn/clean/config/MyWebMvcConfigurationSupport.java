package cn.clean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Configuration
@EnableWebMvc
public class MyWebMvcConfigurationSupport implements WebMvcConfigurer {

	private List<HttpMessageConverter<?>> messageConverters;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TestMappedInterceptor());
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new MappingJackson2HttpMessageConverter());
	}

	/**
	 *  创建类的时候会把bean的参数传进来
	 * @param converters
	 */
	public MyWebMvcConfigurationSupport(List<HttpMessageConverter<?>> converters) {
		messageConverters = converters;
	}

}
