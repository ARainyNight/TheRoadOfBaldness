package com.hn.sm.entity;

/***
 *  ClassName : Department
 *  Author    : lin
 *  Date      : 2018/11/14 14:10    
 *  Remark    : 
 */

public class Department {

    private Integer id ;
    private String name ;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
