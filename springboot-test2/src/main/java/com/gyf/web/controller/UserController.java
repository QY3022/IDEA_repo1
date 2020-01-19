package com.gyf.web.controller;

import com.gyf.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QY3022
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    @ResponseBody
    /**
     * 通过ID查询用户的信息
     */
    public User UserInfo(@PathVariable("id") Integer id){
        User user = new User();
        user.setId(id);
        user.setUsername("niubi");
        int a = 10/0;
        return user;
    }

/**
* 启动springboot项目，以后不建议这样子做
*/
/*
public static void main(String[] args) {
    SpringApplication.run(UserController.class,args);
}
*/



}
