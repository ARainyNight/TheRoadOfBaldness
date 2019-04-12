## jQuery

### jQuery介绍

+ jQuery是一个轻量级JS库，使用十分简单
+ jQuery的核心是选择器，用于获取页面元素
+ jQuery提供了大量高效方法，开发速度大幅提升

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

#### WEB页面开发的两个要素

+ 在使用HTML开发页面时，有两个基本点：
  - **选择**HTML页面上在哪些元素
  - 在这些元素上做哪些**动作**

### jQuery选择器

+ jQuery选择器用于选中需要操作的页面元素
+ 语法1：`jQuery(选择器表达式)`
+ 语法2：`$(选择器表达式)`
+ 俩种是等价的

#### 基本选择器

+ 基本选择器是jQuery最基础也是最常用的选择器表达式
+ ![](F:\JAVA\秃头之路\web入门\3.javaweb基础进阶\7.JQuery与Ajax入门\img\基本选择器.png)

#### 层叠选择器

+ 层叠选择器是根据元素的位置关系来获取元素的选择器表达式
+ ![](F:\JAVA\秃头之路\web入门\3.javaweb基础进阶\7.JQuery与Ajax入门\img\层叠选择器.png)

