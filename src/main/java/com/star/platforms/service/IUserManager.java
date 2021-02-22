package com.star.platforms.service;

import com.star.platforms.common.ResultBean;
import com.star.platforms.model.User;
import com.star.platforms.vo.UserInfo;

public interface IUserManager {
    ResultBean<UserInfo> login(String username, String password);
}
