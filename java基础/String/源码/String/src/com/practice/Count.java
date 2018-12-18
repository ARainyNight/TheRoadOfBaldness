package com.practice;

/***
 *  ClassName : Count
 *  Author    : lin
 *  Date      : 2018/12/17 17:34    
 *  Remark    : 
 */

/**
 * 获取一个字符串在另一个字符串中出现的次数
 */
public class Count {

    /**
     * 方法一
     * @param str
     * @param key
     * @return
     */
    public static int getSubCount(String str,String key){
        //计数器
        int count = 0 ;
        //下标
        int index= 0 ;

        while ((index=str.indexOf(key))!=-1){
            System.out.println("str="+str);
            str=str.substring(index+key.length());

            count++;
        }
        return count;
    }


    /**
     * 方法二
     * @param str
     * @param key
     * @return
     */
    public static int getSubCount_2(String str, String key ){
        int count =0 ;
        int index= 0 ;

        while ((index=str.indexOf(key,index))!=-1){
            System.out.println("index="+index);
            index= index+key.length();

            count++;
        }
        return count;
    }

    public static void main(String []args){
        String str = "abkkcdkkefkkskk";
        System.out.println("count="+getSubCount(str,"kk"));
        System.out.println("count="+getSubCount_2(str,"kk"));
    }
}
