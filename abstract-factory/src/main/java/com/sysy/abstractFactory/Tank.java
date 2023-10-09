package com.sysy.abstractFactory;

/**
 * 具体产品角色
 * @author saku
 * @date 2023/10/9 9:42
 */
public class Tank extends Weapon{

    /** 武器产品族中的产品等级1 */
    @Override
    public void attack() {
        System.out.println("Tank attack");
    }
}
