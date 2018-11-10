package com.hn.aop.demo6;

/***
 *  ClassName : StudentDaoImpl
 *  Author    : lin
 *  Date      : 2018/11/10 13:02    
 *  Remark    : 
 */

public class StudentDaoImpl implements StudentDao {
    public void find() {
        System.out.println("查询学生");
    }

    public void save() {
        System.out.println("保存学生");
    }

    public void update() {
        System.out.println("修改学生");
    }

    public void delete() {
        System.out.println("删除学生");
    }
}
