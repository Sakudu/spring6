package com.sysy;

import com.sysy.aop.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class AopTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean("orderServiceImpl", OrderService.class);
        orderService.generate();
    }
}
