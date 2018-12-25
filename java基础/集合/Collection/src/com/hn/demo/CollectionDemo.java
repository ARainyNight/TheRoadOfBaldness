package com.hn.demo;

import java.util.ArrayList;

/***
 *  ClassName : CollectionDemo
 *  Author    : lin
 *  Date      : 2018/11/15 20:58    
 *  Remark    : 集合中存储的都是对象的引用（地址）
 */

public class CollectionDemo {
    public static void main(String []args){
    //创建一个集合容器。使用collection接口的子类Arraylist
        ArrayList al = new ArrayList();

        //添加
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        //打印集合
        System.out.println(al);

        //删除元素
        al.remove("java02");
        System.out.println(al);

//        //清空集合
//        al.clear();
//        System.out.println(al);

        //判断元素
        System.out.println("java03是否存在"+al.contains("java03"));
        System.out.println("是否为空"+ al.isEmpty());


        //获取长度
        System.out.println(al.size());

        System.out.println(al);
    }

}
