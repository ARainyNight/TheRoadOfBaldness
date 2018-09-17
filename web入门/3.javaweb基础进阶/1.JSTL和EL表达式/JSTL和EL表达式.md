

## EL表达式介绍

### EL表达式介绍及作用

- Expression Language(表达式语言) ，目的是替代JSP页面中复杂的代码

### EL表达式语法

- `${变量名}`

EL表达式不能用在HTML页面中，只能用在JSP页面中



----

## JSTL

### JSTL介绍

- JSP标准标签库(JavaServerPages Standard Tag Library)

### 与EL表达式的关系

- JSTL通常会与EL表达式合作实现JSP页面的编码

### JSTL开发准备

- 在JSP页面添加taglib指令`<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>`

### 为什么要使用JSTL标签

- 在JSP中不建议直接书写java代码	
- EL表达式虽然可以解决“不用书写java代码”问题，但是对于复杂的数据（如数组、集合等）取值会很麻烦
- 使用JSTL标签配合EL表达式能够很好的解决取复杂类型数据的问题，简化代码书写

### 常用标签

![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/2GTjgyX2ELtpGGqSc9uboW4l6LlECyW5DJvyUBhietE!/c/dFMBAAAAAAAA&ek=1&kp=1&pt=0&bo=NAMbAQAAAAADFx8!&tl=1&vuin=3481376519&tm=1537185600&sce=60-2-2&rf=0-0)

![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/Y0KEIqsZ30d3uqv4jY5FzAcBC.9zhzh7VLhZOtIpPH4!/c/dFMBAAAAAAAA&ek=1&kp=1&pt=0&bo=BgTvAQAAAAADJ.4!&tl=1&vuin=3481376519&tm=1537185600&sce=60-2-2&rf=0-0)

条件标签的用法

```jsp
<body>
    <c:set var="age" value="12" scope="request"></c:set>
    <%--test接判断的条件，如果为true，则执行标签体中的内容--%>
    <c:if test="${age==12}">
        你的年龄为12岁
    </c:if>
......
    <hr>
    <c:choose>
        <%--when类似于if，otherwise类似为else--%>
        <c:when test="${age ==12}">
            你的年龄为12岁when
        </c:when>
        <c:otherwise>
            你的年龄不是12岁otherwise
        </c:otherwise>
    </c:choose>
</body>
```

**迭代标签的用法**

```java
package cn.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/JSTLELServlet")
public class JSTLELServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、首先创建一个list集合，我们往list集合中存放多条数据
        Map<String ,Object> dataMap1 = new HashMap<>();
        dataMap1.put("shopName","联想笔记本");
        dataMap1.put("address","北京");
        dataMap1.put("price",4999.99);

        Map<String ,Object> dataMap2 = new HashMap<>();
        dataMap2.put("shopName","神舟笔记本");
        dataMap2.put("address","南京");
        dataMap2.put("price",3999.99);

        Map<String ,Object> dataMap3 = new HashMap<>();
        dataMap3.put("shopName","华硕笔记本");
        dataMap3.put("address","上海");
        dataMap3.put("price",9999.99);

        List<Map<String ,Object>> lists = new ArrayList<>();
        lists.add(dataMap1);
        lists.add(dataMap2);
        lists.add(dataMap3);
        //2、将list集合存放到request域中
        request.setAttribute("lists",lists);
        //3、再5.jsp取出list
        request.getRequestDispatcher("/5.jsp").forward(request,response);

    }
}

```

```jsp
<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/17
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>通过jstl+el表达式迭代LIST集合</title>
</head>
<body>
<table border="1" width="500">
    <tr align="center">
        <th>名称</th>
        <th>产地</th>
        <th>价格</th>
    </tr>
    <c:forEach items="${lists}" var="Map">
        <tr>
            <td>${Map.shopName}</td>
            <td>${Map.address}</td>
            <td>${Map.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
```

