package test;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class Test1 {

    @Test
      public void test(){
        Connection conn = null ;
        Statement stmt = null;

          try {
              Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest","root","123456");
//              String sql ="select * from goods where price<=3500";
              stmt =conn.createStatement();
//              ResultSet resultSet = stmt.executeQuery(sql);
//              while (resultSet.next()){
//                  int id = resultSet.getInt("id");
//                  String name =resultSet.getString("name");
//                  float price = resultSet.getFloat("price");
//                  String desp = resultSet.getString("desp");
//
//                  System.out.println(id+"   "+name+"   "+price+"   "+desp);
//              }

//              String sql = "insert into goods(name,price,desp) values('耳机',200.0,'蓝牙耳机')";
//              String sql = "update goods set desp='冷暖空调' where id =4";
              String sql ="delete from goods where  id = 5";
              int i = stmt.executeUpdate(sql);
              if (i >0 ){
                  System.out.println("删除成功");
              }

//              resultSet.close();
//              stmt.close();
//              conn.close();
          } catch (Exception e) {
              e.printStackTrace();
          }finally {
              if (conn!=null){
                  try {
                      conn.close();
                  } catch (SQLException e) {
                      e.printStackTrace();
                  }
                  conn =null;
              }

              if (stmt!=null){
                  try {
                      stmt.close();
                  } catch (SQLException e) {
                      e.printStackTrace();
                  }
                  stmt=null;
              }
          }
      }
}
