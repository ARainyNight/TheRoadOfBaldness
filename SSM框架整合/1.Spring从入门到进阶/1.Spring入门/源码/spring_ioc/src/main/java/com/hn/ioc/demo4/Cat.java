package com.hn.ioc.demo4;

/***
 *  ClassName : Cat
 *  Author    : lin
 *  Date      : 2018/11/9 17:00    
 *  Remark    : 
 */

public class Cat {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
