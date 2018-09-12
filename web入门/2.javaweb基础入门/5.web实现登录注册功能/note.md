[TOC]







### Servlet+JSP+JavaBean模式优点：

+ 使用Servlet处理用户请求
+ JSP显示数据
+ JavaBean封装和处理数据

### MVC模式

+ M：Model模型层-----------JavaBean
+ V：View视图层------------JSP
+ C：Controller控制层----------------servlet
+ 用户的请求都提交到Servlet，由Servlet统一调度javabean封装和处理数据，由jsp进行数据的显示



### 文件上传的条件

+ 表单必须是post提交方式
+ 表单中必须有文件上传项，文件上传项必须有name属性和值
+ 表单的enctype属性必须设置为multipart/form-data