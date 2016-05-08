package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.po.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/show")
	public String show(String id){
		System.out.println(userService.getUserById(1));
		return "showUser";
	}
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request){
		User user=new User();
		user.setUsername(request.getParameter("username"));
		user.setAddress(request.getParameter("address"));
		this.userService.addUser(user);
		return "showUser";
	}
}