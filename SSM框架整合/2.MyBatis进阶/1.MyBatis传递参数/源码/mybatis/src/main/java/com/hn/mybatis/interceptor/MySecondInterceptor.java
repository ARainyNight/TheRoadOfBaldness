package com.hn.mybatis.interceptor;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Statement;
import java.util.Properties;

/***
 *  ClassName : MyFirstInterceptor
 *  Author    : lin
 *  Date      : 2018/11/17 13:38    
 *  Remark    : 
 */

//插件签名，告诉Mybatis当前插件用来拦截哪个对象的哪个方法
@Intercepts({
        @Signature(type = ResultSetHandler.class,method = "handleResultSets" ,args = Statement.class)
})
public class MySecondInterceptor implements Interceptor {


    //拦截目标对象的目标方法
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("second Intercept..."+invocation.getTarget());
        System.out.println(invocation.getMethod());
        System.out.println(invocation.getArgs());
        Object object = invocation.proceed();
        return object;
    }

    //包装目标对象，为目标对象创建代理对象
    public Object plugin(Object o) {
        System.out.println("second plugin..."+o);
        return Plugin.wrap(o,this);
    }

    public void setProperties(Properties properties) {
        System.out.println("second plugin..."+properties);
//        System.out.println(properties.getProperty("hello"));
    }
}
