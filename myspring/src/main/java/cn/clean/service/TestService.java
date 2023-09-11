package cn.clean.service;

import cn.clean.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	private AppConfig appConfig;

	public String hello(){
		return "hello";
	}
}
