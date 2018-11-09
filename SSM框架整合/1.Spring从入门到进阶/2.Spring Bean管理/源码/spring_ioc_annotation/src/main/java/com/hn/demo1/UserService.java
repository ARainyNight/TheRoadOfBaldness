package com.hn.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/***
 *  ClassName : UserService
 *  Author    : lin
 *  Date      : 2018/11/9 19:23    
 *  Remark    : Spring的Bean管理的注解方式
 */

@Component("userService")
public class UserService {

//    @Autowired
//    @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    @Value("米饭")
    private String something;


    public void setSomething(String something) {
        this.something = something;
    }

    public String sayHello(String name){
        return "Hello"+name;
    }

    public void eat(){
        System.out.println("eat:"+something);
    }

    public void save(){
        System.out.println("service中保存方法");
        userDao.save();
    }
}
