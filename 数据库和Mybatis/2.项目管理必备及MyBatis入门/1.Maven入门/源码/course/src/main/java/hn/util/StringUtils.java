package hn.util;

/***
 *  ClassName : StringUtils
 *  Author    : lin
 *  Date      : 2018/10/9 10:14    
 *  Remark    : 
 */

public class StringUtils {

    /**
     * 判断一个字符串是否为空，为空返回true，否则false
     */

    public static boolean isEmpth(String content){
        return null==content || "".equals(content);
    }

    /**
     * 判断一个字符串是否不为空，不为空返回true，否则false
     */
    public static boolean isNotEmpth(String content){
        return !isEmpth(content);
    }
}
