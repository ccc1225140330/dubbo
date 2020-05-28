package com.fh;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Y7000
 */
@EnableDubbo
@SpringBootApplication
public class SpringbootCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCustomerApplication.class, args);
    }

}
