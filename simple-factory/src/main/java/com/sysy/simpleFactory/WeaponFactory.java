package com.sysy.simpleFactory;

/**
 * 工厂类角色
 * @author saku
 * @date 2023/10/9 9:56
 */
public class WeaponFactory {

    /**
     * 静态方法  获取什么产品就看传的什么参数
     * @return com.sysy.simpleFactory.Weapon
     * @param weaponType 武器类型
     */
    public static Weapon get(String weaponType){
        if (weaponType == null || weaponType.trim().length() == 0) {
            throw new RuntimeException("不支持该武器！");
        }
        Weapon weapon;
        switch (weaponType) {
            case "TANK":
                weapon = new Tank();
                break;
            case "FIGHTER":
                weapon = new Fighter();
                break;
            case "DAGGER":
                weapon = new Dagger();
                break;
            default:
                throw new RuntimeException("不支持该武器！");
        }
        return weapon;
    }
}
