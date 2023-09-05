package cn.clean.controller;

import cn.clean.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class UserController {

	@GetMapping("/hello")
	public String hello( String name1){
		System.out.println("-------------------------------");
		if (name1 != null){
			return name1 + "hello";
		}else{
			return "hello";
		}
	}

	@GetMapping("/hello1")
	public String hello1(@RequestParam("ji") String name1){
		System.out.println("-------------------------------");
		if (name1 != null){
			return name1 + "hello";
		}else{
			return "hello";
		}
	}

	@GetMapping("/hello2")
	public User hello2(User user){
		System.out.println("-------------------------------");
		System.out.println(user);
		User user1 = new User("ji",18);

		return user1;
	}
}
