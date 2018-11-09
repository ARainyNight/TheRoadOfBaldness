package com.hn.ioc.demo4;

/***
 *  ClassName : Product
 *  Author    : lin
 *  Date      : 2018/11/9 17:25    
 *  Remark    : 商品类
 */

public class Product {

    private String name ;
    private Double price  ;

    private Category category ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
