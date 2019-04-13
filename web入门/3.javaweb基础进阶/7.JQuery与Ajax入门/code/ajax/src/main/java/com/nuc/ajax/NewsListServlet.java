package com.nuc.ajax;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/***
 *  ClassName : NewsListServlet
 *  Author    : lin
 *  Date      : 2019/4/13 22:04    
 *  Remark    : 
 */

public class NewsListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List list =  new ArrayList();
        list.add(new News("小罗哒哒哒哒哒哒多多多多","2018-5-1","小罗","小罗真是地中弟弟弟弟弟弟弟弟"));
        list.add(new News("小哒哒哒哒哒哒多多多多2","2018-2-1","小罗2","小罗真是地中弟弟弟弟弟弟弟弟2"));
        list.add(new News("小罗哒哒哒哒哒哒多多多多3","2018-3-1","小罗3","小罗真是地中弟弟弟弟弟弟弟弟3"));
        list.add(new News("小罗哒哒哒哒哒哒多多多多4","2018-4-1","小罗4","小罗真是地中弟弟弟弟弟弟弟弟4"));

    }
}
