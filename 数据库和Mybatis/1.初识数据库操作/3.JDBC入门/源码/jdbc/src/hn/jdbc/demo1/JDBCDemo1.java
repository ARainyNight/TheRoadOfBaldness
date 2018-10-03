package hn.jdbc.demo1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;


public class JDBCDemo1 {

    @Test
    public void demo1() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            //1.加载驱动
//            DriverManager.registerDriver(new Driver());   //会导致驱动注册两次
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "123456");
            //3。创建执行SQL语句
            String sql = "select * from user";stmt = conn.createStatement();

            //3.2 执行sql
            resultSet= stmt.executeQuery(sql);
            while (resultSet.next()) {
                int uid = resultSet.getInt("uid");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");

                System.out.println(uid + "..." + username + "..." + password + "...." + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                resultSet =null;
            }

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
                conn =null;    //垃圾回收机制会更早回收对象
            }

        }

    }

}
