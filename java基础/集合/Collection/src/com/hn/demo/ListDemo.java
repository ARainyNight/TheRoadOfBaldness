package com.hn.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/***
 *  ClassName : ListDemo
 *  Author    : lin
 *  Date      : 2018/12/26 17:24    
 *  Remark    : 
 */

public class ListDemo {
    public static void main(String []args){
        //演示列表迭代器
        ArrayList a2 = new ArrayList();
        a2.add("java01");
        a2.add("java02");
        a2.add("java03");
        a2.add("java04");
        a2.add("java05");


        ListIterator li = a2.listIterator();

        System.out.println("hasNext():"+li.hasNext());  //true
        System.out.println("hasPrevious():"+li.hasPrevious());  //false
        while (li.hasNext()){
            Object obj = li.next();
            if (obj.equals("java02")){
//                li.add("java009");  //[java01, java02, java009, java03, java04, java05]
                li.set("java006"); //[java01, java006, java03, java04, java05]
            }
        }
        System.out.println(a2);

        System.out.println("hasNext():"+li.hasNext());   //false
        System.out.println("hasPrevious():"+li.hasPrevious());   //true

        /**
         * 在迭代器过程中，准备添加或者删除元素
         */
//        Iterator it = a2.iterator();
//        while (it.hasNext()){
//            Object obj  = it.next() ;
//            if (obj.equals("java02")){
//                a2.add("java008");        //会照成同步错误
//                it.remove();
//            }
//            System.out.println("obj="+obj);
//        }
//        System.out.println(a2);
    }


    public void method(){
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

        //通过indexof获取位置
        System.out.println(al.indexOf("java07"));

        List sub = al.subList(1,3);
        System.out.println(sub);

    }
}
