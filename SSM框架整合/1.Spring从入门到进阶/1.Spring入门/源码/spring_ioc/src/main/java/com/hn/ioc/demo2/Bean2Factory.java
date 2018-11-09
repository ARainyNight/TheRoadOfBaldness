package com.hn.ioc.demo2;

/***
 *  ClassName : Bean2Factory
 *  Author    : lin
 *  Date      : 2018/11/9 14:01    
 *  Remark    : Bean2的静态工厂
 */

public class Bean2Factory {

    public static  Bean2 createBean2(){
        System.out.println("Bean2工厂执行");
        return new Bean2();
    }
}
