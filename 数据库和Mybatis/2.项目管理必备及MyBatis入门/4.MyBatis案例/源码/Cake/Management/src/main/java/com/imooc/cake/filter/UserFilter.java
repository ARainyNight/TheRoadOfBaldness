package com.imooc.cake.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/***
 *  ClassName : UserFilter
 *  Author    : lin
 *  Date      : 2018/10/26 16:21    
 *  Remark    : 处理登录和未登录情况
 */

public class UserFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if ("/login.do".equals(((HttpServletRequest)servletRequest).getServletPath())||
        "/loginPrompt".equals(((HttpServletRequest)servletRequest).getServletPath())){
            filterChain.doFilter(servletRequest,servletResponse);
        }else if (null!=((HttpServletRequest)servletRequest).getSession().getAttribute("username")){
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            servletRequest.getRequestDispatcher("/loginPrompt.do").forward(servletRequest, servletResponse);
        }
    }

    public void destroy() {

    }
}
