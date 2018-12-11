package com;

/***
 *  ClassName : Run
 *  Author    : lin
 *  Date      : 2018/12/10 22:04    
 *  Remark    : 
 */

public class Run {
    public static void main(String []args){
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
