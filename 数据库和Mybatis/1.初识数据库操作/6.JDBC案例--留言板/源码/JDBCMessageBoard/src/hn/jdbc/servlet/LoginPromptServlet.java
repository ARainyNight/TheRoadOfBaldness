package hn.jdbc.servlet;

import hn.jdbc.bean.User;
import hn.jdbc.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 *  ClassName : LoginPromptServlet
 *  Author    : lin
 *  Date      : 2018/10/5 22:20    
 *  Remark    : 跳转到登录页面的servlet
 */

public class LoginPromptServlet extends HttpServlet {

//    private UserService userService;
//
//    @Override
//    public void init() throws ServletException {
//        super.init();
//        userService = new UserService();
//    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        User user = userService.login(username,password);
//        if (user!=null){
//            request.getSession().setAttribute("user",user);
//            request.getRequestDispatcher("/message/list.do").forward(request,response);
//        }else {
//            request.getRequestDispatcher("/login.do").forward(request,response);
//        }

        request.getRequestDispatcher("/WEB-INF/views/biz/login.jsp").forward(request,response);
    }

//    @Override
//    public void destroy() {
//        super.destroy();
//    }
}
