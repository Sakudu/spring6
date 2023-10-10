package com.sysy.core.impl;

import com.sysy.core.ApplicationContext;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author saku
 * @date 2023/10/10 16:45
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {

    //一级缓存
    private final Map<String, Object> singletonObjects = new HashMap<>();
    private final Map<String, Object> singletonFactories = new HashMap<>();
    private final Map<String, Object> earlySingletonObjects = new HashMap<>();


    /**
     * 解析配置文件 初始化bean对象
     * 注意，使用ClassPathXmlApplicationContext 配置文件应当放在类路径下
     */
    public ClassPathXmlApplicationContext(String configLocation) {
        try {
            //解析xml文件，实例化bean  将bean存放到singletonObjects中
            SAXReader reader = new SAXReader();
            //获取一个输入流 指向配置文件
            ClassLoader loader = ClassLoader.getSystemClassLoader();
            InputStream inputStream = loader.getResourceAsStream(configLocation);
            Document document = reader.read(inputStream);
            List<Node> beans = document.selectNodes("//bean");
            beans.forEach(b -> {
                try {
                    //向下转型的目的是为了使用Element接口里更加丰富的方法
                    Element beanElt = (Element) b;
                    String id = beanElt.attributeValue("id");
                    String className = beanElt.attributeValue("class");
                    //通过反射机制创建对象
                    Class<?> aClass = Class.forName(className);
                    Constructor<?> constructor = aClass.getDeclaredConstructor();
                    Object bean = constructor.newInstance();
                    //将bean曝光
                    singletonObjects.put(id, bean);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            //再次遍历beans  目的是给对象的属性赋值
            beans.forEach(b -> {
                try {
                    Element beanElt = (Element) b;
                    String id = beanElt.attributeValue("id");
                    String className = beanElt.attributeValue("class");
                    Class<?> aClass = Class.forName(className);
                    Constructor<?> constructor = aClass.getDeclaredConstructor();
                    Object bean = constructor.newInstance();
                    //获取该bean标签下的所有属性标签
                    List<Element> list = beanElt.elements("property");
                    for (Element p : list) {
                        String propertyName = p.attributeValue("name");
                        String propertyValue = p.attributeValue("value");
                        //获取set方法名
                        String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
                        //获取属性类型
                        Class<?> type = aClass.getDeclaredField(propertyName).getType();
                        Method setMethod = aClass.getDeclaredMethod(setMethodName, type);
                        //执行set方法
                        setMethod.invoke(bean, propertyValue);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String name) {
        return singletonObjects.get(name);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) {
        return (T) singletonObjects.get(name);
    }
}
