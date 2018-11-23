package com.imooc.entity;

import java.util.Map;

/***
 *  ClassName : CourseMap
 *  Author    : lin
 *  Date      : 2018/11/23 9:01    
 *  Remark    : 
 */

public class CourseMap {
    private Map<String,Course> courses;

    public void setCourses(Map<String, Course> courses) {
        this.courses = courses;
    }

    public Map<String, Course> getCourses() {
        return courses;
    }
}
