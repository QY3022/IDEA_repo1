package com.qy.api;

import com.qy.myEntity.domain.User;
import com.qy.exception.ApiException;
import com.qy.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author QY3022
 * @date 1/14
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 此处返回的就是一个string或者一个map,而不能是一个对象，采用swagger框架，返回的就是要一个对象，swagger框架自动解析对象
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(){
        User user = new User(4L,"666",23L);
        boolean b = userService.saveUser(user);
        if(b){
            return new ApiException(200,"保存成功").toString();
        }
        return new ApiException(404,"保存失败").toString();
    }


}
