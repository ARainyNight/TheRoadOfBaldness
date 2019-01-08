package com.hn.demo;

import java.util.LinkedList;

/***
 *  ClassName : LinkedListDemo
 *  Author    : lin
 *  Date      : 2019/1/8 19:57    
 *  Remark    : 链表
 */

public class LinkedListDemo {
    public static void main(String []args){
        LinkedList link  = new LinkedList();

        link.addFirst("java01");
        link.addFirst("java02");
        link.addFirst("java03");
        link.addFirst("java04");

        System.out.println(link);

    }
}
