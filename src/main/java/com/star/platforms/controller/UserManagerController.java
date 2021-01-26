package com.star.platforms.controller;

import com.star.platforms.common.ResultBean;
import com.star.platforms.model.User;
import com.star.platforms.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sam
 */
@RestController
@RequestMapping("/user")
public class UserManagerController {
    @Autowired
    UserManagerService userManagerService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultBean<User> Login(String username, String password) {
        return userManagerService.login(username, password);
    }

}
