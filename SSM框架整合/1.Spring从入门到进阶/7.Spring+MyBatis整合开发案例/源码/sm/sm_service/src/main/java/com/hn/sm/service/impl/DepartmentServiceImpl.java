package com.hn.sm.service.impl;

import com.hn.sm.dao.DepartmentDao;
import com.hn.sm.entity.Department;
import com.hn.sm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *  ClassName : DepartmentServiceImpl
 *  Author    : lin
 *  Date      : 2018/11/14 14:28    
 *  Remark    : 
 */

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao ;

    public void add(Department department) {
        departmentDao.insert(department);
    }

    public void remove(Integer id) {
        departmentDao.delete(id);
    }

    public void edit(Department department) {
        departmentDao.update(department);
    }

    public Department get(Integer id) {
        return departmentDao.selectById(id);
    }

    public List<Department> getAll() {
        return departmentDao.selectAll();
    }
}
