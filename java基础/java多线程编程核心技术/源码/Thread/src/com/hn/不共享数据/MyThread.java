package com.hn.不共享数据;

/***
 *  ClassName : MyThread
 *  Author    : lin
 *  Date      : 2018/12/10 16:33    
 *  Remark    : 
 */

public class MyThread extends Thread {
    private int count = 5 ;
    public MyThread(String name){
        super();
        this.setName(name); //设置线程名称
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--  ;
            System.out.println("由"+this.currentThread().getName()+"计算,count="+count);
        }
    }
}
