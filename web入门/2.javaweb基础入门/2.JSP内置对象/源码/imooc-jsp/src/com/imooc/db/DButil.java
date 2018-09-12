package com.imooc.db;

import com.imooc.bean.Emp;

import java.util.HashMap;
import java.util.Map;

public class DButil {
    public static Map<String, Emp> map =new HashMap<>();
    static{
        map.put("101",new Emp("101","aa","123456","aa@imooc.com"));
        map.put("102",new Emp("102","bb","123456","bb@imooc.com"));
        map.put("103",new Emp("103","cc","123456","cc@imooc.com"));
        map.put("104",new Emp("104","dd","123456","dd@imooc.com"));
    }

    //判断用户名和密码是否正确
    public static boolean seletEmpByAccountAndPassword(Emp emp){
        boolean flag = false;
        for (String key :map.keySet()){
            Emp e = map.get(key);
            if (emp.getAccount().equals(e.getAccount())&& emp.getPassword().equals(e.getPassword())){
                flag =true;
                break;
            }
        }
        return flag;
    }
}
