package com.sysy.dynamics.jdk.util;

import com.sysy.dynamics.jdk.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author saku
 * @date 2023/10/12 14:41
 */
public class ProxyUtil {

    public static Object newProxyInstance(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimerInvocationHandler(target));
    }
}
