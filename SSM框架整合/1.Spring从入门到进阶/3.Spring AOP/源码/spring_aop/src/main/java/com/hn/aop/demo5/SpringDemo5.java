package com.hn.aop.demo5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/***
 *  ClassName : SpringDemo5
 *  Author    : lin
 *  Date      : 2018/11/10 15:05    
 *  Remark    : 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo5 {

    @Resource(name = "studentDao")
    private StudentDao studentDao ;

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void demo1(){
        studentDao.save();
        studentDao.delete();
        studentDao.find();
        studentDao.update();

        customerDao.save();
        customerDao.delete();
        customerDao.find();
        customerDao.update();
    }
}
