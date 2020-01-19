package com.gyf.web.controller;

import com.gyf.mapper.UserMapper;
import com.gyf.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserJdbcController {

    @Autowired
    UserService userService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/register")
    @ResponseBody
    public String register(){
        userMapper.save("223","233");
        return "SUCCESS";
    }

}
