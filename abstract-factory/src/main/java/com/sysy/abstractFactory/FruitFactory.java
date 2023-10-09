package com.sysy.abstractFactory;

/**
 * @author saku
 * @date 2023/10/9 10:40
 */
public class FruitFactory extends AbstractFactory {

    @Override
    public Weapon getWeapon(String type) {
        return null;
    }

    @Override
    public Fruit getFruit(String type) {
        if (type == null || type.trim().length() == 0) {
            throw new RuntimeException("果园不产这种水果");
        }
        if ("Orange".equals(type)) {
            return new Orange();
        } else if ("Apple".equals(type)) {
            return new Apple();
        } else {
            throw new RuntimeException("果园不产这种水果");
        }
    }
}
