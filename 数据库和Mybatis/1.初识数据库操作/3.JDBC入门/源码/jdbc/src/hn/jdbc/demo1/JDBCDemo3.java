package hn.jdbc.demo1;

import hn.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCDemo3 {

    @Test
    /**
     * 保存记录
     * */
    public void demo1(){
        Connection conn = null;
        Statement stmt = null;

        try{
            conn = JDBCUtils.getConnection();
            stmt =conn.createStatement();
            String sql  ="insert into user values(null,'ggg','123','小6')";

            int i  =stmt.executeUpdate(sql);
            if (i>0){
                System.out.println("保存成功");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.release(stmt,conn);
        }
    }
}
