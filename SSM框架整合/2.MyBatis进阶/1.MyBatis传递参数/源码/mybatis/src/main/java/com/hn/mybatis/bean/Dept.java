package com.hn.mybatis.bean;

import java.util.List;

/***
 *  ClassName : Dept
 *  Author    : lin
 *  Date      : 2018/11/16 18:32    
 *  Remark    : 
 */

public class Dept {

    private Integer id ;
    private String departmentName ;
    private List<Person> emps;


    public Dept() {
        super();
    }

    public Dept(Integer id) {
        super();
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Person> getEmps() {
        return emps;
    }

    public void setEmps(List<Person> emps) {
        this.emps = emps;
    }
}
