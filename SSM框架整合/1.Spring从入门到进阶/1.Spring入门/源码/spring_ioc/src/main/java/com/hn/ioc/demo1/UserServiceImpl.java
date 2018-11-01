package com.hn.ioc.demo1;

/***
 *  ClassName : UserServiceImpl
 *  Author    : lin
 *  Date      : 2018/11/1 16:31    
 *  Remark    : 
 */

public class UserServiceImpl implements UserService {

    //添加属性
    private String name;

    @Override
    public void sayHello() {
        System.out.println("Hello Spring"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
