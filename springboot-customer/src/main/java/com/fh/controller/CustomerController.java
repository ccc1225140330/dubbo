package com.fh.controller;

import com.fh.bean.User;
import com.fh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Y7000
 */
@RestController
public class CustomerController {

    @Autowired

    CustomerService customerService;

    @RequestMapping("/ss")
    public User ss(){
        User returnUser = customerService.getReturnUser();
        System.out.println(returnUser);
        return returnUser;
    }


}
