package com.qy.service;

import com.qy.myEntity.domain.User;
import com.qy.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author QY3022
 * @date 1/14
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    /**
     * 保存User
     *
     * @param user
     * @return
     */
    @Override
    public boolean saveUser(User user) {
        User save = userRepository.save(user);
        if (null != save) {
            return true;
        }
        return false;
    }
}
