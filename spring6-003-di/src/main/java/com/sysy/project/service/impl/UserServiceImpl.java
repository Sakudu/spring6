package com.sysy.project.service.impl;

import com.sysy.project.mapper.UserMapper;
import com.sysy.project.service.UserService;

/**
 * @author saku
 * @date 2023/10/8 9:09
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void insert() {
        userMapper.insert();
    }
}
