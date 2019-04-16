package com.nuc.channel;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        List chlist = new ArrayList();
        if (level.equals("1")) {
            chlist.add(new Channel("ai", "前沿/前端/人工智能"));
            chlist.add(new Channel("web", "前端/小程序/JS"));
        } else if (level.equals("2")) {
            if (parent.equals("ai")) {
                chlist.add(new Channel("micro", "微服务"));
                chlist.add(new Channel("blockchain", "区块链"));
                chlist.add(new Channel("other", "..."));
            } else if (parent.equals("web")) {
                chlist.add(new Channel("html", "HTML"));
                chlist.add(new Channel("css", "CSS"));
                chlist.add(new Channel("other", "..."));
            }
        }

        String json = JSON.toJSONString(chlist);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(json);
    }
}
