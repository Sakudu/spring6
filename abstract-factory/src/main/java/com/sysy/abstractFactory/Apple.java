package com.sysy.abstractFactory;

/**
 * @author saku
 * @date 2023/10/9 10:34
 */
public class Apple extends Fruit {

    /** 水果产品族中的产品等级2 */
    @Override
    public void ripeCycle() {
        System.out.println("Apple ripe");
    }
}
