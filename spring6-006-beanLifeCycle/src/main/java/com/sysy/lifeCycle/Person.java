package com.sysy.lifeCycle;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author saku
 * @date 2023/10/9 17:16
 */
@Data
public class Person implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String name;

    public Person() {
        System.out.println("1 实例化bean");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2 bean属性赋值");
    }

    /** 初始化方法需要手动编写 */
    public void initBean(){
        System.out.println("6 初始化bean");
    }

    /** 销毁方法需要手动编写 */
    public void destroyBean(){
        System.out.println("10 销毁Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("3 类加载器：" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3 Bean工厂：" + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3 bean名字：" + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9 DisposableBean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("5 afterPropertiesSet执行");
    }
}
