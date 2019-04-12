## jQuery

### jQuery介绍

+ jQuery是一个轻量级JS库，使用十分简单
+ jQuery的核心是选择器，用于获取页面元素
+ jQuery提供了大量高效方法，开发速度大幅提升

------

### jQuery选择器

```javascript
<script type="text/javascript" src="js/jquery-3.3.1.js" ></script>
	<script  type="text/javascript" >
		document.getElementById("btnSelect").onclick =function(){
			var selector= document.getElementById("txtSelector").value;
			//jquery的选择器方法
			//选择器表达式
			// $("*").removeClass('highlight');
			// $(selector).addClass('highlight');
			// $("#marital_status").addClass('highlight');
			$("div").addClass('highlight')
		}
	</script>
```

+ jQuery选择器用于选中需要操作的页面元素
+ 语法1：`jQuery(选择器表达式)`
+ 语法2：`$(选择器表达式)`
+ 俩种是等价的

#### 基本选择器

+ 基本选择器是jQuery最基础也是最常用的选择器表达式
+ ![](.\img\基本选择器.png)

#### 层叠选择器

+ 层叠选择器是根据元素的位置关系来获取元素的选择器表达式
+ ![](.\img\层叠选择器.png)

#### 属性选择器

+ 属性选择器就是根据元素的属性值来选择元素的选择器表达式
+ ![](.\img\属性选择器.jpg)

#### 位置选择器

+ 位置选择器是指通过位置获取指定的元素，例如“获取第3个元素”
+ ![](.\img\位置选择器.jpg)

#### 表单选择器

+ 表单选择器是获取表单元素的简化形式，例如：获取所有文本框
+ ![](./img/表单选择器.jpg)

- 

------

### WEB页面开发的两个要素

- 在使用HTML开发页面时，有两个基本点：
  - **选择**HTML页面上在哪些元素
  - 在这些元素上做哪些**动作**

#### 操作元素属性

- `attr(name|properties|key)`：获取或设置元素属性
- `removeAttr(name)`:移除元素属性

#### 操作元素的CSS样式

- `css()`:获取或设置匹配元素的样式属性
- `addClass()`:为每个匹配的元素添加指定的类名
- `removeClass()`:从所有匹配的元素中删除全部或指定的类

#### 设置元素内容

- `val()`:获取或设置输入项的值
- `text()`:获取或设置元素的纯文本
- `html()`:获取或设置元素内部的HTML

#### jQuery事件处理方法

+ `on("click",function)`：为选中的页面元素绑定单击事件
+ `click(function)`:是绑定事件的简写形式
+ 处理方法中提供了event参数包含了事件的相关信息
+ ![](/img/jQuery常用事件.jpg)