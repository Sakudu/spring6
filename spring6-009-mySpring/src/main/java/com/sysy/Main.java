package com.sysy;

import com.sysy.bean.User;
import com.sysy.core.ApplicationContext;
import com.sysy.core.impl.ClassPathXmlApplicationContext;
import com.sysy.service.UserService;
import com.sysy.service.impl.UserServiceImpl;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        User user = ac.getBean("user", User.class);
        System.out.println(user);
        UserService userService = ac.getBean("userServiceImpl", UserServiceImpl.class);
        userService.save();
    }
}
