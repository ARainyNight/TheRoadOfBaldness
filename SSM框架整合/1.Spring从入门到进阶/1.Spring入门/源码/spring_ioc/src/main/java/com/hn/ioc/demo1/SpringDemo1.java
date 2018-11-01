package com.hn.ioc.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

}
