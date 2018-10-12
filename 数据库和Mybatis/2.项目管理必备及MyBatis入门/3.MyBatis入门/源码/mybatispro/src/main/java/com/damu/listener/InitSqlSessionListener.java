package com.damu.listener;

import com.damu.utils.SqlSessionFactoryUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/***
 *  ClassName : InitSqlSessionListener
 *  Author    : lin
 *  Date      : 2018/10/12 21:32    
 *  Remark    : 
 */

@WebListener
public class InitSqlSessionListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("容器加载中.......");
        //初始化SqlSessionFactory对象
        SqlSessionFactoryUtils.initSqlSessionFactry();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("容器销毁中.......");
        //关闭SqlSessionFactory对象
        SqlSessionFactoryUtils.close();
    }
}
