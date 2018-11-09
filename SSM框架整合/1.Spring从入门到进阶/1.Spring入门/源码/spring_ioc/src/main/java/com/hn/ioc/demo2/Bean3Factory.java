package com.hn.ioc.demo2;

/***
 *  ClassName : Bean3Factory
 *  Author    : lin
 *  Date      : 2018/11/9 14:24    
 *  Remark    : Bean3的实例工厂
 */

public class Bean3Factory {

    public Bean3 createBean3(){
        System.out.println("Bean3的工厂被执行了");
        return  new Bean3();
    }
}
