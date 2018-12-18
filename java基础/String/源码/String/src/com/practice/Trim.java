package com.practice;

/***
 *  ClassName : Trim
 *  Author    : lin
 *  Date      : 2018/12/17 16:55    
 *  Remark    : 
 */

import com.sun.deploy.util.StringUtils;

/**
 * 模拟一个trim方法，去除字符串两端的空格
 */

public class Trim {

    public static String myTrim(String str) {

        if (str.isEmpty()) {
            throw new NullPointerException("字符串为空");
        }

        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (start <= end && str.charAt(end) == ' ') {
            end--;
        }

        return str.substring(start, end + 1);

    }

    public static void main(String[] args) {
        System.out.println(myTrim("  dasd dsa  "));
        System.out.println(myTrim(""));

    }
}
