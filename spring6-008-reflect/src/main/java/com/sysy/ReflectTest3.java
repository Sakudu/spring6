package com.sysy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class ReflectTest3 {

    /**
     *  假设已知方法com.sysy.reflect.User
     *  这个方法符合javabean规范  即属性私有化 对外提供get set方法
     *  类中有个属性叫age
     *  age属性的类型是Integer
     *  反射机制调用相关方法给age属性赋值
     */
    public static void main(String[] args) throws Exception {
        Class<?> user = Class.forName("com.sysy.reflect.User");
        String propertyName = "age";
        Constructor<?> constructor = user.getDeclaredConstructor();
        Object instance = constructor.newInstance();
        // 根据属性名获取setter方法名
        String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
        //根据属性名获取属性类型
        Field field = user.getDeclaredField(propertyName);
        Class<?> type = field.getType();
        // 获取Method
        Method setMethod = user.getDeclaredMethod(setMethodName, type);
        // 调用Method
        setMethod.invoke(instance, 20);
        System.out.println(instance);

    }
}
