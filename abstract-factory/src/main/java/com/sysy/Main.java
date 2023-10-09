package com.sysy;

import com.sysy.abstractFactory.*;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        // 客户端调用方法时只面向AbstractFactory调用方法。
        // 注意：这里的new WeaponFactory()可以采用 简单工厂模式 进行隐藏。
        AbstractFactory factory = new WeaponFactory();
        Weapon gun = factory.getWeapon("Tank");
        Weapon dagger = factory.getWeapon("Fighter");
        gun.attack();
        dagger.attack();

        // 注意：这里的new FruitFactory()可以采用 简单工厂模式 进行隐藏。
        AbstractFactory factory1 = new FruitFactory();
        Fruit orange = factory1.getFruit("Orange");
        Fruit apple = factory1.getFruit("Apple");
        orange.ripeCycle();
        apple.ripeCycle();
    }
}
