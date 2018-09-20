package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SessionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest hrequest  = (HttpServletRequest) servletRequest;
        HttpServletResponse hresponse = (HttpServletResponse) servletResponse;

        String loginUser= (String) hrequest.getSession().getAttribute("loginUser");

        if (loginUser==null){
            hresponse.sendRedirect(hrequest.getContextPath()+"/index.jsp?flag=1");
            return;
        }else {
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
    }

    @Override
    public void destroy() {

    }
}
