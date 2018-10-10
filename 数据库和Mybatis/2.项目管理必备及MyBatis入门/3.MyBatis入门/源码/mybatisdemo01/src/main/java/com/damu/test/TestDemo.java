package com.damu.test;

import com.damu.entity.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/***
 *  ClassName : TestDemo
 *  Author    : lin
 *  Date      : 2018/10/10 20:53    
 *  Remark    : 
 */

public class TestDemo {

    @Test
    public void testDemo1() throws IOException {
        //初始化mybatis配置环境
        String resource = "mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder().build(is);

        //打开和数据库之间的会话
        SqlSession session = factory.openSession();

        List<Users> uList = session.selectList("usersList");

        for (Users users : uList){
            System.out.println(users);
        }

        session.close();
    }
}
