package com.nuc.work;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/***
 *  ClassName : MusicServlet
 *  Author    : lin
 *  Date      : 2019/4/14 17:00    
 *  Remark    : 
 */

public class MusicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String t = req.getParameter("t");
        List<Music> list = new ArrayList<>();

        if (t != null && t.equals("liuxing")) {
            list.add(new Music("稻香"));
            list.add(new Music("晴天"));
            list.add(new Music("告白气球"));
        } else if (t != null && t.equals("jingdian")) {
            list.add(new Music("千千厥歌"));
            list.add(new Music("傻女"));
            list.add(new Music("七友"));
        } else if (t != null && t.equals("yaogun")) {
            list.add(new Music("一块红布"));
            list.add(new Music("假行僧"));
            list.add(new Music("新长征路上的摇滚"));
        }else {
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().println("无数据");
        }

        String json = JSON.toJSONString(list);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(json);
    }
}
