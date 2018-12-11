package com;

/***
 *  ClassName : Run
 *  Author    : lin
 *  Date      : 2018/12/10 22:09    
 *  Remark    : 
 */

public class Run {
    public static void main(String []args){
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1? .........................="+thread.interrupted());
            System.out.println("是否停止2? ............................="+thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
