package com.sysy.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author saku
 * @date 2023/10/16 10:14
 */
@Configuration
@ComponentScan("com.sysy.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Configuration {
}
