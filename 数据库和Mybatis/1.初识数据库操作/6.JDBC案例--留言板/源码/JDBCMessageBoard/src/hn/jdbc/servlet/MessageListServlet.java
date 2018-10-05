package hn.jdbc.servlet;

import hn.jdbc.service.MessageService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 *  ClassName : MessageListServlet
 *  Author    : lin
 *  Date      : 2018/10/5 10:23    
 *  Remark    : 消息列表servlet
 */

public class MessageListServlet extends HttpServlet {

    private MessageService messageService;
    @Override
    public void init() throws ServletException {
        super.init();
        messageService =new MessageService();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pageStr =request.getParameter("page");  //当前页码
        int page =1 ;//页码默认值为1
        if (null != pageStr && (!"".equals(pageStr))){
            try {
                page =Integer.parseInt(pageStr);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        messageService.getMessages(page,5); //分页查询全部留言
    }

    @Override
    public void destroy() {
        super.destroy();
        messageService =null;
    }
}
