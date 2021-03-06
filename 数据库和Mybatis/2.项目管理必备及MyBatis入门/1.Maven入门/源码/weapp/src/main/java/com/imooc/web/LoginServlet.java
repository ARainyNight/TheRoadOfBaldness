package com.imooc.web;

import hn.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 *  ClassName : LoginServlet
 *  Author    : lin
 *  Date      : 2018/10/9 10:56    
 *  Remark    : 
 */

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username+"   "+password);

        if (StringUtils.isEmpth(username) && StringUtils.isEmpth(password)){
            request.getRequestDispatcher("fail.jsp").forward(request,response);
        }else {
            request.setAttribute("username",username);
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
