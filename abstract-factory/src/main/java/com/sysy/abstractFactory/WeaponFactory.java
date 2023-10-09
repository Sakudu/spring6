package com.sysy.abstractFactory;

/**
 * @author saku
 * @date 2023/10/9 10:38
 */
public class WeaponFactory extends AbstractFactory {

    @Override
    public Weapon getWeapon(String type) {
        if (type == null || type.trim().length() == 0) {
            throw new RuntimeException("无法生产该武器");
        }
        if ("Tank".equals(type)) {
            return new Tank();
        } else if ("Fighter".equals(type)) {
            return new Fighter();
        } else {
            throw new RuntimeException("无法生产该武器");
        }
    }

    @Override
    public Fruit getFruit(String type) {
        return null;
    }
}
