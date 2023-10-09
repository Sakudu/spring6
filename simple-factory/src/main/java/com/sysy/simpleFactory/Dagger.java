package com.sysy.simpleFactory;

/**
 * 具体产品角色
 *
 * @author saku
 * @date 2023/10/9 9:44
 */
public class Dagger extends Weapon {

    @Override
    public void attack() {
        System.out.println("dagger attack");
    }
}
