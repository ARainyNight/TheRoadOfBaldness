package com;

/***
 *  ClassName : LoginServlet
 *  Author    : lin
 *  Date      : 2018/12/10 17:14    
 *  Remark    : 本类来模拟一成一个Servlet组件
 */

public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username= " + usernameRef + " password=" + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
