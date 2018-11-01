package com.hn.food;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *  ClassName : FoodDemo
 *  Author    : lin
 *  Date      : 2018/11/1 17:05    
 *  Remark    : 
 */

public class FoodDemo {

    @Test
    public void demo1(){

        //创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过工厂获得类
        FoodService foodService= (FoodService) applicationContext.getBean("food");

        System.out.println(foodService.toString());
    }
}
