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

        link.addLast("java01");
        link.addLast("java02");
        link.addLast("java03");
        link.addLast("java04");

//        System.out.println(link);
//
//        System.out.println(link.getFirst());
//        System.out.println(link.getLast());

        System.out.println(link.removeFirst());

        System.out.println("size="+link.size());
    }
}
