package cn.clean.service;

import cn.clean.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	private Test2Service test2Service;

	public String hello(){
		return "hello";
	}
}
