package com.hn.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/***
 *  ClassName : Demo2
 *  Author    : lin
 *  Date      : 2018/11/15 21:11    
 *  Remark    : 
 */

public class Demo2 {

    public static void main(String[] args) {
//        demo1();
        method_get();
    }

    public static void method_get() {
        ArrayList a1 = new ArrayList();
        a1.add("java1");
        a1.add("java2");
        a1.add("java3");
        a1.add("java4");

//        System.out.println(a1.get(2));

        Iterator it = a1.iterator();  //获取迭代器，用于取出集合中的元素
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void demo1() {
        ArrayList a1 = new ArrayList();
        a1.add("java1");
        a1.add("java2");
        a1.add("java3");
        a1.add("java4");

        ArrayList a2 = new ArrayList();
        a2.add("java1");
        a2.add("java2");
        a2.add("java4");
        a2.add("java5");

        //a1只会保留和A2相同的部分
//        a1.retainAll(a2);
        a1.removeAll(a2);

        System.out.println(a1);
        System.out.println(a2);
    }
}
