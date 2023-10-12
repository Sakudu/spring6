package com.sysy.mapper.impl;

import com.sysy.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @author saku
 * @date 2023/10/12 8:49
 */
@Repository("oracle")
public class UserOracleMapperImpl implements UserMapper {

    @Override
    public void insert() {
        System.out.println("向Oracle数据库插入User数据");
    }
}
