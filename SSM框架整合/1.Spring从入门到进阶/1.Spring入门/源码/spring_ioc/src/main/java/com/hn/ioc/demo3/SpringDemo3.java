package com.hn.ioc.demo3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *  ClassName : SpringDemo3
 *  Author    : lin
 *  Date      : 2018/11/9 14:45    
 *  Remark    : Bean的作用范围的测试
 */

public class SpringDemo3 {

    @Test
    public void demo1(){
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        Persion persion1 = (Persion) applicationContext.getBean("persion");
        Persion persion2 = (Persion) applicationContext.getBean("persion");

        System.out.println(persion1);
        System.out.println(persion2);
    }


    @Test
    public void demo2(){
        ClassPathXmlApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man  = (Man) applicationContext.getBean("man");

        man.run();
        applicationContext.close();
    }


    @Test
    public void demo3(){
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        userDao.findAll();
        userDao.save();
        userDao.update();
        userDao.delete();
    }
}
