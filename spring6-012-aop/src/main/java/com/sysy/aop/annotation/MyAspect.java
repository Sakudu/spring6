package com.sysy.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author saku
 * @date 2023/10/16 8:40
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.sysy.aop.service.OrderService.*(..))")
    public void pointcut(){

    }

    // 切点表达式
    @Before("pointcut()")
    // 这就是需要增强的代码（通知）
    public void advice(){
        //System.out.println("我是一个通知");
    }

    @Around("pointcut()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        // 执行目标方法。
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
    }

    @Before("pointcut()")
    public void beforeAdvice(){
        System.out.println("前置通知");
    }

    @AfterReturning("pointcut()")
    public void afterReturningAdvice(){
        System.out.println("后置通知");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowingAdvice(){
        System.out.println("异常通知");
    }

    @After("pointcut()")
    public void afterAdvice(){
        System.out.println("最终通知");
    }
}
