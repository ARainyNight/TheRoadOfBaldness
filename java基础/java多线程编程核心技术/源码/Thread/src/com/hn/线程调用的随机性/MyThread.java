package com.hn.线程调用的随机性;

/***
 *  ClassName : MyThread
 *  Author    : lin
 *  Date      : 2018/12/10 15:56    
 *  Remark    : 
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            for (int i = 0; i < 10 ; i++) {
                int time = (int)(Math.random() *1000);
                Thread.sleep(time);
                System.out.println("run ="+Thread.currentThread().getName());
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
