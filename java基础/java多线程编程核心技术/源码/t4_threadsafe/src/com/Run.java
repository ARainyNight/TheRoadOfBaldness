package com;

/***
 *  ClassName : Run
 *  Author    : lin
 *  Date      : 2018/12/10 17:17    
 *  Remark    : 
 */

public class Run {
    public static void main(String []args){
        ALogin a= new ALogin();
        a.start();
        BLogin b= new BLogin();
        b.start();
    }
}
