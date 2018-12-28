package com.hn.demo;

/***
 *  ClassName : Test
 *  Author    : lin
 *  Date      : 2018/12/28 9:13    
 *  Remark    : 
 */

public class Test {

    public static void main(String []args){

        String s = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {

        int countMax = 0;

        int count = 0;

        for (int i = 1; i<s.length();i++){

            for (int j = 0; j < i; j++) {

                if (j==0||s.charAt(j)!=s.charAt(i))
                    count++;
                else if (s.charAt(j)==s.charAt(j-1)){
                    count = 1;
                }else
                    break;

            }
            countMax = countMax>count ? countMax:count;

            count = 0;

        }
        return countMax;

    }

}
