package hn.servlet;

import hn.bean.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

public class InitServlet extends HttpServlet {


        public void init() throws ServletException{
            List<User> list = new ArrayList<>();

            //将list保存到ServletContext作用域中
            this.getServletContext().setAttribute("list",list);
        }

}
