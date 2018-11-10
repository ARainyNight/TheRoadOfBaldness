package com.hn.aspectJ.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/***
 *  ClassName : SpringDemo1
 *  Author    : lin
 *  Date      : 2018/11/10 18:10    
 *  Remark    : 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {

    @Resource(name = "productDao")
    private ProductDao productDao;

    @Test
    public void demo1() {
        productDao.save();
        productDao.delete();
        productDao.update();
        productDao.findAll();
        productDao.findOne();
    }

}
