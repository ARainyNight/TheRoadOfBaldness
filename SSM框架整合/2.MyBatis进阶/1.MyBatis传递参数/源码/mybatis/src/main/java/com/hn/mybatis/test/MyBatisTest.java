package com.hn.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hn.mybatis.bean.Person;
import com.hn.mybatis.dao.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/***
 *  ClassName : MyBatisTest
 *  Author    : lin
 *  Date      : 2018/11/17 16:31    
 *  Remark    : 
 */

public class MyBatisTest {

    public static SqlSessionFactory sqlSessionFactory = null;

    public static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
            String resource = "mybatis-config.xml";
            try {
                Reader reader = Resources.getResourceAsReader(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }


    public void getAllPersons() {
        SqlSession sqlSession = this.getSqlSessionFactory().openSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

        Page<Object> page =  PageHelper.startPage(1,10);

        List<Person> persons = personMapper.getAllPersons();

        PageInfo pageInfo  =new PageInfo(persons,1);

        for (Person person : persons) {
            System.out.println(person.getId());
        }

        System.out.println(page.getPageNum());
        System.out.println(page.getTotal());
        System.out.println(page.getPageSize());

        System.out.println(pageInfo.isIsFirstPage());
        System.out.println(pageInfo.getPages());

        int [] nums= pageInfo.getNavigatepageNums();
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String []args){
        new MyBatisTest().getAllPersons();
    }
}
