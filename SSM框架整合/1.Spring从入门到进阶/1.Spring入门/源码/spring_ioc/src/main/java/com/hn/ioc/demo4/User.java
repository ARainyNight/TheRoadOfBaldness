package com.hn.ioc.demo4;

/***
 *  ClassName : User
 *  Author    : lin
 *  Date      : 2018/11/9 16:48    
 *  Remark    : 
 */

public class User {

    private String name ;
    private Integer age ;

    public User(String name ,Integer age){
        this.name= name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
