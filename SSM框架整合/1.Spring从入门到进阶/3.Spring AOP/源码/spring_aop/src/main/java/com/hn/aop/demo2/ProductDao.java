package com.hn.aop.demo2;

/***
 *  ClassName : ProductDao
 *  Author    : lin
 *  Date      : 2018/11/10 11:26    
 *  Remark    : 
 */

public class ProductDao {

    public void save(){
        System.out.println("保存商品");
    }

    public void update(){
        System.out.println("更新商品");
    }

    public void find(){
        System.out.println("查询商品");
    }

    public void delete(){
        System.out.println("删除商品");
    }
}
