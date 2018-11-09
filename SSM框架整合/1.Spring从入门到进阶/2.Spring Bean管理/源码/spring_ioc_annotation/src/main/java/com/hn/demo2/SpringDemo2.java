package com.hn.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *  ClassName : SpringDemo2
 *  Author    : lin
 *  Date      : 2018/11/9 20:14    
 *  Remark    : 
 */

public class SpringDemo2 {

    @Test
    public void demo1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");

        bean1.say();

        applicationContext.close();
    }

    @Test
    public void demo2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        Bean2 bean22 = (Bean2) applicationContext.getBean("bean2");

        System.out.println(bean2);
        System.out.println(bean22);
    }
}
