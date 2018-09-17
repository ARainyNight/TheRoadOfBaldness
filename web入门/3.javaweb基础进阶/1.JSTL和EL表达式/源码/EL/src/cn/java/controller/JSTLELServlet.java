package cn.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/JSTLELServlet")
public class JSTLELServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、首先创建一个list集合，我们往list集合中存放多条数据
        Map<String ,Object> dataMap1 = new HashMap<>();
        dataMap1.put("shopName","联想笔记本");
        dataMap1.put("address","北京");
        dataMap1.put("price",4999.99);

        Map<String ,Object> dataMap2 = new HashMap<>();
        dataMap2.put("shopName","神舟笔记本");
        dataMap2.put("address","南京");
        dataMap2.put("price",3999.99);

        Map<String ,Object> dataMap3 = new HashMap<>();
        dataMap3.put("shopName","华硕笔记本");
        dataMap3.put("address","上海");
        dataMap3.put("price",9999.99);

        List<Map<String ,Object>> lists = new ArrayList<>();
        lists.add(dataMap1);
        lists.add(dataMap2);
        lists.add(dataMap3);
        //2、将list集合存放到request域中
        request.setAttribute("lists",lists);
        //3、再5.jsp取出list
        request.getRequestDispatcher("/5.jsp").forward(request,response);

    }
}
