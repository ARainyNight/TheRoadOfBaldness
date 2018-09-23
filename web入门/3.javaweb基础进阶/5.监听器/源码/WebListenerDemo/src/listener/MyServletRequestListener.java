package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();

        String path = request.getRequestURI();
        String par = request.getParameter("par");

        System.out.println("request listener,path:"+path+",par is:"+par);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request listener,request destroyed....");
    }
}
