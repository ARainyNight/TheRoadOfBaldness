package com.stringbuffer;

/***
 *  ClassName : StringBufferDemo
 *  Author    : lin
 *  Date      : 2018/12/18 16:47    
 *  Remark    : 
 */

public class StringBufferDemo {

    public static void method_update(){
        StringBuffer sb = new StringBuffer("abcde");
//        sb.replace(1,4,"java");
        sb.setCharAt(4,'k');
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

//        StringBuffer stringBuffer = new StringBuffer();
//
//        stringBuffer.append(34).append("dasd").append(true); //34dasdtrue
//        System.out.println(stringBuffer.toString());
//        StringBuffer sb1 = stringBuffer.append(34);
//
//        System.out.println(sb1 == stringBuffer);  // true
//        System.out.println(stringBuffer.toString()); //34dasdtrue
//        System.out.println(sb1.toString());  //34dasdtrue

//        stringBuffer.insert(1,"kk");
//        System.out.println(stringBuffer.toString());
//
//        stringBuffer.delete(2,4);
//        System.out.println(stringBuffer.toString());
//
//        stringBuffer.deleteCharAt(2);
//        System.out.println(stringBuffer.toString());
//
//        //清空缓冲区
//        stringBuffer.delete(0,stringBuffer.length());
//        System.out.println(stringBuffer.toString()+"..");

//        method_update();
        System.out.println(Integer.MAX_VALUE);
    }
}
