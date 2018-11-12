package com.hn.sc.dao;

import com.hn.sc.entity.Student;

import java.util.List;

public interface StudentDao {

    public void insert(Student stu);

    public void update(Student stu);

    public void delete(int id );

    public Student select(int id);

    public List<Student> selectAll();
}
