package com.damu.servlet;

import com.damu.dao.UsersDAO;
import com.damu.entity.Users;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 *  ClassName : UsersFindByIdServlet
 *  Author    : lin
 *  Date      : 2018/10/16 17:04    
 *  Remark    : 
 */

@WebServlet("/detail")
public class UsersFindByIdServlet extends HttpServlet {

    /**
     * 创建对应的日志记录对象
     * 通过不同的级别进行日志的记录
     * */
    private Logger log = Logger.getLogger(UsersFindByIdServlet.class);

    private UsersDAO usersDAO = new UsersDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        log.info("获取到查询参数ID"+id);

        Users user = usersDAO.findById(Integer.parseInt(id));

        log.info("数据是：。。。。。"+user.toString());

        req.setAttribute("user",user);

        req.getRequestDispatcher("detail.jsp").forward(req,resp);
    }
}
