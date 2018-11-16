package com.hn.mybatis.bean;

import java.util.List;

/***
 *  ClassName : Dept
 *  Author    : lin
 *  Date      : 2018/11/16 18:32    
 *  Remark    : 
 */

public class Dept {

    private Integer id;

    private String departmentName;

    private List<Person> persons;

    public Dept(Integer id) {
        super();
        this.id = id;
    }

    public Dept() {
        super();

    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", persons=" + persons +
                '}';
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
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


}
