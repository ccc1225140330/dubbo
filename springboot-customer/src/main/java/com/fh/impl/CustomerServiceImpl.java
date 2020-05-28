package com.fh.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fh.bean.User;
import com.fh.service.CustomerService;
import com.fh.service.UserService;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService{
	//远程调用接口

	@Reference
	private UserService userService;

	@Override
	public void getUser() {
		User someUser = userService.getSomeUser();
		System.out.println(someUser);
	}

	@Override
	public User getReturnUser() {
		User someUser = userService.getSomeUser();
		return someUser;
	}


}
