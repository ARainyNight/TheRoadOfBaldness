package com.hn.ioc.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *  ClassName : SpringDemo2
 *  Author    : lin
 *  Date      : 2018/11/9 13:58    
 *  Remark    : Bean的实例化的三种方式
 */

public class SpringDemo2 {

    @Test
    public void demo1(){
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类的实例
        Bean1 bean1  = (Bean1) applicationContext.getBean("bean1");

    }

    @Test
    public void demo2(){
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类的实例
        Bean2 bean2  = (Bean2) applicationContext.getBean("bean2");

    }

    @Test
    public void demo3(){
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类的实例
        Bean3 bean3  = (Bean3) applicationContext.getBean("bean3");

    }
}
