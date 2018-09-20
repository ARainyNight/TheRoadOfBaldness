<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	//request.getRequestDispatcher("/test2.jsp").forward(request, response);//测试dispatcher FORWARD配置
	//response.sendError(404);//测试dispatcher ERROR配置
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test1</title>
</head>
<body>
	<!-- 测试dispatcher INCLUDE配置 -->
	<!--<jsp:include page="test2.jsp"></jsp:include>-->
	<h1>Test1</h1>
</body>
</html>