package com.hn.aop.demo4;

/***
 *  ClassName : CustomerDao
 *  Author    : lin
 *  Date      : 2018/11/10 14:14    
 *  Remark    : 
 */

public class CustomerDao {

    public void find(){
        System.out.println("查询客户");
    }

    public void save(){
        System.out.println("保存客户");
    }

    public void update(){
        System.out.println("修改客户");
    }

    public void delete(){
        System.out.println("删除客户");
    }
}
