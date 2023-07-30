package cn.clean;

import cn.clean.web.context.ServletWebServerApplicationContext;

/**
 *
 */
public class Main {
	public static void main(String[] args) {
		ServletWebServerApplicationContext servletWebServerApplicationContext = new ServletWebServerApplicationContext();
		servletWebServerApplicationContext.onFresh();
	}
}
