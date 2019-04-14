package com.nuc.channel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 *  ClassName : ChannelServlet
 *  Author    : lin
 *  Date      : 2019/4/14 17:38    
 *  Remark    : 
 */

public class ChannelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //level =1 代表一级频道，level =2 代表级联的二级频道
        String level = req.getParameter("level");
        String parent = req.getParameter("parent");
    }
}
