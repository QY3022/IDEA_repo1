package com.gyf.service.UserServiceImp;

import com.gyf.mapper.UserMapper;
import com.gyf.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 默认情况下会自动创建数据源，在application.propertise配置参数就可以了
 * @author QY3022
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public void registerUser(String username, String password) {
        userMapper.save(username,password);
    }

}
