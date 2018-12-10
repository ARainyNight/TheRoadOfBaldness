package com.hn.共享数据;

/***
 *  ClassName : MyThread
 *  Author    : lin
 *  Date      : 2018/12/10 16:37    
 *  Remark    : 
 */

public class MyThread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        //此代码不要用for语句，因为使用同步后其他线程就得不到运行的机会了
        //一直由一个线程进行减法运算
        System.out.println("由" + this.currentThread().getName() + "计算,count=" + count);
    }
}
