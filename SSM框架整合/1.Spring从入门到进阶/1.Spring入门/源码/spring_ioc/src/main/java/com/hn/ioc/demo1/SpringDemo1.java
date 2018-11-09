package com.hn.ioc.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/***
 *  ClassName : SpringDemo1
 *  Author    : lin
 *  Date      : 2018/11/1 16:32    
 *  Remark    : 测试类
 */

public class SpringDemo1 {

    @Test
    /***
     * 传统方式开发
     */
    public void demo1(){
//        UserService userService = new UserServiceImpl();

        UserServiceImpl userService = new UserServiceImpl();
        userService.setName("王");
        userService.sayHello();
    }

    @Test
    /***
     * 使用Spring的方式实现
     */
    public void demo2(){
        //创建Spring工厂
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }

    @Test
    /**
     * 读取磁盘系统中的配置文件
     * */
    public void demo3(){
        //创建Spring的工厂类
        ApplicationContext applicationContext= new FileSystemXmlApplicationContext("c:\\applicationContext.xml");

        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }


    @Test
    /***
     * 传统方式的工厂类BeanFactory
     */
    public void demo4(){
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.sayHello();
    }

    @Test
    /***
     * 传统方式的读取磁盘系统中的配置文件
     */
    public void demo5(){
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("c:\\applicationContext.xml"));

        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.sayHello();
    }

}
