package com.sysy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class ReflectTest2 {
    public static void main(String[] args) throws Exception {
        //获取类
        Class<?> sysTemService = Class.forName("com.sysy.reflect.SystemService");
        //获取方法
        Method login = sysTemService.getDeclaredMethod("login", String.class, String.class);
        Method logout = sysTemService.getDeclaredMethod("logout");
        //获取无参构造方法
        Constructor<?> constructor = sysTemService.getDeclaredConstructor();
        //创建对象
        Object o = constructor.newInstance();
        //四要素 o：哪个对象  login：哪个方法  "admin", "admin123" ：参数  invoke：返回值
        Object invoke = login.invoke(o, "admin", "admin123");
        Object invoke1 = logout.invoke(o);
        System.out.println(invoke1);
        System.out.println(invoke);

    }
}
