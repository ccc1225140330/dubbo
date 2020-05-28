package com.fh.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class sss {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:ss.xml");
        context.start();
        //阻塞一下 保证 不关闭
        System.in.read();
    }
}
