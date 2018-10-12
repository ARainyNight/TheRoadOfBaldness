package com.damu.dao;

import com.damu.entity.Users;
import com.damu.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/***
 *  ClassName : UsersDAO
 *  Author    : lin
 *  Date      : 2018/10/12 21:37    
 *  Remark    : 
 */

public class UsersDAO {
    private SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();

    private List<Users> list ;

    public List<Users> findAll(){
        try {
            list =sqlSession.selectList("findAll");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return list;
    }
}
