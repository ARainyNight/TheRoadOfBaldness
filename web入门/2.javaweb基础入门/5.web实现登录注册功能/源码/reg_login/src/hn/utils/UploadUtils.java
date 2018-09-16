package hn.utils;

import java.util.UUID;

public class UploadUtils {
    /***
     * 生成唯一的文件名
     */

    public static String getUUIDFileName(String fileName){
        //将文件名的前面部分进行截取：xx.jpg   --->  .jpg
        int idx =fileName.lastIndexOf(".");
        String extention =fileName.substring(idx);
        String UUIDFileName= UUID.randomUUID().toString().replace("-","")+extention;
        return UUIDFileName;
    }

    public static void main(String []args){
        System.out.println(getUUIDFileName("1.jpg"));
    }
}
