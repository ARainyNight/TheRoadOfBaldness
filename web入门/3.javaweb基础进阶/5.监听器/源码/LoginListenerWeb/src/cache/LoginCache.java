package cache;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public class LoginCache {


    private static  LoginCache instance =new LoginCache();

    private Map<String ,String > loginUserSession =new HashMap<String,String>();
    private Map<String , HttpSession> loginSession =new HashMap<>();

    private LoginCache(){

    }

    public static LoginCache getInstance(){
        return instance;
    }

    public String getSessionIdByUsername(String username){
        return loginUserSession.get(username);
    }

    public HttpSession getSessionIdBySessionId(String sessionId){
        return loginSession.get(sessionId);
    }

    public void  setSessionIdByUserName(String username ,String sessionId){
        loginUserSession.put(username,sessionId);
    }

    public void setSessionBySessionId(String sessionId ,HttpSession session){
        loginSession.put(sessionId,session);
    }
}
