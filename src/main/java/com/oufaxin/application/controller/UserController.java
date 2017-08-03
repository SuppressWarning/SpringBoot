package com.oufaxin.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oufaxin.application.pojo.User;
import com.oufaxin.application.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("list")
	public List<User> queryUserByName() {
		List<User> list = this.userService.queryAll();
		return list;
	}
}
