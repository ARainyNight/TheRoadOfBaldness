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
 *  ClassName : StaffServlet
 *  Author    : lin
 *  Date      : 2019/4/14 10:32    
 *  Remark    : 
 */

public class StaffServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Staff> list = new ArrayList<>();
        list.add(new Staff("小红"));
        list.add(new Staff("小明"));
        list.add(new Staff("小白"));
        String json = JSON.toJSONString(list);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(json);
    }
}
