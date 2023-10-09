package com.sysy.lifeCycle;

import lombok.Data;

/**
 * @author saku
 * @date 2023/10/9 15:58
 */
@Data
public class User {

    private String name;

    public User() {
        System.out.println("1 实例化bean");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2 bean属性赋值");
    }

    /** 初始化方法需要手动编写 */
    public void initBean(){
        System.out.println("3 初始化bean");
    }

    /** 销毁方法需要手动编写 */
    public void destroyBean(){
        System.out.println("5 销毁Bean");
    }
}
