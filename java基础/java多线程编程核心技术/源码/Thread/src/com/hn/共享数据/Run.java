package com.hn.共享数据;

/***
 *  ClassName : Run
 *  Author    : lin
 *  Date      : 2018/12/10 16:39    
 *  Remark    : 
 */

public class Run {
    public static void main(String []args){
        MyThread myThread  = new MyThread();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
