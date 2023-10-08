package com.sysy.project.controller;

import com.sysy.project.service.CustomerService;
import com.sysy.project.service.UserService;

/**
 * @author saku
 * @date 2023/10/8 9:12
 */
public class UserController {

    private UserService userService;

    private final CustomerService customerService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void insert() {
        customerService.save();
    }
}
