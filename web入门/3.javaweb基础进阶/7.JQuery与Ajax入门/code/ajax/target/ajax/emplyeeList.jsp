<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2019/4/14
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>职员列表</title>
</head>
<body>
    <div>
        <button type="button" id="staff">员工列表</button>
        <button type="button" id="po">职位列表</button>
        <button type="button" id="department">部门列表</button>
    </div>
<div id="list"></div>

<script type="text/javascript">
    var xmlhttp;
    if (window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    } else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    document.getElementById("staff").onclick = function () {
        document.getElementById("list").innerHTML = "";
        xmlhttp.open("GET","http://localhost:8080/staff",true);
        xmlhttp.send();
        xmlhttp.onreadystatechange= function () {
            if (xmlhttp.readyState= 4 &&xmlhttp.status ==200){
                var json = JSON.parse(xmlhttp.responseText);
                var html = "";
                for (var i = 0; i < json.length ; i++) {
                    html = html+"<h1>"+ json[i].name+"</h1><hr>";
                }
                document.getElementById("list").innerHTML = html;
            }
        }
    }
    document.getElementById("po").onclick = function () {
        document.getElementById("list").innerHTML = "";
        xmlhttp.open("GET","http://localhost:8080/po",true);
        xmlhttp.send();
        xmlhttp.onreadystatechange= function () {
            if (xmlhttp.readyState= 4 &&xmlhttp.status ==200){
                var json = JSON.parse(xmlhttp.responseText);
                var html = "";
                for (var i = 0; i < json.length ; i++) {
                    html = html+"<h1>"+ json[i].name+"</h1><hr>";
                }
                document.getElementById("list").innerHTML = html;
            }
        }
    }

    document.getElementById("department").onclick = function () {
        document.getElementById("list").innerHTML = "";
        xmlhttp.open("GET","http://localhost:8080/department",true);
        xmlhttp.send();
        xmlhttp.onreadystatechange= function () {
            if (xmlhttp.readyState= 4 &&xmlhttp.status ==200){
                var json = JSON.parse(xmlhttp.responseText);
                var html = "";
                for (var i = 0; i < json.length ; i++) {
                    html = html+"<h1>"+ json[i].name+"</h1><hr>";
                }
                document.getElementById("list").innerHTML = html;
            }
        }
    }
</script>
</body>
</html>
