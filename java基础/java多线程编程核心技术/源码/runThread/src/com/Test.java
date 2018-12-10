package com;

/***
 *  ClassName : Test
 *  Author    : lin
 *  Date      : 2018/12/10 21:27    
 *  Remark    : getId()
 */

public class Test {

    public static void main(String []args){
        Thread runThread =  Thread.currentThread();
        System.out.println(runThread.getName()+"  "+runThread.getId());
    }
}
