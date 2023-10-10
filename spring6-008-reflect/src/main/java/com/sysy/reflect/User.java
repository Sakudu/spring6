package com.sysy.reflect;

import lombok.Data;

/**
 * @author saku
 * @date 2023/10/10 14:33
 */
@Data
public class User {

    private String name;

    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
