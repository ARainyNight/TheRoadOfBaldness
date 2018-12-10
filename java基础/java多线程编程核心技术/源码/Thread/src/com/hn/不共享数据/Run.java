package com.hn.不共享数据;

/***
 *  ClassName : Run
 *  Author    : lin
 *  Date      : 2018/12/10 16:35    
 *  Remark    : 
 */

public class Run {
    public static void main(String []args){
        MyThread a = new MyThread("a");
        MyThread b = new MyThread("b");
        MyThread c = new MyThread("c");
        a.start();
        b.start();
        c.start();
    }
}
