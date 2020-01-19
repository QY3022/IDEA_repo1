package com.gyf.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    @Insert("insert into user(username,password) values(#{username},#{password})")
    void save(@Param("username") String username, @Param("password") String password);
}
