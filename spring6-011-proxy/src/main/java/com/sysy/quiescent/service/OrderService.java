package com.sysy.quiescent.service;

/**
 * @author saku
 * @date 2023/10/12 11:40
 */
public interface OrderService {

    /**
     * 生成订单
     */
    void generate();

    /**
     * 查看订单详情
     */
    void detail();

    /**
     * 修改订单
     */
    void modify();
}
