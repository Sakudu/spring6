package com.sysy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date 2023/10/8 11:26
 */
public class BeanTest {


    @Test
    public void initBean(){
        //并不是调用getBean()的时候创建对象  而是new ClassPathXmlApplicationContext时就创建了对象
        new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void test(){
        //获取spring容器对象
        //ApplicationContext:应用上下文（其实就是Spring容器） 它是一个接口 有很多实现类，ClassPathXmlApplicationContext是其中之一
        //ApplicationContext接口的超级父接口是BeanFactory，BeanFactory是IoC容器的顶级接口
        //ClassPathXmlApplicationContext专门从类路径中加载Spring配置文件的一个Spring上下文对象
        //Spring底层的IoC是通过XML解析 + 工厂模式 + 反射机制实现的
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }
}
