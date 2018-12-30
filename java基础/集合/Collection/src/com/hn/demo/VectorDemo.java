package com.hn.demo;

import java.util.Enumeration;
import java.util.Vector;

/***
 *  ClassName : VectorDemo
 *  Author    : lin
 *  Date      : 2018/12/26 22:17    
 *  Remark    : 
 */

public class VectorDemo {
    public static void main(String []args){
        Vector v =new Vector();

        v.add("java01");
        v.add("java02");
        v.add("java03");
        v.add("java04");
        v.add("java05");

        Enumeration en = v.elements();

        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
