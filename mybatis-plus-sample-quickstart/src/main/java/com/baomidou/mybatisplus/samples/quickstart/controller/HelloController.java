package com.baomidou.mybatisplus.samples.quickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.samples.quickstart.entity.User;

@RequestMapping("/hello")
@Controller
public class HelloController {

	@GetMapping("/hello")
	@ResponseBody
	public User Hello() {
		User user = new User();
		user.setAge(11);
		user.setEmail("sdfs@qq.com");
		user.setName("lcc");
		user.setId(11111111111L);
		
		return user;
	}
}
