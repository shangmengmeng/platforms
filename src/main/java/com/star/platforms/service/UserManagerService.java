package com.star.platforms.service;

import com.star.platforms.common.FailResultBean;
import com.star.platforms.common.ResultBean;
import com.star.platforms.common.SuccessResultBean;
import com.star.platforms.dao.UserMapper;
import com.star.platforms.model.User;
import com.star.platforms.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sam
 */
@Service
@Transactional
public class UserManagerService implements IUserManager {
    @Autowired
    UserMapper userMapper;

    @Override
    public ResultBean<UserInfo> login(String username, String password) {
        UserInfo userBean = userMapper.login(username, password);
        if (userBean!=null){
            return new SuccessResultBean<>(userBean);
        }else {
            return new FailResultBean<>(200,"错误",null);
        }

    }
}
