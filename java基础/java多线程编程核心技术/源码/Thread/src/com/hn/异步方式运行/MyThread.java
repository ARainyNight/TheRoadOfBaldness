package com.hn.异步方式运行;

/***
 *  ClassName : MyThread
 *  Author    : lin
 *  Date      : 2018/12/10 16:05    
 *  Remark    : 
 */

public class MyThread extends Thread {

    private int i;
    public MyThread(int i ){
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
