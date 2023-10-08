package com.sysy.test;

import com.sysy.project.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date 2023/10/8 13:55
 */
public class TestCode {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserController controller = applicationContext.getBean("userController", UserController.class);
        controller.insert();

    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserController controller = applicationContext.getBean("userController", UserController.class);
        controller.insert();
    }
}
