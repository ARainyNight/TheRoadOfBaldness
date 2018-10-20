package com.damu.entity;

/***
 *  ClassName : Address
 *  Author    : lin
 *  Date      : 2018/10/20 19:28    
 *  Remark    : 地址表,关联用户数据
 *  一个用户可以有多个地址，有一个是默认地址
 */

public class Address {
    private Integer id ;             //编号
    private Users users;             //所属用户
    private Boolean defaultAddr ;    // 是否默认地址
    private String nation ;          // 国家
    private String province;        //  省
    private String city ;           //  市
    private String country ;        //  县
    private String street ;         //   街道
    private String remark ;         //  描述

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Boolean getDefaultAddr() {
        return defaultAddr;
    }

    public void setDefaultAddr(Boolean defaultAddr) {
        this.defaultAddr = defaultAddr;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", users=" + users +
                ", defaultAddr=" + defaultAddr +
                ", nation='" + nation + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
