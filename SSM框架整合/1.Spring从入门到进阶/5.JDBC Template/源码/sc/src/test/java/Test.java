import com.hn.sc.entity.Student;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/***
 *  ClassName : Test
 *  Author    : lin
 *  Date      : 2018/11/11 10:51    
 *  Remark    : 
 */

public class Test {

    private JdbcTemplate jdbcTemplate;

    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    }

    @org.junit.Test
    public void textExecute() {
        jdbcTemplate.execute("create table user1(id int ,name varchar(20))");
    }


    /**
     * update方法
     * 对数据进行增删改操作
     *
     */
    @org.junit.Test
    public void testUpdate(){
        String sql= "insert into student(name,sex) values(?,?)";

        jdbcTemplate.update(sql,new Object[]{"张飞","男"});
    }


    /***
     * update方法
     * 对数据进行增删改操作
     * 可以放多个数据
     */
    @org.junit.Test
    public void testUpdate2(){
        String sql= "update student set sex=? where id =?";

        jdbcTemplate.update(sql,"女","1");
    }


    /**
     * batchUpdate方法
     * 批量增删改操作
     */
    @org.junit.Test
    public void testBatchUpdate(){
        String[] sql= {
          "insert into  student(name,sex) values('关羽','女')",
          "insert into  student(name,sex) values('刘备','男')",
          "update student set sex ='女' where id = 1 "
        };

        jdbcTemplate.batchUpdate(sql);
    }

    /**
     * batchUpdate方法
     * 批量增删改操作
     * 实际开发常用
     */
    @org.junit.Test
    public void testBatchUpdate2(){
        String sql= "insert into selection(student,course) values(?,?)";

        List<Object[]> list = new ArrayList<Object[]>();

        list.add(new Object[]{2,1001});
        list.add(new Object[]{2,1003});

        jdbcTemplate.batchUpdate(sql,list);
    }


    /**
     * 查询简单数据项
     * 获取一个
     * queryForObject
     */
    @org.junit.Test
     public void testQuerySimple1(){
        String sql = "select count(*) from student";
        int count =jdbcTemplate.queryForObject(sql,Integer.class);

        System.out.println(count);
     }


    /**
     * 查询简单数据项
     * 获取多个数据
     * queryForList
     */
    @org.junit.Test
     public void testQuerySimple2(){
        String sql  = "select name from student where sex = ?";
        List<String> names = jdbcTemplate.queryForList(sql,String.class,"女");
        for (String name : names){
            System.out.println(name);
        }
     }

    /**
     * 查询复杂对象(封装为Map)
     * 查询一个
     * queryForMap
     */
    @org.junit.Test
    public void testQueryMap1(){
        String sql= "select * from student where id = ?";
        Map<String,Object> stu = jdbcTemplate.queryForMap(sql,3);
        System.out.println(stu);
    }

    /**
     * 查询复杂对象(封装为Map)
     * 查询多个
     * queryForList
     */
    @org.junit.Test
    public void testQueryMap2(){
        String sql = "select * from student";
        List<Map<String,Object>> stus = jdbcTemplate.queryForList(sql);
        for (Map<String,Object> stu :stus){
            System.out.println(stu);
        }
    }


    /**
     * 查询复杂对象(封装为实体对象)
     * 获取一个
     * queryForObject
     */
    @org.junit.Test
    public void testQueryEntity1(){
        String sql = "select * from student where id = ?";
        Student stu = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), 2);

        System.out.println(stu);
    }


    /**
     * 查询复杂对象(封装为实体对象)
     * 获取一个
     */
    @org.junit.Test
    public void testQueryEntity2(){
        String sql  ="select * from student";
        List<Student> stus = jdbcTemplate.query(sql, new StudentRowMapper());
        for (Student st :stus){
            System.out.println(st);
        }
    }


    private class StudentRowMapper implements RowMapper<Student> {

        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            Student stu = new Student();
            stu.setId(resultSet.getInt("id"));
            stu.setName(resultSet.getString("name"));
            stu.setSex(resultSet.getString("sex"));
            stu.setBorn(resultSet.getDate("born"));
            return stu;
        }
    }
}
