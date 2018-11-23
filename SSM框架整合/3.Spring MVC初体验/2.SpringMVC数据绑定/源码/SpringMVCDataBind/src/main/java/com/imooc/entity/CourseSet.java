package com.imooc.entity;

import java.util.HashSet;
import java.util.Set;

/***
 *  ClassName : CourseSet
 *  Author    : lin
 *  Date      : 2018/11/23 10:34    
 *  Remark    : 
 */

public class CourseSet {
    private Set<Course> courses = new HashSet<Course>();

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public  CourseSet(){
        courses.add(new Course());
        courses.add(new Course());
    }
}