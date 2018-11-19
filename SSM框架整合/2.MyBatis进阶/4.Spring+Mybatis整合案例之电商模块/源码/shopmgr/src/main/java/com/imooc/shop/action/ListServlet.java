package com.imooc.shop.action;

import com.imooc.shop.bean.Article;
import com.imooc.shop.bean.ArticleType;
import com.imooc.shop.service.ShopService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {

    // 定义业务层对象
    private ShopService shopService;

    @Override
    public void init() throws ServletException {
        super.init();
        // 获取sping的容器。然后从容器中得到业务层对象
        ServletContext servletContext = this.getServletContext();
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        shopService = (ShopService) context.getBean("shopService");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //1.查询所有的一级类型
            List<ArticleType> firstArticleTypes = shopService.loadFirstArticleTypes();
            //2.查询所有的商品信息
            List<Article> articles = shopService.searchArticles();
            req.setAttribute("firstArticleTypes",firstArticleTypes);
            req.setAttribute("articles",articles);
            req.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}