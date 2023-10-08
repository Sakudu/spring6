package com.sysy.project.controller;

import com.sysy.project.service.UserService;
import com.sysy.project.service.impl.UserServiceImpl;

/**
 * @author saku
 * @date 2023/10/8 9:12
 */
public class UserController {

    private final UserService userService = new UserServiceImpl();

    public void delete() {
        userService.deleteById();
    }
}
