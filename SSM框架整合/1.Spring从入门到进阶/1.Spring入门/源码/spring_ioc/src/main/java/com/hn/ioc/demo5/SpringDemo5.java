package com.hn.ioc.demo5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *  ClassName : SpringDemo5
 *  Author    : lin
 *  Date      : 2018/11/9 17:43    
 *  Remark    : 
 */

public class SpringDemo5 {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");

        System.out.println(collectionBean);
    }
}
