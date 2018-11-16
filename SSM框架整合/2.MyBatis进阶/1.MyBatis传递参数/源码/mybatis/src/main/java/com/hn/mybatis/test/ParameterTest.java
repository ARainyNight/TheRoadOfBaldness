package com.hn.mybatis.test;

import com.hn.mybatis.bean.Person;
import com.hn.mybatis.dao.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *  ClassName : ParameterTest
 *  Author    : lin
 *  Date      : 2018/11/16 19:29    
 *  Remark    : 
 */

public class ParameterTest {

    public static SqlSessionFactory sqlSessionFactory = null ;

    public static SqlSessionFactory getSqlSessionFactory(){
        if (sqlSessionFactory == null){
            String resource = "mybatis-config.xml";
            try {
                Reader reader = Resources.getResourceAsReader(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory ;
    }



    public void deletPerson(){
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

        personMapper.deletePerson(11);

        sqlSession.commit();

    }

    public void testPersonByNameAndGender(){
        SqlSession sqlSession= this.getSqlSessionFactory().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

//        Person person = personMapper.getPersonByNameAndGender("wangwu","f");
//        Person person = personMapper.getPersonByNameAndGender(new Person("wangwu","f"));

//        Map<String ,Object> param = new HashMap<String, Object>();
//        param.put("name","wangwu");
//        param.put("gender","f");

//        Person person = personMapper.getPersonByNameAndGender(param);

        Person person= personMapper.getPersonByNameAndGender("wangwu","f");


        System.out.println(person);
    }



    public void testCollection(){
        SqlSession sqlSession= this.getSqlSessionFactory().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

        Person person = personMapper.getPersonByCollection(new int[]{1,2});

        System.out.println(person);
    }


    public void testForeach(){
        SqlSession sqlSession= this.getSqlSessionFactory().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

        List<Person> persons = personMapper.getPersonsByIds(new int[]{1,2,3,6,7});

        for (Person person :persons){
            System.out.println(person);
        }
    }

    public static void main(String []args){
//        new ParameterTest().deletPerson();
//        new ParameterTest().testPersonByNameAndGender();
//        new ParameterTest().testCollection();
        new ParameterTest().testForeach();
    }
}
