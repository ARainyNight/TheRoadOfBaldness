package com.hn.aop.demo2;

import org.junit.Test;

/***
 *  ClassName : SpringDemo2
 *  Author    : lin
 *  Date      : 2018/11/10 11:27    
 *  Remark    : 
 */

public class SpringDemo2 {

    @Test
    public void demo1(){

        ProductDao productDao = new ProductDao();

        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();

       proxy.save();
       proxy.update();
       proxy.find();
       proxy.delete();
    }
}
