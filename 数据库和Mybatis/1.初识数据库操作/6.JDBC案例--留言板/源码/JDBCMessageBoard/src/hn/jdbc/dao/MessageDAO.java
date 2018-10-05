package hn.jdbc.dao;

import hn.jdbc.bean.Message;
import hn.jdbc.common.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/***
 *  ClassName : MessageDAO
 *  Author    : lin
 *  Date      : 2018/10/5 10:24    
 *  Remark    : 消息DAO
 */

public class MessageDAO {

    // page :  当前页码
    // pageSize:  每页记录数

    public List<Message> getMessage(int page, int pageSize) {
        Connection conn = ConnectionUtil.getConnection();
        String sql = "select * from message order by create_time desc limit ? ,? "; //limit m, n :从第m条开始，取出共n条记录
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Message> messages = new ArrayList<>();
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,(page-1)*pageSize);
            stmt.setInt(2,pageSize);
            rs =stmt.executeQuery();
            while (rs.next()){
                messages.add(new Message(rs.getLong("id"),rs.getLong("user_id"),
                        rs.getString("username"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getTimestamp("create_time")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionUtil.release(rs, stmt, conn);
        }


        return null;
    }


    /***
     * 计算所有留言数量
     */
    public int countMessages(){
        Connection conn = ConnectionUtil.getConnection();
        String sql = "select count(*) total from message ";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt =conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){
                return rs.getInt("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionUtil.release(rs, stmt, conn);
        }
        return  0 ;
    }
}
