package com.sysy.reflect;

/**
 * @author saku
 * @date 2023/10/10 14:05
 */
public class SystemService {

    public void logout(){
        System.out.println("退出系统");
    }

    public boolean login(String userName, String password){
        System.out.println("登录系统");
        return userName.equals("admin") && "admin123".equals(password);
    }
}
