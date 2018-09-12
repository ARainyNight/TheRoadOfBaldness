package com.db;

import com.bean.Notice;
import com.bean.User;

import java.util.HashMap;
import java.util.Map;

public class DBUtil {

    public static Map<String , User> userMap= new HashMap<>();
    public static Map<String , Notice> noticeMap = new HashMap<>();

    static {
        userMap.put("101",new User("101","xiaolin","123456"));
        userMap.put("102",new User("102","xiaoliu","123456"));
        userMap.put("103",new User("103","xiaoluo","123456"));
        userMap.put("104",new User("104","feiji","123456"));
    }

    static {
        noticeMap.put("1",new Notice("1","今天值日","今天所有人留下来值日"));
        noticeMap.put("2",new Notice("2","明天安排","明天晚上一起看电影"));
        noticeMap.put("3",new Notice("3","后天安排","后天大三的回家"));
        noticeMap.put("4",new Notice("4","大后天安排","大后天大叔大婶来了"));
    }

    //判断用户名密码是否正确
    public static boolean  seleUseByAccountAndPassword(User user){
        boolean flag=  false;
        for (String key :  userMap.keySet()){
            User u = userMap.get(key);
            if (user.getAccount().equals(u.getAccount())&&user.getPassword().equals(u.getPassword())){
                flag =true;
                break;
            }
        }
        return flag;
    }
}
