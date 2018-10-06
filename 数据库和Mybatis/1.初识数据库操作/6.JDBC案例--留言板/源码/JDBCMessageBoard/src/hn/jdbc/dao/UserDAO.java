package hn.jdbc.dao;

import hn.jdbc.bean.User;
import hn.jdbc.common.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/***
 *  ClassName : UserDAO
 *  Author    : lin
 *  Date      : 2018/10/5 22:22    
 *  Remark    : UserDAO
 */

public class UserDAO {

    public User login(String username, String password){
        Connection conn = ConnectionUtil.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql ="select * from user where username=? and password=?";
        User user = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs=pstmt.executeQuery();
            while (rs.next()){
                user = new User();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRealName(rs.getString("real_name"));
                user.setBirthday(rs.getDate("birthday"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
            }
        }catch(Exception e){
            System.out.println("登录失败");
            e.printStackTrace();
        }finally {
            ConnectionUtil.release(rs,pstmt,conn);
        }
        return user;
    }
}
