package com.hn.aop.demo5;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/***
 *  ClassName : MyBeforeAdvice
 *  Author    : lin
 *  Date      : 2018/11/10 13:05    
 *  Remark    : 
 */

public class MyBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("========前置增强=======");
    }
}
