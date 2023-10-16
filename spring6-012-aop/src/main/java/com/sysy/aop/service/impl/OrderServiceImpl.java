package com.sysy.aop.service.impl;

import com.sysy.aop.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author saku
 * @date 2023/10/16 8:39
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void generate() {
        System.out.println("订单已生成");
        //throw new RuntimeException("测试异常");
    }
}
