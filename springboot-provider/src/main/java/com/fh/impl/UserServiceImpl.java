package com.fh.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.fh.bean.User;
import com.fh.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author Y7000
 */
//com.alibaba.dubbo.config.annotation.Service; 这个service 是暴露接口的

@Service
@Component
public class UserServiceImpl implements UserService {

	@Override
	public User getSomeUser() {
		User u = new User();
		u.setId(15);
		u.setName("221");
		return u;
	}

}
