package hn.jdbc.demo2;

import hn.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 演示JDBC注入漏洞
 * */
public class JDBCDemo4 {

    public boolean login(String username,String password){
        Connection conn  =null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean flag = false;
        try{
            conn= JDBCUtils.getConnection();

            stmt = conn.createStatement();

            String sql = "select * from user where username='"+username+"' and password='"+password+"'";

            rs=stmt.executeQuery(sql);

            if (rs.next()){
                System.out.println("登录成功");
                flag = true;
            }else {
                flag =false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs,stmt,conn);
        }

        return flag;
    }
}
