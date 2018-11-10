package com.hn.aspectJ.demo2;

/***
 *  ClassName : CustomerDaoImpl
 *  Author    : lin
 *  Date      : 2018/11/10 18:57    
 *  Remark    : 
 */

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存客户");
    }

    @Override
    public String update() {
        System.out.println("修改客户");
        return "Spring";
    }

    @Override
    public void delete() {
        System.out.println("删除客户");
    }

    @Override
    public void findOne() {
        System.out.println("查询一个客户");
    }

    @Override
    public void findAll() {
        System.out.println("查询多个客户");
    }
}
