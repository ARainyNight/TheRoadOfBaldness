package com;

/***
 *  ClassName : StringMethodDemo
 *  Author    : lin
 *  Date      : 2018/12/17 11:02    
 *  Remark    : 
 */

public class StringMethodDemo {

    public static void method_is(){
        String str = "ArrayDemo.java";

        System.out.println(str.startsWith("Array"));
        System.out.println(str.endsWith(".java"));
        System.out.println(str.contains("Demo"));
    }

    public static void method_get(){
        String str = "abcdegkkdkkpf";

        System.out.println(str.length());

        //根据索引获取字符
        System.out.println(str.charAt(4));

        //根据字符获取索引
        System.out.println(str.indexOf('k',7));   //如果没找到返回-1

        //反向索引一个字符出现位置
        System.out.println(str.lastIndexOf("k"));
    }


    public static void main(String []args){
//        String s1 = "abc";
//        String s2 = new String("abc");
//        String s3 = "abc";
//
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);

//        method_get();
        method_is();
    }
}
