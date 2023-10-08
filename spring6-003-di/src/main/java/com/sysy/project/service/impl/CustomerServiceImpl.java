package com.sysy.project.service.impl;

import com.sysy.project.mapper.UserMapper;
import com.sysy.project.mapper.VipMapper;
import com.sysy.project.service.CustomerService;

/**
 * @author saku
 * @date 2023/10/8 14:24
 */
public class CustomerServiceImpl implements CustomerService {

    private final UserMapper userMapper;

    private final VipMapper vipMapper;

    public CustomerServiceImpl(UserMapper userMapper, VipMapper vipMapper) {
        this.userMapper = userMapper;
        this.vipMapper = vipMapper;
    }

    @Override
    public void save() {
        userMapper.insert();
        vipMapper.save();
    }
}
