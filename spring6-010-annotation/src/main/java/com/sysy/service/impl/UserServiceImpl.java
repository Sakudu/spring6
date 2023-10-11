package com.sysy.service.impl;

import com.sysy.mapper.UserMapper;
import com.sysy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author saku
 * @date 2023/10/11 16:04
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save() {
        userMapper.insert();
    }
}
