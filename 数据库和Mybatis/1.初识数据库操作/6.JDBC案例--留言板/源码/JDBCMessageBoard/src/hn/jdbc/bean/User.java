package hn.jdbc.bean;

import java.util.Date;

/***
 *  ClassName : User
 *  Author    : lin
 *  Date      : 2018/10/5 22:22    
 *  Remark    : 
 */

public class User {

    //用户ID
    private long id ;
    //用户姓名
    private String name ;
    //密码
    private String password ;
    //真实姓名
    private String realName;
    //生日
    private Date birthday;
    //电话
    private String phone ;
    //地址
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
