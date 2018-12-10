package com.hn.继承Thread类;

/***
 *  ClassName : MyThread
 *  Author    : lin
 *  Date      : 2018/12/10 15:51    
 *  Remark    : 
 */

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
