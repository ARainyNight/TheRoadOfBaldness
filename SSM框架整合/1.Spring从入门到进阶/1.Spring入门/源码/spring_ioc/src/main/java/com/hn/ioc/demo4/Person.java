package com.hn.ioc.demo4;

/***
 *  ClassName : Person
 *  Author    : lin
 *  Date      : 2018/11/9 16:57    
 *  Remark    : 
 */

public class Person {

    private String name ;
    private Integer age ;

    private Cat cat ;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }
}
