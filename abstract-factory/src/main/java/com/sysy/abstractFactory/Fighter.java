package com.sysy.abstractFactory;

/**
 * 具体产品角色
 * @author saku
 * @date 2023/10/9 9:43
 */
public class Fighter extends Weapon{

    /** 武器产品族中的产品等级2 */
    @Override
    public void attack() {
        System.out.println("Fighter attack");
    }
}
