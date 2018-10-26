package com.imooc.cake.servlet;

import com.imooc.cake.entity.Cake;
import com.imooc.cake.service.CakeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/***
 *  ClassName : CakeServlet
 *  Author    : lin
 *  Date      : 2018/10/26 16:50    
 *  Remark    : 蛋糕Servlet
 */

public class CakeServlet extends HttpServlet {

    private CakeService cakeService;

    @Override
    public void init() throws ServletException {
        super.init();
        cakeService= new CakeService();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("/cake/list.do".equals(req.getServletPath())){
            String categoryIdStr = req.getParameter("categoryId");
            try {
                Long categoryId = null;
                if (null!=categoryIdStr){
                    categoryId =Long.valueOf(categoryIdStr);
                }
                List<Cake> cakes =cakeService.getCakesByCategoryId(categoryId,1,5000);
                req.setAttribute("cakes",cakes);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void destroy() {
        super.destroy();
        cakeService =null;
    }
}
