package com.oufaxin.application.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oufaxin.application.mapper.UserMapper;
import com.oufaxin.application.pojo.User;
import com.oufaxin.application.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> queryAll() {
		List<User> list = this.userMapper.queryAll();
		return list;
	}
}
