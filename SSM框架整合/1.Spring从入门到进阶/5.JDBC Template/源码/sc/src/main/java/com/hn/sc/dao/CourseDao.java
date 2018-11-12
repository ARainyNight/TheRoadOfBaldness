package com.hn.sc.dao;

import com.hn.sc.entity.Course;
import com.hn.sc.entity.Student;

import java.util.List;

/***
 *  ClassName : CourseDao
 *  Author    : lin
 *  Date      : 2018/11/12 19:53    
 *  Remark    : 
 */

public interface CourseDao {
    public void insert(Course course);

    public void update(Course course);

    public void delete(int id );

    public Course select(int id);

    public List<Course> selectAll();
}
