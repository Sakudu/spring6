package com.sysy.core;

/**
 * 应用上下文接口
 * @author saku
 * @date 2023/10/10 16:13
 */
public interface ApplicationContext {

    /**
     * 根据beanName 返回 bean对象
     * @return java.lang.Object
     * @param name beanName
     * @date 2023/10/10
     */
    Object getBean(String name);

    /**
     * 根据beanName && type 返回 bean对象
     * @return T
     * @param name beanName
     * @param requiredType type
     * @date 2023/10/10
     */
    <T> T getBean(String name, Class<T> requiredType);
}
