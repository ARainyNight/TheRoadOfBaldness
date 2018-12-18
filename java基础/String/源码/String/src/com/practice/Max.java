package com.practice;

/***
 *  ClassName : Max
 *  Author    : lin
 *  Date      : 2018/12/18 15:09    
 *  Remark    : 
 */

/**
 * 获取两个字符串中最大相同字串
 */
public class Max {


    public static String getMaxSubString(String s1, String s2) {

        String max = "", min = "";

        max = (s1.length() > s2.length()) ? s1 : s2;
        min = (s1.length() > s2.length()) ? s2 : s1;

        for (int x = 0; x < min.length(); x++) {
            for (int y = 0, z = min.length() - x; z != min.length() + 1; y++, z++) {
                String temp = min.substring(y, z);
//                System.out.println(temp);
                if (max.contains(temp)) {
                    return temp;
                }
            }
        }

        return "无相同字符串";
    }

    public static void main(String[] args) {
        String s1 = "sdcadasdhelloascx";
        String s2 = "kkkhelloppp";

        System.out.println(getMaxSubString(s1, s2));
    }
}
