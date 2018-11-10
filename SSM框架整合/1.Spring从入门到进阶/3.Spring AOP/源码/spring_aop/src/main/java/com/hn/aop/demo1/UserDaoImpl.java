package com.hn.aop.demo1;

/***
 *  ClassName : UserDaoImpl
 *  Author    : lin
 *  Date      : 2018/11/10 11:13    
 *  Remark    : 
 */

public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("保存用户");
    }

    public void update() {
        System.out.println("修改用户");
    }

    public void find() {
        System.out.println("查询用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }
}
