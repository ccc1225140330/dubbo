package com.fh.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fh.bean.User;
import com.fh.service.UserService;


public class UserServiceImpl implements UserService {

	@Override
	public User getSomeUser() {
		User u = new User();
		u.setId(15);
		u.setName("221");
		return u;
	}

}
