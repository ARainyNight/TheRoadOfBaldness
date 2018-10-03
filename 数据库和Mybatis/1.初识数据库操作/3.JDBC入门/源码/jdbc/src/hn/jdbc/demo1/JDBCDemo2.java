package hn.jdbc.demo1;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

    @Test
    /**
     * 删除操作
     * */
    public void demo3(){
        Connection conn = null;
        Statement stmt = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root","123456");

            stmt =conn.createStatement();

            String sql = "delete from user where uid =4 ";

            int i = stmt.executeUpdate(sql);
            if (i>0){
                System.out.println("删除成功");
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //释放资源
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
                conn =null;
            }
        }
    }

    @Test
    /**
     * 修改操作
     * */
    public void demo2(){
        Connection conn = null;
        Statement stmt = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root","123456");

            stmt =conn.createStatement();

            String sql = "update  user set username ='qqq',password='456',name ='赵六' where uid =4";

            int i = stmt.executeUpdate(sql);
            if (i>0){
                System.out.println("修改成功");
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //释放资源
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
                conn =null;
            }
        }
    }


    @Test
    /**
     * 保存操作
     * */
    public void demo1(){
        Connection conn = null;
        Statement stmt = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root","123456");

            stmt =conn.createStatement();

            String sql = "insert into user values(null,'eee','123','张三')";

            int i = stmt.executeUpdate(sql);
            if (i>0){
                System.out.println("保存成功");
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //释放资源
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
                conn =null;
            }
        }
    }
}
