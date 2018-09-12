[TOC]

# CSS

+  本课程将学习的内容
  - CSS基础入门：什么是CSS以及为什么要使用CSS
  - CSS基础语法：CCS声明、规则、引入方式和命名规范等
  - CSS选择器：选择器、伪元素、伪类和选择器的优先级别等
  - CSS样式：背景、文本、链接、列表和表格等
  - CSS布局：三行两列、两行三列



### 什么是CSS

- `CSS指层叠样式表(Cascading Style Sheets)样式通常存储在样式表中`
- CSS主要目的是`可以让相同的一个页面在不同浏览器中呈现相同的样式`
- 样式定义如何显示HTML元素
- 是为了解决内容和表现分离的问题
- 内容：`内容主要指HTML中的元素`
- 表现: `表现主要指内容在浏览器中呈现的样式`



### 定义CSS的两种方式

#### 内联样式方式

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title>内联样式</title>
  	</head>
  	<body>
  		<p style="color: lightcoral;font-weight: bolder;">这是一个段落内容</p>
  		<p>这又是一个段落内容</p>
  	</body>
  </html>
  ```

- `仅对当前标签有效`

#### 外联样式方式

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title>外联样式</title>
  		<style>
  			p{
  				color: lightcoral;
  				font-weight: bolder;
  			}
  		</style>
  	</head>
  	<body>
  		<p>这是一个段落内容</p>
  		<p>这又是一个段落内容</p>
  	</body>
  </html>
  ```
  + 引用外联样式

  ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  		<link rel="stylesheet" type="text/css" href="css/04.css"/>
  	</head>
  	<body>
  		<p>这是一个段落内容</p>
  	</body>
  </html>
  ```
  - ```css
    p{
    	color: lightblue;
    	font-weight: bolder;
    }
    ```

  - 如本机中引用 css 文件，link 中的 href 应该是 "css/index.css"

    注意：css文件与html文件的路径关系请参考gif图：

    ![](https://climg.mukewang.com/58bfb3ef0001237d06970443.jpg =50x100)

  - 当同时使用外联样式和内联样式时，优先级别：`内联样式＞外联样式`

​       





### CSS选择器

#### ID选择器

- id属性的特点就是唯一不可重复的

- ```css
  #p{
  	color: lightblue;
    }
  ```

#### 元素选择器

- 元素选择器是通过元素名称来定位页面元素

- ```css
  span{
  	color: lightcoral;
      }
  ```

#### 类(class)选择器

- ```css
  .myclass{
       	color: lightblue;
  		}
  ```

#### 属性选择器

- ```css
  [title] {
  				color: lightblue;
  			}
  ```

```html
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>CSS选择器</title>
		<style>
			#p{
				color: lightblue;
			}
			.myclass{
				color: lightblue;
			}
			span{
				color: lightcoral;
			}
			[title] {
				color: lightblue;
			}
		</style>
	</head>AAA
	<body>
		
		<p id="p">id选择器</p>
		<p class="myclass">类选择器</p>
		<span>元素选择器</span>
		<p title="this is p.">属性选择器</p>
	</body>
</html>
```
#### 基于关系的选择器

##### A E(后代元素选择器)

- 元素A的任一后代元素E(后代节点值A的子节点，子节点的子节点，以此类推),称之为`祖先元素和后代元素`

- 如![](http://m.qpic.cn/psb?/V11ree7s3wel2Y/*ZMELi7t.GX.FvMmi1Ce4F0dcvViFNtadWCg1uJ2NQ0!/b/dDIBAAAAAAAA&bo=.QGfAAAAAAADF1U!&rf=viewer_4)

- `<p><span>`都是`<body>`的后代元素

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title>后代选择器</title>
  		<style>
  			span{
  				background-color: lightblue;
  			}
  			div span {
  				background-color: lightcoral;
  			}
  		</style>
  	</head>
  	<body>
  		<div>
  			<span>
  				span1
  				<span>span2</span>
  			</span>
  		</div>
  		<span>
  			span3
  		</span>
  	</body>
  </html>
  ```

##### A>E(子元素选择器)

- 元素A的任一子元素E(也就是直系后代)，称之为`父元素和子元素`

- 如![](http://m.qpic.cn/psb?/V11ree7s3wel2Y/e1bJD*ZcpjeRREnP9yxr6XnuwXTM6LQNJuoKyiyy0j8!/b/dEIBAAAAAAAA&bo=dwKyAAAAAAADF*U!&rf=viewer_4)

- `<p>`是`<body>`的子元素也是后代元素，`<span>`是`<p>`的子元素也是`<p><body>`的后代元素

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  		<style>
  			span{
  				background-color: blue;
  			}
  			
  			div > span {
  				background-color: red;
  			}
  		</style>
  	</head>
  	<body>
  			<div>
  				<span>span1
  					<span>span2</span>
  				</span>
  			</div>
  			<span>span3</span>
  	</body>
  </html>
  ```

##### B+E(相邻兄弟选择器)

- 元素B的任一下一个兄弟元素E

- 如![](http://m.qpic.cn/psb?/V11ree7s3wel2Y/uL7eRrjHiuFxP5uUTBszWlr9kbJ.IxOvexFaUKZ96HI!/b/dFYBAAAAAAAA&bo=7QGSAAAAAAADF0w!&rf=viewer_4)

- `<span><p>`互为兄弟元素

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  		<style type="text/css">
  			#one + li{
  				color: blue;
  			}
  		</style>
  	</head>
  	<body>
  		<ul>
  			<li id="one">one</li>
  			<li>two</li>
  			<li>thredd</li>
  		</ul>
  	</body>
  </html>
  ```

##### 伪类

- `:link`:向未被访问的链接添加样式
- `:hover`:当鼠标悬浮在元素上方时，向元素添加样式
- `:active`:向被激活的元素添加样式
- `:visited`:向已被访问的链接添加样式

##### 伪元素

- 伪元素加两个：

- `::before`:会为当前元素创建一个子元素作为伪元素

- `::after`:用来匹配已选中元素的一个虚拟的最后子元素

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title>伪元素</title>
  		<style type="text/css">
  			q::before{
  				content: "<<";
  				color: lightgreen;
  			}
  			q::after{
  				content: ">>";
  				color: red;
  			}
  		</style>
  	</head>
  	<body>
  		<q>一些引用</q>，他说，<q>比没有好。</q>
  	</body>
  </html>
  ```

  

####选择器优先级别

- 内联样式的优先级别高于外联样式

- id选择器>类选择器>元素选择器>伪类

#### 背景

##### 属性：

- `background`:简写属性，作用是将背景属性设置在一个声明中

- `background-color`:设置元素的背景颜色

- `background-image`:把图像设置为背景

- `background-position`:设置背景图像的起始位置

- `background-repeat`:设置背景图像是否及如何重复

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  		<style type="text/css">
  			#p1{
  				background-color: greenyellow;
  			}
  			#p2{
  				background-image: url("img/car.jpg");
  				width: 200px;
  				height: 200px;
  			}
  			#p3{
  				background-image: url("img/car.jpg");
  				widows: 200px;
  				height: 200px;
  				background-position: -60px -80px;
  			}
  			body{
  				background-image: url("img/car.jpg");
  				background-repeat: no-repeat;
  			}
  		</style>
  	</head>
  	<body>
  	<p id="p1">这是一个段落内容</p>
  	<p id="p2"></p>
  	<p id="p3"></p>
  	</body>
  </html>
  ```

  

#### 文本

##### 属性

- `color`:设置文本颜色

- `text-align`:对齐元素中的文本

- `text-decoration`:向文本添加修饰

- `text-indent`:缩进元素中文本的首行

- `vertical-align`:设置元素的垂直对齐

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title>文本</title>
  		<style type="text/css">
  			#p1{
  				color: lightcoral;
  			}
  			#p2{
  				text-align: left;
  			}
  			#p3{
  				text-align: center;
  			}
  			#p4{
  				text-align: right;
  			}
  			a{
  				text-decoration: none;
  			}
  			#p5{
  				text-indent: 50px;
  			}
  		</style>
  	</head>
  	<body>
  		<p id="p1">这是一个段落内容</p>
  		<p id="p2">这又是一个段落内容</p>
  		<p id="p3">这又是一个段落内容</p>
  		<p id="p4">这又是一个段落内容</p>
  		<a href="#">这是一个链接</a>
  		<p id="p5">这又是一个段落内容</p>
  	</body>
  </html>
  ```

####字体

##### 属性

- `font`:在一个声明中设置所有的字体属性

- `font-family`:指定文本的字体系列

- `font-size`:指定文本的字体大小

- `font-style`:指定文本的字体样式

- `font-weight`:指定字体的粗细

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  		<style type="text/css">
  			#p1{
  				font-family: "times new roman";
  			}
  			#p2{
  				font-family: "microsoft yahei";
  			}
  			#p3{
  				font-size: large;
  				font-style: italic;
  				font-weight: bolder;
  			}
  		</style>
  	</head>
  	<body>
  		<p id="p1">this is text.</p>
  		<p id="p2">这是一个段落内容</p>
  		<p id="p3">这是一个段落内容</p>
  	</body>
  </html>
  ```



####列表

#####属性

- `list-style`:用于把所有用于列表的属性设置于一个声明中

- `list-style-image`:将图象设置为列表项标志

- `list-style-type`:设置列表项标志的类型

- ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  		<style type="text/css">
  			#u1{
  				list-style-type: decimal;	
  			}
  			#u2{
  				list-style-image: url("img/car.jpg");
  			}
  		</style>
  	</head>
  	<body>
  			<ul id="u1">
  				<li>西瓜</li>
  				<li>苹果</li>
  				<li>香蕉</li>
  			</ul>
  			<ul id="u2">
  				<li>西瓜</li>
  				<li>苹果</li>
  				<li>香蕉</li>
  			</ul>
  	</body>
  </html>
  ```

#### 表格

##### 属性

- `border`:设置表格边框
- `border-collapse`:设置表格的边框是否被折叠成一个单一的边框或隔开
- `width`:定义表格的宽度
- `text-align`:表格中的文本对齐
- `padding`:设置表格中的填充

##### CSS常见布局

- 两行三列布局![](http://a3.qpic.cn/psb?/V11ree7s3wel2Y/OK8uF8gnQJHGD4BxEny*I01F7wGc13Axe5RB3HaNzCQ!/b/dDYBAAAAAAAA&ek=1&kp=1&pt=0&bo=lgWVAgAAAAADFzY!&tl=1&vuin=3481376519&tm=1534816800&sce=60-4-3&rf=viewer_4)
- 三行两列布局![](http://m.qpic.cn/psb?/V11ree7s3wel2Y/ALHI643o54ZMwmFqIBnK8nu02TBKMt9wEcVaqinEOVY!/b/dDABAAAAAAAA&bo=bQd9AwAAAAADFyY!&rf=viewer_4)

### CSS盒子模型

- ![](http://a2.qpic.cn/psb?/V11ree7s3wel2Y/9Ow3PSzssm2h.bieRoW65ISWut*dLuqxjYDzg4r0vkQ!/b/dDEBAAAAAAAA&ek=1&kp=1&pt=0&bo=JwWUAgAAAAADJ7Y!&tl=1&vuin=3481376519&tm=1534816800&sce=60-2-2&rf=viewer_4)

- ![](http://a1.qpic.cn/psb?/V11ree7s3wel2Y/nNHlzYUExhTqr2IEI3nLI4D5ieOrcGLWETkPMihvEag!/b/dDQBAAAAAAAA&ek=1&kp=1&pt=0&bo=GgVzAgAAAAADN3w!&tl=1&vuin=3481376519&tm=1534816800&sce=60-2-2&rf=viewer_4)

- ![](http://a1.qpic.cn/psb?/V11ree7s3wel2Y/dkAmDgwPhvPlHHDI6I4lxzqm7mV1C7xQl6OpTAiVAA0!/b/dDQBAAAAAAAA&ek=1&kp=1&pt=0&bo=FgVBAgAAAAADJ1I!&tl=1&vuin=3481376519&tm=1534820400&sce=60-2-2&rf=viewer_4)

- ![](http://a1.qpic.cn/psb?/V11ree7s3wel2Y/IlxVU*jWStwbrkM2SGHq3gd0oGdg8HcIF8O0gz4j8cY!/b/dDQBAAAAAAAA&ek=1&kp=1&pt=0&bo=DAVVAgAAAAADJ1w!&tl=1&vuin=3481376519&tm=1534820400&sce=60-2-2&rf=viewer_4)

  