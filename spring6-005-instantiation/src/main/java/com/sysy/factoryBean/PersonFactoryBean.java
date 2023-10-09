package com.sysy.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author saku
 * @date 2023/10/9 15:11
 */
public class PersonFactoryBean implements FactoryBean<Person> {

    @Override
    public boolean isSingleton() {
        // true 代表单例 false代表原型（多例）
        return true;
    }

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
