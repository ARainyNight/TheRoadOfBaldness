package com.hn.线程调用的随机性;

/***
 *  ClassName : Test
 *  Author    : lin
 *  Date      : 2018/12/10 15:57    
 *  Remark    : 
 */

public class Test {
    public static void main(String []args){
        try{
            MyThread thread  = new MyThread();
            thread.setName("myThread");
            thread.start();
            for (int i = 0; i < 10 ; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main = " +Thread.currentThread().getName());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
