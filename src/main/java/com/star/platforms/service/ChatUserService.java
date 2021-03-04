package com.star.platforms.service;

import com.star.platforms.dao.ChatUserMapper;
import com.star.platforms.model.ChatUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChatUserService implements IChatUser{
    @Autowired
    ChatUserMapper chatUserMapper;

    @Override
    public void checkUniqueNickname(String nickname) {

    }

    @Override
    public void registerChat(ChatUser chatUser) {

    }
}
