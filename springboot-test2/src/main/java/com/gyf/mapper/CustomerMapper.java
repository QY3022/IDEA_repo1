package com.gyf.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {

    @Insert("insert into customer(name,tel) values(#{name},#{tel})")
    void insert(@Param("name") String name , @Param("tel") String tel);
}
