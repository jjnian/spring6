package cn.clean.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class TestFactoryBean implements FactoryBean<Object> {
	@Override
	public Object getObject() throws Exception {
		return new Object();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
