package com.hn.继承Thread类;

/***
 *  ClassName : Run
 *  Author    : lin
 *  Date      : 2018/12/10 15:51    
 *  Remark    : 
 */

public class Run {
    public static void main(String []args){
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("run end");
    }
}
