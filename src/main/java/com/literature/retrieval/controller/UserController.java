package com.literature.retrieval.controller;

import com.literature.retrieval.po.mysql.User;
import com.literature.retrieval.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理模块
 *
 * @PACKAGE_NAME: com.literature.retrieval.controller
 * @NAME: UserController
 * @AUTHOR: Hansel Ma
 * @DATE: 2021/11/1
 * @PROJECT_NAME: literature-retrieval
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register-new-user")
    public Boolean registerNewUser(@RequestBody User user) {
        try {
            return userService.registerNewUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
