package cn.clean.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class UserController {

	@GetMapping("/hello")
	public String hello(String name){
		System.out.println("-------------------------------");
		if (name != null){
			return name + "hello";
		}else{
			return "hello";
		}
	}
}
