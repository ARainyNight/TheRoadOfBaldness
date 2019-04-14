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
 *  ClassName : PoServlet
 *  Author    : lin
 *  Date      : 2019/4/14 10:33    
 *  Remark    : 
 */

public class PoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Po> list = new ArrayList<>();
        list.add(new Po("职员"));
        list.add(new Po("经理"));
        String json = JSON.toJSONString(list);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(json);
    }
}
