package com.hn.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 *  ClassName : MyJdkProxy
 *  Author    : lin
 *  Date      : 2018/11/10 11:16    
 *  Remark    : 我的JDK动态代理
 */

public class MyJdkProxy implements InvocationHandler {

    private UserDao userDao;

    public MyJdkProxy(UserDao userDao){
        this.userDao = userDao;
    }

    public Object createProxy(){

        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return proxy;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("save".equals(method.getName())){
            System.out.println("权限校验============");
            return method.invoke(userDao,args);
        }

        return method.invoke(userDao,args);
    }
}
