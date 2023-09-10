package cn.clean.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 *
 */
@Component
public class TestMappedInterceptor implements HandlerInterceptor {

	public TestMappedInterceptor() {
		System.out.println();
	}
}
