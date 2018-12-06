package com.hn.config.bean;

/***
 *  ClassName : Dog
 *  Author    : lin
 *  Date      : 2018/12/6 10:47    
 *  Remark    : 
 */

public class Dog {
    private String name ;
    private Integer age ;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
