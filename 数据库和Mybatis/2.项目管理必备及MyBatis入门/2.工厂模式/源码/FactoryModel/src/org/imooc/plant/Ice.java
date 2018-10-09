package org.imooc.plant;

/***
 *  ClassName : Ice
 *  Author    : lin
 *  Date      : 2018/10/9 16:05    
 *  Remark    : 
 */

public class Ice implements Plant{
    public String getName(){
        return "蓝冰";
    }
    public void fight(){
        System.out.println("发射一个蓝冰");
    }

}
