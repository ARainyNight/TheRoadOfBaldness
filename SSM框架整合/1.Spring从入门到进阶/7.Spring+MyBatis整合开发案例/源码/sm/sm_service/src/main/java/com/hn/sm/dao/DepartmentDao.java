package com.hn.sm.dao;

import com.hn.sm.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("DepartmentDao")
public interface DepartmentDao {


    void insert(Department department);

    void delete(Integer id);

    void update(Department department);

    Department selectById(Integer id);

    List<Department> selectAll();
}
