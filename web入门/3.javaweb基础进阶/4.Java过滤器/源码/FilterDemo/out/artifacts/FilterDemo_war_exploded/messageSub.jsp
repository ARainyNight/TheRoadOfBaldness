<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/20
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.util.*,model.*"%>

<%
    String title = request.getParameter("title");
    String content =request.getParameter("content");

    Message message = new Message();
    message.setTitle(title);
    message.setContent(content);

    List<Message> messages = (List<Message>) session.getAttribute("messages");
    if (messages == null){
        messages =new ArrayList<Message>();
        session.setAttribute("messages",messages);
    }

    messages.add(message);

    response.sendRedirect(request.getContextPath()+"/message.jsp?subFlag=1");
%>