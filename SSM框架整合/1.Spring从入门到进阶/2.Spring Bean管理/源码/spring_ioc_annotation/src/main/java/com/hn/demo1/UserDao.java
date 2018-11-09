package com.hn.demo1;

import org.springframework.stereotype.Repository;

/***
 *  ClassName : UserDao
 *  Author    : lin
 *  Date      : 2018/11/9 19:41    
 *  Remark    : 
 */

@Repository("userDao")
public class UserDao {

    public void save(){
        System.out.println("DAO中保存用户");
    }
}
