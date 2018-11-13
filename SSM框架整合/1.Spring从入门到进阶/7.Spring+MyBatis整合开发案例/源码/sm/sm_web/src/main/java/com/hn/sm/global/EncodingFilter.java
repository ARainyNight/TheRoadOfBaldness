package com.hn.sm.global;

import javax.servlet.*;
import java.io.IOException;

/***
 *  ClassName : EncodingFilter
 *  Author    : lin
 *  Date      : 2018/11/13 15:14    
 *  Remark    : 
 */

public class EncodingFilter implements Filter {

    //默认编码UTF8
    private String encoding = "UTF-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        if (filterConfig.getInitParameter("ENCODING") != null) {
            encoding = filterConfig.getInitParameter("ENCODING");
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(encoding);
        servletResponse.setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        encoding = null;
    }
}
