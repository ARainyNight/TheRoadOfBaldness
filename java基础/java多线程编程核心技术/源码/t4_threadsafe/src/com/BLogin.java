package com;

/***
 *  ClassName : BLogin
 *  Author    : lin
 *  Date      : 2018/12/10 17:17    
 *  Remark    : 
 */

public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
