package com.sysy.methodFactory;

/**
 * @author saku
 * @date 2023/10/9 10:22
 */
public class FighterFactory implements WeaponFactory{

    @Override
    public Weapon get() {
        return new Fighter();
    }
}
