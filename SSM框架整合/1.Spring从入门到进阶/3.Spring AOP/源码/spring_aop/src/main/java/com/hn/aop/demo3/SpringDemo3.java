package com.hn.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/***
 *  ClassName : SpringDemo3
 *  Author    : lin
 *  Date      : 2018/11/10 13:10    
 *  Remark    : 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

    //@Resource(name = "studentDao")
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao ;

    @Test
    public void demo1(){
        studentDao.find();
        studentDao.delete();
        studentDao.save();
        studentDao.update();
    }
}
