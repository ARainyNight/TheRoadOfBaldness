package com.hn.aspectJ.demo1;

/***
 *  ClassName : ProductDao
 *  Author    : lin
 *  Date      : 2018/11/10 18:05    
 *  Remark    : 
 */

public class ProductDao {


    public void save() {
        System.out.println("保存商品");
    }

    public String update() {
        System.out.println("修改商品");
        return "HELLO";
    }

    public void delete() {
        System.out.println("删除商品");
    }

    public void findOne() {
        System.out.println("查询单个商品");
//        int i = 1/0 ;
    }

    public void findAll() {
        System.out.println("查询所有商品");
//        int i = 1/0 ;
    }
}
