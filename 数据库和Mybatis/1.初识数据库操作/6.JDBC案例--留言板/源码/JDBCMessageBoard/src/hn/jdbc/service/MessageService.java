package hn.jdbc.service;

import hn.jdbc.bean.Message;
import hn.jdbc.dao.MessageDAO;

import java.util.List;

/***
 *  ClassName : MessageService
 *  Author    : lin
 *  Date      : 2018/10/5 10:24    
 *  Remark    : 消息 service
 */

public class MessageService {

    private MessageDAO messageDAO ;

    public MessageService(){
        messageDAO = new MessageDAO();
    }

    public List<Message> getMessages(int page ,int pageSize){

        return messageDAO.getMessage(page,pageSize);
    }
}
