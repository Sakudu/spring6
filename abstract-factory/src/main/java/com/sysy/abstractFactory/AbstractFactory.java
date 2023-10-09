package com.sysy.abstractFactory;

/**
 * @author saku
 * @date 2023/10/9 10:35
 */
public abstract class AbstractFactory {

    public abstract Weapon getWeapon(String type);
    public abstract Fruit getFruit(String type);
}
