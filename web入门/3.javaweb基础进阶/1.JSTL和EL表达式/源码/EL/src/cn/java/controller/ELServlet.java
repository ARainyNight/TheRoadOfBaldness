package cn.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ELServlet")
public class ELServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //首先获取username和age属性值
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        //将获取的数据保存到request域中
        req.setAttribute("username",username);
        req.setAttribute("age",age);
        //跳转到showEL.jsp页面，通过EL表达式取出request域中的数据
         req.getRequestDispatcher("/showEL.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
