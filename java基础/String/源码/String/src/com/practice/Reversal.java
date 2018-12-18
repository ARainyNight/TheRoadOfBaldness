package com.practice;

/***
 *  ClassName : Reversal
 *  Author    : lin
 *  Date      : 2018/12/17 17:10    
 *  Remark    : 
 */

/**
 * 将一个字符串进行反转
 * 将字符串中指定部分进行反转
 */
public class Reversal {

    /**
     * 将一个字符串反转
     *
     * @param s
     * @return
     */
    public static String reverseString(String s) {
//        //将字符串变成数组
//        char[] chars = s.toCharArray();
//        //将数组反转
//        reverse(chars,0,s.length()-1);
//        //将数组变成字符串
//        return new String(chars);
        return reverseString(s,0,s.length());
    }


    /**
     * 将字符串中指定部分进行反转
     * @param s
     * @param start
     * @param end
     * @return
     */
    public static String reverseString(String s, int start, int end) {
        //将字符串变成数组
        char[] chars = s.toCharArray();
        //将数组反转
        reverse(chars,start,end);
        //将数组变成字符串
        return new String(chars);
    }


    private static void reverse(char[] chars, int x, int y) {
        for (int start = x, end = y-1; start < end; start++, end--) {
            swap(chars, start, end);
        }
    }

    private static void swap(char[] chars, int start, int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }


    public static void main(String[] args) {
        System.out.println(reverseString("abcdefg"));
        System.out.println(reverseString("abcdefg",3,6));
    }
}
