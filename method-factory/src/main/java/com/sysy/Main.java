package com.sysy;

import com.sysy.methodFactory.FighterFactory;
import com.sysy.methodFactory.TankFactory;
import com.sysy.methodFactory.WeaponFactory;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        WeaponFactory factory = new TankFactory();
        factory.get().attack();
        WeaponFactory weaponFactory = new FighterFactory();
        weaponFactory.get().attack();
    }
}
