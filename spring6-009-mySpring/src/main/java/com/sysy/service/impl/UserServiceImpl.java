package com.sysy.service.impl;

import com.sysy.mapper.UserMapper;
import com.sysy.mapper.impl.UserMapperImpl;
import com.sysy.service.UserService;

/**
 * @author saku
 * @date 2023/10/10 15:24
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public void save() {
        userMapper.insert();
    }

    public void setUserMapper(UserMapperImpl userMapper) {
        this.userMapper = userMapper;
    }
}
