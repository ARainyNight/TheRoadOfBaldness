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
    private SqlSession sqlSession;

    private List<Users> list ;
    private Users users ;

    private SqlSession getSession(){
        sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        return sqlSession;
    }

    /**
     * 查询全部用户
     * */
    public List<Users> findAll(){
        try {
            list =getSession().selectList("findUsers");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return list;
    }


    /**
     * 查询单个用户
     * */
    public Users findById(Integer id){
        try {
           users =getSession().selectOne("findUsers",new Users(id));

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return users;
    }
}
