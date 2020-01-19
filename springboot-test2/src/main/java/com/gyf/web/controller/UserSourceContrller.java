package com.gyf.web.controller;

import com.gyf.service.UserService.CustomerService;
import com.gyf.service.UserService.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserSourceContrller {

    @Autowired
    CustomerService customerService;
    @Autowired
    UserService userService;

    Logger logger = Logger.getLogger(UserService.class);

    @RequestMapping("/reg")
    @ResponseBody
    public String register(){
        userService.registerUser("qwe","qwe");
        logger.info("abcdef");
        return "SUCCESS";
    }

}
