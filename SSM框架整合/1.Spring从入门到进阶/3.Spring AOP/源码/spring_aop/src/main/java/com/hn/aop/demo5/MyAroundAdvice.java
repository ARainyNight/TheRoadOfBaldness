package com.hn.aop.demo5;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/***
 *  ClassName : MyAroundAdvice
 *  Author    : lin
 *  Date      : 2018/11/10 14:16    
 *  Remark    : 
 */

public class MyAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("环绕前增强=========");

        Object  object = methodInvocation.proceed();


        System.out.println("环绕后增强=========");
        return object;
    }
}
