package com.fh.service.impl;

import com.fh.service.CustomerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ssss {
    public static void main(String[] args) throws IOException {

            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("classpath:A.xml");
            CustomerService bean = context.getBean(CustomerService.class);

            bean.getUser();
            //阻塞一下 保证消费完 不关闭
        System.in.read();
    }
}
