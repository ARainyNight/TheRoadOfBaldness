package hn.jdbc.demo2;


import hn.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * PreparedStatement的使用
 * */
public class JDBCDemo5 {

    @Test
    /***
     * 保存数据
     */
    public void demo1(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{

            conn =JDBCUtils.getConnection();
            String sql = "insert into user values(null,?,?,?)";

            pstmt =conn.prepareStatement(sql);
            pstmt.setString(1,"qqq");
            pstmt.setString(2,"123");
            pstmt.setString(3,"田七");

            int i = pstmt.executeUpdate();
            if (i>0){
                System.out.println("保存成功");
            }else {
                System.out.println("保存失败");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(pstmt,conn);
        }
    }

    @Test
    /**
     * 修改数据
     * */
    public void demo2(){
        Connection conn =null;
        PreparedStatement pstmt =null;
        try{
            conn= JDBCUtils.getConnection();

            String sql = "update user set username= ? ,password =? ,name=?  where uid=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,"iii");
            pstmt.setString(2,"123456");
            pstmt.setString(3,"王八");
            pstmt.setInt(4,7);

            int i = pstmt.executeUpdate();
            if (i>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(pstmt,conn);
        }
    }

    @Test
    /**
     * 删除记录
     * */
    public void demo3(){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            conn = JDBCUtils.getConnection();

            String sql = "delete from user where uid =?";

            pstmt =conn.prepareStatement(sql);
            pstmt.setInt(1,7);
            int i = pstmt.executeUpdate();
            if (i>0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(pstmt,conn);
        }
    }

    @Test
    /**
     * 查询所有数据
     * */
    public void demo4(){
        Connection conn = null;
        PreparedStatement pstmt= null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "select * from user";

            pstmt = conn.prepareStatement(sql);

            rs= pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("uid")+ "   "+ rs.getString("username")+"   "+rs.getString("password")+"    "+rs.getString("name"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs,pstmt,conn);
        }
    }

    @Test
    /**
     * 查询单个记录
     * */
    public void demo5(){
        Connection conn = null;
        PreparedStatement pstmt =null;
        ResultSet rs =null;
        try{
            conn =JDBCUtils.getConnection();

            String sql ="select * from user where uid = ?";

            pstmt =conn.prepareStatement(sql);
            pstmt.setInt(1,3);
            rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("uid")+"   "+rs.getString("username")+"   "+rs.getString("password")+"   "+rs.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs,pstmt,conn);
        }
    }
}
