package com.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.po.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}
	
	
	public void addUser(User user){
		userMapper.insert(user);
	}
}
