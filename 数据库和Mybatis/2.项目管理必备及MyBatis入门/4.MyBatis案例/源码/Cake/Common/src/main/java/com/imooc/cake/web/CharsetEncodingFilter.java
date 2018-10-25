package com.imooc.cake.web;

import javax.servlet.*;
import java.io.IOException;

/***
 *  ClassName : CharsetEncodingFilter
 *  Author    : lin
 *  Date      : 2018/10/25 21:44    
 *  Remark    : 字符集过滤器
 */

public class CharsetEncodingFilter implements Filter {

    private String encoding;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.encoding =filterConfig.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
