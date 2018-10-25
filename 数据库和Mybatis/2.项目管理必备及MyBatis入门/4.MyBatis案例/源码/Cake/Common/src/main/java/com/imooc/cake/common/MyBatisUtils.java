package com.imooc.cake.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/***
 *  ClassName : MyBatisUtils
 *  Author    : lin
 *  Date      : 2018/10/25 21:40    
 *  Remark    : Mybatis工具类
 */

public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory ;
    private static Reader reader ;

    static {
        try {
            String resource = "config.xml";
            reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }
}
