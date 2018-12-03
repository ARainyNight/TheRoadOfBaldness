package com.imooc.oa.controller;

import com.imooc.oa.biz.DepartmentBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/***
 *  ClassName : DepartmentController
 *  Author    : lin
 *  Date      : 2018/12/3 10:24    
 *  Remark    : 部门管理控制器类
 */


@Controller("departmentController")
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentBiz departmentBiz;

    /**
     * 向页面传递所有部门信息
     * @param map
     * @return
     */
    @RequestMapping("/list")
    public String list(Map<String, Object> map) {
        map.put("list", departmentBiz.getAll());
        return "department_list";
    }

}
