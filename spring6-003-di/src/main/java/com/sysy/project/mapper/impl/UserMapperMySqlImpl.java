package com.sysy.project.mapper.impl;

import com.sysy.project.mapper.UserMapper;

/**
 * @author saku
 * @date 2023/10/8 9:10
 */
public class UserMapperMySqlImpl implements UserMapper {

    @Override
    public void insert() {
        System.out.println("MySQL insert");
    }
}
