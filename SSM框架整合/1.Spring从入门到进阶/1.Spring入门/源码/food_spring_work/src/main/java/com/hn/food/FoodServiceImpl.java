package com.hn.food;

/***
 *  ClassName : FoodServiceImpl
 *  Author    : lin
 *  Date      : 2018/11/1 17:01    
 *  Remark    : 
 */

public class FoodServiceImpl implements FoodService {

    //食物名称
    private String name ;

    //食物口味
    private String taste ;

    //食物种类
    private String kind;

    public void setName(String name) {
        this.name = name;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return name+"属于"+kind+",口味"+taste;
    }
}
