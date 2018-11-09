package com.hn.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *  ClassName : SpringDemo3
 *  Author    : lin
 *  Date      : 2018/11/9 20:31    
 *  Remark    : 
 */

public class SpringDemo3 {

    @Test
    public void demo1(){
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductService productService = (ProductService) applicationContext.getBean("productService");

        productService.save();
    }
}
