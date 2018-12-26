package com.hn.demo;

import java.util.ArrayList;
import java.util.Iterator;

/***
 *  ClassName : ListDemo
 *  Author    : lin
 *  Date      : 2018/12/26 17:24    
 *  Remark    : 
 */

public class ListDemo {
    public static void main(String []args){
        ArrayList al = new ArrayList();

        al.add("java01");
        al.add("java02");
        al.add("java03");

        System.out.println("原集合是:"+al);
        //在指定位置添加元素
        al.add(1,"java9");
        System.out.println("新集合是："+al);

        //删除指定位置元素
        al.remove(2);
        System.out.println(al);

        //修改元素
        al.set(2,"java07");
        System.out.println(al);

        //获取元素
        System.out.println(al.get(2));

        //获取所有元素
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));
        }

        Iterator it  = al.iterator();
        while (it.hasNext()){
            System.out.println("--"+it.next());
        }


    }
}
