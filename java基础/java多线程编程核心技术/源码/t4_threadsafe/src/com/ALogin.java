package com;

/***
 *  ClassName : ALogin
 *  Author    : lin
 *  Date      : 2018/12/10 17:16    
 *  Remark    : 
 */

public class ALogin extends Thread{
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
