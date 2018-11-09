package com.hn.ioc.demo4;

/***
 *  ClassName : Category
 *  Author    : lin
 *  Date      : 2018/11/9 17:26    
 *  Remark    : 商品分类
 */

public class Category {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
