package com.qy.api;

import com.qy.myEntity.domain.User;
import com.qy.exception.ApiException;
import com.qy.service.UserService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author QY3022
 * @date 1/14
 */
@Api("处理用户的controller")
@RestController
@RequestMapping("/UserController")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "save User", notes = "save ", nickname = "User")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "User of id", required = true, dataType = "Long", paramType = "save"),
            @ApiImplicitParam(name = "name", value = "User of name", required = true, dataType = "String", paramType = "save"),
            @ApiImplicitParam(name = "age", value = "User of age", required = true, dataType = "Long", paramType = "save"),
    })
    @RequestMapping(method = RequestMethod.POST)
    public ApiException saveUser(@RequestBody User user){
        boolean b = userService.saveUser(user);
        if(b){
            return new ApiException(200,"保存成功");
        }
        return new ApiException(404,"保存失败");
    }


}
