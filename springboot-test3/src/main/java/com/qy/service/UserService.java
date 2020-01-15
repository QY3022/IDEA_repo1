package com.qy.service;

import com.qy.myEntity.domain.User;

/**
 * @author QY3022
 * @date 1/14
 */
public interface UserService {
    /**
     * 保存 User
     *
     * @param user
     * @return
     */
    boolean saveUser(User user);
}
