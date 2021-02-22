package com.star.platforms.dao;

import com.star.platforms.model.User;
import com.star.platforms.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    UserInfo login(@Param("username")String username, @Param("password")String password);
}