package com.sysy.abstractFactory;

/**
 * @author saku
 * @date 2023/10/9 10:33
 */
public class Orange extends Fruit {

    /** 水果产品族中的产品等级1 */
    @Override
    public void ripeCycle() {
        System.out.println("orange ripe");
    }
}
