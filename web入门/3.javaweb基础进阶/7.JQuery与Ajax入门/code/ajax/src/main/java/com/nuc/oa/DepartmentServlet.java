package com.nuc.oa;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/***
 *  ClassName : DepartmentServlet
 *  Author    : lin
 *  Date      : 2019/4/14 10:33    
 *  Remark    : 
 */

public class DepartmentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Department> list  = new ArrayList<>();
        list.add(new Department("人事部"));
        list.add(new Department("技术部"));
        list.add(new Department("无线事业部"));
        String json = JSON.toJSONString(list);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(json);
    }
}
