package hn.jdbc.demo3;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import hn.jdbc.utils.JDBCUtils;
import hn.jdbc.utils.JDBCUtils2;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 连接池的测试类
 * */
public class DataSourceDemo1 {

    @Test
    /**
     * 手动设置连接池
     * */
    public void demo1(){
        //获得连接:
        Connection conn = null;
        PreparedStatement pstmt =null;
        ResultSet rs = null;
        try{
            //创建连接池
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            //设置连接池的参数
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbctest");
            dataSource.setUser("root");
            dataSource.setPassword("123456");
            //设置最大连接数
            dataSource.setMaxPoolSize(20);
            dataSource.setInitialPoolSize(3);
            //获得连接
            conn =dataSource.getConnection();
            String sql = "select * from user";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("uid")+"   "+rs.getString("username")+"   "+rs.getString("password"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs,pstmt,conn);
        }
    }

    @Test
    /**
     * 使用配置文件的方式使用连接池
     * */
    public void demo2(){
            Connection conn = null;
            PreparedStatement pstmt =null;
            ResultSet rs   =null ;
            try{

                conn= JDBCUtils2.getConnection();
                String sql = "select * from user";
                pstmt = conn.prepareStatement(sql);
                rs = pstmt.executeQuery();
                while (rs.next()){
                    System.out.println(rs.getInt("uid")+"   "+rs.getString("username")+"   "+rs.getString("password"));
                }

            }catch(Exception e){
                e.printStackTrace();
            }finally {
                JDBCUtils2.release(rs,pstmt,conn);
            }
    }
}
