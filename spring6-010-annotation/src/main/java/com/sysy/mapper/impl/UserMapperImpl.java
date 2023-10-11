package com.sysy.mapper.impl;

import com.sysy.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @author saku
 * @date 2023/10/11 16:03
 */
@Repository
public class UserMapperImpl implements UserMapper {

    @Override
    public void insert() {
        System.out.println("向mysql数据库插入User数据1");
    }
}
