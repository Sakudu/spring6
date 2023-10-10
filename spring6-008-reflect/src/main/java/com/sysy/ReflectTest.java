package com.sysy;

import com.sysy.reflect.SystemService;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class ReflectTest {
    public static void main(String[] args) {
        // 创建对象
        SystemService systemService = new SystemService();
        // 调用方法并接收方法的返回值
        boolean success = systemService.login("admin", "admin123");
        System.out.println(success ? "登录成功" : "登录失败");
    }
}
