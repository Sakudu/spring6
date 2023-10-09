package com.sysy;

import com.sysy.simpleFactory.WeaponFactory;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class Main {

    /**
     * 对于客户端来说 不需要了解武器的攻击细节，只需要知道想要的是哪种武器
     * @author gaowende
     * @date 2023/10/9
     */
    public static void main(String[] args) {
        WeaponFactory.get("TANK").attack();
        System.out.println("Hello world!");
    }
}
