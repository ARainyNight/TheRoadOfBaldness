<%@ page import="java.util.Map" %>
<%@ page import="com.edu.nuc.Student" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/3
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生成绩筛选</title>
</head>
<body>
    <%
        Map<String , Student> map  = new HashMap<>();

        map.put("1",new Student("11071010","赵明","78"));
        map.put("2",new Student("11071011","李雷","100"));
        map.put("3",new Student("11071012","韩梅梅","90"));
        map.put("4",new Student("11071013","大熊","80"));
        map.put("5",new Student("11071014","李静香","92"));
        map.put("6",new Student("11071015","胖虎","42"));

        int i = 1 ;
        for (String key:map.keySet()){
            Student s = map.get(key);
    %>
            第<%=i%>条：
            <%=s.toString()%><br>
    <%
            i++;
        }
    %>
</body>
</html>
