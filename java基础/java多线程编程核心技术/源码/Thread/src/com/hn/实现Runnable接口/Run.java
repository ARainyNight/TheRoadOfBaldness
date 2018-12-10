package com.hn.实现Runnable接口;

/***
 *  ClassName : Run
 *  Author    : lin
 *  Date      : 2018/12/10 16:15    
 *  Remark    : 
 */

public class Run {
    public static void main(String []args){
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}
