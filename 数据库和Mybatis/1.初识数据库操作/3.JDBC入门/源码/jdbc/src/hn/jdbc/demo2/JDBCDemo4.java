package hn.jdbc.demo2;

import hn.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 演示JDBC注入漏洞
 */
public class JDBCDemo4 {

    @Test
    /**
     * 测试SQL注入漏洞的方法
     * */
    public void demo1() {
        boolean flag = JDBCDemo4.login2("aaa ' or '1=1", "111ds");
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }

    /**
     * 避免SQL漏洞注入的方法
     */
    public static boolean login2(String username, String password) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password= ?";
            //预处理SQL
            pstmt = conn.prepareStatement(sql);
            //设置参数
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            //执行sql
            rs = pstmt.executeQuery();
            if (rs.next()) {
                flag = true;
            } else {
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, pstmt, conn);
        }
        return flag;
    }

    public static boolean login(String username, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            conn = JDBCUtils.getConnection();

            stmt = conn.createStatement();

            String sql = "select * from user where username='" + username + "' and password='" + password + "'";

            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                System.out.println("登录成功");
                flag = true;
            } else {
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }

        return flag;
    }
}
