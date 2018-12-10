package com;

/***
 *  ClassName : Run
 *  Author    : lin
 *  Date      : 2018/12/10 17:28    
 *  Remark    : isAlive方法
 */

public class Run {
    public static void main(String []args){
        MyThread myThread =  new MyThread();
        System.out.println("begin=="+myThread.isAlive());
        myThread.start();
        System.out.println("end=="+myThread.isAlive());

    }
}
