[TOC]



##### js输出

+ `window.alert()`:警告框

+ `document.write()`:写到HTML文档中

+ `innerHTML`:写到HTML元素

+ `console.log()`:写到浏览器的控制台

+ ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title>js输出</title>
  	</head>
  	<body>
  		<p id="one"></p>
  		<script type="text/javascript">
  			
  // 			window.alert():警告框
  // 			document.write():写到HTML文档中
  // 			innerHTML:写到HTML元素
  // 			console.log():写到浏览器的控制台
    
  			
  			// window.alert('hellowrold');
  			
  			// document.write('hellowrold');
  			
  			// document.getElementById('one').innerHTML="this is p";
  			
  			console.log('helloworld');
  		</script>
  	</body>
  </html>
  ```



##### js语句与注释

+ 分号
+ JavaScript代码
+ JavaScript语句标识符
+ 代码块
+ 单行和多行注释

##### JS数据类型

+ 字符串(String)：`var string ="voasds sda";`

+ 数字(Number):`var number =1;`

+ 布尔(Boolean):`var x =true;`

+ 数组(Array):

  - ```html
    1.var cars=new Array();
    cars[0]="savv";
    2.var cars= new Array("saasd","dasd","dasd");
    3.var cars=["sdasd","dasd","gdgd"];
    ```

+ 对象(Object) :`var person={firstname:"john",lastname:"doe",id:5566};`

+ 空(null)：可以通过设置变量为空清空变量

+ 未定义(Undefined):`var persons;`这个值表示变量不含有值

+ var可以声明7大类型



##### js变量

- 变量必须以字母开头
- 变量也能以$和_符号开头（不推荐）
- 变量名称对大小写敏感

##### js函数

+ 函数是由事件驱动的或者当它被调用时执行的可重复使用的代码块
+ function a(参数){} 声明会前置
+ var a =function(参数){}
+ 函数中的return 



##### js运算符

+ 赋值运算符 ` = +=  -=`等
+ 算术运算符 `+ - * /` 等
+ 字符串的+运算符

##### js比较和逻辑运算符

+ `<` 小于
+ `>` 大于
+ `==`等于1
+ `===`绝对等于（值和类型均相等）
+ `!=`不等于
+ `&&`and
+ `||`or 



##### js条件语句与switch语句

+ 条件语句:`if else if else`
+ switch语句：`switch case break default`



##### js中for循环与while循环

+ for - 循环代码块一定的次数

+ for/in - 循环遍历对象

+ while -当指定的条件为true时循环指定的代码块

+ ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  	</head>
  	<body>
  		<script type="text/javascript">
  					
  			for(var i =0 ;i<10 ;i++){
  				console.log('i'+i);
  			}
  			
  					
  			var person ={
  				name:'json',
  				age:25,
  				sg:170
  			}
  			for(key in person){
  				console.log(person[key])
  			}
  			
  			
  			var count =1
  			while(count <10){
  				console.log('执行');
  				count++;
  			}
  		</script>
  	</body>
  </html>
  ```

#####js中break和continue语句

+ `break`语句可用于跳出循环
+ `continue`语句跳出本次循环，继续执行

##### DOM

![](http://a1.qpic.cn/psb?/V11ree7s3wel2Y/ilD*SNuPVN78ejXbsSO7WsHEwXi1H*dlHhjlM5FKaMc!/b/dDQBAAAAAAAA&ek=1&kp=1&pt=0&bo=QgM7AgAAAAADF0o!&tl=1&vuin=3481376519&tm=1535245200&sce=60-2-2&rf=viewer_4)

+ 获得元素
  - `document.getElementById()`
  - `document.getElementsByTagName()`
  - `document.getElementsByClassName()`



##### DOM HTML

+ 修改HTML内容

  - `document.getElementById(id).innerHTML ="helloWorld"`

+ 修改HTML属性

  - `element.getAttribute()`
  - `element.setAttribute()`
  - `element.src`
  - `element.href`

+ ```html
  <!DOCTYPE html>
  <html>
  	<head>
  		<meta charset="utf-8" />
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<title></title>
  	</head>
  	<body>
  			<div id="main" data="nihao">123</div>
  			<img src="1.jpg" id="img" />
  			
  			<a id="goUrl" href="">调到百度</a>
  			
  			<script type="text/javascript">
  				var main= document.getElementById("main");
  				
  				
  				
  				main.innerHTML = "helloworld";
  				//获取data属性的值
  				alert(main.getAttribute("data"));
  				
  				/**
  				 * 1.判断是否有data值
  				 * 2.有data值修改data值为buhao
  				 * 3.如果没有这个属性则会添加这个属性
  				 */
  				main.setAttribute("data","buhao");
  				main.setAttribute("dd","dasd");
  				document.write(main.getAttribute("data"));
  				document.write(main.getAttribute("dd"));
  				
  				
  				var img =document.getElementById("img");
  				img.src="2.jpg";
  				
  				var goUrl=document.getElementById("goUrl");
  				goUrl.href="www.baidu.com"
  			</script>
  	</body>
  </html>
  ```



##### DOM CSS

+ 修改样式
  - `document.getElementById('id1').style.color='blue'`



##### DOM事件不同写法

+ `<h1 onclick="this.innerHTML='谢谢'">请点击该文本</h1>`
+ `Element.onclick =function(){displayDate()};`
+ `Element.addEventListener("click",function(){});`



##### DOM节点

+ 添加和删除节点

  - `document.createElement("p")`

  - `documnent.createTextNode("新增")`

  - `parent.appendChild(child);`

  - `parent.removeChild(child);`

  - ```html
    <!DOCTYPE html>
    <html>
    	<head>
    		<meta charset="utf-8" />
    		<meta name="viewport" content="width=device-width, initial-scale=1">
    		<title></title>
    	</head>
    	<body>
    			<div id="div1">
    				<p id="p1">我是第一个P</p>
    				<p id="p2">我是第二个P</p>
    			</div>
    			
    			<script type="text/javascript">
    				var p  = document.createElement("p");//新增<p></p>
    				var word =document.createTextNode("我是新增的P标签");  //我是新增的P标签
    				
    				p.appendChild(word);  // <p>我是新增的P标签</p>
    				
    				var div =document.getElementById("div1");
    				div.appendChild(p);              //<p>我是新增的P标签</p> 放到div下
    				
    				var p1 =document.getElementById("p1");
    				div.removeChild(p1);              //删除p1
    			</script>
    	</body>
    </html>
    ```





##### JS window

+ window的概念

  - ![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/eTnkr*9NbBr*vXjve8SquokXokvrlwViJkoS*6cSNoI!/b/dDcBAAAAAAAA&ek=1&kp=1&pt=0&bo=IwWzAQAAAAADJ5Y!&tl=1&vuin=3481376519&tm=1535335200&sce=60-2-2&rf=viewer_4)

  - window的方法

    - `window.open()`:打开新窗口

    - `window.close()`:关闭当前窗口

    - `window.moveTo()`:移动当前窗口

    - `window.resizeTo()`:调整当前窗口的尺寸

    - ```html
      <!DOCTYPE html>
      <html>
      	<head>
      		<meta charset="utf-8" />
      		<meta name="viewport" content="width=device-width, initial-scale=1">
      		<title></title>
      	</head>
      	<body>
      		<button onclick="openwindow()">创建窗口</button>
      		<button onclick="myFunction()">调整窗口</button>
      		<button onclick="moveFunction()">移动窗口</button>
      		<button onclick="closeFunction()">关闭窗口</button>
      		
      		<script type="text/javascript">
      			var w; 
      			
      			function openwindow(){
      				w =window.open('','','width=300,height=300');
      			}
      			
      			function myFunction(){
      			
      				w.resizeTo(500,500);
      				w.focus();
      			}
      			
      			function moveFunction(){
      				w.moveTo(700,500);
      				w.focus();
      			}
      			
      			function closeFunction(){
      				w.close(700,500);
      				w.focus();
      			}
      		</script>
      	</body>
      </html>
      ```



##### window.screen

+ ![](http://a2.qpic.cn/psb?/V11ree7s3wel2Y/K1xgEpFbWCLqgsBoPmAafWnkDAPnZ4a*7.aVEySwfMw!/b/dC0BAAAAAAAA&ek=1&kp=1&pt=0&bo=EQXtAAAAAAADF8s!&tl=1&vuin=3481376519&tm=1535335200&sce=60-2-2&rf=viewer_4)

+ 可用高度不包括底边任务栏高度

+ ```
  屏幕宽度和窗口宽度的区别：
  window.screen.availWidth会返回当前屏幕的宽度，不会随网页缩放而改变，在浏览器运行时固定不变。
  而window.innerWidth会返回当前窗口的宽度，会随网页缩放而改变，例如：在100%缩放时，innerWidth的值为1920；在125%缩放时，innnerWidth的值就会变成1536。但此时availWidth的值不会变，它永远等于100%缩放时的文档宽度。
  
  (在windows10版本中，系统缩放125%会影响availWidth的值，即使你的屏幕是1920px宽，在系统设定125%缩放后，availWidth的值会变1536，所以availWidth并不是严格意义上的屏幕宽度，而是浏览器100%缩放时窗口的宽度。)
  ```



##### window Location

+ ![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/chUTCDIRfKLqTCJFAsn96jX7gFgdPXCkr5ZTv044Hs8!/b/dDcBAAAAAAAA&ek=1&kp=1&pt=0&bo=7QT.AAAAAAADJxU!&tl=1&vuin=3481376519&tm=1535338800&sce=60-2-2&rf=viewer_4)



##### widow.history

+ ![](http://a1.qpic.cn/psb?/V11ree7s3wel2Y/*WUUQveffmiERe2yu7g*d1Kz3KkMU8mOCOSxsgCnQyI!/b/dDQBAAAAAAAA&ek=1&kp=1&pt=0&bo=5AQDAQAAAAADJ.A!&tl=1&vuin=3481376519&tm=1535342400&sce=60-2-2&rf=viewer_4)