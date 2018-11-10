package com.hn.aop.demo1;

import org.junit.Test;

/***
 *  ClassName : SpringDemo1
 *  Author    : lin
 *  Date      : 2018/11/10 11:14    
 *  Remark    : 测试类
 */

public class SpringDemo1 {


    @Test
    public void demo1(){
        UserDao userDao  = new UserDaoImpl();

        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();
        proxy.delete();
        proxy.save();
        proxy.update();
        proxy.find();

    }


}
