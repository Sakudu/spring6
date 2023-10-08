package com.sysy.project.service.impl;

import com.sysy.project.mapper.UserMapper;
import com.sysy.project.mapper.impl.UserMapperMySqlImpl;
import com.sysy.project.service.UserService;

/**
 * @author saku
 * @date 2023/10/8 9:09
 */
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper = new UserMapperMySqlImpl();

    //private final UserMapper userMapper = new UserMapperOracleImpl();

    @Override
    public void deleteById() {
        userMapper.deleteById();
    }
}
