package com;

/***
 *  ClassName : MyThread
 *  Author    : lin
 *  Date      : 2018/12/10 17:27    
 *  Remark    : 
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
    }
}
