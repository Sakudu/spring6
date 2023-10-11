package com.sysy.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author saku
 * @date 2023/10/11 14:04
 */
@Component("userBean")
public class User {

    @Value("20")
    private Integer age;

    @Value("张三")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
