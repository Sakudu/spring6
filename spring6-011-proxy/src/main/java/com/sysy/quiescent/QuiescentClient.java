package com.sysy.quiescent;

import com.sysy.quiescent.service.OrderService;
import com.sysy.quiescent.service.OrderServiceProxy;
import com.sysy.quiescent.service.impl.OrderServiceImpl;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class QuiescentClient {
    public static void main(String[] args) {
        //目标对象
        OrderService orderService = new OrderServiceImpl();
        // 创建代理对象
        OrderService proxy = new OrderServiceProxy(orderService);
        // 调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }


}
