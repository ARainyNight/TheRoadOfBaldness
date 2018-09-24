package listener;

import cache.LoginCache;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class LoginSessionListener implements HttpSessionAttributeListener {


    private static final String LOGIN_USER="loginUser";
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String attrName= se.getName();

        if (LOGIN_USER.equals(attrName)){
            String attrVal = (String) se.getValue();
            HttpSession session = se.getSession();
            String sessionId = session.getId();

            String sessionId2 = LoginCache.getInstance().getSessionIdByUsername(attrVal);
            if (sessionId2 ==null){

            }else {
                HttpSession sesion2 =LoginCache.getInstance().getSessionIdBySessionId(sessionId2);
                sesion2.invalidate();
            }

            LoginCache.getInstance().setSessionIdByUserName(attrVal,sessionId);
            LoginCache.getInstance().setSessionBySessionId(sessionId,session);
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {

    }
}
