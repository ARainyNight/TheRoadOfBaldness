package com;

/***
 *  ClassName : MyThread
 *  Author    : lin
 *  Date      : 2018/12/10 22:04    
 *  Remark    : 
 */

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <50000 ; i++) {
            System.out.println("i =" +(i+1));
        }
    }
}
