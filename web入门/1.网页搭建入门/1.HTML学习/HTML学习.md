

[TOC]

#  HTML入门 📘

##HTML

- 大名HyperText Markup Language
- 寓意:超文本标记语言
- 主要形式：.htm,.html
- 首行声明，一包两段

```html
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>html document</title>
</head>
<body>

</body>
</html>
```

### 标题Heading Content

- 标签 `<h1>标题内容</h1>共有6级`

- 作用 `浏览器会自动给你附加标题样式，搜索引擎或者阅读器能够根据标题来识别 生成文本大纲`

- ```html
  <!DOCTYPE html>
  <html lang="en">
  	<head>
  		<meta charset="utf-8" />
  		<title>学习html标题</title>
  	</head>
  	<body>
  		<h1>标题内容</h1>
  		<h2>标题内容</h2>
  		<h3>标题内容</h3>
  		<h4>标题内容</h4>
  		<h5>标题内容</h5>
  		<h6>标题内容</h6>
  		<h7>标题不存在</h7>
  		<h8>标题不存在</h8>
  	</body>
  </html>
  ```

- 像素比例   `1em=16px`

### 段落paragraph

- 标签 `<p>段落内容</p>`

- 作用 `划分段落`

- 在浏览器中，空标签也是占一个位置的

- ```html
  <!DOCTYPE html>
  <html lang="en">
  	<head>
  		<meta charset="utf-8" />
  		<title>HTML 段落标签</title>
  		<style>
  			p{
  				margin: 0;
  				padding: 0;
  			}
  		</style>
  	</head>
  	<body>
  		<p>段落内容1段落内容1段落内容1段落内容1段落内容1段落内容1段落内容1</p>
  		<p></p>
  		<p>段落内容2</p>
  	</body>
  </html>
  ```

### 字体font

- 标签 `<font>文字内容</font>`

- 作用 `格式化文本`

- 只能控制字体集(Helvetica,Arial)、大小和颜色

- ```html
  <!!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<title>Document</title>
  	</head>
  	<body>
  		<!-- size -->
  		<font size="3">慕课html</font>
  		<!-- face -->
  		<font face="helvetica">html入门</font>
  		<!--color-->
  		<font color="red">多姿多彩的html</font>
  		<font color="#0000ff">多姿多彩的html</font>
  		<font color="rgb(168,178,188)">多姿多彩的html</font>
  	</body>
  </html>
  ```

### 链接

- 标签 `<a></a>`

- 作用 `文档内部锚点、跳转到外部文档、下载资源`

- 属性 `href,target`

  - href是Hypertext Reference的缩写

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8"/>
  		<title>链接</title>
  		<style>
  			.content{
  				height: 800px;
  			}
  			
  			a{
  				color:#333333 ;
  				text-decoration: none;
  		
  			}
  			a:visited{
  				color:#333333;
  			}
  		</style>
  	</head>
  	<body>
  		<a href="http://www.baidu.com" target="_blank">百度_新标签打开</a>
  		
  		</br>
  		<a href="http://www.baidu.com" target="_self">百度_当前标签打开</a>
  		</br>
  		
  		<a href="#titleThird">页面内锚点</a>
  		</br>
  		
  		<a href="javascript:void(0);">随便点，能跳走算我输</a>
  		</br>
  		
  		<div class="content">一堆内容</div>
  		</br>
  		
  		<h3 id="titleThird">调到这里了第三章</h3>
  	</body>
  </html>
  ```

### 图像

- 标签 `<img/>`

- 作用 `插入图像`

- 属性 `src,alt`

- 支持格式：`PNG/JPEG/GIF/PDF`

- ```html
  <!DOCTYPE html>
  <html lang="en">
  	<head>
  		<meta charset="utf-8" />
  		<title>图像</title>
  		<style>
  			.imooc-logo{
  				background: url(http://www.imooc.com/static/img/logo.png);
  				width: 200px;
  				height: 80px;
  			}
  		</style>
  	</head>
  	<body>
  		<img src="http://www.imooc.com/static/img/logo.png" />
  		<img alt="imooc-logo" src="http://www.imooc.com/static/img/logo.g" />
  		
  		<p class="imooc-logo"></p>
  	</body>
  </html>
  ```

### 列表

- 标签

  - 无序标签 `<ul><li></li></ul>`
  - 有序标签 `<ol><li></li></ol>`
  - 定义列表 `<dl><dt></dt><dd></dd></dl>`

- 作用 `插入无序、有序、定义列表`

- type属性项目符号样式（disc,circle,square）不建议使用  只用`<ul></ul>`就好了

- ```html
  <!!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8"/>
  		<title>列表</title>
  		
  	</head>
  	<body>
  		<!--无序列表-->
  		<ul type="circle">
  			<li>苹果</li>
  			<li>葡萄</li>
  			<li>水蜜桃</li>
  		</ul>
  		<!--有序列表-->
  		<ol>
  			<li>炒粉</li>
  			<li>牛肉粉</li>
  			<li>烤冷面</li>
  		</ol>
  		<!--定义列表-->
  		<dl>
  			<dt>正数</dt>
  			<dd>大于0的自然数</dd>
  			<dt>负数</dt>
  			<dd>小于0的自然数</dd>
  		</dl>
  	</body>
  </html>
  ```

### div

- 标签 `<div></div>`
- 作用  `布局`
- 贴士  `非常常用且重要，现代布局都靠它`

### 块级元素和行内元素

- 块级元素一个占满一行

- 行内元素是挨着摆放

- ```html
  <!DOCTYPE html>
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<title></title>
  	</head>
  	<body>
  		<h2>1.块级元素</h2>
  		<div>
  			发现特点了吗？
  		</div>
  		<ul>
  			<li>不着边界</li>
  		</ul>
  		
  		<h2>2.行内元素</h2>
  		<p>
  			<a href="#">点我跳走</a>
  			<span>亮相也蛮多的标签</span>
  		</p>
  	</body>
  </html>
  ```

### 注释

- 行注释

  - `<!---->`

- 段落注释

  - ```html
    <!--  列表begin-->
    <div>
        TOOD 这里要放一个列表
    </div>
    <!--  列表end -->
    ```

- 条件注释

  - ```html
    <!--[if IE 8]>
    	<div>是ie8就输出这句</div>
    <![endif]-->
    ```

  - 满足条件就输出

  - 条件注释标签只在`IE10`以下版本中的浏览器中生效

### HTML常用带格式作用的标签

- 文本格式化

  - `<b><strong><em><big><small><sub><sup>`

  - ```html
    <!DOCTYPE html>
    <!DOCTYPE html>
    <html>
    	<head>
    		<meta charset="utf-8" />
    		<meta name="viewport" content="width=device-width, initial-scale=1">
    		<title></title>
    	</head>
    	<body>
    		<b>加粗字体</b>
    		<br />
    		
    		<strong>另一种粗体</strong>
    		<br />
    		
    		<big>大号字体</big>
    		<br />
    		
    		<em>强调字体</em>
    		<br />
    		
    		<i>斜体</i>
    		<br />
    		
    		<small>小号字体</small>
    		<br />
    	</body>
    </html>
    ```

  #### 预格式文本

  - `<pre>`

  - ```html
    <!DOCTYPE html>
    <!DOCTYPE html>
    <html>
    	<head>
    		<meta charset="utf-8" />
    		<meta name="viewport" content="width=device-width, initial-scale=1">
    		<title></title>
    	</head>
    	<body>
    			<h2>下面为一段JavaScript代码</h2>
    			<pre>
    				var a ="";
    				a = "Hello world";
    				alert(a);
    			</pre>
    	</body>
    </html>
    ```

  ### 引用

  - `<blockquote>`

  ### 删除线

  - `<del>`

  - ```html
    <!DOCTYPE html>
    <!DOCTYPE html>
    <html>
    	<head>
    		<meta charset="utf-8" />
    		<meta name="viewport" content="width=device-width, initial-scale=1">
    		<title></title>
    	</head>
    	<body>
    			<p>我有<del>一个东西</del></p>
    	</body>
    </html>
    ```


### HTML表格

- 标签`<table>.....</table>`
- 作用 `布局，呈现需要表格布局的内容`
- 贴士
  - 表格标签是块级元素
  - 全页布局的作用已经退出舞台了
  - 专注于自己应该专注的布局领域
  - 表格样式
- 重要知识点
  - 边框问题
    - `border`
    - `border`影响的是表格外面的边框粗细

  - 单元格间距
    - `cellspacing`

  - 单元格边距
    - `cellpadding`

  - 单元格跨列
    - `colspan`

  - 单元格跨行

    - rowspan

  - 内容对齐
    - `align`

  - ```html
    <!DOCTYPE html>
    <!DOCTYPE html>
    <html>
    	<head>
    		<meta charset="utf-8" />
    		<meta name="viewport" content="width=device-width, initial-scale=1">
    		<title></title>
    	</head>
    	<body>
    			<table border="2" cellspacing="0" cellpadding="1">
    				<tr>
    					<td>学号</td>
    					<td>姓名</td>					
    					<td>性别</td>
    				</tr>
    				<tr>
    					<td>123456789</td>
    					<td>问问</td>					
    					<td rowspan="2">男</td>
    				</tr>
    				<tr>
    					<td>987654321</td>
    					<td>搭嘎</td>					
    					
    				</tr>
    				<tr align="center">
    					<td colspan="3">按钮</td>
    				</tr>
    			</table>
    	</body>
    </html>
    ```

### HTML表单

- 标签 `<form>...</form>`

- 作用  `收集用户输入的内容(文本、文件)`

- 属性

  - `action`:提交到的服务端地址
  - `method`:指定提交时用哪种HTTP方法：`POST/GET`
  - `name`:标识
  - `autocomplete`:浏览器是否可以自动填充
  - `enctype`:指定表单内容编码

- HTML表单元素

  - `input`:`文本、密码、单选、多选、按钮、数字、日期、颜色、范围、邮件、URL、文件`

  - `select`:`下拉列表`

  - `textarea`:`文本域`

  - `button`:`按钮`

  - ```html
    <!DOCTYPE html>
    <!DOCTYPE html>
    <html lang="en">
    	<head>
    		<meta charset="utf-8" />
    		<meta name="viewport" content="width=device-width, initial-scale=1">
    		<title>表单</title>
    	</head>
    	<body>
    		<form action="">
    			<!--type:输入类型  value:默认文本  maxlength：规定字符长度-->
    			<!--文本-->
    			<input type="text" name="" id="" value="我是一段文本" maxlength="10"/>
    			<br />
    			<!--密码-->
    			<input type="password" value="我是密码" />
    			<br />
    			<!--单选-->
    			<!--同一组要单选必须给name指一样-->
    			<input name="sex"  type="radio" value="0" />男
    			<input name="sex" type="radio" value="1" />女
    			<br />
    			<!--多选-->
    			<!--默认选中checked-->
    			<input type="checkbox" checked value="0"/>电影
    			<input type="checkbox" value="1"/>音乐
    			<input type="checkbox" value="2"/>体育
    			<input type="checkbox" value="3"/>游戏
    			<br />
    			<!--按钮-->
    			<input type="button" value="我是按钮"/>
    			<br />
    			<!--数字-->
    			<input type="number" />
    			<br />
    			<!--日期-->
    			<input type="date" />
    			<!--颜色-->
    			<input type="color" />
    			<br />
    			<!--范围-->
    			<input type="range" min="1"  max="5"/>
    			<br />
    			<!--邮件-->
    			<input type="email" />
    			<br />
    			<input type="submit" name="" id="" value="提交" />
    			<br />
    			<!--URL-->
    			<input type="url" />
    			<br />
    			<!--文件-->
    			<!--multiple可以实现同时上传多个文件-->
    			<input type="file"  multiple="multiple" />
    			<br />
    			<!--下拉列表-->
    			<select >
    				<option value ="">苹果</option>
    				<option value ="" selected="">水蜜桃</option>
    				<option value ="">樱桃</option>
    			</select>
    			<br>
    			<style>
    				textarea{
    					resize: none; 
    				}
    			</style>
    			<!--文本域-->
    			<textarea rows="3" cols="10"></textarea>
    		</form>
    	</body>
    </html>
    ```

### HTML总结

![](http://m.qpic.cn/psb?/V11ree7s3wel2Y/AmrfluGSI76vhxuVdc4BixpnqeBrLvT0Q1kK1cmhDgs!/b/dGEBAAAAAAAA&bo=BQR4AgAAAAADB1k!&rf=viewer_4)