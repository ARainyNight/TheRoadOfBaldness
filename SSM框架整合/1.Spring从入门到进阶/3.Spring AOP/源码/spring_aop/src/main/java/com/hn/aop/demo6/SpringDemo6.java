package com.hn.aop.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/***
 *  ClassName : SpringDemo6
 *  Author    : lin
 *  Date      : 2018/11/10 15:27    
 *  Remark    : 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo6 {

    @Resource(name = "studentDao")
    private StudentDao studentDao ;

    @Resource(name = "customerDao")
    private CustomerDao customerDao ;

    @Test
    public void demo1(){
        studentDao.save();
        studentDao.find();
        studentDao.delete();
        studentDao.update();

        customerDao.delete();
        customerDao.find();
        customerDao.save();
        customerDao.update();
    }
}
