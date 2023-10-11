package com.sysy;

import com.sysy.annotation.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        // 存放Bean的Map集合。key存储beanId。value存储Bean。
        Map<String, Object> beanMap = new HashMap<>();
        String packageName = "com.sysy.bean";
        String path = packageName.replaceAll("\\.", "/");
        URL url = ClassLoader.getSystemClassLoader().getResource(path);
        File file = null;
        if (url != null) {
            file = new File(url.getPath());
        }
        File[] files = new File[0];
        if (file != null) {
            files = file.listFiles();
        }
        if (files != null) {
            Arrays.stream(files).forEach(f -> {
                String className = packageName + "." + f.getName().split("\\.")[0];
                try {
                    Class<?> clazz = Class.forName(className);
                    if (clazz.isAnnotationPresent(Component.class)) {
                        Component component = clazz.getAnnotation(Component.class);
                        String beanId = component.value();
                        Object bean = clazz.newInstance();
                        beanMap.put(beanId, bean);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        System.out.println(beanMap);
    }
}
