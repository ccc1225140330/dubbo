package com.fh.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fh.bean.User;
import com.fh.service.CustomerService;
import com.fh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustumerServiceImpl implements CustomerService{

	@Autowired
	private UserService userService;
	@Override
	public void getUser() {
		User someUser = userService.getSomeUser();
		System.out.println(someUser);
	}

	@Override
	public User getReturnUser() {
		return userService.getSomeUser();
	}

}
