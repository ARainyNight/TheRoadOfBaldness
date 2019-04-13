<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <input id="btnLoad" type="button" value="加载">
    <div id="divContent"></div>
    <script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
    <script>
        document.getElementById("btnLoad").onclick = function () {
            //1.创建XMLHttpRequest对象

            var xmlhttp;
            if (window.XMLHttpRequest){
                //IE7+,Firefox,Chrome,Opera,Safari浏览器执行代码
                xmlhttp = new XMLHttpRequest();
            }else {
                //IE6,IE5浏览器执行代码
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            console.log(xmlhttp);
            //2.发送AJAX请求
            xmlhttp.open("GET","http://localhost:8080/content",true);
            xmlhttp.send();
            //3.处理服务器响应
            xmlhttp.onreadystatechange = function () {
                if (xmlhttp.readyState==4&&xmlhttp.status == 200){
                    var responseText = xmlhttp.responseText;
                    alert(responseText);
                    $("#divContent").html(responseText);
                    //document.getElementById("divContent").innerHTML = responseText;

                }
            }
        }
    </script>
</body>
</html>
