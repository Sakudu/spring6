package com.sysy.simpleFactory;

/**
 * 具体产品角色
 * @author saku
 * @date 2023/10/9 9:43
 */
public class Fighter extends Weapon{

    @Override
    public void attack() {
        System.out.println("Fighter attack");
    }
}
