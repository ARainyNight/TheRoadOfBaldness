package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Date;

public class MyHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
            String sessionId  =se.getSession().getId();
            Date createTime = new Date(se.getSession().getCreationTime());

            System.out.println("sessionId:"+sessionId+",createTime:"+createTime);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
            String sessionId = se.getSession().getId();
            System.out.println("destroy sessionid:"+sessionId);
    }
}
