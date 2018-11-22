package com.imooc.dao;

import com.imooc.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/***
 *  ClassName : CourseDao
 *  Author    : lin
 *  Date      : 2018/11/22 21:35    
 *  Remark    : 
 */

@Repository
public class CourseDao {
    private Map<Integer, Course> courses = new HashMap<>();

    public void add(Course course){
        courses.put(course.getId(),course);
    }

    public Collection<Course> getAll(){
        return  courses.values();
    }
}
