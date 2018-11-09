package com.hn.ioc.demo3;

/***
 *  ClassName : UserDaoImpl
 *  Author    : lin
 *  Date      : 2018/11/9 16:24    
 *  Remark    : 
 */

public class UserDaoImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("查询用户。。。");
    }

    @Override
    public void save() {
        System.out.println("添加用户。。。");
    }

    @Override
    public void update() {
        System.out.println("更新用户。。。");
    }

    @Override
    public void delete() {
        System.out.println("删除用户。。。");
    }
}
