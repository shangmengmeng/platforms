package com.star.platforms.dao;

import com.star.platforms.model.ChatUser;

public interface ChatUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(ChatUser record);

    int insertSelective(ChatUser record);

    ChatUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(ChatUser record);

    int updateByPrimaryKey(ChatUser record);
}