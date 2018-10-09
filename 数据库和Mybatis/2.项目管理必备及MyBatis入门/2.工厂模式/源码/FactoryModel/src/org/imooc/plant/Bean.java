package org.imooc.plant;

/***
 *  ClassName : Bean
 *  Author    : lin
 *  Date      : 2018/10/9 16:05    
 *  Remark    : 
 */

public class Bean implements Plant{
    public String getName(){
        return "绿逗";
    }

    public void fight(){
        System.out.println("发射一个绿豆");
    }
}
