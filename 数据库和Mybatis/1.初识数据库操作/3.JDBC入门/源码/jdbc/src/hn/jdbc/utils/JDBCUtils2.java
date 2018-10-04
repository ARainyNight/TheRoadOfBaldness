package hn.jdbc.utils;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 */
public class JDBCUtils2 {
    private static  final ComboPooledDataSource dataSource =new ComboPooledDataSource();

    /**
     * 获得连接的方法
     */
    public static Connection getConnection() throws Exception {

        Connection conn = dataSource.getConnection();
        return conn;
    }

    /**
     * 资源的释放
     * */
    public static void release(Statement stmt, Connection conn){
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt =null;
            }

            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn=null;
            }
    }

    public static void release(ResultSet rs ,Statement stmt ,Connection conn){
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt =null;
        }


        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs =null;
        }

        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn=null;
        }
    }
}
