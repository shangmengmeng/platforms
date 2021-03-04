package com.star.platforms.service;

import com.star.platforms.model.ChatUser;

public interface IChatUser {
    /**
     * 判断唯一性
     */
    void checkUniqueNickname(String nickname);
    /**
     * 注册
     */
    void registerChat(ChatUser chatUser);
}
