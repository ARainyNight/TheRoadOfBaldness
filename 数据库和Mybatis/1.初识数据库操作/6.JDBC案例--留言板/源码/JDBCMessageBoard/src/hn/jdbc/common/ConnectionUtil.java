package hn.jdbc.common;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.*;

/***
 *  ClassName : ConnectionUtil
 *  Author    : lin
 *  Date      : 2018/10/5 10:02    
 *  Remark    : 数据库操作公共类
 */

public final class ConnectionUtil {
    private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();

    private static Connection conn;
    /**
     * 获得连接的方法
     * */
    public static Connection getConnection() {
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn ;
    }

    /**
     * 释放资源
     **/
    public static void release(Statement stmt ,Connection conn){
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt =null;
        }

        if (conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn =null;
        }
    }
    public static void release(ResultSet rs ,Statement stmt , Connection conn){
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt =null;
        }

        if (conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn =null;
        }

        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs =null;
        }
    }


}
