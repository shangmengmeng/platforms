package com.star.platforms.service;

import com.star.platforms.common.ResultBean;
import com.star.platforms.model.User;

public interface IUserManager {
    ResultBean<User> login(String username, String password);
}
