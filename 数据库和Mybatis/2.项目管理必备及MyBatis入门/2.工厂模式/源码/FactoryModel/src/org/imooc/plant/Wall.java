package org.imooc.plant;

/***
 *  ClassName : Wall
 *  Author    : lin
 *  Date      : 2018/10/9 16:05    
 *  Remark    : 
 */

public class Wall implements Plant{
    public String getName(){
        return "墙";
    }

    public void fight(){
        System.out.println("卡住僵尸");
    }
}
