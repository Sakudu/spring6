package com.sysy.dynamics.jdk.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author saku
 * @date 2023/10/12 14:29
 */
public class TimerInvocationHandler implements InvocationHandler {

    private Object target;

    public TimerInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 目标执行之前增强。
        long begin = System.currentTimeMillis();
        // 调用目标对象的目标方法
        Object retValue = method.invoke(target, args);
        // 目标执行之后增强。
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
        // 记得返回。
        return retValue;
    }
}
