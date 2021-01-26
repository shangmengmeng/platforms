package com.star.platforms.dao;

import com.star.platforms.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User login(@Param("username")String username,@Param("password")String password);
}